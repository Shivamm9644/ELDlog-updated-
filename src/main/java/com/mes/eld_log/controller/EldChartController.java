package com.mes.eld_log.controller;

import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.serviceImpl.DispatchServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.MimeMessage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/eldchart")
public class EldChartController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EldChartController.class);

    @Autowired
    private DispatchServiceImpl dispatchServiceImpl;

    @Autowired
    private EmployeeMasterRepo employeeMasterRepo;

    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * Endpoint for chart PDF generation and email sending.
     * Cleanly handles path variables (/32/2026-08-01/download), query params, and JSON body requests.
     */
    @RequestMapping(
        value = {
            "/generateCharts",
            "/generateCharts/{employeeId}/{fromDate}",
            "/generateCharts/{employeeId}/{fromDate}/{toDate}",
            "/generateCharts/{employeeId}/{fromDate}/{toDate}/**"
        },
        method = {RequestMethod.GET, RequestMethod.POST}
    )
    public ResponseEntity<?> generateCharts(
            @PathVariable(value = "employeeId", required = false) Long pathEmployeeId,
            @PathVariable(value = "fromDate", required = false) String pathFromDate,
            @PathVariable(value = "toDate", required = false) String pathToDate,
            @RequestParam(value = "employeeId", required = false) Long paramEmployeeId,
            @RequestParam(value = "driverId", required = false) Long paramDriverId,
            @RequestParam(value = "fromDate", required = false) String paramFromDate,
            @RequestParam(value = "toDate", required = false) String paramToDate,
            @RequestParam(value = "email", required = false) String paramEmail,
            @RequestBody(required = false) Map<String, Object> bodyMap
    ) {
        long employeeId = 0L;
        String fromDateStr = "";
        String toDateStr = "";
        String email = "";

        // Extract employeeId / driverId
        if (pathEmployeeId != null && pathEmployeeId > 0) {
            employeeId = pathEmployeeId;
        } else if (paramEmployeeId != null && paramEmployeeId > 0) {
            employeeId = paramEmployeeId;
        } else if (paramDriverId != null && paramDriverId > 0) {
            employeeId = paramDriverId;
        } else if (bodyMap != null && bodyMap.get("employeeId") != null) {
            employeeId = Long.parseLong(bodyMap.get("employeeId").toString());
        } else if (bodyMap != null && bodyMap.get("driverId") != null) {
            employeeId = Long.parseLong(bodyMap.get("driverId").toString());
        }

        // Extract fromDate
        if (pathFromDate != null && !pathFromDate.isEmpty()) {
            fromDateStr = pathFromDate;
        } else if (paramFromDate != null && !paramFromDate.isEmpty()) {
            fromDateStr = paramFromDate;
        } else if (bodyMap != null && bodyMap.get("fromDate") != null) {
            fromDateStr = bodyMap.get("fromDate").toString();
        }

        // Extract toDate
        if (pathToDate != null && !pathToDate.isEmpty()) {
            toDateStr = pathToDate;
        } else if (paramToDate != null && !paramToDate.isEmpty()) {
            toDateStr = paramToDate;
        } else if (bodyMap != null && bodyMap.get("toDate") != null) {
            toDateStr = bodyMap.get("toDate").toString();
        }

        // Extract email
        if (paramEmail != null && !paramEmail.trim().isEmpty()) {
            email = paramEmail.trim();
        } else if (bodyMap != null && bodyMap.get("email") != null) {
            email = bodyMap.get("email").toString().trim();
        }

        LOGGER.info("[ELDChart] Request Received -> employeeId: {}, fromDate: {}, toDate: {}, email: {}", employeeId, fromDateStr, toDateStr, email);

        try {
            if (fromDateStr != null && !fromDateStr.isEmpty()) {
                fromDateStr = URLDecoder.decode(fromDateStr, StandardCharsets.UTF_8.name()).trim();
            }
            if (toDateStr != null && !toDateStr.isEmpty()) {
                toDateStr = URLDecoder.decode(toDateStr, StandardCharsets.UTF_8.name()).trim();
            }

            long fromMillis = 0L;
            long toMillis = 0L;

            DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter dateOnlyFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            if (fromDateStr != null && fromDateStr.length() >= 10) {
                String cleanFromDate = fromDateStr.substring(0, 10);
                if (fromDateStr.length() == 10) {
                    LocalDate fDate = LocalDate.parse(cleanFromDate, dateOnlyFormatter);
                    fromMillis = fDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                } else {
                    try {
                        LocalDateTime fLdt = LocalDateTime.parse(fromDateStr, fullFormatter);
                        fromMillis = fLdt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    } catch (Exception ex) {
                        LocalDate fDate = LocalDate.parse(cleanFromDate, dateOnlyFormatter);
                        fromMillis = fDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    }
                }
            } else {
                LocalDate today = LocalDate.now();
                fromMillis = today.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                fromDateStr = today.toString();
            }

            if (toDateStr == null || toDateStr.isEmpty() || toDateStr.equalsIgnoreCase("download")) {
                if (fromDateStr.length() >= 10) {
                    String cleanFromDate = fromDateStr.substring(0, 10);
                    LocalDate tDate = LocalDate.parse(cleanFromDate, dateOnlyFormatter);
                    toMillis = tDate.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    toDateStr = cleanFromDate;
                } else {
                    toMillis = fromMillis + 86399000L;
                    toDateStr = fromDateStr;
                }
            } else if (toDateStr.length() >= 10) {
                String cleanToDate = toDateStr.substring(0, 10);
                if (toDateStr.length() == 10) {
                    LocalDate tDate = LocalDate.parse(cleanToDate, dateOnlyFormatter);
                    toMillis = tDate.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                } else {
                    try {
                        LocalDateTime tLdt = LocalDateTime.parse(toDateStr, fullFormatter);
                        toMillis = tLdt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    } catch (Exception ex) {
                        LocalDate tDate = LocalDate.parse(cleanToDate, dateOnlyFormatter);
                        toMillis = tDate.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    }
                }
            }

            String driverName = "Driver";
            if (employeeId > 0) {
                try {
                    EmployeeMaster emp = this.employeeMasterRepo.findByEmployeeId((int) employeeId);
                    if (emp != null) {
                        driverName = emp.getFirstName() + " " + emp.getLastName();
                    }
                } catch (Exception ex) {
                    LOGGER.warn("[ELDChart] Unable to fetch EmployeeMaster for id {}: {}", employeeId, ex.getMessage());
                }
            }

            LOGGER.info("[ELDChart] Generating Driver Log PDF for driver: {} (ID: {}), range: {} to {}", driverName, employeeId, fromMillis, toMillis);

            Map<String, Object> pdfMap = this.dispatchServiceImpl.createDriverLogStatusPDF(employeeId, fromMillis, toMillis, driverName);
            if (pdfMap != null && pdfMap.containsKey("outputStream")) {
                ByteArrayOutputStream baos = (ByteArrayOutputStream) pdfMap.get("outputStream");
                byte[] pdfBytes = baos.toByteArray();

                LOGGER.info("[ELDChart] PDF generated successfully. Size: {} bytes", pdfBytes.length);

                // Save copy to upload directory
                try {
                    String basePath = "/opt/tomcat/webapps/uploads/driver_log_report/";
                    File folder = new File(basePath);
                    if (!folder.exists()) {
                        folder.mkdirs();
                    }
                    String pdfFileName = employeeId + "_" + fromDateStr + "_driver_log.pdf";
                    File file = new File(folder, pdfFileName);
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        fos.write(pdfBytes);
                        fos.flush();
                    }
                    LOGGER.info("[ELDChart] Saved PDF copy to {}", file.getAbsolutePath());
                } catch (Exception fileEx) {
                    LOGGER.warn("[ELDChart] Could not save local file copy: {}", fileEx.getMessage());
                }

                // If email address is provided, send email with PDF attachment
                boolean emailSent = false;
                if (!email.isEmpty()) {
                    try {
                        LOGGER.info("[ELDChart] Preparing email to: {}", email);
                        MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
                        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
                        helper.setTo(email);
                        helper.setSubject("ELD Driver Log Report - " + driverName + " (" + fromDateStr + ")");

                        String htmlContent = "<div style='font-family: Arial, sans-serif; padding: 20px; line-height: 1.6;'>"
                                + "<h2 style='color: #2c3e50;'>ELD Roadside Inspection / Driver Log Report</h2>"
                                + "<p><b>Driver Name:</b> " + driverName + "</p>"
                                + "<p><b>Report Date Range:</b> " + fromDateStr + " to " + toDateStr + "</p>"
                                + "<p>Please find attached the official DOT Driver Log Status PDF report.</p>"
                                + "<br/><hr style='border: 0; border-top: 1px solid #eee;'/>"
                                + "<p style='color: #7f8c8d; font-size: 12px;'>This is an automated message sent from ELD Logger System.</p>"
                                + "</div>";

                        helper.setText(htmlContent, true);
                        String attachmentName = "driver_log_" + (employeeId > 0 ? employeeId : "report") + "_" + fromDateStr + ".pdf";
                        helper.addAttachment(attachmentName, new ByteArrayResource(pdfBytes));

                        this.javaMailSender.send(mimeMessage);
                        emailSent = true;
                        LOGGER.info("[ELDChart] Email successfully sent to {} with attachment {}", email, attachmentName);
                    } catch (Exception mailEx) {
                        LOGGER.error("[ELDChart] FAILED to send email to {}: {}", email, mailEx.getMessage(), mailEx);
                    }
                }

                // If requested with email in request or body, return JSON summary response
                if (!email.isEmpty() && (paramEmail != null || (bodyMap != null && bodyMap.get("email") != null))) {
                    Map<String, Object> response = new HashMap<>();
                    response.put("status", emailSent ? "SUCCESS" : "FAIL");
                    response.put("message", emailSent ? "Driver Log PDF emailed successfully to " + email : "Failed to send email");
                    response.put("driverId", employeeId);
                    response.put("driverName", driverName);
                    response.put("email", email);
                    response.put("fromDate", fromDateStr);
                    response.put("toDate", toDateStr);
                    return ResponseEntity.ok(response);
                }

                // Default return PDF stream for direct download / browser preview
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_PDF);
                String filename = "driver_log_" + employeeId + "_" + fromDateStr + ".pdf";
                headers.setContentDispositionFormData("inline", filename);
                headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

                return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
            }
        } catch (Exception e) {
            LOGGER.error("[ELDChart] Error processing generateCharts request: {}", e.getMessage(), e);
        }

        Map<String, Object> errorResp = new HashMap<>();
        errorResp.put("status", "FAIL");
        errorResp.put("message", "Error generating chart report or sending email.");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResp);
    }
}
