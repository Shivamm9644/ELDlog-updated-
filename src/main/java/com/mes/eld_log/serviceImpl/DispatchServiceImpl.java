package com.mes.eld_log.serviceImpl;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfEncryptor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.mes.eld_log.dtos.AddCertifiedLogDto;
import com.mes.eld_log.dtos.AddDriveringStatusDto;
import com.mes.eld_log.dtos.AddDriveringStatusResponseDto;
import com.mes.eld_log.dtos.AddDvirDataDto;
import com.mes.eld_log.dtos.AlertsLogViewDto;
import com.mes.eld_log.dtos.AllDispatchDataViewDto;
import com.mes.eld_log.dtos.AssignLogToDriverDto;
import com.mes.eld_log.dtos.CertifiedLogCRUDDto;
import com.mes.eld_log.dtos.CertifiedLogViewDto;
import com.mes.eld_log.dtos.ClientMasterCRUDDto;
import com.mes.eld_log.dtos.CycleTimeRulesViewDto;
import com.mes.eld_log.dtos.DVIRDataCRUDDto;
import com.mes.eld_log.dtos.DefectDetailCRUDDto;
import com.mes.eld_log.dtos.DispatchDataViewDto;
import com.mes.eld_log.dtos.DispatchDetailCRUDDto;
import com.mes.eld_log.dtos.DispatchDetailViewDto;
import com.mes.eld_log.dtos.DriverLogWithLoginLogViewDto;
import com.mes.eld_log.dtos.DriveringStatusCRUDDto;
import com.mes.eld_log.dtos.DriveringStatusLogViewDto;
import com.mes.eld_log.dtos.DriveringStatusViewDto;
import com.mes.eld_log.dtos.ELDOtaCRUDDto;
import com.mes.eld_log.dtos.ELDSupportViewDto;
import com.mes.eld_log.dtos.EldLogDataViewDto;
import com.mes.eld_log.dtos.EldReportDto;
import com.mes.eld_log.dtos.EmployeeMasterCRUDDto;
import com.mes.eld_log.dtos.EmployeeMasterViewDto;
import com.mes.eld_log.dtos.IdlingReportViewDto;
import com.mes.eld_log.dtos.IftaReportViewDto;
import com.mes.eld_log.dtos.IftaSummaryReport;
import com.mes.eld_log.dtos.LiveDataLogViewDto;
import com.mes.eld_log.dtos.LoginLogViewDto;
import com.mes.eld_log.dtos.MaxIdViewDto;
import com.mes.eld_log.dtos.OtherChargeViewDto;
import com.mes.eld_log.dtos.ReceiverDataViewDto;
import com.mes.eld_log.dtos.ShiftLogAddDto;
import com.mes.eld_log.dtos.ShipperDataViewDto;
import com.mes.eld_log.dtos.UserLoginDto;
import com.mes.eld_log.dtos.ViewDriverLogWithDetailDto;
import com.mes.eld_log.dtos.ViewDriverWorkingDayStatus;
import com.mes.eld_log.models.AlertsLog;
import com.mes.eld_log.models.CertifiedLog;
import com.mes.eld_log.models.CityMaster;
import com.mes.eld_log.models.ClientMaster;
import com.mes.eld_log.models.CountryMaster;
import com.mes.eld_log.models.CustomerMaster;
import com.mes.eld_log.models.CycleUsa;
import com.mes.eld_log.models.DVIRData;
import com.mes.eld_log.models.DefectDetails;
import com.mes.eld_log.models.DeviceStatus;
import com.mes.eld_log.models.DispatchDetails;
import com.mes.eld_log.models.DriverStatusLog;
import com.mes.eld_log.models.DriverWorkingStatus;
import com.mes.eld_log.models.DriveringStatus;
import com.mes.eld_log.models.ELDLogData;
import com.mes.eld_log.models.ELDOta;
import com.mes.eld_log.models.ELDOtaStatus;
import com.mes.eld_log.models.ELDSettings;
import com.mes.eld_log.models.ELDSupport;
import com.mes.eld_log.models.EmployeeMaster;
import com.mes.eld_log.models.ExceptionLog;
import com.mes.eld_log.models.GeofanceMaster;
import com.mes.eld_log.models.IFTAReports;
import com.mes.eld_log.models.LiveDataLog;
import com.mes.eld_log.models.LoginLog;
import com.mes.eld_log.models.MACAddressMaster;
import com.mes.eld_log.models.MainTerminalMaster;
import com.mes.eld_log.models.OtherCharges;
import com.mes.eld_log.models.ReceiverMaster;
import com.mes.eld_log.models.ReferModeMaster;
import com.mes.eld_log.models.ServerHealth;
import com.mes.eld_log.models.ShipperMaster;
import com.mes.eld_log.models.ShipperReceiverDetails;
import com.mes.eld_log.models.SplitLog;
import com.mes.eld_log.models.StateMaster;
import com.mes.eld_log.models.UserMaster;
import com.mes.eld_log.models.VehicleMaster;
import com.mes.eld_log.repo.AlertsLogRepo;
import com.mes.eld_log.repo.CertifiedLogRepo;
import com.mes.eld_log.repo.CityMasterRepo;
import com.mes.eld_log.repo.ClientMasterRepo;
import com.mes.eld_log.repo.CountryMasterRepo;
import com.mes.eld_log.repo.CustomerMasterRepo;
import com.mes.eld_log.repo.CycleUsaRepo;
import com.mes.eld_log.repo.DVIRDataRepo;
import com.mes.eld_log.repo.DefectDetailsRepo;
import com.mes.eld_log.repo.DeviceMasterRepo;
import com.mes.eld_log.repo.DeviceStatusRepo;
import com.mes.eld_log.repo.DispatchDetailsRepo;
import com.mes.eld_log.repo.DriverStatusLogRepo;
import com.mes.eld_log.repo.DriverWorkingStatusRepo;
import com.mes.eld_log.repo.DriveringStatusRepo;
import com.mes.eld_log.repo.ELDLogDataRepo;
import com.mes.eld_log.repo.ELDOtaRepo;
import com.mes.eld_log.repo.ELDOtaStatusRepo;
import com.mes.eld_log.repo.ELDSettingsRepo;
import com.mes.eld_log.repo.ELDSupportRepo;
import com.mes.eld_log.repo.EmployeeMasterRepo;
import com.mes.eld_log.repo.ExceptionLogRepo;
import com.mes.eld_log.repo.GeofanceMasterRepo;
import com.mes.eld_log.repo.IFTAReportsRepo;
import com.mes.eld_log.repo.LiveDataLogRepo;
import com.mes.eld_log.repo.LoginLogRepo;
import com.mes.eld_log.repo.LoginRepo;
import com.mes.eld_log.repo.MACAddressMasterRepo;
import com.mes.eld_log.repo.MainTerminalMasterRepo;
import com.mes.eld_log.repo.OtherChargesRepo;
import com.mes.eld_log.repo.ReceiverMasterRepo;
import com.mes.eld_log.repo.ReferModeMasterRepo;
import com.mes.eld_log.repo.ServerHealthRepo;
import com.mes.eld_log.repo.ShipperMasterRepo;
import com.mes.eld_log.repo.ShipperReceiverDetailsRepo;
import com.mes.eld_log.repo.SplitLogRepo;
import com.mes.eld_log.repo.StateMasterRepo;
import com.mes.eld_log.repo.UserMasterRepo;
import com.mes.eld_log.repo.VehicleMasterRepo;
import com.mes.eld_log.results.Result;
import com.mes.eld_log.results.ResultWrapper;
import com.mes.eld_log.service.DispatchService;
import com.mes.eld_log.util.eldLogUtils;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.types.ObjectId;
import com.itextpdf.text.Element;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.BasicStroke;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service("dispatchService")
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;
    @Autowired
    private eldLogUtils eldUtils;
    @Autowired
    LoginRepo loginRepo;
    @Autowired
    ServerHealthRepo serverHealthRepo;
    @Autowired
    ELDSettingsRepo eldSettingsRepo;
    @Autowired
    ELDSupportRepo eldSupportRepo;
    @Autowired
    AlertsLogRepo alertsLogRepo;
    @Autowired
    DefectDetailsRepo defectDetailsRepo;
    @Autowired
    IFTAReportsRepo iftaReportsRepo;
    @Autowired
    UserMasterRepo userMasterRepo;
    @Autowired
    DriverStatusLogRepo driverStatusLogRepo;
    @Autowired
    SplitLogRepo splitLogRepo;
    @Autowired
    LiveDataLogRepo liveDataLogRepo;
    @Autowired
    LoginLogRepo loginLogRepo;
    @Autowired
    GeofanceMasterRepo geofanceMasterRepo;
    @Autowired
    ELDLogDataRepo eldLogDataRepo;
    @Autowired
    DeviceStatusRepo deviceStatusRepo;
    @Autowired
    MACAddressMasterRepo macAddressMasterRepo;
    @Autowired
    DriverWorkingStatusRepo driverWorkingStatusRepo;
    @Autowired
    private DispatchServiceImpl dispatchServiceImpl;
    @Autowired
    private DVIRDataRepo dvirDataRepo;
    @Autowired
    private CertifiedLogRepo certifiedLogRepo;
    @Autowired
    private ELDOtaRepo eldOtaRepo;
    @Autowired
    private ELDOtaStatusRepo eldOtaStatusRepo;
    @Autowired
    ClientMasterRepo clientMasterRepo;
    @Autowired
    DispatchDetailsRepo dispatchDetailsRepo;
    @Autowired
    MainTerminalMasterRepo mainTerminalMasterRepo;
    @Autowired
    VehicleMasterRepo vehicleMasterRepo;
    @Autowired
    DeviceMasterRepo deviceMasterRepo;
    @Autowired
    OtherChargesRepo otherChargesRepo;
    @Autowired
    CycleUsaRepo cycleUsaRepo;
    @Autowired
    ExceptionLogRepo exceptionLogRepo;
    @Autowired
    CustomerMasterRepo customerMasterRepo;
    @Autowired
    ShipperMasterRepo shipperMasterRepo;
    @Autowired
    ReceiverMasterRepo receiverMasterRepo;
    @Autowired
    private EmployeeMasterRepo employeeMasterRepo;
    @Autowired
    private CountryMasterRepo countryMasterRepo;
    @Autowired
    private StateMasterRepo stateMasterRepo;
    @Autowired
    private CityMasterRepo cityMasterRepo;
    @Autowired
    private ReferModeMasterRepo referModeMasterRepo;
    @Autowired
    ShipperReceiverDetailsRepo shipperReceiverDetailsRepo;
    @Autowired
    DriveringStatusRepo driveringStatusRepo;
    @Autowired
    private JavaMailSender javaMailSender;
    private Path fileStorageLocation;
    private MongoTemplate mongoTemplate;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private final Map<String, ELDLogData> vehicleMap = new ConcurrentHashMap<>();
    private final Map<String, String> vehicleMsgMap = new ConcurrentHashMap<>();
    List<ShiftLogAddDto> shiftLogAddDtoData = new ArrayList<>();
    Boolean isVoilation = false;
    String voilationMessage = "";
    long splitSleep1 = 0L;
    long splitSleep2 = 0L;
    boolean isFirstSplitDone = false;
    LocalDate firstSplitDay = null;
    Map<Integer, String> labels = new HashMap<>();

    @Autowired
    public DispatchServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
        this.workbook = new XSSFWorkbook();
    }

    @Override
    public ResultWrapper<String> AddDispatchDetails(DispatchDetailCRUDDto dispatchDetailCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            ArrayList<DispatchDetails> adddispatchData = dispatchDetailCRUDDto.getDispatchData();
            DispatchDetails dispatchDetails = null;

            for (int i = 0; i < adddispatchData.size(); ++i) {
                dispatchDetails = adddispatchData.get(i);
                dispatchDetails.setAddedTimestamp(instant.toEpochMilli());
                dispatchDetails.setUpdatedTimestamp(instant.toEpochMilli());
                dispatchDetails = (DispatchDetails) this.dispatchDetailsRepo.save(dispatchDetails);
            }

            DispatchDetailViewDto dispatchDetailViewDto = this.dispatchDetailsRepo.findDispatchDetailsByTimestamp(dispatchDetails.getAddedTimestamp());
            ArrayList<OtherCharges> addOtherChargeData = dispatchDetailCRUDDto.getOtherChargeData();
            OtherCharges otherCharges = null;

            for (int i = 0; i < addOtherChargeData.size(); ++i) {
                otherCharges = addOtherChargeData.get(i);
                otherCharges.setDispatchId(dispatchDetailViewDto.get_id());
                otherCharges.setAddedTimestamp(instant.toEpochMilli());
                otherCharges.setUpdatedTimestamp(instant.toEpochMilli());
                otherCharges = (OtherCharges) this.otherChargesRepo.save(otherCharges);
            }

            ArrayList<ShipperReceiverDetails> addShipperData = dispatchDetailCRUDDto.getShipperData();
            ShipperReceiverDetails shipperDetails = null;

            for (int i = 0; i < addShipperData.size(); ++i) {
                shipperDetails = addShipperData.get(i);
                shipperDetails.setDispatchId(dispatchDetailViewDto.get_id());
                shipperDetails.setAddedTimestamp(instant.toEpochMilli());
                shipperDetails.setUpdatedTimestamp(instant.toEpochMilli());
                shipperDetails = (ShipperReceiverDetails) this.shipperReceiverDetailsRepo.save(shipperDetails);
            }

            ArrayList<ShipperReceiverDetails> addReceiverData = dispatchDetailCRUDDto.getReceiverData();
            ShipperReceiverDetails receiverDetails = null;

            for (int i = 0; i < addReceiverData.size(); ++i) {
                receiverDetails = addReceiverData.get(i);
                receiverDetails.setDispatchId(dispatchDetailViewDto.get_id());
                receiverDetails.setAddedTimestamp(instant.toEpochMilli());
                receiverDetails.setUpdatedTimestamp(instant.toEpochMilli());
                receiverDetails = (ShipperReceiverDetails) this.shipperReceiverDetailsRepo.save(receiverDetails);
            }

            result.setResult("Saved");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Dispatch Details Added Successfully");
        } catch (Exception var14) {
            result.setStatus(Result.FAIL);
            result.setMessage(var14.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DispatchDetailViewDto>> ViewDispatchDetails(DispatchDetailCRUDDto dispatchDetailCRUDDto) {
        ResultWrapper<List<DispatchDetailViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            List<DispatchDetailViewDto> dispatchDetailViewDto = null;
            String dispatchId = dispatchDetailCRUDDto.getDispatchId();
            long clientId = dispatchDetailCRUDDto.getClientId();
            if (dispatchId.equals("")) {
                sDebug = sDebug + "1,";
                dispatchDetailViewDto = this.dispatchDetailsRepo.findAllDispatchDetails(clientId);
                sDebug = sDebug + "2,";

                try {
                    for (int i = 0; i < dispatchDetailViewDto.size(); ++i) {
                        CustomerMaster customerInfo = this.customerMasterRepo.findByCustomerId((int) dispatchDetailViewDto.get(i).getCustomerId());
                        dispatchDetailViewDto.get(i).setCustomerName(customerInfo.getCustomerName());
                        sDebug = sDebug + "3,";
                        List<ShipperReceiverDetails> srDetails = this.shipperReceiverDetailsRepo.findByDispatchSRId(dispatchDetailViewDto.get(i).get_id());
                        sDebug = sDebug + "4,";
                        if (srDetails.size() > 0) {
                            sDebug = sDebug + "5,";

                            for (int sr = 0; sr < srDetails.size(); ++sr) {
                                sDebug = sDebug + "6,";
                                if (srDetails.get(sr).getShipperId() > 0L) {
                                    ShipperMaster shipperInfo = this.shipperMasterRepo.findByShipperId((int) srDetails.get(sr).getShipperId());
                                    dispatchDetailViewDto.get(i).setShipperId((long) shipperInfo.getShipperId().intValue());
                                    dispatchDetailViewDto.get(i).setShipperName(shipperInfo.getShipperName());
                                    dispatchDetailViewDto.get(i).setShippingDate(srDetails.get(sr).getDate());
                                }

                                if (srDetails.get(sr).getReceiverId() > 0L) {
                                    ReceiverMaster receiverInfo = this.receiverMasterRepo.findByReceiverId((int) srDetails.get(sr).getReceiverId());
                                    dispatchDetailViewDto.get(i).setReceiverId((long) receiverInfo.getReceiverId().intValue());
                                    dispatchDetailViewDto.get(i).setReceiverName(receiverInfo.getReceiverName());
                                    dispatchDetailViewDto.get(i).setReceivingDate(srDetails.get(sr).getDate());
                                }
                            }

                            sDebug = sDebug + "7,";
                        }

                        sDebug = sDebug + "8,";
                    }

                    sDebug = sDebug + "9,";
                } catch (Exception var13) {
                    var13.printStackTrace();
                }
            } else {
                dispatchDetailViewDto = this.dispatchDetailsRepo.findAndViewDispatchDetailsById(dispatchId, clientId);
            }

            result.setResult(dispatchDetailViewDto);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Dispatch Detail Information Send Successfully");
        } catch (Exception var14) {
            result.setStatus(Result.FAIL);
            result.setMessage(var14.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<AllDispatchDataViewDto> ViewDispatchData(DispatchDetailCRUDDto dispatchDetailCRUDDto) {
        ResultWrapper<AllDispatchDataViewDto> result = new ResultWrapper<>();

        try {
            AllDispatchDataViewDto allDispatchDataViewDto = new AllDispatchDataViewDto();
            long driverId = dispatchDetailCRUDDto.getDriverId();
            String dispatchId = "";
            if (driverId > 0L) {
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId));
                query.limit(1);
                query.with(pageableRequest);
                List<DispatchDataViewDto> dispatchData = this.mongoTemplate.find(query, DispatchDataViewDto.class, "dispatch_details");

                for (int i = 0; i < dispatchData.size(); ++i) {
                    dispatchId = dispatchData.get(i).get_id();
                    CustomerMaster customerInfo = this.customerMasterRepo.findByCustomerId((int) dispatchData.get(i).getCustomerId());
                    dispatchData.get(i).setCustomerName(customerInfo.getCustomerName());
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) dispatchData.get(i).getDriverId());
                    dispatchData.get(i).setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
                    dispatchData.get(i).setDivR(empInfo.getDivR());
                }

                List<OtherChargeViewDto> otherChargesData = null;
                List<ShipperDataViewDto> shipperData = null;
                List<ReceiverDataViewDto> receiverData = null;
                if (!dispatchId.equals("")) {
                    otherChargesData = this.otherChargesRepo.findAndViewByDispatchId(dispatchId);
                    List<ShipperReceiverDetails> srDetails = this.shipperReceiverDetailsRepo.findByDispatchSRId(dispatchId);
                    if (srDetails.size() > 0) {
                        for (int sr = 0; sr < srDetails.size(); ++sr) {
                            if (srDetails.get(sr).getShipperId() > 0L) {
                                shipperData = this.shipperReceiverDetailsRepo.findByDispatchIdOfShipperData(dispatchId, srDetails.get(sr).getShipperId());
                                if (shipperData.size() > 0) {
                                    for (int i = 0; i < shipperData.size(); ++i) {
                                        ShipperMaster shipperInfo = this.shipperMasterRepo.findByShipperId((int) shipperData.get(i).getShipperId());
                                        shipperData.get(i).setShipperName(shipperInfo.getShipperName());
                                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) shipperData.get(i).getCountryId());
                                        shipperData.get(i).setCountryName(countryInfo.getCountryName());
                                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) shipperData.get(i).getStateId());
                                        shipperData.get(i).setStateName(stateInfo.getStateName());
                                        CityMaster cityInfo = this.cityMasterRepo.findByCityId((int) shipperData.get(i).getCityId());
                                        shipperData.get(i).setCityName(cityInfo.getCityName());
                                        ReferModeMaster referModeInfo = this.referModeMasterRepo.findByReferModeId((int) shipperData.get(i).getReferModeId());
                                        shipperData.get(i).setReferModeName(referModeInfo.getReferModeName());
                                    }
                                }
                            }

                            if (srDetails.get(sr).getReceiverId() > 0L) {
                                receiverData = this.shipperReceiverDetailsRepo.findByDispatchIdOfReceiverData(dispatchId, srDetails.get(sr).getReceiverId());
                                if (receiverData.size() > 0) {
                                    for (int i = 0; i < receiverData.size(); ++i) {
                                        ReceiverMaster receiverInfo = this.receiverMasterRepo.findByReceiverId((int) receiverData.get(i).getReceiverId());
                                        receiverData.get(i).setReceiverName(receiverInfo.getReceiverName());
                                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) receiverData.get(i).getCountryId());
                                        receiverData.get(i).setCountryName(countryInfo.getCountryName());
                                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) receiverData.get(i).getStateId());
                                        receiverData.get(i).setStateName(stateInfo.getStateName());
                                        CityMaster cityInfo = this.cityMasterRepo.findByCityId((int) receiverData.get(i).getCityId());
                                        receiverData.get(i).setCityName(cityInfo.getCityName());
                                        ReferModeMaster referModeInfo = this.referModeMasterRepo.findByReferModeId((int) receiverData.get(i).getReferModeId());
                                        receiverData.get(i).setReferModeName(referModeInfo.getReferModeName());
                                    }
                                }
                            }
                        }
                    }
                }

                allDispatchDataViewDto.setDispatchData(dispatchData);
                allDispatchDataViewDto.setOtherChargeData(otherChargesData);
                allDispatchDataViewDto.setShippingData(shipperData);
                allDispatchDataViewDto.setReceivingData(receiverData);
                result.setResult(allDispatchDataViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Dispatch Detail Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddExceptionLog(ExceptionLog exceptionLog, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            exceptionLog.setAddedTimestamp(instant.toEpochMilli());
            exceptionLog.setUpdatedTimestamp(instant.toEpochMilli());
            if (tokenValid.equals("true")) {
                exceptionLog = (ExceptionLog) this.exceptionLogRepo.save(exceptionLog);
            } else {
                exceptionLog = (ExceptionLog) this.exceptionLogRepo.save(exceptionLog);
            }

            result.setResult("Saved");
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Dispatch Details Added Successfully");
        } catch (Exception var5) {
            result.setStatus(Result.FAIL);
            result.setMessage(var5.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<EldLogDataViewDto>> ViewEldLogData() {
        ResultWrapper<List<EldLogDataViewDto>> result = new ResultWrapper<>();

        try {
            Pageable pageableRequest = PageRequest.of(0, 10, Sort.by(new String[]{"utcDateTime"}).descending());
            Query query = new Query();
            query.with(pageableRequest);
            List<EldLogDataViewDto> eldLogData = this.mongoTemplate.find(query, EldLogDataViewDto.class, "eld_log_data");
            result.setResult(eldLogData);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Eld Log Information Send Successfully");
        } catch (Exception var5) {
            result.setStatus(Result.FAIL);
            result.setMessage(var5.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<DriveringStatusViewDto> AddDriveringStatus(DriveringStatus driveringStatus, String tokenValid) {
        ResultWrapper<DriveringStatusViewDto> result = new ResultWrapper<>();

        try {
            DriverStatusLog driverStatusLog = new DriverStatusLog();
            if (tokenValid.equals("true")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime ldtDateTime = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
                long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                driveringStatus.setLDateTime(lDateTime);
                if (driveringStatus.getUtcDateTime() <= 0L) {
                    driveringStatus.setUtcDateTime(lDateTime);
                }

                String logType = driveringStatus.getLogType();
                String sVoilationHour = logType.replaceAll("\\D+", "");
                int voilationHour = sVoilationHour.isEmpty() ? 0 : Integer.parseInt(sVoilationHour);
                driveringStatus.setVoilationHour(voilationHour);
                driveringStatus.setIsVisible(1);
                if (driveringStatus.getIsVoilation() > 0) {
                    driverStatusLog.setStatusId(0L);
                } else {
                    long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                    driverStatusLog = new DriverStatusLog();
                    if (maxId <= 0L) {
                        maxId = 1L;
                        driverStatusLog.setStatusId(maxId);
                    } else {
                        driverStatusLog.setStatusId(++maxId);
                    }
                }

                Instant instant = Instant.now();
                driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                if (driveringStatus.getAppVersion().equals("")) {
                    driveringStatus.setAppVersion("1.0");
                }

                String sAddress = "";
                if (driveringStatus.getCustomLocation().equals("") && driveringStatus.getCurrentLocation().equals("")) {
                    sAddress = this.GetGoogleAddress(driveringStatus.getLattitude(), driveringStatus.getLongitude());
                    driveringStatus.setCustomLocation(sAddress);
                    driveringStatus.setCurrentLocation(sAddress);
                }

                List<DriveringStatusViewDto> dsData = this.driveringStatusRepo
                        .findAndViewDriverStatusByDate(driveringStatus.getDriverId(), driveringStatus.getDateTime());
                if (dsData.size() <= 0) {
                    driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
                    Query query = new Query();
                    query.addCriteria(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                    Update update = new Update();
                    update.set("workingStatus", driveringStatus.getStatus());
                    update.set("updatedTimestamp", instant.toEpochMilli());
                    this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
                    Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                    Query queryLog = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()));
                    queryLog.limit(1);
                    queryLog.with(pageableRequest);
                    List<DriveringStatusViewDto> dsDataLog = this.mongoTemplate.find(queryLog, DriveringStatusViewDto.class, "drivering_status");
                    driverStatusLog.setLogDataId(dsDataLog.get(0).get_id());
                    driverStatusLog.setDriverId(driveringStatus.getDriverId());
                    driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
                    driverStatusLog.setClientId(driveringStatus.getClientId());
                    driverStatusLog.setStatus(driveringStatus.getStatus());
                    driverStatusLog.setLattitude(driveringStatus.getLattitude());
                    driverStatusLog.setLongitude(driveringStatus.getLongitude());
                    driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
                    driverStatusLog.setLogType(driveringStatus.getLogType());
                    driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
                    driverStatusLog.setOrigin(driveringStatus.getOrigin());
                    driverStatusLog.setOdometer(driveringStatus.getOdometer());
                    driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
                    driverStatusLog.setNote(driveringStatus.getNote());
                    driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
                    driverStatusLog.setIsReportGenerated(0);
                    driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                    driverStatusLog.setIsVisible(1);
                    List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(dsDataLog.get(0).get_id());
                    if (logDataExist.size() <= 0) {
                        this.driverStatusLogRepo.save(driverStatusLog);
                        this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                    }
                }
            } else {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime ldtDateTime = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
                long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                driveringStatus.setLDateTime(lDateTime);
                String logType = driveringStatus.getLogType();
                String sVoilationHour = logType.replaceAll("\\D+", "");
                int voilationHour = sVoilationHour.isEmpty() ? 0 : Integer.parseInt(sVoilationHour);
                driveringStatus.setVoilationHour(voilationHour);
                driveringStatus.setIsVisible(1);
                if (driveringStatus.getIsVoilation() > 0) {
                    driverStatusLog.setStatusId(0L);
                } else {
                    long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                    driverStatusLog = new DriverStatusLog();
                    if (maxId <= 0L) {
                        maxId = 1L;
                        driverStatusLog.setStatusId(maxId);
                    } else {
                        driverStatusLog.setStatusId(++maxId);
                    }
                }

                Instant instant = Instant.now();
                driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                if (driveringStatus.getAppVersion().equals("")) {
                    driveringStatus.setAppVersion("1.0");
                }

                List<DriveringStatusViewDto> dsData = this.driveringStatusRepo
                        .findAndViewDriverStatusByDate(driveringStatus.getDriverId(), driveringStatus.getDateTime());
                if (dsData.size() <= 0) {
                    driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
                    Query query = new Query();
                    query.addCriteria(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                    Update update = new Update();
                    update.set("workingStatus", driveringStatus.getStatus());
                    update.set("updatedTimestamp", instant.toEpochMilli());
                    this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
                    Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                    Query queryLog = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()));
                    queryLog.limit(1);
                    queryLog.with(pageableRequest);
                    List<DriveringStatusViewDto> dsDataLog = this.mongoTemplate.find(queryLog, DriveringStatusViewDto.class, "drivering_status");
                    driverStatusLog.setLogDataId(dsDataLog.get(0).get_id());
                    driverStatusLog.setDriverId(driveringStatus.getDriverId());
                    driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
                    driverStatusLog.setClientId(driveringStatus.getClientId());
                    driverStatusLog.setStatus(driveringStatus.getStatus());
                    driverStatusLog.setLattitude(driveringStatus.getLattitude());
                    driverStatusLog.setLongitude(driveringStatus.getLongitude());
                    driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
                    driverStatusLog.setLogType(driveringStatus.getLogType());
                    driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
                    driverStatusLog.setOrigin(driveringStatus.getOrigin());
                    driverStatusLog.setOdometer(driveringStatus.getOdometer());
                    driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
                    driverStatusLog.setNote(driveringStatus.getNote());
                    driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
                    driverStatusLog.setIsReportGenerated(0);
                    driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                    driverStatusLog.setIsVisible(1);
                    List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(dsDataLog.get(0).get_id());
                    if (logDataExist.size() <= 0) {
                        this.driverStatusLogRepo.save(driverStatusLog);
                        this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                    }
                }
            }

            DriveringStatusViewDto driverStatus = this.driveringStatusRepo
                    .findAndViewDriverStatusById(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
            if (driveringStatus.getOsVersion().equals("web")) {
                Query queryData = new Query(Criteria.where("dateTime").gte(driveringStatus.getUtcDateTime()).and("driverId").is(driveringStatus.getDriverId()));
                queryData.with(Sort.by(Direction.ASC, new String[]{"statusId"}));
                List<DriverStatusLog> dsLogList = this.mongoTemplate.find(queryData, DriverStatusLog.class, "driver_status_log");
                Query query = new Query();
                new Update();

                for (int i = 0; i < dsLogList.size(); ++i) {
                    long dsLogStatusId = driveringStatus.getStatusId() + (long) i;
                    query.addCriteria(Criteria.where("logDataId").is(dsLogList.get(i).getLogDataId()));
                    Update var29 = new Update();
                    var29.set("statusId", dsLogStatusId);
                    this.mongoTemplate.updateMulti(query, var29, DriverStatusLog.class);
                }
            }

            result.setResult(driverStatus);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Added Successfully");
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddDriveringStatusFromWeb(DriveringStatus driveringStatus) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "Save Log\n";

        try {
            long remainingWeeklyTime = 0L;
            long remainingDutyTime = 0L;
            long remainingDriveTime = 0L;
            long remainingSleepTime = 0L;
            int shift = 0;
            int days = 0;
            int lastDays = 0;
            int lastShift = 0;
            String currentStatus = driveringStatus.getStatus();
            String previousStatus = "";
            String nextStatus = "";
            boolean isDataSave = true;
            boolean isDayChange = false;
            long lastLogUtcDateTime = 0L;
            Integer isActive = driveringStatus.getIsActive();
            Instant instant = Instant.now();
            new DriverStatusLog();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
            long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            driveringStatus.setLDateTime(lDateTime);
            LocalDateTime ldt15DaysPlusDate = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
            ldt15DaysPlusDate = ldt15DaysPlusDate.plusDays(14L);
            LocalDateTime endOfDay15 = ldt15DaysPlusDate.withHour(23).withMinute(59).withSecond(59);
            long to = endOfDay15.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            ZonedDateTime currentDateTime = Instant.ofEpochMilli(lDateTime).atZone(ZoneId.systemDefault());
            ZonedDateTime startOfDay = currentDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault());
            long midnightTimestamp = startOfDay.toInstant().toEpochMilli();
            ZonedDateTime endOfDay = startOfDay.plusDays(1L).minusNanos(1000000L);
            long endOfDayTimestamp = endOfDay.toInstant().toEpochMilli();
            if (currentStatus.equalsIgnoreCase("Login")) {
                if (driveringStatus.getUtcDateTime() <= 0L) {
                    driveringStatus.setUtcDateTime(lDateTime);
                }

                LoginLog loginLog = new LoginLog();
                loginLog.setEmployeeId((int) driveringStatus.getDriverId());
                loginLog.setUserId(0);
                loginLog.setLoginDateTime(driveringStatus.getUtcDateTime());
                loginLog.setLogoutDateTime(0L);
                loginLog.setReceivedTimestamp(instant.toEpochMilli());
                loginLog.setIsCoDriver("0");
                loginLog.setLoginType(driveringStatus.getOsVersion() == null ? "web" : driveringStatus.getOsVersion());
                this.mongoTemplate.save(loginLog, "login_log");
                DriverStatusLog var61 = new DriverStatusLog();
                long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                if (maxId <= 0L) {
                    maxId = 1L;
                    var61.setStatusId(maxId);
                } else {
                    var61.setStatusId(++maxId);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                query.limit(1);
                query.with(pageableRequest);
                List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(query, LoginLogViewDto.class, "login_log");
                var61.setLogDataId(loginLogViewDto.get(0).get_id());
                var61.setDriverId(driveringStatus.getDriverId());
                var61.setVehicleId(driveringStatus.getVehicleId());
                var61.setClientId(driveringStatus.getClientId());
                var61.setStatus(currentStatus);
                var61.setLattitude(driveringStatus.getLattitude());
                var61.setLongitude(driveringStatus.getLongitude());
                var61.setDateTime(loginLogViewDto.get(0).getLoginDateTime());
                var61.setLogType(currentStatus);
                var61.setEngineHour(driveringStatus.getEngineHour());
                var61.setOrigin(driveringStatus.getOrigin());
                var61.setOdometer(driveringStatus.getOdometer());
                var61.setIsVoilation(driveringStatus.getIsVoilation());
                var61.setNote(driveringStatus.getNote());
                var61.setCustomLocation(driveringStatus.getCustomLocation());
                var61.setIsReportGenerated(1);
                var61.setReceivedTimestamp(instant.toEpochMilli());
                var61.setIsVisible(1);
                List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(loginLogViewDto.get(0).get_id());
                if (logDataExist.size() <= 0) {
                    this.driverStatusLogRepo.save(var61);
                    this.UpdateDriverSequenceId(driveringStatus.getDriverId(), loginLogViewDto.get(0).getLoginDateTime());
                }
            } else if (currentStatus.equalsIgnoreCase("Logout")) {
                if (driveringStatus.getUtcDateTime() <= 0L) {
                    driveringStatus.setUtcDateTime(lDateTime);
                }

                LoginLog loginLog = new LoginLog();
                loginLog.setEmployeeId((int) driveringStatus.getDriverId());
                loginLog.setUserId(0);
                loginLog.setLoginDateTime(0L);
                loginLog.setLogoutDateTime(driveringStatus.getUtcDateTime());
                loginLog.setReceivedTimestamp(instant.toEpochMilli());
                loginLog.setIsCoDriver("0");
                loginLog.setLoginType(driveringStatus.getOsVersion() == null ? "web" : driveringStatus.getOsVersion());
                this.mongoTemplate.save(loginLog, "login_log");
                DriverStatusLog var60 = new DriverStatusLog();
                long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                if (maxId <= 0L) {
                    maxId = 1L;
                    var60.setStatusId(maxId);
                } else {
                    var60.setStatusId(++maxId);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                query.limit(1);
                query.with(pageableRequest);
                List<LoginLogViewDto> loginLogViewDto = this.mongoTemplate.find(query, LoginLogViewDto.class, "login_log");
                var60.setLogDataId(loginLogViewDto.get(0).get_id());
                var60.setDriverId(driveringStatus.getDriverId());
                var60.setVehicleId(driveringStatus.getVehicleId());
                var60.setClientId(driveringStatus.getClientId());
                var60.setStatus(currentStatus);
                var60.setLattitude(driveringStatus.getLattitude());
                var60.setLongitude(driveringStatus.getLongitude());
                var60.setDateTime(loginLogViewDto.get(0).getLogoutDateTime());
                var60.setLogType(currentStatus);
                var60.setEngineHour(driveringStatus.getEngineHour());
                var60.setOrigin(driveringStatus.getOrigin());
                var60.setOdometer(driveringStatus.getOdometer());
                var60.setIsVoilation(driveringStatus.getIsVoilation());
                var60.setNote(driveringStatus.getNote());
                var60.setCustomLocation(driveringStatus.getCustomLocation());
                var60.setIsReportGenerated(1);
                var60.setReceivedTimestamp(instant.toEpochMilli());
                var60.setIsVisible(1);
                List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(loginLogViewDto.get(0).get_id());
                if (logDataExist.size() <= 0) {
                    this.driverStatusLogRepo.save(var60);
                    this.UpdateDriverSequenceId(driveringStatus.getDriverId(), loginLogViewDto.get(0).getLogoutDateTime());
                }
            } else {
                if (driveringStatus.getUtcDateTime() <= 0L) {
                    driveringStatus.setUtcDateTime(lDateTime);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query queryData = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()).and("utcDateTime").lt(driveringStatus.getUtcDateTime()));
                queryData.limit(1);
                queryData.with(pageableRequest);
                List<DriveringStatusLogViewDto> driveringStatusLastLog = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                if (driveringStatusLastLog.size() > 0) {
                    remainingWeeklyTime = Long.parseLong(driveringStatusLastLog.get(0).getRemainingWeeklyTime());
                    remainingDutyTime = Long.parseLong(driveringStatusLastLog.get(0).getRemainingDutyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusLastLog.get(0).getRemainingDriveTime());
                    remainingSleepTime = Long.parseLong(driveringStatusLastLog.get(0).getRemainingSleepTime());
                    shift = driveringStatusLastLog.get(0).getShift();
                    days = driveringStatusLastLog.get(0).getDays();
                    lastLogUtcDateTime = driveringStatusLastLog.get(0).getUtcDateTime();
                    previousStatus = driveringStatusLastLog.get(0).getStatus();
                } else {
                    EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driveringStatus.getDriverId());
                    CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                    remainingWeeklyTime = cycleUsaData.getCycleHour() * 60L * 60L;
                    remainingDutyTime = cycleUsaData.getOnDutyTime() * 60L * 60L;
                    remainingDriveTime = cycleUsaData.getOnDutyTime() * 60L * 60L;
                    remainingSleepTime = cycleUsaData.getOnSleepTime() * 60L * 60L;
                    shift = 1;
                    days = 1;
                    previousStatus = "OffDuty";
                }

                driveringStatus.setRemainingSleepTime(remainingSleepTime);
                driveringStatus.setShift(shift);
                driveringStatus.setDays(days);
                long totalSeconds = 0L;
                if (lastLogUtcDateTime > 0L) {
                    long duration = driveringStatus.getUtcDateTime() - lastLogUtcDateTime;
                    totalSeconds = Math.abs(duration) / 1000L;
                    driveringStatus.setRemainingDutyTime(remainingDutyTime - totalSeconds);
                    driveringStatus.setRemainingDriveTime(remainingDriveTime - totalSeconds);
                    driveringStatus.setRemainingWeeklyTime(remainingWeeklyTime - totalSeconds);
                }

                long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                DriverStatusLog driverStatusLog = new DriverStatusLog();
                if (maxId <= 0L) {
                    maxId = 1L;
                    driverStatusLog.setStatusId(maxId);
                } else {
                    driverStatusLog.setStatusId(++maxId);
                }

                driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                if (driveringStatus.getAppVersion().equals("")) {
                    driveringStatus.setAppVersion("1.0");
                }

                String sAddress = "";
                if (driveringStatus.getCustomLocation().equals("") && driveringStatus.getCurrentLocation().equals("")) {
                    sAddress = this.GetGoogleAddress(driveringStatus.getLattitude(), driveringStatus.getLongitude());
                    driveringStatus.setCustomLocation(sAddress);
                    driveringStatus.setCurrentLocation(sAddress);
                }

                List<DriveringStatusViewDto> dsData = this.driveringStatusRepo
                        .findAndViewDriverStatusByDate(driveringStatus.getDriverId(), driveringStatus.getDateTime());
                if (dsData.size() <= 0) {
                    sDebug = sDebug + "C | " + currentStatus + " P | " + previousStatus + " N | " + nextStatus + "\n";
                    if (!currentStatus.equals(nextStatus) && !currentStatus.equals(previousStatus)) {
                        driveringStatus.setIsVisible(1);
                        driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
                        Query query = new Query();
                        query.addCriteria(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                        Update update = new Update();
                        update.set("workingStatus", driveringStatus.getStatus());
                        update.set("updatedTimestamp", instant.toEpochMilli());
                        this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
                        DriveringStatusViewDto driverStatus = this.driveringStatusRepo
                                .findAndViewDriverStatusById(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                        driverStatusLog.setLogDataId(driverStatus.get_id());
                        driverStatusLog.setDriverId(driveringStatus.getDriverId());
                        driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
                        driverStatusLog.setClientId(driveringStatus.getClientId());
                        driverStatusLog.setStatus(driveringStatus.getStatus());
                        driverStatusLog.setLattitude(driveringStatus.getLattitude());
                        driverStatusLog.setLongitude(driveringStatus.getLongitude());
                        driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
                        driverStatusLog.setLogType(driveringStatus.getLogType());
                        driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
                        driverStatusLog.setOrigin(driveringStatus.getOrigin());
                        driverStatusLog.setOdometer(driveringStatus.getOdometer());
                        driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
                        driverStatusLog.setNote(driveringStatus.getNote());
                        driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
                        driverStatusLog.setIsReportGenerated(0);
                        driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                        driverStatusLog.setIsVisible(1);
                        List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(driverStatus.get_id());
                        if (logDataExist.size() <= 0) {
                            this.driverStatusLogRepo.save(driverStatusLog);
                            this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                        }
                    } else {
                        isDataSave = false;
                    }
                }

                this.EditDriverLog(
                        driveringStatus.getDriverId(),
                        lDateTime,
                        midnightTimestamp,
                        endOfDayTimestamp,
                        to,
                        totalSeconds,
                        lastLogUtcDateTime,
                        driveringStatus.getStatus(),
                        shift,
                        days
                );
            }

            long removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driveringStatus.getDriverId(), midnightTimestamp, endOfDayTimestamp, 1);
            this.CheckAllVoilations(driveringStatus.getDriverId(), midnightTimestamp, endOfDayTimestamp, to, shift, days);
            this.UpdateDriverSequenceId(driveringStatus.getDriverId(), lDateTime);
            this.SaveLog(sDebug);
            if (isDataSave) {
                result.setResult("Saved");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Added Successfully");
            } else {
                result.setResult("Not Save");
                result.setStatus(Result.FAIL);
                result.setMessage("This driver log already exist in before or after of current log.");
            }
        } catch (Exception var54) {
            result.setStatus(Result.FAIL);
            result.setMessage(var54.getLocalizedMessage());
        }

        return result;
    }

    public long lookupMaxIdOfDriverOperation(long driverId) {
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{
                    Aggregation.match(Criteria.where("driverId").is(driverId)), Aggregation.group(new String[0]).max("statusId").as("statusId")
                }
        );
        AggregationResults<MaxIdViewDto> result = this.mongoTemplate.aggregate(aggregation, "driver_status_log", MaxIdViewDto.class);
        List<MaxIdViewDto> results = result.getMappedResults();
        return results.isEmpty() ? -1L : results.get(0).getStatusId();
    }

    public void UpdateVehicleLog(ELDLogData liveDataLog) {
        String vehicleId = liveDataLog.getVehicleId();
        double speed = (double) liveDataLog.getSpeed();
        if (speed == 0.0) {
            if (!this.vehicleMap.containsKey(vehicleId)) {
                this.vehicleMap.put(vehicleId, liveDataLog);
                this.vehicleMsgMap.put(vehicleId, "Offline");
            } else {
                this.vehicleMsgMap.put(vehicleId, "Idle");
            }
        } else {
            this.vehicleMap.remove(vehicleId);
            this.vehicleMsgMap.remove(vehicleId);
        }
    }

    @Override
    public ResultWrapper<List<AddDriveringStatusResponseDto>> AddDriveringStatusOffline(AddDriveringStatusDto addDriveringStatusDto, String tokenValid) {
        ResultWrapper<List<AddDriveringStatusResponseDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            List<AddDriveringStatusResponseDto> AddDriveringStatusData = new ArrayList<>();
            new AddDriveringStatusResponseDto();
            DriverStatusLog driverStatusLog = new DriverStatusLog();
            ArrayList<DriveringStatus> driveringStatusData = addDriveringStatusDto.getDriveringStatusData();
            ArrayList<ELDLogData> eldLogStatusData = addDriveringStatusDto.getEldLogData();
            SplitLog splitLog = addDriveringStatusDto.getSplitLog();
            sDebug = sDebug + " >> " + eldLogStatusData + ",";
            String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(instant.toEpochMilli()));
            ELDLogData eldLogData = null;
            double dLattitude = 0.0;
            double dLongitude = 0.0;
            String sAddress = "";
            String timezoneName = "";
            String timezoneOffSet = "";
            new LiveDataLog();
            long MIN_IDLE_DURATION = 60000L;

            try {
                List<SplitLog> splitLogData = this.splitLogRepo.findSplitLogByDriverId(splitLog.getDriverId());
                sDebug = sDebug + "S : " + splitLogData.size() + ", " + splitLog;
                if (splitLogData.size() <= 0) {
                    splitLog.setUpdatedTimestamp(instant.toEpochMilli());
                    this.splitLogRepo.save(splitLog);
                } else {
                    Query query = new Query();
                    query.addCriteria(Criteria.where("driverId").is(splitLog.getDriverId()));
                    Update update = new Update();
                    update.set("dbId", splitLog.getDbId());
                    update.set("status", splitLog.getStatus());
                    update.set("splitTiming", splitLog.getSplitTiming());
                    update.set("shift", splitLog.getShift());
                    update.set("day", splitLog.getDay());
                    update.set("updatedTimestamp", instant.toEpochMilli());
                    this.mongoTemplate.findAndModify(query, update, SplitLog.class);
                }
            } catch (Exception var42) {
                var42.printStackTrace();
            }

            for (int i = 0; i < eldLogStatusData.size(); ++i) {
                eldLogData = eldLogStatusData.get(i);
                sDebug = sDebug + "0--" + eldLogData.getDateTime() + ",";
                LocalDateTime ldtDateTime = LocalDateTime.parse(eldLogData.getDateTime(), formatter);
                long lDateTime = ldtDateTime.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli();
                sDebug = sDebug + "1,";
                eldLogData.setLDateTime(lDateTime);
                eldLogData.setReceive_time(instant.toEpochMilli());
                eldLogData.setReceive_data_time(currentDateTime);
                sDebug = sDebug + "2,";
                String latLng = eldLogData.getLatLong();
                String[] splitLatLng = latLng.split("/");
                dLattitude = Double.valueOf(splitLatLng[0]);
                dLongitude = Double.valueOf(splitLatLng[1]);
                sDebug = sDebug + "3,";
                double[] point = new double[]{dLongitude, dLattitude};

                try {
                    GeofanceMaster lstGeofacne = this.geofanceMasterRepo.findByAreaIntersects(point);
                    eldLogData.setGeoStateId(lstGeofacne.getStateId());
                    List<StateMaster> states = this.stateMasterRepo.findAndViewByGeofanceId((long) lstGeofacne.getGeoId().intValue());
                    eldLogData.setStateId((long) states.get(0).getStateId().intValue());
                } catch (Exception var41) {
                    var41.printStackTrace();
                }

                eldLogData.setLattitude(dLattitude);
                eldLogData.setLongitude(dLongitude);
                sDebug = sDebug + "4,";
                sAddress = this.GetGoogleAddress(dLattitude, dLongitude);
                sDebug = sDebug + "5,";
                eldLogData.setPlaceAddress(sAddress);
                sDebug = sDebug + "6,";
                this.eldLogDataRepo.save(eldLogData);
                List<LiveDataLog> liveDataLogData = this.liveDataLogRepo.findAndViewLiveDataLog(eldLogData.getDriverId(), eldLogData.getMAC());
                if (liveDataLogData.size() <= 0) {
                    LiveDataLog liveDataLog = new LiveDataLog();
                    liveDataLog.setMAC(eldLogData.getMAC());
                    liveDataLog.setDateTime(eldLogData.getUtcDateTime());
                    liveDataLog.setDriverId(eldLogData.getDriverId());
                    liveDataLog.setLattitude(dLattitude);
                    liveDataLog.setLongitude(dLongitude);
                    liveDataLog.setPlaceAddress(sAddress);
                    liveDataLog.setModel(eldLogData.getModel());
                    liveDataLog.setOdometer(eldLogData.getOdometer());
                    liveDataLog.setClientId(eldLogData.getClientId());
                    liveDataLog.setSerialNo(eldLogData.getSerialNo());
                    liveDataLog.setSpeed(eldLogData.getSpeed());
                    liveDataLog.setVIN(eldLogData.getVIN());
                    liveDataLog.setVehicleId(eldLogData.getVehicleId());
                    liveDataLog.setVersion(eldLogData.getVersion());
                    liveDataLog.setReceive_time(instant.toEpochMilli());
                    this.liveDataLogRepo.save(liveDataLog);
                } else {
                    Query query = new Query();
                    query.addCriteria(Criteria.where("MAC").is(eldLogData.getMAC()).and("DriverId").is(eldLogData.getDriverId()));
                    Update update = new Update();
                    update.set("DateTime", eldLogData.getUtcDateTime());
                    update.set("Lattitude", dLattitude);
                    update.set("Longitude", dLongitude);
                    update.set("PlaceAddress", sAddress);
                    update.set("Model", eldLogData.getModel());
                    update.set("Odometer", eldLogData.getOdometer());
                    update.set("clientId", eldLogData.getClientId());
                    update.set("SerialNo", eldLogData.getSerialNo());
                    update.set("Speed", eldLogData.getSpeed());
                    update.set("VIN", eldLogData.getVIN());
                    update.set("VehicleId", eldLogData.getVehicleId());
                    update.set("Version", eldLogData.getVersion());
                    update.set("receive_time", instant.toEpochMilli());
                    this.mongoTemplate.findAndModify(query, update, LiveDataLog.class);
                    ELDLogData data = this.vehicleMap.get(eldLogData.getVehicleId());
                    String alertMsg = this.vehicleMsgMap.get(eldLogData.getVehicleId());
                    if (data != null) {
                        long durationInMillis = eldLogData.getUtcDateTime() - data.getUtcDateTime();
                        if (durationInMillis > 60000L) {
                            List<AlertsLog> alertLogData = this.alertsLogRepo
                                    .findAndViewByDriverIdAndUtcDateTime(Long.parseLong(eldLogData.getDriverId()), data.getUtcDateTime());
                            if (alertLogData.size() <= 0) {
                                AlertsLog alertsLog = new AlertsLog();
                                alertsLog.setDriverId(Long.parseLong(eldLogData.getDriverId()));
                                alertsLog.setVehicleId(Long.parseLong(eldLogData.getVehicleId()));
                                alertsLog.setClientId(eldLogData.getClientId());
                                alertsLog.setMAC(eldLogData.getMAC());
                                alertsLog.setModel(eldLogData.getModel());
                                alertsLog.setSerialNo(eldLogData.getSerialNo());
                                alertsLog.setVin(eldLogData.getVIN());
                                alertsLog.setVersion(eldLogData.getVersion());
                                alertsLog.setOdometer(eldLogData.getOdometer());
                                alertsLog.setStartUtcDateTime(data.getUtcDateTime());
                                alertsLog.setEndUtcDateTime(eldLogData.getUtcDateTime());
                                alertsLog.setDurationInMillis(durationInMillis);
                                alertsLog.setPlaceAddress(data.getPlaceAddress());
                                alertsLog.setMessage(alertMsg);
                                alertsLog.setIsRead(0);
                                alertsLog.setLattitude(data.getLattitude());
                                alertsLog.setLongitude(data.getLongitude());
                                alertsLog.setAddedTimestamp(instant.toEpochMilli());
                                this.alertsLogRepo.save(alertsLog);
                            } else {
                                query = new Query();
                                query.addCriteria(
                                        Criteria.where("driverId").is(Long.parseLong(eldLogData.getDriverId())).and("startUtcDateTime").is(data.getUtcDateTime())
                                );
                                update = new Update();
                                update.set("endUtcDateTime", eldLogData.getUtcDateTime());
                                update.set("durationInMillis", durationInMillis);
                                this.mongoTemplate.findAndModify(query, update, AlertsLog.class);
                            }
                        }
                    }

                    this.UpdateVehicleLog(eldLogData);
                }
            }

            DriveringStatus driveringStatus = null;

            for (int i = 0; i < driveringStatusData.size(); ++i) {
                driveringStatus = driveringStatusData.get(i);
                String logType = driveringStatus.getLogType();
                String sVoilationHour = logType.replaceAll("\\D+", "");
                int voilationHour = sVoilationHour.isEmpty() ? 0 : Integer.parseInt(sVoilationHour);
                driveringStatus.setVoilationHour(voilationHour);
                if (tokenValid.equals("true")) {
                    LocalDateTime ldtDateTime = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
                    long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    driveringStatus.setLDateTime(lDateTime);
                    if (driveringStatus.getIsVoilation() > 0) {
                        driverStatusLog.setStatusId(0L);
                    } else {
                        long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                        driverStatusLog = new DriverStatusLog();
                        if (maxId <= 0L) {
                            maxId = 1L;
                            driverStatusLog.setStatusId(maxId);
                        } else {
                            driverStatusLog.setStatusId(++maxId);
                        }
                    }

                    driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                    if (driveringStatus.getAppVersion().equals("")) {
                        driveringStatus.setAppVersion("1.0");
                    }

                    sAddress = "";
                    if (driveringStatus.getCustomLocation().equals("") && driveringStatus.getCurrentLocation().equals("")) {
                        sAddress = this.GetGoogleAddress(driveringStatus.getLattitude(), driveringStatus.getLongitude());
                        driveringStatus.setCustomLocation(sAddress);
                        driveringStatus.setCurrentLocation(sAddress);
                    }

                    List<DriveringStatusViewDto> dsData = this.driveringStatusRepo
                            .findAndViewDriverStatusByDate(driveringStatus.getDriverId(), driveringStatus.getDateTime());
                    if (dsData.size() <= 0) {
                        driveringStatus.setIsVisible(1);
                        driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
                        Query query = new Query();
                        query.addCriteria(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                        Update update = new Update();
                        update.set("workingStatus", driveringStatus.getStatus());
                        update.set("updatedTimestamp", driveringStatus.getUtcDateTime());
                        this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
                        Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query queryLog = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()));
                        queryLog.limit(1);
                        queryLog.with(pageableRequest);
                        List<DriveringStatusViewDto> dsDataLog = this.mongoTemplate.find(queryLog, DriveringStatusViewDto.class, "drivering_status");
                        driverStatusLog.setLogDataId(dsDataLog.get(0).get_id());
                        driverStatusLog.setDriverId(driveringStatus.getDriverId());
                        driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
                        driverStatusLog.setClientId(driveringStatus.getClientId());
                        driverStatusLog.setStatus(driveringStatus.getStatus());
                        driverStatusLog.setLattitude(driveringStatus.getLattitude());
                        driverStatusLog.setLongitude(driveringStatus.getLongitude());
                        driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
                        driverStatusLog.setLogType(driveringStatus.getLogType());
                        driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
                        driverStatusLog.setOrigin(driveringStatus.getOrigin());
                        driverStatusLog.setOdometer(driveringStatus.getOdometer());
                        driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
                        driverStatusLog.setNote(driveringStatus.getNote());
                        driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
                        driverStatusLog.setIsReportGenerated(0);
                        driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                        driverStatusLog.setIsVisible(1);
                        List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(dsDataLog.get(0).get_id());
                        if (logDataExist.size() <= 0) {
                            this.driverStatusLogRepo.save(driverStatusLog);
                            this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                        }
                    }
                } else {
                    LocalDateTime ldtDateTime = LocalDateTime.parse(driveringStatus.getDateTime(), formatter);
                    long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    driveringStatus.setLDateTime(lDateTime);
                    if (driveringStatus.getIsVoilation() > 0) {
                        driverStatusLog.setStatusId(0L);
                    } else {
                        long maxId = this.lookupMaxIdOfDriverOperation(driveringStatus.getDriverId());
                        driverStatusLog = new DriverStatusLog();
                        if (maxId <= 0L) {
                            maxId = 1L;
                            driverStatusLog.setStatusId(maxId);
                        } else {
                            driverStatusLog.setStatusId(++maxId);
                        }
                    }

                    driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
                    if (driveringStatus.getAppVersion().equals("")) {
                        driveringStatus.setAppVersion("1.0");
                    }

                    List<DriveringStatusViewDto> dsData = this.driveringStatusRepo
                            .findAndViewDriverStatusByDate(driveringStatus.getDriverId(), driveringStatus.getDateTime());
                    if (dsData.size() <= 0) {
                        driveringStatus.setIsVisible(1);
                        driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
                        Query query = new Query();
                        query.addCriteria(Criteria.where("employeeId").is(driveringStatus.getDriverId()));
                        Update update = new Update();
                        update.set("workingStatus", driveringStatus.getStatus());
                        update.set("updatedTimestamp", instant.toEpochMilli());
                        this.mongoTemplate.findAndModify(query, update, EmployeeMaster.class);
                        Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query queryLog = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()));
                        queryLog.limit(1);
                        queryLog.with(pageableRequest);
                        List<DriveringStatusViewDto> dsDataLog = this.mongoTemplate.find(queryLog, DriveringStatusViewDto.class, "drivering_status");
                        driverStatusLog.setLogDataId(dsDataLog.get(0).get_id());
                        driverStatusLog.setDriverId(driveringStatus.getDriverId());
                        driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
                        driverStatusLog.setClientId(driveringStatus.getClientId());
                        driverStatusLog.setStatus(driveringStatus.getStatus());
                        driverStatusLog.setLattitude(driveringStatus.getLattitude());
                        driverStatusLog.setLongitude(driveringStatus.getLongitude());
                        driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
                        driverStatusLog.setLogType(driveringStatus.getLogType());
                        driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
                        driverStatusLog.setOrigin(driveringStatus.getOrigin());
                        driverStatusLog.setOdometer(driveringStatus.getOdometer());
                        driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
                        driverStatusLog.setNote(driveringStatus.getNote());
                        driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
                        driverStatusLog.setIsReportGenerated(0);
                        driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                        driverStatusLog.setIsVisible(1);
                        List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(dsDataLog.get(0).get_id());
                        if (logDataExist.size() <= 0) {
                            this.driverStatusLogRepo.save(driverStatusLog);
                            this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                        }
                    }
                }

                DriveringStatusViewDto driverStatus = this.driveringStatusRepo
                        .findAndViewDriverStatusById(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
                String objId = driverStatus.get_id();
                AddDriveringStatusResponseDto addDriveringStatus = new AddDriveringStatusResponseDto();
                addDriveringStatus.setLocalId(driveringStatus.getLocalId());
                addDriveringStatus.setServerId(objId);
                AddDriveringStatusData.add(addDriveringStatus);
            }

            result.setResult(AddDriveringStatusData);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Added Successfully" + sDebug);
        } catch (Exception var43) {
            result.setStatus(Result.FAIL);
            result.setMessage(var43.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    private String GetGoogleAddress(double lat, double lng) {
        String sAddress = "";

        try {
            this.SaveLog(lat + " :: " + lng);
            String sUrl = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + lat + "," + lng + "&key=AIzaSyBR2Xiu4PJOVrPD125X0X7qUnC0H72NTus";
            URL url = new URL(sUrl);
            URLConnection conn = url.openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/4.76");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder result = new StringBuilder();

            String text;
            while ((text = in.readLine()) != null) {
                result.append(text);
            }

            in.close();
            JSONObject jObject = new JSONObject(result.toString());
            if (jObject.has("error")) {
                System.err.println(jObject.get("error"));
                return "Invalid Location";
            }

            JSONObject location = jObject.getJSONArray("results").getJSONObject(0);
            sAddress = location.getString("formatted_address");
            this.SaveLog(sAddress);
        } catch (IOException var14) {
            System.out.println("Get Address Error: " + var14.getMessage());
            return sAddress;
        } catch (Exception var15) {
            System.out.println("Get Address Error: " + var15.getMessage());
        }

        return sAddress;
    }

    public List<Map<String, Object>> callReportCreateMethods(long driverId, long from, long to, String logType, String driverName) {
        List<Map<String, Object>> finalList = new ArrayList<>();
        if (logType.equals("driver_log")) {
            System.out.println(">> Processing Driver Log PDF");
            finalList.add(this.dispatchServiceImpl.createDriverLogStatusPDF(driverId, from, to, driverName));
        } else if (logType.equals("dvir_log")) {
            System.out.println(">> Processing DVIR Log PDF");
            finalList.add(this.dispatchServiceImpl.createDVIRLogStatusPDF(driverId, from, to, driverName));
        }

        System.out.println("+++++ Finish +++++");
        return finalList;
    }

    public PdfPTable getReportHeader(String reportName, Integer cols, String driverName) {
        try {
            PdfPTable table = new PdfPTable(cols);
            table.setWidthPercentage(100.0F);
            BaseFont baseFont = BaseFont.createFont("Courier-Bold", "Cp1250", true);
            Font font = new Font(baseFont, 14.0F, 0);
            PdfPCell logo = new PdfPCell(new Paragraph("ELD NEXT", font));
            logo.setVerticalAlignment(1);
            logo.setHorizontalAlignment(1);
            int iColSpan = 0;
            logo.setPadding(4.0F);
            logo.setPaddingLeft(20.0F);
            table.addCell(logo);
            PdfPCell name = new PdfPCell(new Paragraph(reportName, font));
            name.setVerticalAlignment(1);
            name.setHorizontalAlignment(1);
            name.setColspan(cols - iColSpan);
            name.setPadding(15.0F);
            table.addCell(name);
            BaseFont headreDataBaseFont = BaseFont.createFont("Courier-Bold", "Cp1250", true);
            new Font(headreDataBaseFont, 12.0F, 0);
            Font headerDataFontColor = new Font(headreDataBaseFont, 12.0F, 0);
            headerDataFontColor.setColor(0, 0, 0);
            BaseColor backgroundColor = new BaseColor(135, 206, 235);
            int datacol = cols / 6;
            PdfPCell driverNameHeading = new PdfPCell(new Paragraph("Driver Name :", headerDataFontColor));
            driverNameHeading.setVerticalAlignment(1);
            driverNameHeading.setHorizontalAlignment(1);
            driverNameHeading.setPadding(4.0F);
            driverNameHeading.setColspan(datacol);
            driverNameHeading.setRowspan(1);
            driverNameHeading.setBackgroundColor(backgroundColor);
            table.addCell(driverNameHeading);
            PdfPCell statusHeading = new PdfPCell(new Paragraph(driverName, headerDataFontColor));
            statusHeading.setVerticalAlignment(1);
            statusHeading.setHorizontalAlignment(1);
            statusHeading.setPadding(4.0F);
            if (reportName.equals("DVIR Log Status")) {
                statusHeading.setColspan(5);
            } else {
                statusHeading.setColspan(2);
            }

            statusHeading.setRowspan(1);
            statusHeading.setBackgroundColor(backgroundColor);
            table.addCell(statusHeading);
            return table;
        } catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private Image generate24HourGraphImage(List<DriveringStatusViewDto> logs, long fromMillis, long toMillis) {
        try {
            XYSeries series = new XYSeries("Status");
            if (logs != null && logs.size() > 0) {
                for (DriveringStatusViewDto dto : logs) {
                    long lTime = dto.getLDateTime();
                    if (lTime <= 0) {
                        lTime = dto.getUtcDateTime();
                    }
                    double hourOffset = (double) (lTime - fromMillis) / 3600000.0;
                    if (hourOffset < 0.0) {
                        hourOffset = 0.0;
                    }
                    if (hourOffset > 24.0) {
                        hourOffset = 24.0;
                    }

                    double statusVal = 1.0;
                    String st = (dto.getStatus() != null) ? dto.getStatus() : "";
                    if ("OffDuty".equalsIgnoreCase(st) || "OFF".equalsIgnoreCase(st)) {
                        statusVal = 4.0;
                    } else if ("OnSleep".equalsIgnoreCase(st) || "Sleeper".equalsIgnoreCase(st) || "SB".equalsIgnoreCase(st)) {
                        statusVal = 3.0;
                    } else if ("OnDrive".equalsIgnoreCase(st) || "Driving".equalsIgnoreCase(st) || "D".equalsIgnoreCase(st)) {
                        statusVal = 2.0;
                    } else if ("OnDuty".equalsIgnoreCase(st) || "ON".equalsIgnoreCase(st) || "YardMove".equalsIgnoreCase(st) || "PersonalUse".equalsIgnoreCase(st)) {
                        statusVal = 1.0;
                    }

                    series.add(hourOffset, statusVal);
                }
            } else {
                series.add(0.0, 4.0);
                series.add(24.0, 4.0);
            }

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series);

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "",
                    "Hours (00:00 - 24:00)",
                    "Duty Status",
                    dataset,
                    PlotOrientation.VERTICAL,
                    false,
                    false,
                    false
            );

            XYPlot plot = chart.getXYPlot();
            plot.setBackgroundPaint(java.awt.Color.WHITE);
            plot.setDomainGridlinePaint(java.awt.Color.LIGHT_GRAY);
            plot.setRangeGridlinePaint(java.awt.Color.LIGHT_GRAY);

            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, false);
            renderer.setSeriesPaint(0, new java.awt.Color(4, 53, 109));
            renderer.setSeriesStroke(0, new BasicStroke(2.5f));
            plot.setRenderer(renderer);

            SymbolAxis yAxis = new SymbolAxis("", new String[]{"", "ON DUTY", "DRIVING", "SLEEPER", "OFF DUTY"});
            yAxis.setGridBandsVisible(false);
            plot.setRangeAxis(yAxis);

            BufferedImage chartImage = chart.createBufferedImage(800, 180, null);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(chartImage, "png", baos);
            Image pdfChartImage = Image.getInstance(baos.toByteArray());
            pdfChartImage.scaleToFit(540.0F, 130.0F);
            pdfChartImage.setAlignment(Element.ALIGN_CENTER);
            return pdfChartImage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void addCellPair(PdfPTable table, String label, String value, Font labelFont, Font valueFont) {
        PdfPCell lCell = new PdfPCell(new Phrase(label, labelFont));
        lCell.setPadding(4.0F);
        lCell.setBorderColor(BaseColor.LIGHT_GRAY);
        lCell.setBackgroundColor(new BaseColor(240, 243, 246));

        PdfPCell vCell = new PdfPCell(new Phrase(value != null ? value : "", valueFont));
        vCell.setPadding(4.0F);
        vCell.setBorderColor(BaseColor.LIGHT_GRAY);

        table.addCell(lCell);
        table.addCell(vCell);
    }

    private void addTableHeader(PdfPTable table, String[] headers, Font font, BaseColor bg) {
        for (String h : headers) {
            PdfPCell cell = new PdfPCell(new Phrase(h, font));
            cell.setBackgroundColor(bg);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPadding(5.0F);
            table.addCell(cell);
        }
    }

    private void addTableRow(PdfPTable table, String[] values, Font font, BaseColor bg) {
        for (int i = 0; i < values.length; i++) {
            PdfPCell cell = new PdfPCell(new Phrase(values[i] != null ? values[i] : "", font));
            cell.setBackgroundColor(bg);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPadding(4.0F);
            if (i == 0 || i == 1 || i == 4 || i == 5) {
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            }
            table.addCell(cell);
        }
    }

    public Map<String, Object> createDriverLogStatusPDF(long driverId, long from, long to, String sDriverName) {
        Map<String, Object> finalMap = new LinkedHashMap<>();

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Document document = new Document(PageSize.A4, 25.0F, 25.0F, 25.0F, 25.0F);
            PdfWriter.getInstance(document, outputStream);

            Font titleFont = new Font(FontFamily.HELVETICA, 13.0F, Font.BOLD, new BaseColor(4, 53, 109));
            Font labelFont = new Font(FontFamily.HELVETICA, 8.0F, Font.BOLD, BaseColor.BLACK);
            Font valueFont = new Font(FontFamily.HELVETICA, 8.0F, Font.NORMAL, BaseColor.DARK_GRAY);
            Font tableHeaderFont = new Font(FontFamily.HELVETICA, 8.0F, Font.BOLD, BaseColor.WHITE);
            Font tableDataFont = new Font(FontFamily.HELVETICA, 7.5F, Font.NORMAL, BaseColor.BLACK);

            BaseColor headerBg = new BaseColor(4, 53, 109);
            BaseColor alternateRowBg = new BaseColor(245, 247, 250);

            document.open();

            // Fetch driver metadata
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
            String driverName = (empInfo != null) ? empInfo.getFirstName() + " " + empInfo.getLastName() : sDriverName;
            String cdlNo = (empInfo != null && empInfo.getCdlNo() != null) ? empInfo.getCdlNo() : "";
            String username = (empInfo != null && empInfo.getUsername() != null) ? empInfo.getUsername() : "";

            ClientMaster clientInfo = (empInfo != null && empInfo.getClientId() > 0) ? this.clientMasterRepo.findByClientId((int) empInfo.getClientId()) : null;
            String companyName = (clientInfo != null && clientInfo.getClientName() != null) ? clientInfo.getClientName() : "GBT USA";
            String dotNo = (clientInfo != null && clientInfo.getDotNo() != null) ? clientInfo.getDotNo() : "";

            VehicleMaster vehInfo = (empInfo != null && empInfo.getTruckNo() > 0) ? this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo()) : null;
            String vehicleNo = (vehInfo != null && vehInfo.getVehicleNo() != null) ? vehInfo.getVehicleNo() : "";
            String vin = (vehInfo != null && vehInfo.getVin() != null) ? vehInfo.getVin() : "";

            MainTerminalMaster terminal = (empInfo != null && empInfo.getMainTerminalId() > 0) ? this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId()) : null;
            String terminalName = (terminal != null && terminal.getMainTerminalName() != null) ? terminal.getMainTerminalName() : "";

            List<ELDSettings> settings = this.eldSettingsRepo.findAndViewBySettingId(1);
            String eldProvider = (settings.size() > 0 && settings.get(0).getEldProvider() != null) ? settings.get(0).getEldProvider() : "gbt-usa";
            String eldRegistrationId = (settings.size() > 0 && settings.get(0).getEldRegistrationId() != null) ? settings.get(0).getEldRegistrationId() : "NA";

            List<CertifiedLogViewDto> certifiedLogs = this.lookupCertifiedLogDataOperation(from, to, driverId);
            String coDriverName = "None";
            String trailers = "None";
            String shippingDocs = "None";
            String signaturePath = null;
            if (certifiedLogs.size() > 0) {
                CertifiedLogViewDto cert = certifiedLogs.get(0);
                if (cert.getCoDriverId() > 0) {
                    EmployeeMaster coEmp = this.employeeMasterRepo.findByEmployeeId((int) cert.getCoDriverId());
                    if (coEmp != null) {
                        coDriverName = coEmp.getFirstName() + " " + coEmp.getLastName();
                    }
                }
                if (cert.getTrailers() != null && cert.getTrailers().size() > 0) {
                    trailers = String.join(", ", cert.getTrailers());
                }
                if (cert.getShippingDocs() != null && cert.getShippingDocs().size() > 0) {
                    shippingDocs = String.join(", ", cert.getShippingDocs());
                }
                signaturePath = cert.getCertifiedSignature();
            }

            List<DriveringStatusViewDto> driverLogs = this.lookupDriverStatusDataOperation(from, to, driverId);

            // Calculate odometer & engine hours
            double startOdo = 0.0, endOdo = 0.0, totalDistance = 0.0;
            String startEngineHr = "0.0", endEngineHr = "0.0";
            try {
                Pageable ascPage = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
                Query qAsc = new Query(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                qAsc.with(ascPage);
                List<DriveringStatusViewDto> ascList = this.mongoTemplate.find(qAsc, DriveringStatusViewDto.class, "drivering_status");
                if (ascList.size() > 0) {
                    startOdo = ascList.get(0).getOdometer();
                    startEngineHr = (ascList.get(0).getEngineHour() != null) ? ascList.get(0).getEngineHour() : "0.0";
                }

                Pageable descPage = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                Query qDesc = new Query(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                qDesc.with(descPage);
                List<DriveringStatusViewDto> descList = this.mongoTemplate.find(qDesc, DriveringStatusViewDto.class, "drivering_status");
                if (descList.size() > 0) {
                    endOdo = descList.get(0).getOdometer();
                    endEngineHr = (descList.get(0).getEngineHour() != null) ? descList.get(0).getEngineHour() : "0.0";
                }
                if (endOdo >= startOdo && startOdo > 0) {
                    totalDistance = endOdo - startOdo;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd");
            String reportDateStr = dfDate.format(new Date(from));

            // Document Title Header
            Paragraph titleP = new Paragraph("DRIVER'S RECORD OF DUTY STATUS (DOT ELD REPORT)", titleFont);
            titleP.setAlignment(Element.ALIGN_CENTER);
            titleP.setSpacingAfter(8.0F);
            document.add(titleP);

            // --- METADATA HEADER GRID (A to Z Details) ---
            PdfPTable headerTable = new PdfPTable(4);
            headerTable.setWidthPercentage(100.0F);
            headerTable.setWidths(new float[]{2.0F, 3.0F, 2.0F, 3.0F});
            headerTable.setSpacingAfter(8.0F);

            addCellPair(headerTable, "Date:", reportDateStr, labelFont, valueFont);
            addCellPair(headerTable, "Driver Name:", driverName, labelFont, valueFont);
            addCellPair(headerTable, "Driver Username:", username, labelFont, valueFont);
            addCellPair(headerTable, "Co-Driver Name:", coDriverName, labelFont, valueFont);

            addCellPair(headerTable, "Carrier / Company:", companyName, labelFont, valueFont);
            addCellPair(headerTable, "USDOT Number:", dotNo, labelFont, valueFont);
            addCellPair(headerTable, "Main Terminal:", terminalName, labelFont, valueFont);
            addCellPair(headerTable, "CDL No / State:", cdlNo, labelFont, valueFont);

            addCellPair(headerTable, "Vehicle / Truck No:", vehicleNo, labelFont, valueFont);
            addCellPair(headerTable, "VIN Number:", vin, labelFont, valueFont);
            addCellPair(headerTable, "Trailer(s):", trailers, labelFont, valueFont);
            addCellPair(headerTable, "Shipping Doc(s):", shippingDocs, labelFont, valueFont);

            addCellPair(headerTable, "Start Odometer:", String.format("%.2f", startOdo), labelFont, valueFont);
            addCellPair(headerTable, "End Odometer:", String.format("%.2f", endOdo), labelFont, valueFont);
            addCellPair(headerTable, "Distance Traveled:", String.format("%.2f miles", totalDistance), labelFont, valueFont);
            addCellPair(headerTable, "Engine Hours:", startEngineHr + " - " + endEngineHr, labelFont, valueFont);

            addCellPair(headerTable, "ELD Provider:", eldProvider, labelFont, valueFont);
            addCellPair(headerTable, "ELD Registration ID:", eldRegistrationId, labelFont, valueFont);

            document.add(headerTable);

            // --- 24-HOUR DUTY STATUS GRAPH CHART ---
            try {
                Image graphImg = generate24HourGraphImage(driverLogs, from, to);
                if (graphImg != null) {
                    Paragraph graphTitle = new Paragraph("24-HOUR DUTY STATUS GRAPH", new Font(FontFamily.HELVETICA, 9.0F, Font.BOLD, headerBg));
                    graphTitle.setSpacingAfter(4.0F);
                    document.add(graphTitle);
                    document.add(graphImg);
                    document.add(Chunk.NEWLINE);
                }
            } catch (Exception graphEx) {
                graphEx.printStackTrace();
            }

            // --- DUTY STATUS EVENT LOGS TABLE (A to Z Status Logs) ---
            Paragraph logSecTitle = new Paragraph("DUTY STATUS EVENT LOGS", new Font(FontFamily.HELVETICA, 10.0F, Font.BOLD, headerBg));
            logSecTitle.setSpacingAfter(5.0F);
            document.add(logSecTitle);

            PdfPTable logTable = new PdfPTable(7);
            logTable.setWidthPercentage(100.0F);
            logTable.setWidths(new float[]{1.8F, 2.8F, 1.8F, 3.5F, 2.0F, 2.0F, 2.5F});
            logTable.setSpacingAfter(12.0F);

            addTableHeader(logTable, new String[]{"Status", "Time", "Duration", "Location", "Odometer", "Eng. Hours", "Notes / Origin"}, tableHeaderFont, headerBg);

            for (int i = 0; i < driverLogs.size(); i++) {
                DriveringStatusViewDto row = driverLogs.get(i);
                BaseColor rowBg = (i % 2 == 0) ? BaseColor.WHITE : alternateRowBg;

                String statusStr = (row.getStatus() != null) ? row.getStatus() : "";
                String timeStr = (row.getDateTime() != null) ? row.getDateTime() : "";
                String locStr = (row.getCustomLocation() != null && !row.getCustomLocation().isEmpty()) ? row.getCustomLocation() : (row.getLattitude() + ", " + row.getLongitude());
                String odoStr = String.format("%.1f", row.getOdometer());
                String engHrStr = (row.getEngineHour() != null) ? row.getEngineHour() : "0.0";
                String noteOrigin = (row.getNote() != null && !row.getNote().isEmpty()) ? row.getNote() : ((row.getOrigin() != null) ? row.getOrigin() : "");

                addTableRow(logTable, new String[]{statusStr, timeStr, "-", locStr, odoStr, engHrStr, noteOrigin}, tableDataFont, rowBg);
            }

            if (driverLogs.size() == 0) {
                PdfPCell emptyCell = new PdfPCell(new Phrase("No duty status log records found for this period.", tableDataFont));
                emptyCell.setColspan(7);
                emptyCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                emptyCell.setPadding(8.0F);
                logTable.addCell(emptyCell);
            }

            document.add(logTable);

            // --- DRIVER CERTIFICATION & SIGNATURE ---
            Paragraph certTitle = new Paragraph("DRIVER CERTIFICATION", new Font(FontFamily.HELVETICA, 10.0F, Font.BOLD, headerBg));
            certTitle.setSpacingAfter(4.0F);
            document.add(certTitle);

            Paragraph certStmt = new Paragraph("I hereby certify that my data entries and my record of duty status for this 24-hour period are true and correct.", valueFont);
            certStmt.setSpacingAfter(6.0F);
            document.add(certStmt);

            if (signaturePath != null && !signaturePath.isEmpty()) {
                try {
                    String fullSignUrl = "https://admin.gbt-usa.com/uploads/certified_signature/" + signaturePath;
                    Image signImg = Image.getInstance(new URL(fullSignUrl));
                    signImg.scaleToFit(160.0F, 50.0F);
                    document.add(signImg);
                } catch (Exception signEx) {
                    document.add(new Paragraph("[Signed Electronically by " + driverName + "]", valueFont));
                }
            } else {
                document.add(new Paragraph("[Signed Electronically by " + driverName + "]", valueFont));
            }

            document.close();

            finalMap.put("outputStream", outputStream);
            finalMap.put("fileName", "driver_log_" + driverId + ".pdf");
            finalMap.put("subject", "Driver Log Status Report");
            finalMap.put("text", "Attached is the complete Driver Record of Duty Status report for " + driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return finalMap;
    }

    public Map<String, Object> createDVIRLogStatusPDF_old(long driverId, long from, long to, String sDriverName) {
        Map<String, Object> finalMap = new LinkedHashMap<>();

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, outputStream);
            Font headerFont = new Font(FontFamily.HELVETICA, 11.0F, 1);
            Font dataFont = new Font(FontFamily.HELVETICA, 10.0F, 0);
            document.open();
            Paragraph title = new Paragraph("DVIR", new Font(FontFamily.HELVETICA, 16.0F, 1));
            title.setAlignment(1);
            document.add(title);
            document.add(Chunk.NEWLINE);
            List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(from, to, driverId);
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) dvirDataViewDto.get(0).getVehicleId());
            String vin = vehcileInfo.getVin();
            String vehicleNo = vehcileInfo.getVehicleNo();
            String driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
            String companyName = clientInfo.getClientName();
            String dateTime = dvirDataViewDto.size() > 0 ? dvirDataViewDto.get(0).getDateTime() : "";
            String location = dvirDataViewDto.size() > 0 ? dvirDataViewDto.get(0).getLocation() : "";
            String trailer = dvirDataViewDto.size() > 0 ? String.join(",", dvirDataViewDto.get(0).getTrailer()) : "None";
            String vehicleDefect = dvirDataViewDto.size() > 0 ? String.join(",", dvirDataViewDto.get(0).getTruckDefect()) : "None";
            String trailerDefect = dvirDataViewDto.size() > 0 ? String.join(",", dvirDataViewDto.get(0).getTrailerDefect()) : "None";
            String remarks = dvirDataViewDto.get(0).getNotes();
            String odometer = dvirDataViewDto.size() > 0 ? String.valueOf(dvirDataViewDto.get(0).getOdometer()) : "0";
            String engineHour = dvirDataViewDto.size() > 0 ? String.valueOf(dvirDataViewDto.get(0).getEngineHour()) : "0";
            String signaturePath = dvirDataViewDto.get(0).getDriverSignFile();
            PdfPTable mainTable = new PdfPTable(2);
            mainTable.setWidthPercentage(100.0F);
            mainTable.setSpacingBefore(10.0F);
            mainTable.addCell(this.getCell("TIME", 0, headerFont));
            mainTable.addCell(this.getCell("LOCATION", 0, headerFont));
            mainTable.addCell(this.getCell(dateTime, 0, dataFont));
            mainTable.addCell(this.getCell(location, 0, dataFont));
            mainTable.addCell(this.getCell("DRIVER", 0, headerFont));
            mainTable.addCell(this.getCell("COMPANY", 0, headerFont));
            mainTable.addCell(this.getCell(driverName, 0, dataFont));
            mainTable.addCell(this.getCell(companyName, 0, dataFont));
            mainTable.addCell(this.getCell("VEHICLE", 0, headerFont));
            mainTable.addCell(this.getCell("TRAILER", 0, headerFont));
            mainTable.addCell(this.getCell(vehicleNo, 0, dataFont));
            mainTable.addCell(this.getCell(trailer, 0, dataFont));
            mainTable.addCell(this.getCell("VIN", 0, headerFont));
            mainTable.addCell(this.getCell(vin, 0, dataFont));
            mainTable.addCell(this.getCell("VEHICLE DEFECTS", 0, headerFont));
            mainTable.addCell(this.getCell("TRAILER DEFECTS", 0, headerFont));
            mainTable.addCell(this.getCell(vehicleDefect, 0, dataFont));
            mainTable.addCell(this.getCell(trailerDefect, 0, dataFont));
            mainTable.addCell(this.getCell("ODOMETER", 0, headerFont));
            mainTable.addCell(this.getCell("ENGINE HOUR", 0, headerFont));
            mainTable.addCell(this.getCell(odometer, 0, dataFont));
            mainTable.addCell(this.getCell(engineHour, 0, dataFont));
            PdfPCell remarksHeader = this.getCell("REMARKS", 0, headerFont);
            remarksHeader.setColspan(2);
            mainTable.addCell(remarksHeader);
            PdfPCell remarksData = this.getCell(remarks, 0, dataFont);
            remarksData.setColspan(2);
            mainTable.addCell(remarksData);
            document.add(mainTable);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Signed by the driver " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()), dataFont));
            document.add(Chunk.NEWLINE);
            if (signaturePath != null) {
                try {
                    Image signImg = Image.getInstance("/opt/tomcat/webapps/uploads/dvir/" + signaturePath);
                    signImg.scaleToFit(200.0F, 80.0F);
                    PdfPTable signTable = new PdfPTable(1);
                    signTable.setWidthPercentage(40.0F);
                    PdfPCell signCell = new PdfPCell(signImg);
                    signCell.setBorder(15);
                    signCell.setPadding(6.0F);
                    signTable.addCell(signCell);
                    document.add(signTable);
                } catch (Exception var37) {
                    document.add(new Paragraph("[Signature not available]", dataFont));
                }
            }

            document.close();
            finalMap.put("outputStream", outputStream);
            finalMap.put("fileName", "dvir_log.pdf");
            finalMap.put("subject", "DVIR Report");
            finalMap.put("text", "This is a DVIR report");
        } catch (Exception var38) {
            var38.printStackTrace();
        }

        return finalMap;
    }

    public Map<String, Object> createDVIRLogStatusPDF(long driverId, long from, long to, String sDriverName) {
        Map<String, Object> finalMap = new LinkedHashMap<>();

        try {
            DecimalFormat df = new DecimalFormat("0.00");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, outputStream);
            Font headerFont = new Font(FontFamily.HELVETICA, 11.0F, 1);
            Font dataFont = new Font(FontFamily.HELVETICA, 10.0F, 0);
            document.open();
            Paragraph title = new Paragraph("DVIR Report", new Font(FontFamily.HELVETICA, 16.0F, 1));
            title.setAlignment(1);
            document.add(title);
            document.add(Chunk.NEWLINE);
            List<DVIRDataCRUDDto> dvirDataList = this.lookupDVIRDataOperation(from, to, driverId);
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
            String driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
            String companyName = clientInfo.getClientName();
            MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
            String timeZone = "";
            if (mainTerminal.getStateId() > 0L) {
                StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                timeZone = stateInfo.getTimeZone();
            }

            Map<String, List<DVIRDataCRUDDto>> groupedByDate = dvirDataList.stream()
                    .collect(Collectors.groupingBy(d -> d.getDateTime().substring(0, 10), LinkedHashMap::new, Collectors.toList()));

            for (Entry<String, List<DVIRDataCRUDDto>> entry : groupedByDate.entrySet()) {
                String currentDate = entry.getKey();
                List<DVIRDataCRUDDto> dayRecords = entry.getValue();
                DVIRDataCRUDDto dvir = dayRecords.get(0);
                VehicleMaster vehicleInfo = this.vehicleMasterRepo.findByVehicleId((int) dvir.getVehicleId());
                String vin = vehicleInfo.getVin();
                String vehicleNo = vehicleInfo.getVehicleNo();
                String location = dvir.getLocation();
                String trailer = dvir.getTrailer() != null ? String.join(",", dvir.getTrailer()) : "None";
                String vehicleDefect = dvir.getTruckDefect() != null ? String.join(",", dvir.getTruckDefect()) : "None";
                String trailerDefect = dvir.getTrailerDefect() != null ? String.join(",", dvir.getTrailerDefect()) : "None";
                String remarks = dvir.getNotes() != null ? dvir.getNotes() : "";
                String odometer = df.format(dvir.getOdometer());
                String engineHour = df.format(Double.parseDouble(dvir.getEngineHour()));
                String signaturePath = dvir.getDriverSignFile();
                Paragraph dayHeader = new Paragraph("Date: " + currentDate, new Font(FontFamily.HELVETICA, 14.0F, 1));
                dayHeader.setAlignment(0);
                document.add(dayHeader);
                document.add(Chunk.NEWLINE);
                PdfPTable mainTable = new PdfPTable(2);
                mainTable.setWidthPercentage(100.0F);
                mainTable.setSpacingBefore(10.0F);
                mainTable.addCell(this.getCell("TIME", 0, headerFont));
                mainTable.addCell(this.getCell("LOCATION", 0, headerFont));
                mainTable.addCell(this.getCell(dvir.getDateTime() + " (" + timeZone + ")", 0, dataFont));
                mainTable.addCell(this.getCell(location, 0, dataFont));
                mainTable.addCell(this.getCell("DRIVER", 0, headerFont));
                mainTable.addCell(this.getCell("COMPANY", 0, headerFont));
                mainTable.addCell(this.getCell(driverName, 0, dataFont));
                mainTable.addCell(this.getCell(companyName, 0, dataFont));
                mainTable.addCell(this.getCell("VEHICLE", 0, headerFont));
                mainTable.addCell(this.getCell("TRAILER", 0, headerFont));
                mainTable.addCell(this.getCell(vehicleNo, 0, dataFont));
                mainTable.addCell(this.getCell(trailer, 0, dataFont));
                mainTable.addCell(this.getCell("VIN", 0, headerFont));
                mainTable.addCell(this.getCell(vin, 0, dataFont));
                mainTable.addCell(this.getCell("VEHICLE DEFECTS", 0, headerFont));
                mainTable.addCell(this.getCell("TRAILER DEFECTS", 0, headerFont));
                mainTable.addCell(this.getCell(vehicleDefect, 0, dataFont));
                mainTable.addCell(this.getCell(trailerDefect, 0, dataFont));
                mainTable.addCell(this.getCell("ODOMETER", 0, headerFont));
                mainTable.addCell(this.getCell("ENGINE HOUR", 0, headerFont));
                mainTable.addCell(this.getCell(odometer, 0, dataFont));
                mainTable.addCell(this.getCell(engineHour, 0, dataFont));
                PdfPCell remarksHeader = this.getCell("REMARKS", 0, headerFont);
                remarksHeader.setColspan(2);
                mainTable.addCell(remarksHeader);
                PdfPCell remarksData = this.getCell(remarks, 0, dataFont);
                remarksData.setColspan(2);
                mainTable.addCell(remarksData);
                document.add(mainTable);
                document.add(Chunk.NEWLINE);
                Paragraph signText = new Paragraph("Signed by the driver " + currentDate, dataFont);
                signText.setAlignment(1);
                document.add(signText);
                document.add(Chunk.NEWLINE);
                if (signaturePath != null) {
                    try {
                        Image signImg = Image.getInstance("/opt/tomcat/webapps/uploads/dvir/" + signaturePath);
                        signImg.scaleToFit(200.0F, 80.0F);
                        PdfPTable signTable = new PdfPTable(1);
                        signTable.setWidthPercentage(40.0F);
                        PdfPCell signCell = new PdfPCell(signImg);
                        signCell.setBorder(15);
                        signCell.setPadding(6.0F);
                        signTable.addCell(signCell);
                        document.add(signTable);
                    } catch (Exception var47) {
                        document.add(new Paragraph("[Signature not available]", dataFont));
                    }
                }

                document.newPage();
            }

            document.close();
            finalMap.put("outputStream", outputStream);
            finalMap.put("fileName", "dvir_log.pdf");
            finalMap.put("subject", "DVIR Report");
            finalMap.put("text", "This is a DVIR report");
        } catch (Exception var48) {
            var48.printStackTrace();
        }

        return finalMap;
    }

    private PdfPCell getCell(String text, int alignment, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text, font));
        cell.setPadding(6.0F);
        cell.setHorizontalAlignment(alignment);
        return cell;
    }

    @Override
    public ResultWrapper<List<ViewDriverWorkingDayStatus>> ViewDriverWorkingDay(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<ViewDriverWorkingDayStatus>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            List<ViewDriverWorkingDayStatus> viewDriverWorkingDayStatusData = new ArrayList<>();
            new ViewDriverWorkingDayStatus();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            if (driverId > 0L) {
                String firstDate = "";
                String lastDate = "";
                long lDateTime = 0L;
                List<DriveringStatusViewDto> driveringStatusViewDto = this.lookupDriverStatusDataOperation(from, to, driverId);
                sDebug = sDebug + ">> Size : " + driveringStatusViewDto.size() + ",";

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    ViewDriverWorkingDayStatus viewDriverWorkingDayStatus = new ViewDriverWorkingDayStatus();
                    Date date = new Date(driveringStatusViewDto.get(i).getLDateTime());
                    SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
                    firstDate = df2.format(date);
                    sDebug = sDebug + "Date : " + firstDate + ",";
                    LocalDateTime ldtDateTime = LocalDateTime.parse(firstDate + " 00:00:00", formatter);
                    lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    sDebug = sDebug + "lDate : " + lDateTime + ",";
                    if (!lastDate.equals(firstDate)) {
                        sDebug = sDebug + "here1,";
                        viewDriverWorkingDayStatus.setDateTime(firstDate);
                        sDebug = sDebug + "here2,";
                        viewDriverWorkingDayStatus.setLDateTime(lDateTime);
                        sDebug = sDebug + "here3,";
                        viewDriverWorkingDayStatusData.add(viewDriverWorkingDayStatus);
                        sDebug = sDebug + "here4,";
                    }

                    lastDate = firstDate;
                }

                result.setResult(viewDriverWorkingDayStatusData);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Working Day Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var26) {
            result.setStatus(Result.FAIL);
            result.setMessage(var26.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatus(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            List<DriveringStatusViewDto> driveringStatusViewDto = null;
            long driverId = driveringStatusCRUDDto.getDriverId();
            String email = driveringStatusCRUDDto.getEmail();
            if (email == null || email.trim().isEmpty()) {
                email = "shivamitwork@gmail.com";
            }
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
            driveringStatusViewDto = this.lookupDriverStatusDataOperation(from, to, driverId);
            sDebug = sDebug + " >> " + driveringStatusViewDto.size() + " :: " + from + " : " + to + ",";
            String onDutyTime = "";
            String onDriveTime = "";
            String onSleepTime = "";
            String weeklyTime = "";
            String onBreak = "";

            for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                driveringStatusViewDto.get(i).setFromDate(from);
                driveringStatusViewDto.get(i).setToDate(to);

                try {
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    driveringStatusViewDto.get(i).setDriverName(driverName);
                    driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                    driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                    driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                    driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                    CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                    driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                    StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                    driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                    driveringStatusViewDto.get(i).setExempt(empInfo.getExempt());
                    VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo());
                    driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                    driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                    MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                    driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                    CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                    driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                    if (empInfo.getClientId() > 0L) {
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                        driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                        driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                    }

                    String[] sDate = driveringStatusViewDto.get(i).getDateTime().split(" ");
                    LocalDate lDate = LocalDate.parse(sDate[0]);
                    LocalDateTime ldtStartOfDay = LocalDateTime.of(lDate, LocalTime.MIDNIGHT);
                    LocalDateTime ldtEndOfDay = LocalDateTime.of(lDate, LocalTime.MAX);
                    long dFrom = ldtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    long dTo = ldtEndOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(dFrom, dTo, driveringStatusViewDto.get(i).getDriverId());
                    sDebug = sDebug + " << " + certifiedLogViewDto + ",";

                    for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                        if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                            empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                            driveringStatusViewDto.get(i).setCompanyCoDriverId(empInfo.getUsername());
                            driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                            driveringStatusViewDto.get(i).setCoDriverName(driverName);
                        }

                        driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                        driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                        String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                        driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                    }
                } catch (Exception var44) {
                    var44.printStackTrace();
                }

                DriverWorkingStatus driverWorkingStatus = this.driverWorkingStatusRepo
                        .findAndViewDriverWorkingstatusByDriverId(driveringStatusViewDto.get(i).getDriverId());

                try {
                    onDutyTime = driverWorkingStatus.getOnDutyTime();
                    onDriveTime = driverWorkingStatus.getOnDriveTime();
                    onSleepTime = driverWorkingStatus.getOnSleepTime();
                    weeklyTime = driverWorkingStatus.getWeeklyTime();
                    onBreak = driverWorkingStatus.getOnBreak();
                    onDutyTime = onDutyTime.substring(0, onDutyTime.length() - 3);
                    onDriveTime = onDriveTime.substring(0, onDriveTime.length() - 3);
                    onSleepTime = onSleepTime.substring(0, onSleepTime.length() - 3);
                    weeklyTime = weeklyTime.substring(0, weeklyTime.length() - 3);
                    onBreak = onBreak.substring(0, onBreak.length() - 3);
                    driveringStatusViewDto.get(i).setOnDutyTime(onDutyTime);
                    driveringStatusViewDto.get(i).setOnDriveTime(onDriveTime);
                    driveringStatusViewDto.get(i).setOnSleepTime(onSleepTime);
                    driveringStatusViewDto.get(i).setWeeklyTime(weeklyTime);
                    driveringStatusViewDto.get(i).setOnBreak(onBreak);
                } catch (Exception var43) {
                    var43.printStackTrace();
                    driveringStatusViewDto.get(i).setOnDutyTime("14:00");
                    driveringStatusViewDto.get(i).setOnDriveTime("11:00");
                    driveringStatusViewDto.get(i).setOnSleepTime("10:00");
                    driveringStatusViewDto.get(i).setWeeklyTime("70:00");
                    driveringStatusViewDto.get(i).setOnBreak("08:00");
                }
            }

            if (email != null && !email.trim().isEmpty()) {
                for (Map<String, Object> valueMap : this.dispatchServiceImpl.callReportCreateMethods(driverId, from, to, "driver_log", driverName)) {
                    System.out.println(">>>SendEmail: [" + valueMap.size() + "]" + LocalDateTime.now());
                    if (valueMap.size() > 0) {
                        ByteArrayOutputStream outputStream = (ByteArrayOutputStream) valueMap.get("outputStream");
                        String fileName = valueMap.get("fileName").toString();
                        System.out.println(">>ReportName-" + fileName + "----------------------" + LocalDateTime.now());
                        String subject = valueMap.get("subject").toString();
                        String text = valueMap.get("text").toString();
                        MimeBodyPart textBodyPart = new MimeBodyPart();
                        textBodyPart.setText(text);
                        byte[] bytes = outputStream.toByteArray();
                        DataSource dataSource = null;
                        if (fileName.contains("pdf")) {
                            dataSource = new ByteArrayDataSource(bytes, "application/pdf");
                        } else if (fileName.contains("xlsx")) {
                            dataSource = new ByteArrayDataSource(bytes, "application/vnd.ms-excel");
                        }

                        MimeBodyPart fileBodyPart = new MimeBodyPart();
                        fileBodyPart.setDataHandler(new DataHandler(dataSource));
                        fileBodyPart.setFileName(fileName);
                        MimeMultipart mimeMultipart = new MimeMultipart();
                        mimeMultipart.addBodyPart(textBodyPart);
                        mimeMultipart.addBodyPart(fileBodyPart);
                        MimeMessage message = this.javaMailSender.createMimeMessage();
                        MimeMessageHelper helper = new MimeMessageHelper(message);
                        helper.setTo(email);
                        helper.setSubject(subject);
                        message.setContent(mimeMultipart);
                        this.javaMailSender.send(message);
                    }
                }
            }

            result.setResult(driveringStatusViewDto);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Information Send Successfully" + sDebug);
        } catch (Exception var45) {
            result.setStatus(Result.FAIL);
            result.setMessage(var45.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> ShiftDriveringStatusWithoutUpdate(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = driveringStatusCRUDDto.getDriverId();
            long lastDriverId = driveringStatusCRUDDto.getLastDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List<DriveringStatus> driverStatusData = this.driveringStatusRepo.findAndViewDriverStatusData(lastDriverId, from, to);
            sDebug = sDebug + " Size : " + driverStatusData.size() + ",";
            DriveringStatus driveringStatus = null;

            for (int i = 0; i < driverStatusData.size(); ++i) {
                driveringStatus = driverStatusData.get(i);
                driveringStatus.setDriverId(driverId);
                driveringStatus.setIsVisible(1);
                this.driveringStatusRepo.save(driveringStatus);
            }

            result.setResult("Shift Data");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Information Shift Successfully" + sDebug);
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForLog(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            List<DriveringStatusViewDto> driveringStatusViewDto = null;
            long driverId = driveringStatusCRUDDto.getDriverId();
            long clientId = driveringStatusCRUDDto.getClientId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
            driveringStatusViewDto = this.lookupDriverStatusDataByClientOperation(from, to, driverId, clientId);
            sDebug = sDebug + " >> " + driveringStatusViewDto.size() + " :: " + from + " : " + to + ",";
            String onDutyTime = "";
            String onDriveTime = "";
            String onSleepTime = "";
            String weeklyTime = "";
            String onBreak = "";

            for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                driveringStatusViewDto.get(i).setFromDate(from);
                driveringStatusViewDto.get(i).setToDate(to);

                try {
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    driveringStatusViewDto.get(i).setDriverName(driverName);
                    driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                    driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                    driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                    driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                    CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                    driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                    StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                    driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                    driveringStatusViewDto.get(i).setExempt(empInfo.getExempt());
                    VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo());
                    driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                    driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                    MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                    driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                    if (mainTerminal.getStateId() > 0L) {
                        stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                        driveringStatusViewDto.get(i).setTimezoneName(stateInfo.getTimeZone());
                        driveringStatusViewDto.get(i).setTimezoneOffSet(stateInfo.getTimezoneOffSet());
                    }

                    CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                    driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                    if (empInfo.getClientId() > 0L) {
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                        driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                        driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                    }

                    LocalDateTime localDateTime = LocalDateTime.ofInstant(
                            Instant.ofEpochMilli(driveringStatusViewDto.get(i).getUtcDateTime()), TimeZone.getDefault().toZoneId()
                    );
                    LocalDateTime fromDate1 = localDateTime.withHour(0).withMinute(0).withSecond(0).withNano(0);
                    LocalDateTime toDate1 = localDateTime.withHour(23).withMinute(59).withSecond(59).withNano(999000000);
                    long fromTimestamp = fromDate1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    long toTimestamp = toDate1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(fromTimestamp, toTimestamp, driverId);

                    for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                        if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                            empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                            driveringStatusViewDto.get(i).setCompanyCoDriverId(empInfo.getUsername());
                            driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                            driveringStatusViewDto.get(i).setCoDriverName(driverName);
                        }

                        driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                        driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                        String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                        driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                    }
                } catch (Exception var43) {
                    var43.printStackTrace();
                }

                DriverWorkingStatus driverWorkingStatus = this.driverWorkingStatusRepo
                        .findAndViewDriverWorkingstatusByDriverId(driveringStatusViewDto.get(i).getDriverId());

                try {
                    onDutyTime = driverWorkingStatus.getOnDutyTime();
                    onDriveTime = driverWorkingStatus.getOnDriveTime();
                    onSleepTime = driverWorkingStatus.getOnSleepTime();
                    weeklyTime = driverWorkingStatus.getWeeklyTime();
                    onBreak = driverWorkingStatus.getOnBreak();
                    onDutyTime = onDutyTime.substring(0, onDutyTime.length() - 3);
                    onDriveTime = onDriveTime.substring(0, onDriveTime.length() - 3);
                    onSleepTime = onSleepTime.substring(0, onSleepTime.length() - 3);
                    weeklyTime = weeklyTime.substring(0, weeklyTime.length() - 3);
                    onBreak = onBreak.substring(0, onBreak.length() - 3);
                    driveringStatusViewDto.get(i).setOnDutyTime(onDutyTime);
                    driveringStatusViewDto.get(i).setOnDriveTime(onDriveTime);
                    driveringStatusViewDto.get(i).setOnSleepTime(onSleepTime);
                    driveringStatusViewDto.get(i).setWeeklyTime(weeklyTime);
                    driveringStatusViewDto.get(i).setOnBreak(onBreak);
                } catch (Exception var42) {
                    var42.printStackTrace();
                    driveringStatusViewDto.get(i).setOnDutyTime("14:00");
                    driveringStatusViewDto.get(i).setOnDriveTime("11:00");
                    driveringStatusViewDto.get(i).setOnSleepTime("10:00");
                    driveringStatusViewDto.get(i).setWeeklyTime("70:00");
                    driveringStatusViewDto.get(i).setOnBreak("08:00");
                }
            }

            result.setResult(driveringStatusViewDto);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Information Send Successfully" + sDebug);
        } catch (Exception var44) {
            result.setStatus(Result.FAIL);
            result.setMessage(var44.getLocalizedMessage());
        }

        return result;
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataByClientOperation(long from, long to, long driverId, long clientId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("clientId").is(clientId));
        } else {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("clientId").is(clientId));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "shift",
                    "days",
                    "osVersion",
                    "simCardNo",
                    "origin",
                    "utcDateTime",
                    "statusId",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime",
                    "isReportGenerated"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.DESC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<EmployeeMasterCRUDDto> ViewDriveringStatusWithLoginDetails(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid) {
        String sDebug = "";
        ResultWrapper<EmployeeMasterCRUDDto> result = new ResultWrapper<>();

        try {
            EmployeeMasterCRUDDto empInfo = null;
            long driverId = driveringStatusCRUDDto.getDriverId();
            Instant instant = Instant.now();
            String timezoneName = "";
            String timezoneOffSet = "";
            if (driverId > 0L) {
                UserLoginDto loginData = this.loginRepo.GetLoginDataByEmployeeId((int) driverId);
                empInfo = this.employeeMasterRepo.findEmployeeByEmployeeId1((int) driverId);
                empInfo.setLoginDateTime(loginData.getLoginDateTime());

                try {
                    List<ELDSettings> settings = this.eldSettingsRepo.findAndViewBySettingId(1);
                    if (settings.size() > 0) {
                        empInfo.setAndroidVersion(settings.get(0).getAndroidVersion());
                        empInfo.setAndroidCode(settings.get(0).getAndroidCode());
                        empInfo.setIosVersion(settings.get(0).getIosVersion());
                        empInfo.setIosCode(settings.get(0).getIosCode());
                        empInfo.setTermsAndCondition(settings.get(0).getTermsAndCondition());
                    } else {
                        empInfo.setAndroidVersion("");
                        empInfo.setAndroidCode("");
                        empInfo.setIosVersion("");
                        empInfo.setIosCode("");
                        empInfo.setTermsAndCondition("");
                    }

                    MACAddressMaster macAddressData = this.macAddressMasterRepo.findByMACAddressMasterId(driverId);
                    empInfo.setMacAddress(macAddressData.getMacAddress());
                    empInfo.setVehicleId(macAddressData.getVehicleId());
                    VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) macAddressData.getVehicleId());
                    empInfo.setVehicleNo(vehcileInfo.getVehicleNo());
                    if (empInfo.getClientId() > 0L) {
                        ClientMaster client = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                        empInfo.setClientName(client.getClientName());
                    } else {
                        empInfo.setClientName("");
                    }
                } catch (Exception var35) {
                    var35.printStackTrace();
                }

                LocalDate periviousDate = LocalDate.now();
                periviousDate = periviousDate.minusDays(14L);
                String fromDate = periviousDate.toString() + " 00:00:00";
                String toDate = LocalDate.now().toString() + " 23:59:59";
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
                long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
                long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                String driverName = "";
                String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
                List<DriveringStatusViewDto> driveringStatusViewDto = this.lookupDriverStatusDataOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(from);
                    driveringStatusViewDto.get(i).setToDate(to);

                    try {
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                        driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empDetails.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empDetails.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empDetails.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empDetails.getCdlNo());
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empDetails.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empDetails.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        driveringStatusViewDto.get(i).setExempt(empDetails.getExempt());
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empDetails.getTruckNo());
                        driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                        driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empDetails.getMainTerminalId());
                        driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        if (mainTerminal.getStateId() > 0L) {
                            stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                            timezoneName = stateInfo.getTimeZone();
                            timezoneOffSet = stateInfo.getTimezoneOffSet();
                        }

                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empDetails.getClientId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empDetails.getClientId());
                            driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                            driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                        }

                        List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);
                        if (certifiedLogViewDto.size() > 0) {
                            for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                                empDetails = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                                driveringStatusViewDto.get(i).setCompanyCoDriverId(empDetails.getUsername());
                                driverName = empDetails.getFirstName() + " " + empDetails.getLastName();
                                driveringStatusViewDto.get(i).setCoDriverName(driverName);
                                driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                                driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                                String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                                driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                            }
                        } else {
                            driveringStatusViewDto.get(i).setTrailers(new ArrayList());
                            driveringStatusViewDto.get(i).setShippingDocs(new ArrayList());
                        }
                    } catch (Exception var36) {
                        var36.printStackTrace();
                    }
                }

                EmployeeMaster empDetailData = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetailData.getCycleUsaId());
                List<CycleTimeRulesViewDto> cycleTimeRulesViewDto = new ArrayList<>();
                CycleTimeRulesViewDto cycleTimeRules = new CycleTimeRulesViewDto();
                long hourToSec = 3600L;
                long minToSec = 60L;
                cycleTimeRules.setCycleTime(cycleUsaData.getCycleHour() * hourToSec);
                cycleTimeRules.setCycleDays(cycleUsaData.getCycleDays());
                cycleTimeRules.setOnDutyTime(cycleUsaData.getOnDutyTime() * hourToSec);
                cycleTimeRules.setOnDriveTime(cycleUsaData.getOnDriveTime() * hourToSec);
                cycleTimeRules.setOnSleepTime(cycleUsaData.getOnSleepTime() * hourToSec);
                cycleTimeRules.setContinueDriveTime(cycleUsaData.getContinueDriveTime() * hourToSec);
                cycleTimeRules.setBreakTime(cycleUsaData.getBreakTime() * minToSec);
                cycleTimeRules.setCycleRestartTime(cycleUsaData.getCycleRestartTime() * hourToSec);
                cycleTimeRules.setWarningOnDutyTime1(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                cycleTimeRules.setWarningOnDutyTime2(cycleUsaData.getOnDutyTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
                cycleTimeRules.setWarningOnDriveTime1(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                cycleTimeRules.setWarningOnDriveTime2(cycleUsaData.getOnDriveTime() * hourToSec - cycleUsaData.getWarningTime2() * minToSec);
                cycleTimeRules.setWarningBreakTime1(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                cycleTimeRules.setWarningBreakTime2(cycleUsaData.getContinueDriveTime() * hourToSec - cycleUsaData.getWarningTime1() * minToSec);
                cycleTimeRules.setCycleWarningTime1(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime1() * minToSec);
                cycleTimeRules.setCycleWarningTime2(cycleUsaData.getCycleHour() * hourToSec - cycleUsaData.getCycleWarningTime2() * minToSec);
                cycleTimeRulesViewDto.add(cycleTimeRules);
                empInfo.setDriverLog(driveringStatusViewDto);
                empInfo.setRules(cycleTimeRulesViewDto);
                result.setResult(empInfo);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Log Send Successfully");
            } else {
                result.setResult(null);
                result.setToken(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var37) {
            result.setStatus(Result.FAIL);
            result.setMessage(var37.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DriveringStatusLogViewDto>> ViewDriveringStatusLog(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusLogViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            DecimalFormat df = new DecimalFormat("0.00");
            List<DriveringStatusLogViewDto> driveringStatusLogViewDto = new ArrayList<>();
            DriveringStatusLogViewDto driveringStatusLogData = new DriveringStatusLogViewDto();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String employeeStatus = "";
            if (driverId > 0L) {
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                employeeStatus = empInfo.getStatus();
                List<LoginLog> loginLog = this.lookupLoginLogDataOperation(from, to, driverId, "loginDateTime");

                for (int i = 0; i < loginLog.size(); ++i) {
                    try {
                        if (loginLog.get(i).getLoginDateTime() > 0L) {
                            DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById1(loginLog.get(i).get_id(), "Login");
                            Pageable pageableRequest1 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                            Query query1 = new Query(
                                    Criteria.where("driverId").is(driverId).and("utcDateTime").lte(loginLog.get(i).getLoginDateTime()).and("isVoilation").is(0)
                            );
                            query1.limit(1);
                            query1.with(pageableRequest1);
                            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate
                                    .find(query1, DriveringStatusViewDto.class, "drivering_status");
                            if (driveringStatusViewDtoData.size() > 0) {
                                if (driveringStatusViewDtoData.get(0).getIsActive() == 1) {
                                    employeeStatus = "Active";
                                } else {
                                    employeeStatus = "Inactive";
                                }
                            }

                            driveringStatusLogData = new DriveringStatusLogViewDto();
                            driveringStatusLogData.setDriverId(driverId);
                            driveringStatusLogData.setDriverStatusId(loginLog.get(i).get_id());
                            driveringStatusLogData.setDriverName(driverName);
                            driveringStatusLogData.setLattitude(0.0);
                            driveringStatusLogData.setLongitude(0.0);
                            driveringStatusLogData.setCustomLocation("");
                            driveringStatusLogData.setOrigin("");
                            if (driveringStatusViewDtoData.size() > 0) {
                                driveringStatusLogData.setOdometer(Double.parseDouble(df.format(driveringStatusViewDtoData.get(0).getOdometer())));
                                driveringStatusLogData.setEngineHour(df.format(Double.parseDouble(driveringStatusViewDtoData.get(0).getEngineHour())));
                            } else {
                                driveringStatusLogData.setOdometer(0.0);
                                driveringStatusLogData.setEngineHour("0");
                            }

                            driveringStatusLogData.setNote("");
                            driveringStatusLogData.setIsVoilation(0L);
                            driveringStatusLogData.setLogType("Login");
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                            driveringStatusLogData.setIsReportGenerated(1L);
                            driveringStatusLogData.setIsPreviousLog(0);
                            driveringStatusLogData.setDateTime(String.valueOf(loginLog.get(i).getLoginDateTime()));
                            driveringStatusLogData.setStatus("Login");
                            driveringStatusLogData.setEmployeeStatus(employeeStatus);
                            driveringStatusLogViewDto.add(driveringStatusLogData);
                        }
                    } catch (Exception var37) {
                        var37.printStackTrace();
                    }
                }

                loginLog = this.lookupLoginLogDataOperation(from, to, driverId, "logoutDateTime");

                for (int i = 0; i < loginLog.size(); ++i) {
                    try {
                        if (loginLog.get(i).getLogoutDateTime() > 0L) {
                            DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById1(loginLog.get(i).get_id(), "Logout");
                            Pageable pageableRequest1 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                            Query query1 = new Query(
                                    Criteria.where("driverId").is(driverId).and("utcDateTime").lte(loginLog.get(i).getLogoutDateTime()).and("isVoilation").is(0)
                            );
                            query1.limit(1);
                            query1.with(pageableRequest1);
                            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate
                                    .find(query1, DriveringStatusViewDto.class, "drivering_status");
                            if (driveringStatusViewDtoData.size() > 0) {
                                if (driveringStatusViewDtoData.get(0).getIsActive() == 1) {
                                    employeeStatus = "Active";
                                } else {
                                    employeeStatus = "Inactive";
                                }
                            }

                            driveringStatusLogData = new DriveringStatusLogViewDto();
                            driveringStatusLogData.setDriverId(driverId);
                            driveringStatusLogData.setDriverStatusId(loginLog.get(i).get_id());
                            driveringStatusLogData.setDriverName(driverName);
                            driveringStatusLogData.setLattitude(0.0);
                            driveringStatusLogData.setLongitude(0.0);
                            driveringStatusLogData.setCustomLocation("");
                            driveringStatusLogData.setOrigin("");
                            if (driveringStatusViewDtoData.size() > 0) {
                                driveringStatusLogData.setOdometer(Double.parseDouble(df.format(driveringStatusViewDtoData.get(0).getOdometer())));
                                driveringStatusLogData.setEngineHour(df.format(Double.parseDouble(driveringStatusViewDtoData.get(0).getEngineHour())));
                            } else {
                                driveringStatusLogData.setOdometer(0.0);
                                driveringStatusLogData.setEngineHour("0");
                            }

                            driveringStatusLogData.setNote("");
                            driveringStatusLogData.setIsVoilation(0L);
                            driveringStatusLogData.setLogType("Logout");
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                            driveringStatusLogData.setIsReportGenerated(1L);
                            driveringStatusLogData.setIsPreviousLog(0);
                            driveringStatusLogData.setDateTime(String.valueOf(loginLog.get(i).getLogoutDateTime()));
                            driveringStatusLogData.setStatus("Logout");
                            driveringStatusLogData.setEmployeeStatus(employeeStatus);
                            driveringStatusLogViewDto.add(driveringStatusLogData);
                        }
                    } catch (Exception var36) {
                        var36.printStackTrace();
                    }
                }

                List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lte(from).and("isVoilation").is(0).and("isVisible").is(1));
                query.limit(1);
                query.with(pageableRequest);
                List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                if (driveringStatusViewDtoData.size() > 0) {
                    driveringStatusViewDtoData.get(0).setIsPreviousLog(1);
                    driveringStatusLogData.setIsLogDelete(1);
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(0));
                }

                driveringStatusViewDtoData = this.lookupDriverStatusDataOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
                }

                sDebug = sDebug + "List Size : " + driveringStatusViewDto.size() + "##,";

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    try {
                        if (driveringStatusViewDto.size() > 0) {
                            if (driveringStatusViewDto.get(i).getIsActive() == 1) {
                                employeeStatus = "Active";
                            } else {
                                employeeStatus = "Inactive";
                            }
                        }

                        sDebug = sDebug + "1,";
                        DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById(driveringStatusViewDto.get(i).get_id());
                        sDebug = sDebug + "2,";
                        driveringStatusLogData = new DriveringStatusLogViewDto();
                        driveringStatusLogData.setVehicleId(driveringStatusViewDto.get(i).getVehicleId());
                        driveringStatusLogData.setDriverId(driverId);
                        driveringStatusLogData.setDriverStatusId(driveringStatusViewDto.get(i).get_id());
                        driveringStatusLogData.setDriverName(driverName);
                        sDebug = sDebug + "3,";
                        driveringStatusLogData.setDateTime(String.valueOf(driveringStatusViewDto.get(i).getUtcDateTime()));
                        driveringStatusLogData.setUtcDateTime(driveringStatusViewDto.get(i).getUtcDateTime());
                        driveringStatusLogData.setStatus(driveringStatusViewDto.get(i).getStatus());
                        sDebug = sDebug + "3-1,";
                        driveringStatusLogData.setLattitude(driveringStatusViewDto.get(i).getLattitude());
                        sDebug = sDebug + "3-2,";
                        driveringStatusLogData.setLongitude(driveringStatusViewDto.get(i).getLongitude());
                        sDebug = sDebug + "3-3,";
                        driveringStatusLogData.setCustomLocation(driveringStatusViewDto.get(i).getCustomLocation());
                        sDebug = sDebug + "3-4,";
                        driveringStatusLogData.setOrigin(driveringStatusViewDto.get(i).getOrigin());
                        sDebug = sDebug + "3-5,";
                        driveringStatusLogData.setOdometer(Double.parseDouble(df.format(driveringStatusViewDto.get(i).getOdometer())));
                        sDebug = sDebug + "3-6,";

                        try {
                            driveringStatusLogData.setEngineHour(df.format(Double.parseDouble(driveringStatusViewDto.get(i).getEngineHour())));
                        } catch (Exception var34) {
                            driveringStatusLogData.setEngineHour("0.00");
                            var34.printStackTrace();
                        }

                        driveringStatusLogData.setNote(driveringStatusViewDto.get(i).getNote());
                        sDebug = sDebug + "3-7,";
                        driveringStatusLogData.setIsVoilation((long) driveringStatusViewDto.get(i).getIsVoilation().intValue());
                        driveringStatusLogData.setLogType(driveringStatusViewDto.get(i).getLogType());
                        sDebug = sDebug + "3-8,";
                        driveringStatusLogData.setEmployeeStatus(employeeStatus);

                        try {
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                        } catch (Exception var33) {
                            var33.printStackTrace();
                        }

                        sDebug = sDebug + "4,";
                        driveringStatusLogData.setRemainingWeeklyTime(driveringStatusViewDto.get(i).getRemainingWeeklyTime());
                        driveringStatusLogData.setRemainingDutyTime(driveringStatusViewDto.get(i).getRemainingDutyTime());
                        driveringStatusLogData.setRemainingDriveTime(driveringStatusViewDto.get(i).getRemainingDriveTime());
                        driveringStatusLogData.setRemainingSleepTime(driveringStatusViewDto.get(i).getRemainingSleepTime());
                        driveringStatusLogData.setShift(driveringStatusViewDto.get(i).getShift());
                        driveringStatusLogData.setDays(driveringStatusViewDto.get(i).getDays());
                        driveringStatusLogData.setIsReportGenerated((long) driveringStatusViewDto.get(i).getIsReportGenerated());
                        driveringStatusLogData.setIsPreviousLog(driveringStatusViewDto.get(i).getIsPreviousLog());
                        driveringStatusLogData.setIsLogDelete(1);
                        driveringStatusLogViewDto.add(driveringStatusLogData);
                        sDebug = sDebug + "5,";
                    } catch (Exception var35) {
                        var35.printStackTrace();
                    }
                }

                List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);

                for (int i = 0; i < certifiedLogViewDto.size(); ++i) {
                    try {
                        employeeStatus = "Active";
                        DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById(certifiedLogViewDto.get(i).get_id());
                        Pageable pageableRequest1 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                        Query query1 = new Query(
                                Criteria.where("driverId").is(driverId).and("utcDateTime").lte(certifiedLogViewDto.get(i).getLCertifiedDate()).and("isVoilation").is(0)
                        );
                        query1.limit(1);
                        query1.with(pageableRequest1);
                        List<DriveringStatusViewDto> driveringStatusViewDtoData1 = this.mongoTemplate.find(query1, DriveringStatusViewDto.class, "drivering_status");
                        driveringStatusLogData = new DriveringStatusLogViewDto();
                        driveringStatusLogData.setVehicleId(certifiedLogViewDto.get(i).getVehicleId());
                        driveringStatusLogData.setDriverId(driverId);
                        driveringStatusLogData.setDriverStatusId(certifiedLogViewDto.get(i).get_id());
                        driveringStatusLogData.setDriverName(driverName);
                        driveringStatusLogData.setDateTime(String.valueOf(certifiedLogViewDto.get(i).getLCertifiedDate()));
                        driveringStatusLogData.setStatus("Certified");
                        driveringStatusLogData.setLattitude(0.0);
                        driveringStatusLogData.setLongitude(0.0);
                        driveringStatusLogData.setCustomLocation("");
                        driveringStatusLogData.setOrigin("");
                        if (driveringStatusViewDtoData1.size() > 0) {
                            driveringStatusLogData.setOdometer(Double.parseDouble(df.format(driveringStatusViewDtoData1.get(0).getOdometer())));
                            driveringStatusLogData.setEngineHour(df.format(Double.parseDouble(driveringStatusViewDtoData1.get(0).getEngineHour())));
                        } else {
                            driveringStatusLogData.setOdometer(0.0);
                            driveringStatusLogData.setEngineHour("0");
                        }

                        driveringStatusLogData.setNote("");
                        driveringStatusLogData.setIsVoilation(0L);
                        driveringStatusLogData.setLogType("Certified Log");
                        driveringStatusLogData.setEmployeeStatus(employeeStatus);
                        driveringStatusLogData.setStatusId(dsLog.getStatusId());
                        driveringStatusLogData.setIsReportGenerated(1L);
                        driveringStatusLogData.setIsPreviousLog(0);
                        driveringStatusLogViewDto.add(driveringStatusLogData);
                    } catch (Exception var32) {
                        var32.printStackTrace();
                    }
                }

                result.setResult(driveringStatusLogViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully" + sDebug);
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var38) {
            result.setStatus(Result.FAIL);
            result.setMessage(var38.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AssignLogToDriver(AssignLogToDriverDto assignLogToDriverDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";
        this.shiftLogAddDtoData = new ArrayList<>();
        this.isVoilation = false;
        this.voilationMessage = "";
        long firstLogUtcDateTime = 0L;

        try {
            boolean checkDvir = Boolean.parseBoolean(assignLogToDriverDto.getCheckDvir());
            boolean checkCertified = Boolean.parseBoolean(assignLogToDriverDto.getCheckCertified());
            Instant instant = Instant.now();
            long driverId = assignLogToDriverDto.getDriverId();
            long lastDriverId = 0L;
            List<DriveringStatusLogViewDto> logStatusData = assignLogToDriverDto.getLogStatusData();
            logStatusData.sort(Comparator.comparingLong(d -> {
                if (d.getUtcDateTime() > 0L) {
                    return d.getUtcDateTime();
                } else {
                    try {
                        return Long.parseLong(d.getDateTime());
                    } catch (Exception var2xx) {
                        return Long.MAX_VALUE;
                    }
                }
            }));
            this.SaveLog(logStatusData.toString());
            int iCount = 0;
            DriveringStatusLogViewDto lastLogData = null;
            long utcDateTime = 0L;
            long plus15DaysTimestamp = 0L;
            List<DriveringStatusLogViewDto> driveringStatus = null;
            Map<Long, List<String>> duplicateLogs = new HashMap<>();
            if (!duplicateLogs.isEmpty()) {
                result.setResult("Error");
                result.setStatus(Result.FAIL);
                StringBuilder sb = new StringBuilder("This driver logs already exist:");
                duplicateLogs.forEach((lDriverId, dateTimes) -> sb.append(dateTimes));
                result.setMessage(sb.toString());
            } else {
                for (int i = 0; i < logStatusData.size(); ++i) {
                    if (i == 0 && logStatusData.get(i).getUtcDateTime() > 0L) {
                        firstLogUtcDateTime = logStatusData.get(i).getUtcDateTime();
                    } else if (i == 0 && Long.parseLong(logStatusData.get(i).getDateTime()) > 0L) {
                        firstLogUtcDateTime = Long.parseLong(logStatusData.get(i).getDateTime());
                    }

                    utcDateTime = logStatusData.get(i).getUtcDateTime();
                    LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(utcDateTime), ZoneId.systemDefault());
                    LocalDateTime newDateTime = dateTime.plusDays(15L).withHour(23).withMinute(59).withSecond(59).withNano(0);
                    plus15DaysTimestamp = newDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    lastDriverId = logStatusData.get(i).getDriverId();
                    if (this.isVoilation) {
                        break;
                    }

                    lastLogData = this.ShiftDriverLog(logStatusData.get(i), driverId, iCount, lastLogData);
                    if (i == 0) {
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) lastDriverId);
                        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                        long remainingWeeklyTime = cycleUsaData.getCycleHour() * 60L * 60L;
                        long remainingDutyTime = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        long remainingDriveTime = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        new DriveringStatus();
                        Pageable pageableRequest1 = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query query1 = new Query(Criteria.where("driverId").is(lastDriverId).and("utcDateTime").lt(utcDateTime));
                        query1.limit(1);
                        query1.with(pageableRequest1);
                        List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query1, DriveringStatusViewDto.class, "drivering_status");
                        LocalDate logDate = Instant.ofEpochMilli(utcDateTime).atZone(ZoneId.systemDefault()).toLocalDate();
                        ZonedDateTime utcDateTime1 = Instant.ofEpochMilli(utcDateTime).atZone(ZoneOffset.UTC);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String formattedDate = utcDateTime1.format(formatter);
                        if (driveringStatusViewDtoData.size() > 0
                                && (driveringStatusViewDtoData.get(0).getStatus().equals("OnDuty") || driveringStatusViewDtoData.get(0).getStatus().equals("OnDrive"))) {
                            DriveringStatus logDays = new DriveringStatus();
                            logDays.setDriverId(lastDriverId);
                            logDays.setVehicleId(driveringStatusViewDtoData.get(0).getVehicleId());
                            logDays.setClientId(driveringStatusViewDtoData.get(0).getClientId());
                            logDays.setStatus("OffDuty");
                            logDays.setLattitude(driveringStatusViewDtoData.get(0).getLattitude());
                            logDays.setLongitude(driveringStatusViewDtoData.get(0).getLongitude());
                            logDays.setDateTime(formattedDate);
                            logDays.setLDateTime(utcDateTime);
                            logDays.setUtcDateTime(utcDateTime);
                            logDays.setLogType(driveringStatusViewDtoData.get(0).getLogType());
                            logDays.setAppVersion(driveringStatusViewDtoData.get(0).getAppVersion());
                            logDays.setOsVersion(driveringStatusViewDtoData.get(0).getOsVersion());
                            logDays.setIsVoilation(driveringStatusViewDtoData.get(0).getIsVoilation());
                            logDays.setSimCardNo(driveringStatusViewDtoData.get(0).getSimCardNo());
                            logDays.setNote(driveringStatusViewDtoData.get(0).getNote());
                            logDays.setCustomLocation(driveringStatusViewDtoData.get(0).getCustomLocation());
                            logDays.setCurrentLocation(driveringStatusViewDtoData.get(0).getCustomLocation());
                            logDays.setEngineHour(driveringStatusViewDtoData.get(0).getEngineHour());
                            logDays.setOrigin(driveringStatusViewDtoData.get(0).getOrigin());
                            logDays.setTimezone(driveringStatusViewDtoData.get(0).getTimezone());
                            logDays.setOdometer(driveringStatusViewDtoData.get(0).getOdometer());
                            logDays.setShift(driveringStatusViewDtoData.get(0).getShift());
                            logDays.setDays(driveringStatusViewDtoData.get(0).getDays());
                            logDays.setRemainingWeeklyTime(Long.parseLong(driveringStatusViewDtoData.get(0).getRemainingWeeklyTime()));
                            logDays.setRemainingDutyTime(Long.parseLong(driveringStatusViewDtoData.get(0).getRemainingDutyTime()));
                            logDays.setRemainingDriveTime(Long.parseLong(driveringStatusViewDtoData.get(0).getRemainingDriveTime()));
                            logDays.setRemainingSleepTime(Long.parseLong(driveringStatusViewDtoData.get(0).getRemainingSleepTime()));
                            logDays.setReceivedTimestamp(instant.toEpochMilli());
                            logDays.setIsVisible(1);
                            this.driveringStatusRepo.save(logDays);
                        }

                        Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query queryData = new Query(Criteria.where("driverId").is(lastDriverId).and("utcDateTime").lt(utcDateTime).and("isVoilation").is(0));
                        queryData.limit(1);
                        queryData.with(pageableRequest);
                        driveringStatus = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                    }

                    ++iCount;
                }

                long millisecondShift = 122400000L;

                try {
                    EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                    millisecondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L * 1000L;
                } catch (Exception var48) {
                    var48.printStackTrace();
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lt(utcDateTime).and("isVoilation").is(0));
                queryData.limit(1);
                queryData.with(pageableRequest);
                List<DriveringStatusLogViewDto> driveringStatusNewDriver = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                if (driveringStatusNewDriver.size() > 0) {
                    lastLogData = driveringStatusNewDriver.get(0);
                }

                queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(utcDateTime).lte(plus15DaysTimestamp).and("isVoilation").is(0));
                queryData.with(Sort.by(Direction.ASC, new String[]{"utcDateTime"}));
                List<DriveringStatusLogViewDto> driveringStatusList = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");

                for (int i = 0; i < driveringStatusList.size(); ++i) {
                    long duration = driveringStatusList.get(i).getUtcDateTime() - lastLogData.getUtcDateTime();
                    int diffDays = driveringStatusList.get(i).getDays() - lastLogData.getDays();
                    if (diffDays > 0) {
                        driveringStatusList.get(i).setDays(diffDays);
                    }

                    driveringStatusList.get(i).setDriverStatusId(driveringStatusList.get(i).get_id());
                    if (this.isVoilation) {
                        break;
                    }

                    lastLogData = this.ShiftDriverLog(driveringStatusList.get(i), driverId, iCount, lastLogData);
                    ++iCount;
                }

                if (driveringStatus.size() > 0) {
                    lastLogData = driveringStatus.get(0);
                }

                queryData = new Query(
                        Criteria.where("driverId").is(lastDriverId).and("utcDateTime").gt(utcDateTime).lte(plus15DaysTimestamp).and("isVoilation").is(0)
                );
                queryData.with(Sort.by(Direction.ASC, new String[]{"utcDateTime"}));
                driveringStatusList = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");

                for (int i = 0; i < driveringStatusList.size(); ++i) {
                    long duration = driveringStatusList.get(i).getUtcDateTime() - lastLogData.getUtcDateTime();
                    int diffDays = driveringStatusList.get(i).getDays() - lastLogData.getDays();
                    if (diffDays > 0) {
                        driveringStatusList.get(i).setDays(diffDays);
                    }

                    driveringStatusList.get(i).setDriverStatusId(driveringStatusList.get(i).get_id());
                    if (this.isVoilation) {
                        break;
                    }

                    lastLogData = this.ShiftDriverLog(driveringStatusList.get(i), lastDriverId, iCount, lastLogData);
                    ++iCount;
                }

                long firstUtcDateTime = 0L;
                long lastUtcDateTime = 0L;
                int logShift = 0;
                int logDays = 0;
                if (!this.isVoilation) {
                    for (int i = 0; i < this.shiftLogAddDtoData.size(); ++i) {
                        sDebug = sDebug + "ID : -> " + this.shiftLogAddDtoData.get(i).getLogStatusId() + ",";
                        Query updateQuery = new Query(Criteria.where("logDataId").is(this.shiftLogAddDtoData.get(i).getLogStatusId()));
                        Update update = new Update().set("driverId", driverId);
                        this.mongoTemplate.updateMulti(updateQuery, update, DriverStatusLog.class);
                        if (i == 0) {
                            firstUtcDateTime = this.shiftLogAddDtoData.get(i).getUtcDateTime();
                            logShift = this.shiftLogAddDtoData.get(i).getShift();
                            logDays = this.shiftLogAddDtoData.get(i).getDays();
                            instant = Instant.ofEpochMilli(firstUtcDateTime);
                            LocalDate date = instant.atZone(ZoneOffset.UTC).toLocalDate();
                            ZonedDateTime startOfDayUTC = date.atStartOfDay(ZoneOffset.UTC);
                            ZonedDateTime endOfDayUTC = startOfDayUTC.plusDays(1L).minusNanos(1L);
                            long from = startOfDayUTC.toInstant().toEpochMilli();
                            long to = endOfDayUTC.toInstant().toEpochMilli();
                            if (checkDvir) {
                                Pageable var56 = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).ascending());
                                Query query1 = new Query();
                                query1.addCriteria(Criteria.where("lDateTime").gte(from).lte(to).and("driverId").is(lastDriverId));
                                query1.with(var56);
                                List<DVIRData> dvirData = this.mongoTemplate.find(query1, DVIRData.class, "dvir_data");
                                if (dvirData.size() > 0) {
                                    String driverSignFile = driverId + "_sign_1.jpg";
                                    Update update1 = new Update();
                                    update1.set("driverId", driverId);
                                    update1.set("driverSignFile", driverSignFile);
                                    this.mongoTemplate.updateMulti(query1, update1, DVIRData.class);
                                }
                            }
                        } else {
                            lastUtcDateTime = this.shiftLogAddDtoData.get(i).getUtcDateTime();
                        }

                        this.UpdateLogData(
                                this.shiftLogAddDtoData.get(i).getUtcDateTime(),
                                this.shiftLogAddDtoData.get(i).getLogStatusId(),
                                this.shiftLogAddDtoData.get(i).getLogStatus(),
                                this.shiftLogAddDtoData.get(i).getDriverId(),
                                this.shiftLogAddDtoData.get(i).getDays(),
                                this.shiftLogAddDtoData.get(i).getShift(),
                                this.shiftLogAddDtoData.get(i).getTotalWeeklyTime(),
                                this.shiftLogAddDtoData.get(i).getTotalTimeOnDuty(),
                                this.shiftLogAddDtoData.get(i).getTotalTimeDrive(),
                                this.shiftLogAddDtoData.get(i).getTotalTimeOnSleep(),
                                checkCertified
                        );
                    }

                    ZonedDateTime currentDateTime = Instant.ofEpochMilli(firstUtcDateTime).atZone(ZoneId.systemDefault());
                    ZonedDateTime startOfDay = currentDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault());
                    long midnightTimestamp = startOfDay.toInstant().toEpochMilli();
                    ZonedDateTime endOfDay = startOfDay.plusDays(1L).minusNanos(1000000L);
                    long endOfDayTimestamp = endOfDay.toInstant().toEpochMilli();
                    this.driveringStatusRepo.deleteAllDriveringStatusVoilation(lastDriverId, midnightTimestamp, endOfDayTimestamp, 1);
                    sDebug = sDebug
                            + " Shift >> From : "
                            + midnightTimestamp
                            + " :: "
                            + endOfDayTimestamp
                            + " Driver : "
                            + driverId
                            + " :: "
                            + logShift
                            + " :: "
                            + logDays
                            + "\n";
                    this.SaveLog(sDebug);
                    this.CheckAllVoilations(driverId, midnightTimestamp, endOfDayTimestamp, plus15DaysTimestamp, logShift, logDays);
                    if (firstLogUtcDateTime > 0L) {
                        this.UpdateDriverSequenceId(driverId, firstLogUtcDateTime);
                    }

                    result.setResult("Updated");
                    result.setStatus(Result.SUCCESS);
                    result.setMessage("Bulk Log Assign To Driver Updated Successfully" + sDebug);
                } else {
                    result.setResult("Voilation Generated" + sDebug);
                    result.setStatus(Result.FAIL);
                    result.setMessage(this.voilationMessage);
                }
            }
        } catch (Exception var49) {
            result.setStatus(Result.FAIL);
            result.setMessage(var49.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public void UpdateDriverSequenceId(long driverId, long utcDateTime) {
        String sDebug = "SEQ ID : ";

        try {
            long baseStatusId = 0L;
            Query lastLogQuery = new Query(
                    Criteria.where("driverId").is(driverId).and("dateTime").lt(utcDateTime).and("isVoilation").is(0).and("isVisible").is(1)
            )
                    .with(Sort.by(Direction.DESC, new String[]{"dateTime"}))
                    .limit(1);
            List<DriverStatusLog> lastLogList = this.mongoTemplate.find(lastLogQuery, DriverStatusLog.class, "driver_status_log");
            if (!lastLogList.isEmpty()) {
                baseStatusId = lastLogList.get(0).getStatusId();
            }

            sDebug = sDebug + " >> " + baseStatusId + " :: " + utcDateTime + "\n";
            Query logsToUpdateQuery = new Query(
                    Criteria.where("driverId").is(driverId).and("dateTime").gte(utcDateTime).and("isVoilation").is(0).and("isVisible").is(1)
            )
                    .with(Sort.by(Direction.ASC, new String[]{"dateTime"}));
            List<DriverStatusLog> logsToUpdate = this.mongoTemplate.find(logsToUpdateQuery, DriverStatusLog.class, "driver_status_log");

            for (int i = 0; i < logsToUpdate.size(); ++i) {
                long newStatusId = baseStatusId + (long) i + 1L;
                DriverStatusLog log = logsToUpdate.get(i);
                sDebug = sDebug + "status ID: " + newStatusId + " :: " + log.getStatus() + " :: " + log.getLogDataId() + "\n";
                Query updateQuery = new Query(Criteria.where("logDataId").is(log.getLogDataId()).and("driverId").is(driverId));
                Update update = new Update().set("statusId", newStatusId);
                this.mongoTemplate.updateFirst(updateQuery, update, DriverStatusLog.class);
            }

            this.SaveLog(sDebug);
        } catch (Exception var18) {
            var18.printStackTrace();
        }
    }

    public void UpdateDriverSequenceId_old(long driverId, long utcDateTime) {
        String sDebug = "SEQ ID : ";

        try {
            new Update();
            new Query();
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
            Query query = new Query(Criteria.where("driverId").is(driverId).and("dateTime").lt(utcDateTime).and("isVoilation").is(0));
            query.limit(1);
            query.with(pageableRequest);
            List<DriverStatusLog> driverStatusLog = this.mongoTemplate.find(query, DriverStatusLog.class, "driver_status_log");
            long statusId = 0L;
            if (driverStatusLog.size() > 0) {
                long dataUtcDateTime = driverStatusLog.get(0).getDateTime();
                statusId = driverStatusLog.get(0).getStatusId();
                new Query();
                Query queryData = new Query(Criteria.where("dateTime").gte(dataUtcDateTime).and("driverId").is(driverId).and("isVoilation").is(0));
                queryData.with(Sort.by(Direction.ASC, new String[]{"dateTime"}));
                List<DriverStatusLog> dsLogList = this.mongoTemplate.find(queryData, DriverStatusLog.class, "driver_status_log");

                for (int i = 0; i < dsLogList.size(); ++i) {
                    long dsLogStatusId = statusId + (long) i;
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(dsLogList.get(i).getLogDataId()));
                    Update ex = new Update();
                    ex.set("statusId", dsLogStatusId);
                    this.mongoTemplate.updateMulti(query, ex, DriverStatusLog.class);
                }
            } else {
                statusId = 1L;
                new Query();
                Query var26 = new Query(Criteria.where("dateTime").gte(utcDateTime).and("driverId").is(driverId).and("isVoilation").is(0));
                sDebug = sDebug + " >> ";
                var26.with(Sort.by(Direction.ASC, new String[]{"dateTime"}));
                List<DriverStatusLog> dsLogList = this.mongoTemplate.find(var26, DriverStatusLog.class, "driver_status_log");

                for (int i = 0; i < dsLogList.size(); ++i) {
                    long dsLogStatusId = statusId + (long) i;
                    sDebug = sDebug + " status ID : " + dsLogStatusId + " :: " + dsLogList.get(i).getStatus() + " :: " + dsLogList.get(i).getLogDataId() + "\n";
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(dsLogList.get(i).getLogDataId()));
                    Update var21 = new Update();
                    var21.set("statusId", dsLogStatusId);
                    this.mongoTemplate.updateMulti(query, var21, DriverStatusLog.class);
                }

                this.SaveLog(sDebug);
            }
        } catch (Exception var19) {
            var19.printStackTrace();
        }
    }

    @Override
    public ResultWrapper<String> ShiftHourInDriveringStatusLog(AssignLogToDriverDto assignLogToDriverDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";
        boolean isDataExist = false;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            ZoneId zoneId = ZoneId.of("America/Los_Angeles");
            Instant instant = Instant.now();
            long hour = (long) assignLogToDriverDto.getHour().intValue();
            String logShift = assignLogToDriverDto.getLogShift();
            long logShiftMilliSeconds = hour * 60L * 60L * 1000L;
            long driverId = 0L;
            List<DriveringStatusLogViewDto> logStatusData = assignLogToDriverDto.getLogStatusData();
            List<DriveringStatusLogViewDto> driveringStatus = null;
            long utcDateTime = 0L;
            long durationInSec = 0L;
            long logShiftUtcDateTime = 0L;
            String dateTime = "";
            long secondShift = 122400L;
            long secondSleep = 36000L;

            for (int i = 0; i < logStatusData.size(); ++i) {
                utcDateTime = logStatusData.get(i).getUtcDateTime();
                LocalDateTime ldtDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(utcDateTime), ZoneId.of("America/Los_Angeles"));
                driverId = logStatusData.get(i).getDriverId();
                ObjectId objId = new ObjectId(logStatusData.get(i).getDriverStatusId());
                if (i == 0) {
                    Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                    Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lt(utcDateTime).and("isVoilation").is(0));
                    queryData.limit(1);
                    queryData.with(pageableRequest);
                    driveringStatus = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                    long duration = utcDateTime - driveringStatus.get(0).getUtcDateTime();
                    durationInSec = duration / 1000L;
                    EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                    secondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L;
                    secondSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
                }

                if (durationInSec >= secondSleep && durationInSec <= secondShift) {
                    if (logShift.equals("before")) {
                        logShiftUtcDateTime = utcDateTime - logShiftMilliSeconds;
                        ldtDateTime = ldtDateTime.minusHours(hour);
                        dateTime = ldtDateTime.format(formatter);
                    } else {
                        logShiftUtcDateTime = utcDateTime + logShiftMilliSeconds;
                        ldtDateTime = ldtDateTime.plusHours(hour);
                        dateTime = ldtDateTime.format(formatter);
                    }

                    if (i == 0) {
                        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(logShiftUtcDateTime), zoneId);
                        LocalDateTime fromDate = localDateTime.withHour(0).withMinute(0).withSecond(0);
                        LocalDateTime toDate = localDateTime.withHour(23).withMinute(59).withSecond(59);
                        long fromTimestamp = fromDate.atZone(zoneId).toInstant().toEpochMilli();
                        long toTimestamp = toDate.atZone(zoneId).toInstant().toEpochMilli();
                        Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query queryData = new Query(
                                Criteria.where("driverId").is(driverId).and("utcDateTime").gte(fromTimestamp).lte(toTimestamp).and("isVoilation").is(0)
                        );
                        queryData.limit(1);
                        queryData.with(pageableRequest);
                        driveringStatus = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                        if (driveringStatus.size() > 0) {
                            isDataExist = true;
                            break;
                        }
                    }

                    if (!isDataExist) {
                        Query query = new Query();
                        query.addCriteria(Criteria.where("_id").is(objId));
                        Update update = new Update();
                        update.set("utcDateTime", logShiftUtcDateTime);
                        update.set("lDateTime", logShiftUtcDateTime);
                        update.set("dateTime", dateTime);
                        this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
                    }
                } else {
                    if (logShift.equals("before")) {
                        logShiftUtcDateTime = utcDateTime - logShiftMilliSeconds;
                        ldtDateTime = ldtDateTime.minusHours(hour);
                        dateTime = ldtDateTime.format(formatter);
                    } else {
                        logShiftUtcDateTime = utcDateTime + logShiftMilliSeconds;
                        ldtDateTime = ldtDateTime.plusHours(hour);
                        dateTime = ldtDateTime.format(formatter);
                    }

                    if (i == 0) {
                        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(logShiftUtcDateTime), zoneId);
                        LocalDateTime fromDate = localDateTime.withHour(0).withMinute(0).withSecond(0);
                        LocalDateTime toDate = localDateTime.withHour(23).withMinute(59).withSecond(59);
                        long fromTimestamp = fromDate.atZone(zoneId).toInstant().toEpochMilli();
                        long toTimestamp = toDate.atZone(zoneId).toInstant().toEpochMilli();
                        Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                        Query queryData = new Query(
                                Criteria.where("driverId").is(driverId).and("utcDateTime").gte(fromTimestamp).lte(toTimestamp).and("isVoilation").is(0)
                        );
                        queryData.limit(1);
                        queryData.with(pageableRequest);
                        driveringStatus = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
                        if (driveringStatus.size() > 0) {
                            isDataExist = true;
                            break;
                        }
                    }

                    if (!isDataExist) {
                        Query query = new Query();
                        query.addCriteria(Criteria.where("_id").is(objId));
                        Update update = new Update();
                        update.set("utcDateTime", logShiftUtcDateTime);
                        update.set("lDateTime", logShiftUtcDateTime);
                        update.set("dateTime", dateTime);
                        this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
                    }
                }

                if (!isDataExist) {
                    result.setResult("Updated");
                    result.setStatus(Result.SUCCESS);
                    result.setMessage("Bulk Log Assign To Driver Updated Successfully" + sDebug);
                } else {
                    result.setResult("Error" + sDebug);
                    result.setStatus(Result.FAIL);
                    result.setMessage("Log already exist for the date of shifting hour.");
                }
            }
        } catch (Exception var40) {
            result.setStatus(Result.FAIL);
            result.setMessage(var40.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public DriveringStatusLogViewDto ShiftDriverLog(DriveringStatusLogViewDto logStatusData, long driverId, int i, DriveringStatusLogViewDto driveringStatus1) {
        String sDebug = "";
        String logStatusId = "";
        String logStatus = "";
        long utcDateTime = 0L;
        long lastUtcDateTime = 0L;
        long onDutyTime = 0L;
        long onDriveTime = 0L;
        long offDutyTime = 0L;
        long onSleepTime = 0L;
        long totalWeeklyTime = 0L;
        long totalTimeOnDuty = 0L;
        long totalTimeDrive = 0L;
        long totalTimeOnSleep = 0L;
        long totalWeeklyTimeDiff = 0L;
        long totalTimeOnDutyDiff = 0L;
        long totalTimeDriveDiff = 0L;
        long totalTimeOnSleepDiff = 0L;
        int day = 0;
        int shift = 0;
        long millisecondShift = 0L;
        long millisecondDays = 0L;
        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        String driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
        String lastStatus = "";
        String driverLastStatus = "";
        String driverCurrentStatus = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        List<DriveringStatusLogViewDto> driveringStatus = null;
        logStatusId = logStatusData.getDriverStatusId();
        logStatus = logStatusData.getStatus();
        utcDateTime = logStatusData.getUtcDateTime();
        new ObjectId(logStatusId);
        if (i == 0) {
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
            Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lt(utcDateTime).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(pageableRequest);
            driveringStatus = this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
            if (driveringStatus.size() > 0) {
                driverLastStatus = driveringStatus.get(0).getStatus();
                day = driveringStatus.get(0).getDays();
                shift = driveringStatus.get(0).getShift();
                lastUtcDateTime = driveringStatus.get(0).getUtcDateTime();
                driveringStatus1 = driveringStatus.get(0);
            } else {
                DriveringStatusLogViewDto dsData = new DriveringStatusLogViewDto();
                dsData.setStatus("OffDuty");
                EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
                dsData.setRemainingWeeklyTime(String.valueOf(cycleUsaData.getCycleHour() * 60L * 60L));
                dsData.setRemainingDutyTime(String.valueOf(cycleUsaData.getOnDutyTime() * 60L * 60L));
                dsData.setRemainingDriveTime(String.valueOf(cycleUsaData.getOnDriveTime() * 60L * 60L));
                dsData.setRemainingSleepTime(String.valueOf(cycleUsaData.getOnSleepTime() * 60L * 60L));
                dsData.setShift(0);
                dsData.setDays(0);
                boolean var80 = false;
                boolean var83 = false;
                driverLastStatus = "OffDuty";
                driveringStatus1 = dsData;
            }
        }

        try {
            totalWeeklyTime = Long.parseLong(driveringStatus1.getRemainingWeeklyTime());
            totalTimeOnDuty = Long.parseLong(driveringStatus1.getRemainingDutyTime());
            totalTimeDrive = Long.parseLong(driveringStatus1.getRemainingDriveTime());
            totalTimeOnSleep = Long.parseLong(driveringStatus1.getRemainingSleepTime());
            day = driveringStatus1.getDays();
            shift = driveringStatus1.getShift();
            long duration = logStatusData.getUtcDateTime() - driveringStatus1.getUtcDateTime();
            long durationInSec = duration / 1000L;
            sDebug = sDebug + " >> Duration : " + duration + "  :: " + shift + " :: " + day + " :: " + driveringStatus1.getStatus() + ",";
            if (totalWeeklyTime > 0L) {
                if (!driveringStatus1.getStatus().equals("OnSleep") && !driveringStatus1.getStatus().equals("OffDuty")) {
                    totalWeeklyTimeDiff = totalWeeklyTime - duration / 1000L;
                } else {
                    totalWeeklyTimeDiff = totalWeeklyTime;
                }
            } else {
                totalWeeklyTimeDiff = Long.parseLong(driveringStatus1.getRemainingWeeklyTime());
            }

            if (totalTimeOnDuty > 0L) {
                if (!driveringStatus1.getStatus().equals("OnSleep") && !driveringStatus1.getStatus().equals("OffDuty")) {
                    totalTimeOnDutyDiff = totalTimeOnDuty - duration / 1000L;
                } else {
                    totalTimeOnDutyDiff = totalTimeOnDuty;
                }
            } else {
                totalTimeOnDutyDiff = Long.parseLong(driveringStatus1.getRemainingDutyTime());
            }

            if (totalTimeDrive > 0L) {
                if (driveringStatus1.getStatus().equals("OnSleep") || driveringStatus1.getStatus().equals("OffDuty")) {
                    totalTimeDriveDiff = totalTimeDrive;
                } else if (driveringStatus1.getStatus().equals("OnDrive")) {
                    totalTimeDriveDiff = totalTimeDrive - duration / 1000L;
                } else {
                    totalTimeDriveDiff = totalTimeDrive;
                }
            } else {
                totalTimeDriveDiff = Long.parseLong(driveringStatus1.getRemainingDriveTime());
            }

            if (totalTimeOnSleep > 0L) {
                if (driveringStatus1.getStatus().equals("OnSleep")) {
                    totalTimeOnSleepDiff = totalTimeOnSleep - duration / 1000L;
                } else {
                    totalTimeOnSleepDiff = totalTimeOnSleep;
                }
            } else {
                totalTimeOnSleepDiff = Long.parseLong(driveringStatus1.getRemainingSleepTime());
            }

            long voilation8Hour = 28800L;
            LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(driveringStatus1.getUtcDateTime()), ZoneId.systemDefault());
            EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
            CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
            String shiftLogAddDto = driveringStatus1.getStatus();
            switch (shiftLogAddDto) {
                case "OnDuty":
                    totalWeeklyTime = totalWeeklyTimeDiff;
                    totalTimeOnDuty = totalTimeOnDutyDiff;
                    totalTimeDrive = totalTimeDriveDiff;
                    totalTimeOnSleep = totalTimeOnSleepDiff;
                    break;
                case "OnDrive":
                    totalWeeklyTime = totalWeeklyTimeDiff;
                    totalTimeOnDuty = totalTimeOnDutyDiff;
                    totalTimeDrive = totalTimeDriveDiff;
                    totalTimeOnSleep = totalTimeOnSleepDiff;
                    break;
                case "OffDuty":
                    millisecondShift = 122400000L;
                    millisecondDays = 36000000L;
                    millisecondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L * 1000L;
                    millisecondDays = cycleUsaData.getOnSleepTime() * 60L * 60L * 1000L;
                    if (duration >= millisecondShift) {
                        totalWeeklyTime = cycleUsaData.getCycleHour() * 60L * 60L;
                        totalTimeOnDuty = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        totalTimeDrive = cycleUsaData.getOnDriveTime() * 60L * 60L;
                        totalTimeOnSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
                        ++shift;
                        day = 1;
                    } else if (duration >= millisecondDays) {
                        ++day;
                        totalWeeklyTime = totalWeeklyTimeDiff;
                        totalTimeOnDuty = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        totalTimeDrive = cycleUsaData.getOnDriveTime() * 60L * 60L;
                        totalTimeOnSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
                    } else {
                        totalWeeklyTime = totalWeeklyTimeDiff;
                        totalTimeOnDuty = totalTimeOnDutyDiff;
                        totalTimeDrive = totalTimeDriveDiff;
                        totalTimeOnSleep = totalTimeOnSleepDiff;
                    }
                    break;
                case "OnSleep":
                    millisecondShift = 122400000L;
                    millisecondDays = 36000000L;
                    millisecondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L * 1000L;
                    millisecondDays = cycleUsaData.getOnSleepTime() * 60L * 60L * 1000L;
                    if (duration >= millisecondShift) {
                        ++shift;
                        day = 1;
                        totalWeeklyTime = cycleUsaData.getCycleHour() * 60L * 60L;
                        totalTimeOnDuty = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        totalTimeDrive = cycleUsaData.getOnDriveTime() * 60L * 60L;
                        totalTimeOnSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
                    } else if (duration >= millisecondDays) {
                        ++day;
                        totalWeeklyTime = totalWeeklyTimeDiff;
                        totalTimeOnDuty = cycleUsaData.getOnDutyTime() * 60L * 60L;
                        totalTimeDrive = cycleUsaData.getOnDriveTime() * 60L * 60L;
                        totalTimeOnSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
                    } else {
                        totalWeeklyTime = totalWeeklyTimeDiff;
                        totalTimeOnDuty = totalTimeOnDutyDiff;
                        totalTimeDrive = totalTimeDriveDiff;
                        totalTimeOnSleep = totalTimeOnSleepDiff;
                    }
            }

            lastStatus = logStatusData.getStatus();
            logStatusData.setRemainingWeeklyTime(String.valueOf(totalWeeklyTime));
            logStatusData.setRemainingDutyTime(String.valueOf(totalTimeOnDuty));
            logStatusData.setRemainingDriveTime(String.valueOf(totalTimeDrive));
            logStatusData.setRemainingSleepTime(String.valueOf(totalTimeOnSleep));
            logStatusData.setShift(shift);
            logStatusData.setDays(day);
            ShiftLogAddDto shiftLogAddObj = new ShiftLogAddDto();
            shiftLogAddObj.setLogStatusId(logStatusId);
            shiftLogAddObj.setLogStatus(logStatus);
            shiftLogAddObj.setDriverId(driverId);
            shiftLogAddObj.setDays(day);
            shiftLogAddObj.setShift(shift);
            shiftLogAddObj.setTotalWeeklyTime(totalWeeklyTime);
            shiftLogAddObj.setTotalTimeOnDuty(totalTimeOnDuty);
            shiftLogAddObj.setTotalTimeDrive(totalTimeDrive);
            shiftLogAddObj.setTotalTimeOnSleep(totalTimeOnSleep);
            shiftLogAddObj.setUtcDateTime(utcDateTime);
            shiftLogAddObj.setDebugTime(duration);
            shiftLogAddObj.setDebugData(sDebug);
            this.shiftLogAddDtoData.add(shiftLogAddObj);
            sDebug = sDebug + " 3, ";
        } catch (Exception var64) {
            var64.printStackTrace();
        }

        return logStatusData;
    }

    public void UpdateLogData(
            long utcDateTime,
            String objId,
            String logStatus,
            long driverId,
            int days,
            int shift,
            long totalWeeklyTime,
            long totalTimeOnDuty,
            long totalTimeDrive,
            long totalTimeOnSleep,
            boolean checkCertified
    ) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(objId));
        Update update = new Update();
        if (logStatus.equals("Certified")) {
            if (checkCertified) {
                String certifiedSignature = driverId + "_sign_1.jpg";
                update.set("certifiedSignature", certifiedSignature);
                update.set("driverId", driverId);
                update.set("coDriverId", 0);
                this.mongoTemplate.findAndModify(query, update, CertifiedLog.class);
            }
        } else if (logStatus.equals("Login")) {
            update.set("employeeId", driverId);
            this.mongoTemplate.findAndModify(query, update, LoginLog.class);
        } else if (logStatus.equals("Logout")) {
            update.set("employeeId", driverId);
            this.mongoTemplate.findAndModify(query, update, LoginLog.class);
        } else {
            update.set("driverId", driverId);
            update.set("shift", shift);
            update.set("days", days);
            update.set("remainingWeeklyTime", totalWeeklyTime);
            update.set("remainingDutyTime", totalTimeOnDuty);
            update.set("remainingDriveTime", totalTimeDrive);
            update.set("remainingSleepTime", totalTimeOnSleep);
            this.mongoTemplate.findAndModify(query, update, DriveringStatus.class);
        }
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForGraph(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String email = driveringStatusCRUDDto.getEmail();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            Instant instant = Instant.now();
            LocalDate ldFrom = ldtFromDate.toLocalDate();
            LocalDate ldCurrentDate = LocalDate.now();
            sDebug = sDebug + ">> Data :";
            List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);
            ArrayList<String> sCertifiedDate = new ArrayList<>();

            for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                sCertifiedDate.add(certifiedLogViewDto.get(c).getCertifiedDate());
            }

            String driverName = "";
            String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
            if (driverId > 0L) {
                String onDutyTime = "";
                String onDriveTime = "";
                String onSleepTime = "";
                String weeklyTime = "";
                String onBreak = "";
                String timezoneName = "";
                String timezoneOffSet = "";
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                Query query = new Query(
                        Criteria.where("driverId")
                                .is(driverId)
                                .and("utcDateTime")
                                .lte(from)
                                .and("isVoilation")
                                .is(0)
                                .and("isVisible")
                                .is(1)
                                .and("status")
                                .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove"})
                );
                query.limit(1);
                query.with(pageableRequest);
                List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                if (driveringStatusViewDtoData.size() > 0) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(0));
                }

                driveringStatusViewDtoData = this.lookupDriverStatusDataForGraphOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
                }

                sDebug = sDebug + ">> Data1 :";

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(from);
                    driveringStatusViewDto.get(i).setToDate(to);

                    try {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                        driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        if (mainTerminal.getStateId() > 0L) {
                            stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                            timezoneName = stateInfo.getTimeZone();
                            timezoneOffSet = stateInfo.getTimezoneOffSet();
                            driveringStatusViewDto.get(i).setTimezoneName(timezoneName);
                            driveringStatusViewDto.get(i).setTimezoneOffSet(timezoneOffSet);
                        }

                        driveringStatusViewDto.get(i).setExempt(empInfo.getExempt());
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo());
                        driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                        driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empInfo.getClientId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                            driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                            driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                        }

                        String[] sDate = driveringStatusViewDto.get(i).getDateTime().split(" ");
                        LocalDate lDate = LocalDate.parse(sDate[0]);
                        LocalDateTime ldtStartOfDay = LocalDateTime.of(lDate, LocalTime.MIDNIGHT);
                        LocalDateTime ldtEndOfDay = LocalDateTime.of(lDate, LocalTime.MAX);
                        long fromTimestamp = ldtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                        long toTimestamp = ldtEndOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                        sDebug = sDebug + " >> Date : " + fromTimestamp + " :: " + toTimestamp + " :: " + driverId + ",";
                        certifiedLogViewDto = this.lookupCertifiedLogDataOperation(fromTimestamp, toTimestamp, driverId);
                        sDebug = sDebug + " Size : " + certifiedLogViewDto.size() + ",";

                        for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                            if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                                empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                                driveringStatusViewDto.get(i).setCompanyCoDriverId(empInfo.getUsername());
                                driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                                driveringStatusViewDto.get(i).setCoDriverName(driverName);
                            }

                            sDebug = sDebug + " :: " + certifiedLogViewDto.get(c).getTrailers() + " :: " + certifiedLogViewDto.get(c).getShippingDocs() + ",";
                            driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                            driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                            String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                            driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                        }
                    } catch (Exception var55) {
                        var55.printStackTrace();
                    }

                    DriverWorkingStatus driverWorkingStatus = this.driverWorkingStatusRepo
                            .findAndViewDriverWorkingstatusByDriverId(driveringStatusViewDto.get(i).getDriverId());

                    try {
                        onDutyTime = driverWorkingStatus.getOnDutyTime();
                        onDriveTime = driverWorkingStatus.getOnDriveTime();
                        onSleepTime = driverWorkingStatus.getOnSleepTime();
                        weeklyTime = driverWorkingStatus.getWeeklyTime();
                        onBreak = driverWorkingStatus.getOnBreak();
                        onDutyTime = onDutyTime.substring(0, onDutyTime.length() - 3);
                        onDriveTime = onDriveTime.substring(0, onDriveTime.length() - 3);
                        onSleepTime = onSleepTime.substring(0, onSleepTime.length() - 3);
                        weeklyTime = weeklyTime.substring(0, weeklyTime.length() - 3);
                        onBreak = onBreak.substring(0, onBreak.length() - 3);
                        driveringStatusViewDto.get(i).setOnDutyTime(onDutyTime);
                        driveringStatusViewDto.get(i).setOnDriveTime(onDriveTime);
                        driveringStatusViewDto.get(i).setOnSleepTime(onSleepTime);
                        driveringStatusViewDto.get(i).setWeeklyTime(weeklyTime);
                        driveringStatusViewDto.get(i).setOnBreak(onBreak);
                    } catch (Exception var54) {
                        var54.printStackTrace();
                        driveringStatusViewDto.get(i).setOnDutyTime("14:00");
                        driveringStatusViewDto.get(i).setOnDriveTime("11:00");
                        driveringStatusViewDto.get(i).setOnSleepTime("10:00");
                        driveringStatusViewDto.get(i).setWeeklyTime("70:00");
                        driveringStatusViewDto.get(i).setOnBreak("08:00");
                    }
                }

                Pageable var73 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                query = new Query(
                        Criteria.where("driverId")
                                .is(driverId)
                                .and("utcDateTime")
                                .lte(to)
                                .and("isVoilation")
                                .is(0)
                                .and("isVisible")
                                .is(1)
                                .and("status")
                                .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove"})
                );
                query.limit(1);
                query.with(var73);
                driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                if (driveringStatusViewDtoData.size() > 0) {
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDtoData.get(0).getDriverId());
                    MainTerminalMaster mainTerminal = null;

                    try {
                        mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        driveringStatusViewDtoData.get(0).setMainTerminalName(mainTerminal.getMainTerminalName());
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }

                    if (mainTerminal.getStateId() > 0L) {
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                        timezoneName = stateInfo.getTimeZone();
                        timezoneOffSet = stateInfo.getTimezoneOffSet();
                    }

                    if (!timezoneOffSet.equals("")) {
                        String[] splitStr = timezoneOffSet.split(":");
                        long hour = Math.abs(Long.parseLong(splitStr[0]));
                        long minutes = Math.abs(Long.parseLong(splitStr[1]));
                        int totalMinutes = (int) (hour * 60L + minutes);
                        String minusPlus = "";
                        long timestampValue = 0L;
                        if (timezoneOffSet.substring(0, 1).equals("-")) {
                            minusPlus = "minus";
                            timestampValue = instant.toEpochMilli() - (hour * 60L + minutes) * 60000L;
                        } else {
                            minusPlus = "plus";
                            timestampValue = instant.toEpochMilli() + (hour * 60L + minutes) * 60000L;
                        }

                        Clock cl = Clock.systemUTC();
                        Clock adjustedClock;
                        if (timezoneOffSet.startsWith("-")) {
                            adjustedClock = Clock.offset(cl, Duration.ofMinutes((long) (-totalMinutes)));
                        } else {
                            adjustedClock = Clock.offset(cl, Duration.ofMinutes((long) totalMinutes));
                        }

                        LocalDate lt = LocalDate.now(adjustedClock);
                        if (ldFrom.toString().equals(lt.toString())) {
                            sDebug = sDebug + "today,";
                            driveringStatusViewDtoData.get(0).setUtcDateTime(timestampValue);
                        } else if (ldFrom.isBefore(lt)) {
                            sDebug = sDebug + "past day,";
                            LocalDateTime localDateTime = LocalDateTime.parse(toDate, formatter);
                            Instant instant1 = localDateTime.toInstant(ZoneOffset.UTC);
                            long utcTimestamp = instant1.getEpochSecond() * 1000L;
                            driveringStatusViewDtoData.get(0).setUtcDateTime(utcTimestamp);
                        } else {
                            sDebug = sDebug + "future day,";
                            LocalDateTime localDateTime = LocalDateTime.parse(fromDate, formatter);
                            Instant instant1 = localDateTime.toInstant(ZoneOffset.UTC);
                            long utcTimestamp = instant1.getEpochSecond() * 1000L;
                            driveringStatusViewDtoData.get(0).setUtcDateTime(utcTimestamp);
                        }
                    }

                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(0));
                }

                result.setResult(driveringStatusViewDto);
                result.setArrayData(sCertifiedDate);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully" + sDebug);
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var56) {
            result.setStatus(Result.FAIL);
            result.setMessage(var56.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public List<CertifiedLogViewDto> lookupCertifiedLogDataByDateOperation(String sDate, long driverId) {
        MatchOperation filter = Aggregation.match(Criteria.where("certifiedDate").is(sDate).and("driverId").is(driverId));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "vehicleId",
                    "trailers",
                    "shippingDocs",
                    "coDriverId",
                    "certifiedSignature",
                    "certifiedDate",
                    "lCertifiedDate",
                    "addedTimestamp",
                    "_id",
                    "certifiedAt"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "certified_log", CertifiedLogViewDto.class).getMappedResults();
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataForGraphOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(
                    Criteria.where("utcDateTime")
                            .gte(from)
                            .lte(to)
                            .and("driverId")
                            .is(driverId)
                            .and("isVisible")
                            .is(1)
                            .and("status")
                            .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove", "Voilation"})
            );
        } else {
            filter = Aggregation.match(
                    Criteria.where("utcDateTime")
                            .gte(from)
                            .lte(to)
                            .and("isVisible")
                            .is(1)
                            .and("status")
                            .in(new Object[]{"OnDrive", "OnDuty", "OnSleep", "OffDuty", "PersonalUse", "YardMove", "Voilation"})
            );
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "utcDateTime",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "osVersion",
                    "simCardNo",
                    "origin",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusForGraphNew(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();

        try {
            List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String email = driveringStatusCRUDDto.getEmail();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
            if (driverId > 0L) {
                String onDutyTime = "";
                String onDriveTime = "";
                String onSleepTime = "";
                String weeklyTime = "";
                String onBreak = "";
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lte(from));
                query.limit(1);
                query.with(pageableRequest);
                List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                if (driveringStatusViewDtoData.size() > 0) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(0));
                }

                driveringStatusViewDtoData = this.lookupDriverStatusDataForGraphNewOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
                }

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(from);
                    driveringStatusViewDto.get(i).setToDate(to);

                    try {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                        driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        driveringStatusViewDto.get(i).setExempt(empInfo.getExempt());
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo());
                        driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                        driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empInfo.getClientId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                            driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                            driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                        }

                        List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);

                        for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                            empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                            driveringStatusViewDto.get(i).setCompanyCoDriverId(empInfo.getUsername());
                            driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                            driveringStatusViewDto.get(i).setCoDriverName(driverName);
                            driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                            driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                            String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                            driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                        }
                    } catch (Exception var37) {
                        var37.printStackTrace();
                    }

                    DriverWorkingStatus driverWorkingStatus = this.driverWorkingStatusRepo
                            .findAndViewDriverWorkingstatusByDriverId(driveringStatusViewDto.get(i).getDriverId());

                    try {
                        onDutyTime = driverWorkingStatus.getOnDutyTime();
                        onDriveTime = driverWorkingStatus.getOnDriveTime();
                        onSleepTime = driverWorkingStatus.getOnSleepTime();
                        weeklyTime = driverWorkingStatus.getWeeklyTime();
                        onBreak = driverWorkingStatus.getOnBreak();
                        onDutyTime = onDutyTime.substring(0, onDutyTime.length() - 3);
                        onDriveTime = onDriveTime.substring(0, onDriveTime.length() - 3);
                        onSleepTime = onSleepTime.substring(0, onSleepTime.length() - 3);
                        weeklyTime = weeklyTime.substring(0, weeklyTime.length() - 3);
                        onBreak = onBreak.substring(0, onBreak.length() - 3);
                        driveringStatusViewDto.get(i).setOnDutyTime(onDutyTime);
                        driveringStatusViewDto.get(i).setOnDriveTime(onDriveTime);
                        driveringStatusViewDto.get(i).setOnSleepTime(onSleepTime);
                        driveringStatusViewDto.get(i).setWeeklyTime(weeklyTime);
                        driveringStatusViewDto.get(i).setOnBreak(onBreak);
                    } catch (Exception var36) {
                        var36.printStackTrace();
                        driveringStatusViewDto.get(i).setOnDutyTime("14:00");
                        driveringStatusViewDto.get(i).setOnDriveTime("11:00");
                        driveringStatusViewDto.get(i).setOnSleepTime("10:00");
                        driveringStatusViewDto.get(i).setWeeklyTime("70:00");
                        driveringStatusViewDto.get(i).setOnBreak("08:00");
                    }
                }

                result.setResult(driveringStatusViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var38) {
            result.setStatus(Result.FAIL);
            result.setMessage(var38.getLocalizedMessage());
        }

        return result;
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataForGraphNewOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("isVoilation").is(0));
        } else {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("isVoilation").is(0));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "utcDateTime",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "osVersion",
                    "simCardNo",
                    "origin",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewVoilationReport(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            if (driverId > 0L) {
                List<DriveringStatusViewDto> driveringStatusViewDto = this.lookupDriverStatusDataOfVoilationOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(from);
                    driveringStatusViewDto.get(i).setToDate(to);

                    try {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                        driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        driveringStatusViewDto.get(i).setExempt(empInfo.getExempt());
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) empInfo.getTruckNo());
                        driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                        driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        if (mainTerminal.getStateId() > 0L) {
                            stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                        }

                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empInfo.getClientId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                            driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                            driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                        }
                    } catch (Exception var25) {
                        var25.printStackTrace();
                    }
                }

                result.setResult(driveringStatusViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request." + sDebug);
            }
        } catch (Exception var26) {
            result.setStatus(Result.FAIL);
            result.setMessage(var26.getLocalizedMessage());
        }

        return result;
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataOfVoilationOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("isVoilation").is(1));
        } else {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("isVoilation").is(1));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "utcDateTime",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "osVersion",
                    "simCardNo",
                    "origin",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusCalculation(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();

        try {
            long driverId = driveringStatusCRUDDto.getDriverId();
            int voilation = 0;
            int shift = 3;
            int days = 2;
            LocalDate periviousDate = LocalDate.now();
            periviousDate = periviousDate.minusDays(14L);
            String fromDate = periviousDate.toString() + " 00:00:00";
            String toDate = LocalDate.now().toString() + " 23:59:59";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            if (driverId > 0L) {
                List<DriveringStatusViewDto> driveringStatusViewDto = this.lookupDriverStatusDataForCalculationOperation(
                        from, to, driverId, voilation, shift, days
                );
                result.setResult(driveringStatusViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var19) {
            result.setStatus(Result.FAIL);
            result.setMessage(var19.getLocalizedMessage());
        }

        return result;
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataForCalculationOperation(long from, long to, long driverId, int voilation, int shift, int days) {
        MatchOperation filter = Aggregation.match(
                Criteria.where("utcDateTime")
                        .gte(from)
                        .lte(to)
                        .and("driverId")
                        .is(driverId)
                        .and("isVoilation")
                        .is(voilation)
                        .and("shift")
                        .is(shift)
                        .and("days")
                        .is(days)
        );
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "osVersion",
                    "simCardNo",
                    "shift",
                    "days",
                    "origin",
                    "utcDateTime",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewUnidentifiedEvents(DriveringStatusCRUDDto requestDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();

        try {
            if (requestDto == null) {
                result.setResult(new ArrayList<>());
                result.setStatus(Result.FAIL);
                result.setMessage("Request data is required.");
                return result;
            }

            String fromDate = requestDto.getFromDate();
            String toDate = requestDto.getToDate();
            if (fromDate == null || fromDate.trim().isEmpty() || toDate == null || toDate.trim().isEmpty()) {
                result.setResult(new ArrayList<>());
                result.setStatus(Result.FAIL);
                result.setMessage("From date and to date are required.");
                return result;
            }

            long vehicleId = requestDto.getVehicleId();
            long clientId = requestDto.getClientId();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime fromLocalDateTime = LocalDateTime.parse(fromDate, formatter);
            LocalDateTime toLocalDateTime = LocalDateTime.parse(toDate, formatter);
            long from = fromLocalDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
            long to = toLocalDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
            if (from > to) {
                result.setResult(new ArrayList<>());
                result.setStatus(Result.FAIL);
                result.setMessage("From date cannot be greater than to date.");
                return result;
            }

            List<DriveringStatusViewDto> unidentifiedEvents = this.lookupUnIdentifiedEventsOperation(from, to, vehicleId, clientId, requestDto.getMacAddress(), requestDto.getTruckNo());

            Map<Long, VehicleMaster> vehicleMap = new HashMap<>();
            Map<String, VehicleMaster> macToVehicleMap = new HashMap<>();

            List<VehicleMaster> allVehicles = this.vehicleMasterRepo.findAll();
            if (allVehicles != null) {
                for (VehicleMaster vm : allVehicles) {
                    if (vm.getVehicleId() != null) {
                        vehicleMap.put(vm.getVehicleId().longValue(), vm);
                    }
                }
            }

            List<MACAddressMaster> allMacs = this.macAddressMasterRepo.findAll();
            if (allMacs != null) {
                for (MACAddressMaster macDoc : allMacs) {
                    if (macDoc.getMacAddress() != null && !macDoc.getMacAddress().trim().isEmpty()) {
                        VehicleMaster vm = vehicleMap.get(macDoc.getVehicleId());
                        if (vm != null) {
                            macToVehicleMap.put(macDoc.getMacAddress().trim().toLowerCase(), vm);
                        }
                    }
                }
            }

            for (DriveringStatusViewDto event : unidentifiedEvents) {
                event.setFromDate(from);
                event.setToDate(to);
                if (event.getDriverId() == 0L) {
                    event.setDriverName("Unidentified Driver");
                }

                VehicleMaster vm = null;
                if (event.getVehicleId() > 0L) {
                    vm = vehicleMap.get(event.getVehicleId());
                }

                if (vm == null && event.getMacAddress() != null && !event.getMacAddress().trim().isEmpty()) {
                    vm = macToVehicleMap.get(event.getMacAddress().trim().toLowerCase());
                    if (vm != null && vm.getVehicleId() != null) {
                        event.setVehicleId(vm.getVehicleId().longValue());
                    }
                }

                if (vm != null) {
                    if (event.getTruckNo() == null || event.getTruckNo().trim().isEmpty() || event.getTruckNo().equals("0") || event.getTruckNo().equalsIgnoreCase("null")) {
                        event.setTruckNo(vm.getVehicleNo());
                    }
                    if (event.getVin() == null || event.getVin().trim().isEmpty()) {
                        event.setVin(vm.getVin());
                    }
                }

                if ((event.getMacAddress() == null || event.getMacAddress().trim().isEmpty() || event.getMacAddress().equalsIgnoreCase("null")) && event.getVehicleId() > 0L) {
                    List<MACAddressMaster> macList = this.macAddressMasterRepo.findByMACAddressMasterByVehicleId(event.getVehicleId());
                    if (macList != null && !macList.isEmpty() && macList.get(0).getMacAddress() != null) {
                        event.setMacAddress(macList.get(0).getMacAddress());
                    }
                }

                if (event.getTruckNo() == null || event.getTruckNo().trim().isEmpty() || event.getTruckNo().equalsIgnoreCase("null")) {
                    event.setTruckNo(event.getVehicleId() > 0L ? "Vehicle #" + event.getVehicleId() : "N/A");
                }

                if (event.getMacAddress() == null || event.getMacAddress().trim().isEmpty() || event.getMacAddress().equalsIgnoreCase("null")) {
                    event.setMacAddress("N/A");
                }
            }

            result.setResult(unidentifiedEvents);
            result.setStatus(Result.SUCCESS);
            if (unidentifiedEvents.isEmpty()) {
                result.setMessage("No unidentified driving events found.");
            } else {
                result.setMessage("Unidentified driving events fetched successfully.");
            }
        } catch (DateTimeParseException var19) {
            result.setResult(new ArrayList<>());
            result.setStatus(Result.FAIL);
            result.setMessage("Invalid date format. Required format: yyyy-MM-dd HH:mm:ss");
        } catch (Exception var20) {
            var20.printStackTrace();
            result.setResult(new ArrayList<>());
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getMessage() != null ? var20.getMessage() : "Unable to fetch unidentified driving events.");
        }

        return result;
    }

    public List<DriveringStatusViewDto> lookupUnIdentifiedEventsOperation(long from, long to, long vehicleId, long clientId) {
        return lookupUnIdentifiedEventsOperation(from, to, vehicleId, clientId, null, null);
    }

    public List<DriveringStatusViewDto> lookupUnIdentifiedEventsOperation(long from, long to, long vehicleId, long clientId, String macAddress, String truckNoStr) {
        List<Criteria> criteriaList = new ArrayList();
        criteriaList.add(Criteria.where("utcDateTime").gte(from).lte(to));
        criteriaList.add(
                new Criteria().orOperator(new Criteria[]{Criteria.where("driverId").in(new Object[]{0L, 0, "0"}), Criteria.where("driverId").exists(false)})
        );
        criteriaList.add(Criteria.where("isVisible").ne(0));
        criteriaList.add(Criteria.where("isActive").ne(0));
        criteriaList.add(
                new Criteria().orOperator(new Criteria[]{Criteria.where("note").regex("Unidentified", "i"), Criteria.where("origin").is("Unidentified")})
        );
        if (macAddress != null && !macAddress.trim().isEmpty() && !macAddress.trim().equals("0") && !macAddress.trim().equalsIgnoreCase("null") && !macAddress.trim().equalsIgnoreCase("undefined")) {
            criteriaList.add(Criteria.where("macAddress").regex(macAddress.trim(), "i"));
        }
        if (truckNoStr != null && !truckNoStr.trim().isEmpty() && !truckNoStr.trim().equals("0") && !truckNoStr.trim().equalsIgnoreCase("null") && !truckNoStr.trim().equalsIgnoreCase("undefined")) {
            List<VehicleMaster> vehicles = (clientId > 0L) ? this.vehicleMasterRepo.findByClientId(clientId) : this.vehicleMasterRepo.findAll();
            List<Object> matchingVehicleIds = new ArrayList<>();
            if (vehicles != null) {
                for (VehicleMaster v : vehicles) {
                    if (v != null && v.getVehicleNo() != null && v.getVehicleNo().toLowerCase().contains(truckNoStr.trim().toLowerCase())) {
                        if (v.getVehicleId() != null) {
                            matchingVehicleIds.add(v.getVehicleId());
                            matchingVehicleIds.add((long) v.getVehicleId().intValue());
                            matchingVehicleIds.add(String.valueOf(v.getVehicleId()));
                        }
                    }
                }
            }
            Criteria truckCriteria = Criteria.where("truckNo").regex(truckNoStr.trim(), "i");
            if (!matchingVehicleIds.isEmpty()) {
                criteriaList.add(new Criteria().orOperator(truckCriteria, Criteria.where("vehicleId").in(matchingVehicleIds)));
            } else {
                criteriaList.add(truckCriteria);
            }
        }
        if (vehicleId > 0L) {
            criteriaList.add(Criteria.where("vehicleId").in(new Object[]{vehicleId, (int) vehicleId, String.valueOf(vehicleId)}));
            if (clientId > 0L) {
                criteriaList.add(
                        new Criteria()
                                .orOperator(
                                        new Criteria[]{
                                            Criteria.where("clientId").in(new Object[]{clientId, (int) clientId, String.valueOf(clientId)}),
                                            Criteria.where("clientId").in(new Object[]{0L, 0, "0"})
                                        }
                                )
                );
            }
        } else if (clientId > 0L) {
            List<VehicleMaster> clientVehicles = this.vehicleMasterRepo.findByClientId(clientId);
            List<Object> validVehicleIds = new ArrayList<>();

            for (VehicleMaster v : clientVehicles) {
                validVehicleIds.add(v.getVehicleId());
                validVehicleIds.add((long) v.getVehicleId().intValue());
                validVehicleIds.add(String.valueOf(v.getVehicleId()));
            }

            if (!validVehicleIds.isEmpty()) {
                criteriaList.add(
                        new Criteria()
                                .orOperator(
                                        new Criteria[]{
                                            Criteria.where("clientId").in(new Object[]{clientId, (int) clientId, String.valueOf(clientId)}),
                                            new Criteria()
                                                    .andOperator(
                                                            new Criteria[]{Criteria.where("clientId").in(new Object[]{0L, 0, "0"}), Criteria.where("vehicleId").in(validVehicleIds)}
                                                    )
                                        }
                                )
                );
            } else {
                criteriaList.add(Criteria.where("clientId").in(new Object[]{clientId, (int) clientId, String.valueOf(clientId)}));
            }
        }

        Criteria finalCriteria = new Criteria().andOperator(criteriaList.toArray(new Criteria[0]));
        MatchOperation matchOperation = Aggregation.match(finalCriteria);
        ProjectionOperation projectionOperation = Aggregation.project(
                new String[]{
                    "_id",
                    "_class",
                    "statusId",
                    "driverId",
                    "vehicleId",
                    "clientId",
                    "truckNo",
                    "vin",
                    "macAddress",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "utcDateTime",
                    "receivedTimestamp",
                    "updatedTimestamp",
                    "logType",
                    "appVersion",
                    "osVersion",
                    "isVoilation",
                    "voilationHour",
                    "note",
                    "customLocation",
                    "currentLocation",
                    "engineHour",
                    "odometer",
                    "origin",
                    "identifier",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime",
                    "remainingSleepTime",
                    "localId",
                    "shift",
                    "days",
                    "isSplit",
                    "isVisible",
                    "isActive"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{matchOperation, projectionOperation, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    public static boolean imageExists(String imageUrl) {
        if (imageUrl != null && !imageUrl.trim().isEmpty()) {
            HttpURLConnection connection = null;

            boolean var3;
            try {
                connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setInstanceFollowRedirects(true);
                int responseCode = connection.getResponseCode();
                return responseCode == 200;
            } catch (Exception var7) {
                var3 = false;
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }

            return var3;
        } else {
            return false;
        }
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriveringStatusByDate(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();
        String sDebug = " >> ";

        try {
            List<DriveringStatusViewDto> driveringStatusViewDto = null;
            List<DriveringStatusViewDto> driveringStatusViewDtoData = new ArrayList<>();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String sDateTime = driveringStatusCRUDDto.getDateTime();
            LocalDate currentDate = LocalDate.parse(sDateTime);
            LocalDateTime startOfDay = LocalDateTime.of(currentDate, LocalTime.MIDNIGHT);
            LocalDateTime endOfDay = LocalDateTime.of(currentDate, LocalTime.MAX);
            long from = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long to = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String baseUrl = "https://admin.gbt-usa.com/uploads/certified_signature/";
            String fileNameWithoutExt = driverId + "_sign_1";
            String[] extensions = new String[]{".png", ".jpg", ".jpeg", ".gif", ".webp"};
            String imageUrl = "";

            for (String ext : extensions) {
                String url = baseUrl + fileNameWithoutExt + ext;
                if (imageExists(url)) {
                    imageUrl = url;
                    break;
                }
            }

            String driverName = "";
            String url = "https://admin.gbt-usa.com/uploads/certified_signature/";
            double startOdometer = 0.0;
            double endOdometer = 0.0;
            double distance = 0.0;
            String startEngineHour = "";
            String endEngineHour = "";
            String unidentifiedLogEvent = "No";
            driveringStatusViewDto = this.lookupDriverStatusDataOperation(from, to, driverId);
            if (driveringStatusViewDto.size() <= 0) {
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lte(from));
                query.limit(1);
                query.with(pageableRequest);
                driveringStatusViewDto = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
            }

            sDebug = sDebug + driveringStatusViewDto.size() + " :: " + from + " : " + to + ",";
            if (driveringStatusViewDto.size() > 0) {
                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    if (driveringStatusViewDto.get(i).getOrigin().equals("Unidentified")) {
                        unidentifiedLogEvent = "Yes";
                    }
                }

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(from);
                    driveringStatusViewDto.get(i).setToDate(to);
                    driveringStatusViewDto.get(i).setUnidentifiedLog(unidentifiedLogEvent);
                    driveringStatusViewDto.get(i).setSignatureUrl(imageUrl);

                    try {
                        sDebug = sDebug + "1,";
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driveringStatusViewDto.get(i).getDriverId());
                        driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        driveringStatusViewDto.get(i).setDriverName(driverName);
                        driveringStatusViewDto.get(i).setMobileNo(empInfo.getMobileNo());
                        driveringStatusViewDto.get(i).setEmail(empInfo.getEmail());
                        driveringStatusViewDto.get(i).setCompanyDriverId(empInfo.getUsername());
                        driveringStatusViewDto.get(i).setCdlNo(empInfo.getCdlNo());
                        sDebug = sDebug + "2,";
                        CountryMaster countryInfo = this.countryMasterRepo.findByCountryId((int) empInfo.getCdlCountryId());
                        driveringStatusViewDto.get(i).setCountryName(countryInfo.getCountryName());
                        sDebug = sDebug + "3,";
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) empInfo.getCdlStateId());
                        driveringStatusViewDto.get(i).setStateName(stateInfo.getStateName());
                        String exemptStatus = "No";
                        if (empInfo.getExempt().equals("active")) {
                            exemptStatus = "Yes";
                        }

                        driveringStatusViewDto.get(i).setExempt(exemptStatus);
                        sDebug = sDebug + "4,";
                        VehicleMaster vehcileInfo = null;
                        if (driveringStatusViewDto.get(i).getVehicleId() > 0L) {
                            vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) driveringStatusViewDto.get(i).getVehicleId());
                            driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                            driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                        } else {
                            driveringStatusViewDto.get(i).setTruckNo("");
                            driveringStatusViewDto.get(i).setVin("");
                        }

                        sDebug = sDebug + "5,";

                        try {
                            MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                            driveringStatusViewDto.get(i).setMainTerminalName(mainTerminal.getMainTerminalName());
                        } catch (Exception var49) {
                            var49.printStackTrace();
                        }

                        sDebug = sDebug + "6,";
                        CycleUsa cycleUsa = this.cycleUsaRepo.findByCycleUsaId((int) empInfo.getCycleUsaId());
                        driveringStatusViewDto.get(i).setCycleUsaName(cycleUsa.getCycleUsaName());
                        if (empInfo.getShortHaulException().equals("active")) {
                            int shorHaulHour = (int) cycleUsa.getOnDutyTime() + 2;
                            driveringStatusViewDto.get(i).setShortHaulException(empInfo.getShortHaulException());
                            driveringStatusViewDto.get(i).setException("Short Haul (" + shorHaulHour + ")");
                        }

                        if (empInfo.getClientId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) empInfo.getClientId());
                            driveringStatusViewDto.get(i).setCompanyName(clientInfo.getClientName());
                            driveringStatusViewDto.get(i).setDotNo(clientInfo.getDotNo());
                            driveringStatusViewDto.get(i).setCarrier(clientInfo.getClientName());
                            countryInfo = this.countryMasterRepo.findByCountryId((int) clientInfo.getCountryId());
                            String address = clientInfo.getStreet() + " " + clientInfo.getCity() + " " + countryInfo.getCountryName();
                            driveringStatusViewDto.get(i).setMainOffice(address);
                            driveringStatusViewDto.get(i).setPeriodStartingTime("00:00");
                        }

                        sDebug = sDebug + "7,";
                        List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);
                        if (certifiedLogViewDto.size() > 0) {
                            for (int c = 0; c < certifiedLogViewDto.size(); ++c) {
                                sDebug = sDebug + "8,";
                                if (certifiedLogViewDto.get(c).getCoDriverId() > 0L) {
                                    empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(c).getCoDriverId());
                                    driveringStatusViewDto.get(i).setCompanyCoDriverId(empInfo.getEmail());
                                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                                    driveringStatusViewDto.get(i).setCoDriverName(driverName);
                                }

                                driveringStatusViewDto.get(i).setCoDriverId(certifiedLogViewDto.get(c).getCoDriverId());
                                driveringStatusViewDto.get(i).setCertifiedLogId(certifiedLogViewDto.get(c).get_id());
                                driveringStatusViewDto.get(i).setTrailers(certifiedLogViewDto.get(c).getTrailers());
                                driveringStatusViewDto.get(i).setShippingDocs(certifiedLogViewDto.get(c).getShippingDocs());
                                sDebug = sDebug + "9,";
                                if (certifiedLogViewDto.get(c).getCertifiedSignature() != null) {
                                    driveringStatusViewDto.get(i).setCertifiedSignatureName(certifiedLogViewDto.get(c).getCertifiedSignature());
                                    String setImagePath1 = url.concat(certifiedLogViewDto.get(c).getCertifiedSignature());
                                    driveringStatusViewDto.get(i).setCertifiedSignature(setImagePath1);
                                }

                                sDebug = sDebug + "10,";
                                vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) certifiedLogViewDto.get(c).getVehicleId());
                                driveringStatusViewDto.get(i).setTruckNo(vehcileInfo.getVehicleNo());
                                driveringStatusViewDto.get(i).setVin(vehcileInfo.getVin());
                            }
                        } else {
                            driveringStatusViewDto.get(i).setTrailers(new ArrayList());
                            driveringStatusViewDto.get(i).setShippingDocs(new ArrayList());
                        }

                        try {
                            MACAddressMaster macAddressData = this.macAddressMasterRepo.findByMACAddressMasterId(driveringStatusViewDto.get(i).getDriverId());
                            driveringStatusViewDto.get(i).setMacAddress(macAddressData.getMacAddress());
                            driveringStatusViewDto.get(i).setSerialNo(macAddressData.getSerialNo());
                            driveringStatusViewDto.get(i).setVersion(macAddressData.getVersion());
                            driveringStatusViewDto.get(i).setModelNo(macAddressData.getModelNo());
                        } catch (Exception var48) {
                            var48.printStackTrace();
                        }

                        try {
                            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
                            Query query = new Query();
                            query.addCriteria(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                            query.with(pageableRequest);
                            List<DriveringStatusViewDto> dsLogData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                            startOdometer = dsLogData.get(0).getOdometer();
                            startEngineHour = dsLogData.get(0).getEngineHour();
                            Pageable var86 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                            query = new Query();
                            query.addCriteria(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("odometer").gt(0));
                            query.with(var86);
                            dsLogData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                            endOdometer = dsLogData.get(0).getOdometer();
                            endEngineHour = dsLogData.get(0).getEngineHour();
                            sDebug = sDebug + "Odometer : " + startOdometer + " :: " + endOdometer + ",";
                            if (endOdometer >= startOdometer && startOdometer > 0.0 && endOdometer > 0.0) {
                                distance = endOdometer - startOdometer;
                            } else {
                                distance = 0.0;
                            }

                            sDebug = sDebug + "Distance : " + distance + ",";
                            driveringStatusViewDto.get(i).setStartEngineHour(startEngineHour);
                            driveringStatusViewDto.get(i).setEndEngineHour(endEngineHour);
                            driveringStatusViewDto.get(i).setStartOdometer(Double.valueOf(String.format("%.2f", startOdometer)));
                            driveringStatusViewDto.get(i).setEndOdometer(Double.valueOf(String.format("%.2f", endOdometer)));
                            driveringStatusViewDto.get(i).setDistance(Double.valueOf(String.format("%.2f", distance)));
                        } catch (Exception var50) {
                            var50.printStackTrace();
                        }

                        sDebug = sDebug + "11,";
                        List<ELDSettings> settings = this.eldSettingsRepo.findAndViewBySettingId(1);
                        if (settings.size() > 0) {
                            driveringStatusViewDto.get(i).setEldProvider(settings.get(0).getEldProvider());
                            driveringStatusViewDto.get(i).setDiagnosticIndicator("NA");
                            driveringStatusViewDto.get(i).setMalfunctionIndicator("NA");
                            driveringStatusViewDto.get(i).setEldRegistrationId(settings.get(0).getEldRegistrationId());
                            driveringStatusViewDto.get(i).setEldIdentifier(settings.get(0).getEldIdentifier());
                        } else {
                            driveringStatusViewDto.get(i).setEldProvider("gbt-usa");
                            driveringStatusViewDto.get(i).setDiagnosticIndicator("NA");
                            driveringStatusViewDto.get(i).setMalfunctionIndicator("NA");
                            driveringStatusViewDto.get(i).setEldRegistrationId("NA");
                            driveringStatusViewDto.get(i).setEldIdentifier("NA");
                        }

                        driveringStatusViewDtoData.add(driveringStatusViewDto.get(i));
                    } catch (Exception var51) {
                        var51.printStackTrace();
                    }
                }

                if ((driverName == null || driverName.isEmpty()) && driverId > 0L) {
                    try {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                        if (empInfo != null) {
                            driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        }
                    } catch (Exception var47) {
                        var47.printStackTrace();
                    }
                }

                try {
                    Map<String, Object> pdfMap = this.createDriverLogStatusPDF(driverId, from, to, driverName);
                    if (pdfMap != null && pdfMap.containsKey("outputStream")) {
                        ByteArrayOutputStream outputStream = (ByteArrayOutputStream) pdfMap.get("outputStream");
                        if (outputStream != null) {
                            byte[] bytes = outputStream.toByteArray();
                            if (bytes != null && bytes.length > 0) {
                                String basePath = "/opt/tomcat/webapps/uploads/driver_log_report/";
                                File folder = new File(basePath);
                                if (!folder.exists()) {
                                    folder.mkdirs();
                                }

                                String pdfFileName = driverId + "_" + sDateTime + "_driver_log.pdf";
                                String filePath = basePath + pdfFileName;

                                try (FileOutputStream fos = new FileOutputStream(filePath)) {
                                    fos.write(bytes);
                                    fos.flush();
                                }

                                String var82 = "https://admin.gbt-usa.com/uploads/driver_log_report/" + pdfFileName;
                                result.setDownload(var82);
                            }
                        }
                    }
                } catch (Exception var46) {
                    var46.printStackTrace();
                }

                result.setResult(driveringStatusViewDtoData);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully" + sDebug);
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("No record found.");
            }
        } catch (Exception var52) {
            result.setStatus(Result.FAIL);
            result.setMessage(var52.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<ViewDriverLogWithDetailDto> ViewDriverLogWithDetails(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<ViewDriverLogWithDetailDto> result = new ResultWrapper<>();

        try {
            ViewDriverLogWithDetailDto viewDriverLogWithDetailDto = new ViewDriverLogWithDetailDto();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            if (driverId > 0L) {
                List<DriveringStatusViewDto> driverLog = this.lookupDriverStatusDataOperation(from, to, driverId);

                for (int i = 0; i < driverLog.size(); ++i) {
                    driverLog.get(i).setFromDate(from);
                    driverLog.get(i).setToDate(to);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    driverLog.get(i).setDriverName(driverName);
                    driverLog.get(i).setMobileNo(empInfo.getMobileNo());
                    driverLog.get(i).setEmail(empInfo.getEmail());
                }

                viewDriverLogWithDetailDto.setDriverLog(driverLog);
                result.setResult(viewDriverLogWithDetailDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Log With Details Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var19) {
            result.setStatus(Result.FAIL);
            result.setMessage(var19.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<DriverLogWithLoginLogViewDto> ViewDriverLogWithLoginLog(DriveringStatusCRUDDto driveringStatusCRUDDto, String tokenValid) {
        ResultWrapper<DriverLogWithLoginLogViewDto> result = new ResultWrapper<>();

        try {
            DriverLogWithLoginLogViewDto driverLogWithLoginLogViewDto = new DriverLogWithLoginLogViewDto();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            if (driverId > 0L) {
                List<DriveringStatusViewDto> driverLog = this.lookupDriverStatusDataOperation(from, to, driverId);

                for (int i = 0; i < driverLog.size(); ++i) {
                    driverLog.get(i).setFromDate(from);
                    driverLog.get(i).setToDate(to);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    driverLog.get(i).setDriverName(driverName);
                }

                List<LoginLog> loginLog = this.lookupLoginLogDataOperation(from, to, driverId, "loginDateTime");
                driverLogWithLoginLogViewDto.setDriverLog(driverLog);
                driverLogWithLoginLogViewDto.setLoginLog(loginLog);
                result.setResult(driverLogWithLoginLogViewDto);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Log With Login Log Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage());
        }

        return result;
    }

    public List<LoginLog> lookupLoginLogDataOperation(long from, long to, long driverId, String loginType) {
        MatchOperation filter = Aggregation.match(
                Criteria.where(loginType).gte(from).lte(to).and("employeeId").is(driverId).and("loginType").is("app").and("isVisible").is(1)
        );
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"employeeId", "loginDateTime", "logoutDateTime", "receivedTimestamp", "isCoDriver", "_id"}
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "login_log", LoginLog.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<LoginLogViewDto>> LoginLogForWeb(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        String sDebug = " >> ";
        ResultWrapper<List<LoginLogViewDto>> result = new ResultWrapper<>();

        try {
            Integer userId = driveringStatusCRUDDto.getUserId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + userId + " :: " + fromDate + " :: " + toDate + ",";
            List<LoginLogViewDto> loginLogViewDto = this.lookupLoginLogDataForWebOperation(from, to, userId);
            sDebug = sDebug + " Size : " + loginLogViewDto.size() + "<< ";

            for (int i = 0; i < loginLogViewDto.size(); ++i) {
                try {
                    UserMaster user = this.userMasterRepo.findByUserId(loginLogViewDto.get(i).getUserId());
                    loginLogViewDto.get(i).setFirstName(user.getFirstName());
                    loginLogViewDto.get(i).setLastName(user.getLastName());
                    loginLogViewDto.get(i).setEmail(user.getEmail());
                    loginLogViewDto.get(i).setMobileNo(user.getMobileNo());
                } catch (Exception var17) {
                    var17.printStackTrace();
                }
            }

            result.setResult(loginLogViewDto);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Login Log Information Send Successfully");
        } catch (Exception var18) {
            result.setStatus(Result.FAIL);
            result.setMessage(var18.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public List<LoginLogViewDto> lookupLoginLogDataForWebOperation(long from, long to, Integer userId) {
        MatchOperation filter = null;
        if (userId == 0) {
            filter = Aggregation.match(Criteria.where("loginDateTime").gte(from).lte(to).and("loginType").is("web"));
        } else {
            filter = Aggregation.match(Criteria.where("loginDateTime").gte(from).lte(to).and("userId").is(userId).and("loginType").is("web"));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"userId", "loginDateTime", "logoutDateTime", "receivedTimestamp", "isCoDriver", "_id"}
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "login_log", LoginLogViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<String> UpdateDriverLog(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            long driverId = driveringStatusCRUDDto.getDriverId();
            long lastDriverId = driveringStatusCRUDDto.getLastDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            Query query = new Query();
            query.addCriteria(Criteria.where("lDateTime").gte(from).lte(to).and("driverId").is(lastDriverId));
            Update update = new Update();
            update.set("driverId", driverId);
            update.set("updatedTimestamp", instant.toEpochMilli());
            this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Log Transfer Successfully");
        } catch (Exception var19) {
            result.setStatus(Result.FAIL);
            result.setMessage(var19.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateAndEnableDisableDriverLog(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            long driverId = driveringStatusCRUDDto.getDriverId();
            long dateTime = Long.parseLong(driveringStatusCRUDDto.getDateTime());
            int isVisible = driveringStatusCRUDDto.getIsVisible();
            String email = driveringStatusCRUDDto.getEmail();
            String driverStatusId = driveringStatusCRUDDto.getDriverStatusId();
            ObjectId objId = new ObjectId(driverStatusId);
            int logShift = driveringStatusCRUDDto.getDays();
            int logDays = driveringStatusCRUDDto.getShift();
            String logStatus = driveringStatusCRUDDto.getStatus();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = Instant.ofEpochMilli(dateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDateTime startOfDay = ldtDateTime.toLocalDate().atStartOfDay();
            long midnightTimestamp = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime endOfDay = ldtDateTime.withHour(23).withMinute(59).withSecond(59);
            long lToDate = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldt15DaysPlusDate = ldtDateTime.plusDays(14L).withHour(23).withMinute(59).withSecond(59);
            long lToDate15 = ldt15DaysPlusDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long nextLogUtcDateTime = 0L;
            long lNextLogEndOfDay = 0L;
            Query query = new Query();
            Update update = new Update();
            if (!logStatus.equals("Certified")) {
                if (logStatus.equals("Login")) {
                    query.addCriteria(Criteria.where("_id").is(objId).and("employeeId").is((int) driverId));
                    update.set("isVisible", isVisible);
                    update.set("email", email);
                    this.mongoTemplate.updateMulti(query, update, LoginLog.class);
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(driverStatusId).and("driverId").is(driverId));
                    update = new Update();
                    update.set("statusId", 0L);
                    update.set("isVisible", isVisible);
                    this.mongoTemplate.updateMulti(query, update, DriverStatusLog.class);
                } else if (logStatus.equals("Logout")) {
                    query.addCriteria(Criteria.where("_id").is(objId).and("employeeId").is((int) driverId));
                    update.set("isVisible", isVisible);
                    update.set("email", email);
                    this.mongoTemplate.updateMulti(query, update, LoginLog.class);
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(driverStatusId).and("driverId").is(driverId));
                    update = new Update();
                    update.set("statusId", 0L);
                    update.set("isVisible", isVisible);
                    this.mongoTemplate.updateMulti(query, update, DriverStatusLog.class);
                } else {
                    query.addCriteria(Criteria.where("_id").is(objId).and("driverId").is(driverId));
                    update.set("isVisible", isVisible);
                    update.set("email", email);
                    this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(driverStatusId).and("driverId").is(driverId));
                    update = new Update();
                    update.set("statusId", 0L);
                    update.set("isVisible", isVisible);
                    this.mongoTemplate.updateMulti(query, update, DriverStatusLog.class);
                }
            }

            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
            Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(dateTime).and("isVoilation").is(0).and("isVisible").is(1));
            queryData.limit(1);
            queryData.with(pageableRequest);
            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                nextLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                nextLogUtcDateTime = lToDate;
            }

            LocalDateTime nexLogDateTime1 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDate nextLogDate1 = nexLogDateTime1.toLocalDate();
            LocalDateTime nextLogEndOfDay1 = nextLogDate1.atTime(23, 59, 59, 999000000);
            nextLogUtcDateTime = nextLogEndOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime nexLogDateTime = Instant.ofEpochMilli(dateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDate nextLogDate = nexLogDateTime.toLocalDate();
            LocalDateTime nextLogEndOfDay = nextLogDate.atTime(23, 59, 59, 999000000);
            lNextLogEndOfDay = nextLogEndOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime startOfDay1 = nextLogDate.atStartOfDay();
            long lStartOfDay = startOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, midnightTimestamp, nextLogUtcDateTime, 1);
            removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, lStartOfDay, lNextLogEndOfDay, 1);
            boolean isVoilationDeleted = false;
            ZoneId zone = ZoneId.systemDefault();
            LocalDate date1 = Instant.ofEpochMilli(midnightTimestamp).atZone(zone).toLocalDate();
            LocalDate date2 = Instant.ofEpochMilli(lNextLogEndOfDay).atZone(zone).toLocalDate();
            LocalDate date3 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(zone).toLocalDate();
            if (date1.isBefore(date3)) {
                this.CheckAllVoilations(driverId, midnightTimestamp, nextLogUtcDateTime, lToDate15, logShift, logDays);
            } else {
                long newMidnightTimestamp = date3.atStartOfDay(zone).toInstant().toEpochMilli();
                LocalDateTime endOfDay1 = date1.atTime(23, 59, 59, 999000000);
                long newEndOfDayTimestamp = endOfDay1.atZone(zone).toInstant().toEpochMilli();
                this.CheckAllVoilations(driverId, newMidnightTimestamp, newEndOfDayTimestamp, lToDate15, logShift, logDays);
            }

            this.UpdateDriverSequenceId(driverId, dateTime);
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Log Transfer Successfully");
        } catch (Exception var57) {
            result.setStatus(Result.FAIL);
            result.setMessage(var57.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateAndShiftDriverLog(DriveringStatusLogViewDto driveringStatusLogViewDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            long remainingDutyTime = 0L;
            long remainingDriveTime = 0L;
            long remainingWeeklyTime = 0L;
            long remainingSleepTime = 0L;
            String driverStatusId = driveringStatusLogViewDto.getDriverStatusId();
            ObjectId logStatusId = new ObjectId(driverStatusId);
            String dateTime = driveringStatusLogViewDto.getDateTime();
            long driverId = driveringStatusLogViewDto.getDriverId();
            long totalSeconds = driveringStatusLogViewDto.getTotalSeconds();
            long lastUtcDateTime = driveringStatusLogViewDto.getLastUtcDateTime();
            String logStatus = driveringStatusLogViewDto.getStatus();
            int logShift = driveringStatusLogViewDto.getShift();
            int logDays = driveringStatusLogViewDto.getDays();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = LocalDateTime.parse(dateTime, formatter);
            long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime startOfDay = ldtDateTime.toLocalDate().atStartOfDay();
            long midnightTimestamp = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(dateTime, formatter);
            LocalDateTime endOfDay = ldtToDate.withHour(23).withMinute(59).withSecond(59);
            long lToDate = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldt15DaysPlusDate = LocalDateTime.parse(dateTime, formatter);
            ldt15DaysPlusDate = ldt15DaysPlusDate.plusDays(14L);
            LocalDateTime endOfDay15 = ldt15DaysPlusDate.withHour(23).withMinute(59).withSecond(59);
            long lToDate15 = endOfDay15.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtAdd8HourDateTime = LocalDateTime.parse(dateTime, formatter);
            ldtAdd8HourDateTime = ldtAdd8HourDateTime.plusHours(8L);
            long l8HourDateTime = ldtAdd8HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long nextLogUtcDateTime = 0L;
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
            Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(lastUtcDateTime).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(pageableRequest);
            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                nextLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                nextLogUtcDateTime = lToDate;
            }

            LocalDateTime nexLogDateTime1 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDate nextLogDate1 = nexLogDateTime1.toLocalDate();
            LocalDateTime nextLogEndOfDay1 = nextLogDate1.atTime(23, 59, 59, 999000000);
            nextLogUtcDateTime = nextLogEndOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime nexLogDateTime = Instant.ofEpochMilli(lastUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDate nextLogDate = nexLogDateTime.toLocalDate();
            LocalDateTime nextLogEndOfDay = nextLogDate.atTime(23, 59, 59, 999000000);
            long lNextLogEndOfDay = nextLogEndOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime startOfDay1 = nextLogDate.atStartOfDay();
            long lStartOfDay = startOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            boolean isVoilationDeleted = false;
            if (!logStatus.equals("Certified") && !logStatus.equals("Login") && !logStatus.equals("Logout")) {
                long removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, midnightTimestamp, nextLogUtcDateTime, 1);
                removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, lStartOfDay, lNextLogEndOfDay, 1);
            }

            LocalDateTime ldtAdd11HourDateTime = LocalDateTime.parse(dateTime, formatter);
            ldtAdd11HourDateTime = ldtAdd11HourDateTime.plusHours(11L);
            long l11HourDateTime = ldtAdd11HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtAdd14HourDateTime = LocalDateTime.parse(dateTime, formatter);
            ldtAdd14HourDateTime = ldtAdd14HourDateTime.plusHours(14L);
            long l14HourDateTime = ldtAdd14HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String sAddress = this.GetGoogleAddress(driveringStatusLogViewDto.getLattitude(), driveringStatusLogViewDto.getLongitude());
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(logStatusId));
            Update update = new Update();
            if (logStatus.equals("Certified")) {
                LocalDate dateOnly = ldtDateTime.toLocalDate();
                update.set("certifiedDate", dateOnly.toString());
                update.set("lCertifiedDate", lDateTime);
                update.set("certifiedDateTime", lDateTime);
                this.mongoTemplate.findAndModify(query, update, CertifiedLog.class);
            } else if (logStatus.equals("Login")) {
                update.set("loginDateTime", lDateTime);
                this.mongoTemplate.findAndModify(query, update, LoginLog.class);
            } else if (logStatus.equals("Logout")) {
                update.set("logoutDateTime", lDateTime);
                this.mongoTemplate.findAndModify(query, update, LoginLog.class);
            }

            query = new Query();
            query.addCriteria(Criteria.where("_id").is(logStatusId));
            update = new Update();
            update.set("dateTime", dateTime);
            update.set("lDateTime", lDateTime);
            update.set("utcDateTime", lDateTime);
            update.set("status", driveringStatusLogViewDto.getStatus());
            update.set("origin", driveringStatusLogViewDto.getOrigin());
            update.set("lattitude", driveringStatusLogViewDto.getLattitude());
            update.set("longitude", driveringStatusLogViewDto.getLongitude());
            update.set("customLocation", sAddress);
            update.set("currentLocation", sAddress);
            update.set("odometer", driveringStatusLogViewDto.getOdometer());
            update.set("engineHour", driveringStatusLogViewDto.getEngineHour());
            update.set("note", driveringStatusLogViewDto.getNote());
            this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
            query = new Query();
            query.addCriteria(Criteria.where("logDataId").is(driverStatusId));
            update = new Update();
            update.set("status", driveringStatusLogViewDto.getStatus());
            update.set("lattitude", driveringStatusLogViewDto.getLattitude());
            update.set("longitude", driveringStatusLogViewDto.getLongitude());
            update.set("dateTime", lDateTime);
            update.set("odometer", driveringStatusLogViewDto.getOdometer());
            update.set("engineHour", driveringStatusLogViewDto.getEngineHour());
            update.set("note", driveringStatusLogViewDto.getNote());
            this.mongoTemplate.updateMulti(query, update, DriverStatusLog.class);
            this.EditDriverLog(driverId, lDateTime, midnightTimestamp, lToDate, lToDate15, totalSeconds, lastUtcDateTime, logStatus, logShift, logDays);
            ZoneId zone = ZoneId.systemDefault();
            LocalDate date1 = Instant.ofEpochMilli(midnightTimestamp).atZone(zone).toLocalDate();
            LocalDate date2 = Instant.ofEpochMilli(lNextLogEndOfDay).atZone(zone).toLocalDate();
            LocalDate date3 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(zone).toLocalDate();
            this.CheckAllVoilations(driverId, midnightTimestamp, nextLogUtcDateTime, lToDate15, logShift, logDays);
            if (date1.isBefore(date2)) {
                this.CheckAndUpdateDVIR(driverId, midnightTimestamp, lNextLogEndOfDay);
            } else {
                long newMidnightTimestamp = date2.atStartOfDay(zone).toInstant().toEpochMilli();
                LocalDateTime endOfDay1 = date1.atTime(23, 59, 59, 999000000);
                long newEndOfDayTimestamp = endOfDay1.atZone(zone).toInstant().toEpochMilli();
                this.CheckAndUpdateDVIR(driverId, newMidnightTimestamp, newEndOfDayTimestamp);
            }

            this.UpdateDriverSequenceId(driverId, lDateTime);
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Log Transfer Successfully" + sDebug);
        } catch (Exception var79) {
            result.setStatus(Result.FAIL);
            result.setMessage(var79.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateAndShiftDriverLogInBulk(AssignLogToDriverDto assignLogToDriverDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            long remainingDutyTime = 0L;
            long remainingDriveTime = 0L;
            long remainingWeeklyTime = 0L;
            long remainingSleepTime = 0L;
            List<DriveringStatusLogViewDto> logStatusData = assignLogToDriverDto.getLogStatusData();
            int iCount = 0;
            DriveringStatusLogViewDto lastLogData = null;
            long utcDateTime = 0L;
            long plus15DaysTimestamp = 0L;
            Map<Long, List<String>> duplicateLogs = new HashMap<>();
            if (!duplicateLogs.isEmpty()) {
                result.setResult("Error");
                result.setStatus(Result.FAIL);
                StringBuilder sb = new StringBuilder("This driver logs already exist:");
                duplicateLogs.forEach((driverIdx, dateTimes) -> sb.append(dateTimes));
                result.setMessage(sb.toString());
            } else {
                List<DriveringStatusLogViewDto> driveringStatus = null;

                for (int i = 0; i < logStatusData.size(); ++i) {
                    DriveringStatusLogViewDto driveringStatusLogViewDto = logStatusData.get(i);
                    String driverStatusId = driveringStatusLogViewDto.getDriverStatusId();
                    ObjectId logStatusId = new ObjectId(driverStatusId);
                    String dateTime = driveringStatusLogViewDto.getDateTime();
                    long driverId = driveringStatusLogViewDto.getDriverId();
                    long totalSeconds = driveringStatusLogViewDto.getTotalSeconds();
                    long lastUtcDateTime = driveringStatusLogViewDto.getLastUtcDateTime();
                    String logStatus = driveringStatusLogViewDto.getStatus();
                    int logShift = driveringStatusLogViewDto.getShift();
                    int logDays = driveringStatusLogViewDto.getDays();
                    String isDvirShift = driveringStatusLogViewDto.getIsDvirShift();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime ldtDateTime = LocalDateTime.parse(dateTime, formatter);
                    long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime startOfDay = ldtDateTime.toLocalDate().atStartOfDay();
                    long midnightTimestamp = startOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime ldtToDate = LocalDateTime.parse(dateTime, formatter);
                    LocalDateTime endOfDay = ldtToDate.withHour(23).withMinute(59).withSecond(59);
                    long lToDate = endOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime ldt15DaysPlusDate = LocalDateTime.parse(dateTime, formatter);
                    ldt15DaysPlusDate = ldt15DaysPlusDate.plusDays(14L);
                    LocalDateTime endOfDay15 = ldt15DaysPlusDate.withHour(23).withMinute(59).withSecond(59);
                    long lToDate15 = endOfDay15.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime ldtAdd8HourDateTime = LocalDateTime.parse(dateTime, formatter);
                    ldtAdd8HourDateTime = ldtAdd8HourDateTime.plusHours(8L);
                    long l8HourDateTime = ldtAdd8HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    long nextLogUtcDateTime = 0L;
                    Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
                    Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(lastUtcDateTime).and("isVoilation").is(0));
                    queryData.limit(1);
                    queryData.with(pageableRequest);
                    List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
                    if (driveringStatusViewDtoData.size() > 0) {
                        nextLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
                    } else {
                        nextLogUtcDateTime = lToDate;
                    }

                    LocalDateTime nexLogDateTime1 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
                    LocalDate nextLogDate1 = nexLogDateTime1.toLocalDate();
                    LocalDateTime nextLogEndOfDay1 = nextLogDate1.atTime(23, 59, 59, 999000000);
                    nextLogUtcDateTime = nextLogEndOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime nexLogDateTime = Instant.ofEpochMilli(lastUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
                    LocalDate nextLogDate = nexLogDateTime.toLocalDate();
                    LocalDateTime nextLogEndOfDay = nextLogDate.atTime(23, 59, 59, 999000000);
                    long lNextLogEndOfDay = nextLogEndOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime startOfDay1 = nextLogDate.atStartOfDay();
                    long lStartOfDay = startOfDay1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    boolean isVoilationDeleted = false;
                    if (!logStatus.equals("Certified") && !logStatus.equals("Login") && !logStatus.equals("Logout")) {
                        long removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, midnightTimestamp, nextLogUtcDateTime, 1);
                        removeCount = this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, lStartOfDay, lNextLogEndOfDay, 1);
                    }

                    LocalDateTime ldtAdd11HourDateTime = LocalDateTime.parse(dateTime, formatter);
                    ldtAdd11HourDateTime = ldtAdd11HourDateTime.plusHours(11L);
                    long l11HourDateTime = ldtAdd11HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    LocalDateTime ldtAdd14HourDateTime = LocalDateTime.parse(dateTime, formatter);
                    ldtAdd14HourDateTime = ldtAdd14HourDateTime.plusHours(14L);
                    long l14HourDateTime = ldtAdd14HourDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    String sAddress = this.GetGoogleAddress(driveringStatusLogViewDto.getLattitude(), driveringStatusLogViewDto.getLongitude());
                    Query query = new Query();
                    query.addCriteria(Criteria.where("_id").is(logStatusId));
                    Update update = new Update();
                    if (logStatus.equals("Certified")) {
                        LocalDate dateOnly = ldtDateTime.toLocalDate();
                        update.set("certifiedDate", dateOnly.toString());
                        update.set("lCertifiedDate", lDateTime);
                        update.set("certifiedDateTime", lDateTime);
                        this.mongoTemplate.findAndModify(query, update, CertifiedLog.class);
                    } else if (logStatus.equals("Login")) {
                        update.set("loginDateTime", lDateTime);
                        this.mongoTemplate.findAndModify(query, update, LoginLog.class);
                    } else if (logStatus.equals("Logout")) {
                        update.set("logoutDateTime", lDateTime);
                        this.mongoTemplate.findAndModify(query, update, LoginLog.class);
                    }

                    query = new Query();
                    query.addCriteria(Criteria.where("_id").is(logStatusId));
                    update = new Update();
                    update.set("dateTime", dateTime);
                    update.set("lDateTime", lDateTime);
                    update.set("utcDateTime", lDateTime);
                    update.set("status", driveringStatusLogViewDto.getStatus());
                    update.set("origin", driveringStatusLogViewDto.getOrigin());
                    update.set("lattitude", driveringStatusLogViewDto.getLattitude());
                    update.set("longitude", driveringStatusLogViewDto.getLongitude());
                    update.set("customLocation", sAddress);
                    update.set("currentLocation", sAddress);
                    update.set("odometer", driveringStatusLogViewDto.getOdometer());
                    update.set("engineHour", driveringStatusLogViewDto.getEngineHour());
                    update.set("note", driveringStatusLogViewDto.getNote());
                    this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
                    query = new Query();
                    query.addCriteria(Criteria.where("logDataId").is(driverStatusId));
                    update = new Update();
                    update.set("status", driveringStatusLogViewDto.getStatus());
                    update.set("lattitude", driveringStatusLogViewDto.getLattitude());
                    update.set("longitude", driveringStatusLogViewDto.getLongitude());
                    update.set("dateTime", lDateTime);
                    update.set("odometer", driveringStatusLogViewDto.getOdometer());
                    update.set("engineHour", driveringStatusLogViewDto.getEngineHour());
                    update.set("note", driveringStatusLogViewDto.getNote());
                    this.mongoTemplate.updateMulti(query, update, DriverStatusLog.class);
                    if (isDvirShift.equals("true")) {
                        List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(lStartOfDay, lNextLogEndOfDay, driverId);
                        if (dvirDataViewDto.size() > 0) {
                            ObjectId objId = new ObjectId(dvirDataViewDto.get(0).get_id());
                            query = new Query();
                            query.addCriteria(Criteria.where("_id").is(objId));
                            update = new Update();
                            update.set("dateTime", dateTime);
                            update.set("lDateTime", lDateTime);
                            this.mongoTemplate.findAndModify(query, update, DVIRData.class);
                        }
                    }

                    this.EditDriverLog(driverId, lDateTime, midnightTimestamp, lToDate, lToDate15, totalSeconds, lastUtcDateTime, logStatus, logShift, logDays);
                    ZoneId zone = ZoneId.systemDefault();
                    LocalDate date1 = Instant.ofEpochMilli(midnightTimestamp).atZone(zone).toLocalDate();
                    LocalDate date2 = Instant.ofEpochMilli(lNextLogEndOfDay).atZone(zone).toLocalDate();
                    LocalDate date3 = Instant.ofEpochMilli(nextLogUtcDateTime).atZone(zone).toLocalDate();
                    if (date1.isBefore(date3)) {
                        this.CheckAllVoilations(driverId, midnightTimestamp, nextLogUtcDateTime, lToDate15, logShift, logDays);
                    } else {
                        long newMidnightTimestamp = date3.atStartOfDay(zone).toInstant().toEpochMilli();
                        LocalDateTime endOfDay1 = date1.atTime(23, 59, 59, 999000000);
                        long newEndOfDayTimestamp = endOfDay1.atZone(zone).toInstant().toEpochMilli();
                        this.CheckAllVoilations(driverId, newMidnightTimestamp, newEndOfDayTimestamp, lToDate15, logShift, logDays);
                    }

                    if (date1.isBefore(date2)) {
                        this.CheckAndUpdateDVIR(driverId, midnightTimestamp, lNextLogEndOfDay);
                    } else {
                        long newMidnightTimestamp = date2.atStartOfDay(zone).toInstant().toEpochMilli();
                        LocalDateTime endOfDay1 = date1.atTime(23, 59, 59, 999000000);
                        long newEndOfDayTimestamp = endOfDay1.atZone(zone).toInstant().toEpochMilli();
                        this.CheckAndUpdateDVIR(driverId, newMidnightTimestamp, newEndOfDayTimestamp);
                    }

                    this.UpdateDriverSequenceId(driverId, lDateTime);
                }

                result.setResult("Updated");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Log Transfer Successfully" + sDebug);
            }
        } catch (Exception var91) {
            result.setStatus(Result.FAIL);
            result.setMessage(var91.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public void CheckAndUpdateDVIR(long driverId, long from, long to) {
        List<DriveringStatusLogViewDto> driveringStatusList = this.loockupDriveringStatusData(driverId, from, to);
        Set<LocalDate> processedDates = new HashSet<>();

        for (int i = 0; i < driveringStatusList.size(); ++i) {
            if ("ONDRIVE".equalsIgnoreCase(driveringStatusList.get(i).getStatus())) {
                long utcDateTime = driveringStatusList.get(i).getUtcDateTime();
                String formattedTime = Instant.ofEpochMilli(utcDateTime).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                LocalDate logDate = Instant.ofEpochMilli(utcDateTime).atZone(ZoneId.systemDefault()).toLocalDate();
                long startOfDayMillis = logDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                long endOfDayMillis = logDate.atTime(23, 59, 59, 999000000).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                if (!processedDates.contains(logDate)) {
                    List<DVIRDataCRUDDto> dvirDataViewDto = this.lookupDVIRDataOperation(startOfDayMillis, endOfDayMillis, driverId);
                    if (dvirDataViewDto.size() > 0) {
                        processedDates.add(logDate);
                        ObjectId objId = new ObjectId(dvirDataViewDto.get(0).get_id());
                        Query query = new Query();
                        query.addCriteria(Criteria.where("_id").is(objId));
                        Update update = new Update();
                        update.set("dateTime", formattedTime);
                        update.set("lDateTime", utcDateTime);
                        this.mongoTemplate.findAndModify(query, update, DVIRData.class);
                    }
                }
            }
        }
    }

    public void SaveVoilations(DriveringStatusLogViewDto driveringStatusViewDto, String logType, int voilationHour, long voilationUtcDateTime) {
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            LocalDateTime ldtDateTime = Instant.ofEpochMilli(voilationUtcDateTime).atZone(ZoneOffset.UTC).toLocalDateTime();
            String dateTime = ldtDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            long remainingDutyTime = Long.parseLong(driveringStatusViewDto.getRemainingDutyTime());
            long remainingWeeklyTime = Long.parseLong(driveringStatusViewDto.getRemainingWeeklyTime());
            long remainingDriveTime = Long.parseLong(driveringStatusViewDto.getRemainingDriveTime());
            long remainingSleepTime = Long.parseLong(driveringStatusViewDto.getRemainingSleepTime());
            sDebug = sDebug + " OD | " + remainingDutyTime + " ODR | " + remainingDriveTime + " Cycle | " + remainingWeeklyTime + "\n";
            this.SaveLog(sDebug);
            DriveringStatus driveringStatus = new DriveringStatus();
            driveringStatus.setDriverId(driveringStatusViewDto.getDriverId());
            driveringStatus.setVehicleId(driveringStatusViewDto.getVehicleId());
            driveringStatus.setClientId(driveringStatusViewDto.getClientId());
            driveringStatus.setStatus("Voilation");
            driveringStatus.setLattitude(0.0);
            driveringStatus.setLongitude(0.0);
            driveringStatus.setDateTime(dateTime);
            driveringStatus.setLDateTime(voilationUtcDateTime);
            driveringStatus.setUtcDateTime(voilationUtcDateTime);
            driveringStatus.setLogType(logType);
            driveringStatus.setAppVersion("1.0");
            driveringStatus.setOsVersion("web");
            driveringStatus.setIsVoilation(1);
            driveringStatus.setVoilationHour(voilationHour);
            driveringStatus.setNote("");
            driveringStatus.setCustomLocation("");
            driveringStatus.setCurrentLocation("");
            driveringStatus.setEngineHour("0");
            driveringStatus.setEngineStatus(driveringStatusViewDto.getEngineStatus());
            driveringStatus.setOrigin("Driver");
            driveringStatus.setOdometer(0.0);
            driveringStatus.setRemainingWeeklyTime(remainingWeeklyTime);
            driveringStatus.setRemainingDutyTime(remainingDutyTime);
            driveringStatus.setRemainingDriveTime(remainingDriveTime);
            driveringStatus.setRemainingSleepTime(remainingSleepTime);
            driveringStatus.setShift(driveringStatusViewDto.getShift());
            driveringStatus.setDays(driveringStatusViewDto.getDays());
            driveringStatus.setReceivedTimestamp(instant.toEpochMilli());
            driveringStatus.setIsVisible(1);
            driveringStatus = (DriveringStatus) this.driveringStatusRepo.save(driveringStatus);
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
            Query queryLog = new Query(Criteria.where("driverId").is(driveringStatus.getDriverId()));
            queryLog.limit(1);
            queryLog.with(pageableRequest);
            List<DriveringStatusViewDto> dsDataLog = this.mongoTemplate.find(queryLog, DriveringStatusViewDto.class, "drivering_status");
            DriverStatusLog driverStatusLog = new DriverStatusLog();
            driverStatusLog.setStatusId(0L);
            driverStatusLog.setLogDataId(dsDataLog.get(0).get_id());
            driverStatusLog.setDriverId(driveringStatus.getDriverId());
            driverStatusLog.setVehicleId(driveringStatus.getVehicleId());
            driverStatusLog.setClientId(driveringStatus.getClientId());
            driverStatusLog.setStatus(driveringStatus.getStatus());
            driverStatusLog.setLattitude(driveringStatus.getLattitude());
            driverStatusLog.setLongitude(driveringStatus.getLongitude());
            driverStatusLog.setDateTime(driveringStatus.getUtcDateTime());
            driverStatusLog.setLogType(driveringStatus.getLogType());
            driverStatusLog.setEngineHour(driveringStatus.getEngineHour());
            driverStatusLog.setOrigin(driveringStatus.getOrigin());
            driverStatusLog.setOdometer(driveringStatus.getOdometer());
            driverStatusLog.setIsVoilation(driveringStatus.getIsVoilation());
            driverStatusLog.setNote(driveringStatus.getNote());
            driverStatusLog.setCustomLocation(driveringStatus.getCustomLocation());
            driverStatusLog.setIsReportGenerated(0);
            driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
            driverStatusLog.setIsVisible(1);
            List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(dsDataLog.get(0).get_id());
            if (logDataExist.size() <= 0) {
                this.driverStatusLogRepo.save(driverStatusLog);
                this.UpdateDriverSequenceId(driveringStatus.getDriverId(), driveringStatus.getUtcDateTime());
            }
        } catch (Exception var24) {
            var24.printStackTrace();
        }
    }

    public void EditDriverLogNew(
            long driverId,
            long currentLogTime,
            long midnightTimestamp,
            long currentDayEndTime,
            long to,
            long totalSeconds,
            long lastUtcDateTime,
            String currentStatus,
            int logShift,
            int logDays
    ) {
        String sDebug = " ## ";
        long remainingDriveTime = 0L;
        long remainingDutyTime = 0L;
        long remainingWeeklyTime = 0L;
        long remainingSleepTime = 0L;
        int shift = 0;
        int lastShift = 0;
        int days = 0;
        int lastDays = 0;
        long secondShift = 122400L;
        long secondSleep = 36000L;
        long continueDriveSeconds = 28800L;
        long remainingContinueDrive = 0L;
        long breakTimeSeconds = 1800L;
        long splitSleepSeconds = 7200L;
        long totalDriveSeconds = 39600L;
        long totalDutySeconds = 50400L;
        long totalContinueDrive = 0L;
        long totalBreakSecond = 0L;
        long breakDuration = 0L;
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
        secondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L;
        secondSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
        continueDriveSeconds = cycleUsaData.getContinueDriveTime() * 60L * 60L;
        breakTimeSeconds = cycleUsaData.getBreakTime() * 60L;
        totalDriveSeconds = cycleUsaData.getOnDriveTime() * 60L * 60L;
        totalDutySeconds = cycleUsaData.getOnDutyTime() * 60L * 60L;
        long currentUtcDateTime = 0L;
        long lastLogUtcDateTime = 0L;
        long nextLogUtcDateTime = 0L;
        String nextStatus = "";
        String previousStatus = "";
        int iCount = 0;
        boolean isDayChange = false;
        boolean isBreak = false;

        try {
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
            Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(lastUtcDateTime).lte(to).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(pageableRequest);
            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                nextStatus = driveringStatusViewDtoData.get(0).getStatus();
                nextLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                nextStatus = currentStatus;
            }

            Pageable var163 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
            queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lt(lastUtcDateTime).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(var163);
            driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                previousStatus = driveringStatusViewDtoData.get(0).getStatus();
                lastLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                previousStatus = "OffDuty";
                lastLogUtcDateTime = midnightTimestamp;
            }

            new Query();
            new Update();
            long previousMidnightTimestamp = midnightTimestamp - 86400000L;
            List<DriveringStatusLogViewDto> driveringStatusList = this.loockupDriveringStatusDataForOneDay(
                    driverId, previousMidnightTimestamp, to, logShift, logDays
            );
            sDebug = sDebug + " >> " + previousStatus + " :: " + currentStatus + " : " + nextStatus + "\n";
            this.SaveLog(sDebug);
            String logType = "";
            int voilationHour = 0;
            long voilationUtcDateTime = 0L;
            currentUtcDateTime = 0L;
            if (!currentStatus.equals("OnDrive") || !nextStatus.equals("OnDuty") || !previousStatus.equals("OffDuty") && !previousStatus.equals("OnSleep")) {
                if (currentStatus.equals("OnDuty") && nextStatus.equals("OnDrive")) {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (lastDays != 0 || i != 0) {
                                break;
                            }

                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        lastDays = days;
                    }
                } else if (currentStatus.equals("OnDrive") && nextStatus.equals("OnDuty")) {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (lastDays != 0 || i != 0) {
                                break;
                            }

                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        lastDays = days;
                    }
                } else if (!currentStatus.equals("OnDrive") || !nextStatus.equals("OffDuty") && !nextStatus.equals("OnSleep")) {
                    if (!currentStatus.equals("OnDuty") || !nextStatus.equals("OffDuty") && !nextStatus.equals("OnSleep")) {
                        if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && previousStatus.equals("OnDrive")) {
                            sDebug = sDebug + "Previous log : " + previousStatus + ",\n";

                            for (int i = 0; i < driveringStatusList.size(); ++i) {
                                ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                                days = driveringStatusList.get(i).getDays();
                                shift = driveringStatusList.get(i).getShift();
                                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                                isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentUtcDateTime, lastLogUtcDateTime, nextLogUtcDateTime);
                                if (isBreak) {
                                    if (totalSeconds < 0L) {
                                        totalSeconds = Math.abs(totalSeconds);
                                    } else {
                                        totalSeconds = -totalSeconds;
                                    }

                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                } else {
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                }

                                sDebug = sDebug
                                        + "Day | "
                                        + days
                                        + " OD | "
                                        + remainingDutyTime
                                        + " ODR | "
                                        + remainingDriveTime
                                        + " Cycle | "
                                        + remainingWeeklyTime
                                        + "\n";
                                if (days == lastDays && lastDays > 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else if (lastDays == 0 && i == 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else {
                                    if (shift != lastShift) {
                                        break;
                                    }

                                    isDayChange = true;
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    sDebug = sDebug
                                            + "Shift | "
                                            + shift
                                            + " Day | "
                                            + days
                                            + " OD | "
                                            + remainingDutyTime
                                            + " ODR | "
                                            + remainingDriveTime
                                            + " Cycle | "
                                            + remainingWeeklyTime
                                            + "\n";
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                }

                                if (!isDayChange) {
                                    lastDays = days;
                                }

                                lastShift = shift;
                                lastLogUtcDateTime = currentUtcDateTime;
                            }
                        } else if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && previousStatus.equals("OnDuty")) {
                            for (int i = 0; i < driveringStatusList.size(); ++i) {
                                ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                                isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentUtcDateTime, lastLogUtcDateTime, nextLogUtcDateTime);
                                if (isBreak) {
                                    if (totalSeconds < 0L) {
                                        totalSeconds = Math.abs(totalSeconds);
                                    } else {
                                        totalSeconds = -totalSeconds;
                                    }

                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                } else {
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                }

                                days = driveringStatusList.get(i).getDays();
                                shift = driveringStatusList.get(i).getShift();
                                if (days == lastDays && lastDays > 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else if (lastDays == 0 && i == 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else {
                                    if (shift != lastShift) {
                                        break;
                                    }

                                    isDayChange = true;
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                }

                                if (!isDayChange) {
                                    lastDays = days;
                                }

                                lastShift = shift;
                            }
                        }
                    } else {
                        for (int i = 0; i < driveringStatusList.size(); ++i) {
                            sDebug = sDebug + "Next log : " + nextStatus + ",\n";
                            ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                            remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                            remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                            remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                            remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                            remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                            days = driveringStatusList.get(i).getDays();
                            shift = driveringStatusList.get(i).getShift();
                            currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                            sDebug = sDebug
                                    + "Day | "
                                    + days
                                    + " OD | "
                                    + remainingDutyTime
                                    + " ODR | "
                                    + remainingDriveTime
                                    + " Cycle | "
                                    + remainingWeeklyTime
                                    + "\n";
                            if (days == lastDays && lastDays > 0) {
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            } else if (lastDays == 0 && i == 0) {
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            } else {
                                if (shift != lastShift) {
                                    break;
                                }

                                isDayChange = true;
                                remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            }

                            if (!isDayChange) {
                                lastDays = days;
                            }

                            lastShift = shift;
                        }
                    }
                } else {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        sDebug = sDebug + "Next log : " + nextStatus + ",\n";
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        sDebug = sDebug + "Day | " + days + " OD | " + remainingDutyTime + " ODR | " + remainingDriveTime + " Cycle | " + remainingWeeklyTime + "\n";
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else if (lastDays == 0 && i == 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (shift != lastShift) {
                                break;
                            }

                            isDayChange = true;
                            remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                            remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        if (!isDayChange) {
                            lastDays = days;
                        }

                        lastShift = shift;
                    }
                }
            } else {
                for (int i = 0; i < driveringStatusList.size(); ++i) {
                    ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                    if (i == 0) {
                        isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentLogTime, lastLogUtcDateTime, nextLogUtcDateTime);
                        breakDuration = (lastUtcDateTime - lastLogUtcDateTime) / 1000L;
                    }

                    if (isBreak) {
                        remainingDutyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingDutyTime);
                        remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingWeeklyTime);
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                    } else {
                        remainingDutyTime = this.CalculateRemainingTime(-breakDuration, remainingDutyTime);
                        remainingWeeklyTime = this.CalculateRemainingTime(-breakDuration, remainingWeeklyTime);
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                    }

                    sDebug = sDebug + " >> BD : " + breakDuration + " :: " + remainingDutyTime + " : " + remainingWeeklyTime + "\n";
                    days = driveringStatusList.get(i).getDays();
                    shift = driveringStatusList.get(i).getShift();
                    currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                    if (days == lastDays && lastDays > 0) {
                        this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                    } else {
                        if (lastDays != 0 || i != 0) {
                            break;
                        }

                        this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                    }

                    lastDays = days;
                }
            }

            this.SaveLog(sDebug);
        } catch (Exception var80) {
            var80.printStackTrace();
        }
    }

    private String normalizeStatus(String status) {
        if (status == null) {
            return "";
        } else if (status.equals("YardMove")) {
            return "OnDuty";
        } else {
            return status.equals("PersonalUse") ? "OffDuty" : status;
        }
    }

    public void EditDriverLog(
            long driverId,
            long currentLogTime,
            long midnightTimestamp,
            long currentDayEndTime,
            long to,
            long totalSeconds,
            long lastUtcDateTime,
            String currentStatus,
            int logShift,
            int logDays
    ) {
        String sDebug = "## TIMELINE ENGINE (COMPATIBLE) ##\n";

        try {
            List<DriveringStatusLogViewDto> logs = this.loockupDriveringStatusData(driverId, midnightTimestamp, currentDayEndTime);
            if (logs == null || logs.size() < 2) {
                return;
            }

            logs.sort(Comparator.comparingLong(DriveringStatusLogViewDto::getUtcDateTime));
            DriveringStatusLogViewDto firstLog = logs.get(0);
            long remainingDriveTime = Long.parseLong(firstLog.getRemainingDriveTime());
            long remainingDutyTime = Long.parseLong(firstLog.getRemainingDutyTime());
            long remainingWeeklyTime = Long.parseLong(firstLog.getRemainingWeeklyTime());
            long prevTime = firstLog.getUtcDateTime();
            String prevStatus = this.normalizeStatus(firstLog.getStatus());
            int lastDay = firstLog.getDays();
            int lastShift = firstLog.getShift();

            for (int i = 1; i < logs.size(); ++i) {
                DriveringStatusLogViewDto log = logs.get(i);
                ObjectId objId = new ObjectId(log.get_id());
                long currTime = log.getUtcDateTime();
                String currStatus = this.normalizeStatus(log.getStatus());
                int currDay = log.getDays();
                int currShift = log.getShift();
                long duration = (currTime - prevTime) / 1000L;
                if (duration < 0L) {
                    duration = 0L;
                }

                boolean wasWorking = prevStatus.equals("OnDuty") || prevStatus.equals("OnDrive");
                boolean wasResting = prevStatus.equals("OffDuty") || prevStatus.equals("OnSleep");
                if (wasWorking) {
                    remainingDutyTime -= duration;
                    remainingWeeklyTime -= duration;
                    if (prevStatus.equals("OnDrive")) {
                        remainingDriveTime -= duration;
                    }

                    sDebug = sDebug + "[WORK] " + duration + " sec\n";
                } else if (wasResting) {
                    if (duration < 7200L) {
                        remainingDutyTime -= duration;
                        remainingWeeklyTime -= duration;
                        sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                    } else {
                        sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                    }
                }

                if (currDay != lastDay) {
                    break;
                }

                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                prevTime = currTime;
                prevStatus = currStatus;
                lastDay = currDay;
            }

            this.SaveLog(sDebug);
        } catch (Exception var44) {
            var44.printStackTrace();
        }
    }

    public void EditDriverLog_old(
            long driverId,
            long currentLogTime,
            long midnightTimestamp,
            long currentDayEndTime,
            long to,
            long totalSeconds,
            long lastUtcDateTime,
            String currentStatus,
            int logShift,
            int logDays
    ) {
        String sDebug = " ## ";
        long remainingDriveTime = 0L;
        long remainingDutyTime = 0L;
        long remainingWeeklyTime = 0L;
        long remainingSleepTime = 0L;
        int shift = 0;
        int lastShift = 0;
        int days = 0;
        int lastDays = 0;
        long secondShift = 122400L;
        long secondSleep = 36000L;
        long continueDriveSeconds = 28800L;
        long remainingContinueDrive = 0L;
        long breakTimeSeconds = 1800L;
        long splitSleepSeconds = 7200L;
        long totalDriveSeconds = 39600L;
        long totalDutySeconds = 50400L;
        long totalContinueDrive = 0L;
        long totalBreakSecond = 0L;
        long breakDuration = 0L;
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
        secondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L;
        secondSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
        continueDriveSeconds = cycleUsaData.getContinueDriveTime() * 60L * 60L;
        breakTimeSeconds = cycleUsaData.getBreakTime() * 60L;
        totalDriveSeconds = cycleUsaData.getOnDriveTime() * 60L * 60L;
        totalDutySeconds = cycleUsaData.getOnDutyTime() * 60L * 60L;
        long currentUtcDateTime = 0L;
        long lastLogUtcDateTime = 0L;
        long nextLogUtcDateTime = 0L;
        String nextStatus = "";
        String previousStatus = "";
        int iCount = 0;
        boolean isDayChange = false;
        boolean isBreak = false;
        if (currentStatus.equals("YardMove")) {
            currentStatus = "OnDuty";
        } else if (currentStatus.equals("PersonalUse")) {
            currentStatus = "OffDuty";
        }

        try {
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).ascending());
            Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gt(lastUtcDateTime).lte(to).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(pageableRequest);
            List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                nextStatus = driveringStatusViewDtoData.get(0).getStatus();
                nextLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                nextStatus = currentStatus;
            }

            if (nextStatus.equals("YardMove")) {
                nextStatus = "OnDuty";
            } else if (nextStatus.equals("PersonalUse")) {
                nextStatus = "OffDuty";
            }

            Pageable var169 = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
            queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lt(lastUtcDateTime).and("isVoilation").is(0));
            queryData.limit(1);
            queryData.with(var169);
            driveringStatusViewDtoData = this.mongoTemplate.find(queryData, DriveringStatusViewDto.class, "drivering_status");
            if (driveringStatusViewDtoData.size() > 0) {
                previousStatus = driveringStatusViewDtoData.get(0).getStatus();
                lastLogUtcDateTime = driveringStatusViewDtoData.get(0).getUtcDateTime();
            } else {
                previousStatus = "OffDuty";
                lastLogUtcDateTime = midnightTimestamp;
            }

            if (previousStatus.equals("YardMove")) {
                previousStatus = "OnDuty";
            } else if (previousStatus.equals("PersonalUse")) {
                previousStatus = "OffDuty";
            }

            new Query();
            new Update();
            List<DriveringStatusLogViewDto> driveringStatusList = this.loockupDriveringStatusData(driverId, lastUtcDateTime, currentDayEndTime);
            sDebug = sDebug + " >> " + previousStatus + " :: " + currentStatus + " : " + nextStatus + "\n";
            this.SaveLog(sDebug);
            String logType = "";
            int voilationHour = 0;
            long voilationUtcDateTime = 0L;
            currentUtcDateTime = 0L;
            if (currentStatus.equals("OnDrive") && nextStatus.equals("OnDuty") && (previousStatus.equals("OffDuty") || previousStatus.equals("OnSleep"))) {
                for (int i = 0; i < driveringStatusList.size(); ++i) {
                    ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                    if (i == 0) {
                        isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentLogTime, lastLogUtcDateTime, nextLogUtcDateTime);
                        breakDuration = (lastUtcDateTime - lastLogUtcDateTime) / 1000L;
                    }

                    if (isBreak) {
                        remainingDutyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingDutyTime);
                        remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingWeeklyTime);
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                    } else {
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                    }

                    sDebug = sDebug + " >> BD : " + isBreak + " >> " + breakDuration + " :: " + remainingDutyTime + " : " + remainingWeeklyTime + "\n";
                    days = driveringStatusList.get(i).getDays();
                    shift = driveringStatusList.get(i).getShift();
                    currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                    if (days == lastDays && lastDays > 0) {
                        this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                    } else {
                        if (lastDays != 0 || i != 0) {
                            break;
                        }

                        this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                    }

                    lastDays = days;
                    lastShift = shift;
                }
            }

            if (!currentStatus.equals("OnDuty") || !nextStatus.equals("OnDrive") || !previousStatus.equals("OffDuty") && !previousStatus.equals("OnSleep")) {
                if (currentStatus.equals("OnDuty") && nextStatus.equals("OnDrive")) {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (lastDays != 0 || i != 0) {
                                break;
                            }

                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        lastDays = days;
                    }
                } else if (currentStatus.equals("OnDrive") && nextStatus.equals("OnDuty")) {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (lastDays != 0 || i != 0) {
                                break;
                            }

                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        lastDays = days;
                    }
                } else if (!currentStatus.equals("OnDrive") || !nextStatus.equals("OffDuty") && !nextStatus.equals("OnSleep")) {
                    if (!currentStatus.equals("OnDuty") || !nextStatus.equals("OffDuty") && !nextStatus.equals("OnSleep")) {
                        if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && previousStatus.equals("OnDrive")) {
                            sDebug = sDebug + "Previous log : " + previousStatus + ",\n";

                            for (int i = 0; i < driveringStatusList.size(); ++i) {
                                ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                                days = driveringStatusList.get(i).getDays();
                                shift = driveringStatusList.get(i).getShift();
                                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                                isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentUtcDateTime, lastLogUtcDateTime, nextLogUtcDateTime);
                                if (isBreak) {
                                    if (totalSeconds < 0L) {
                                        totalSeconds = Math.abs(totalSeconds);
                                    } else {
                                        totalSeconds = -totalSeconds;
                                    }

                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                } else {
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                }

                                sDebug = sDebug
                                        + "Day | "
                                        + days
                                        + " OD | "
                                        + remainingDutyTime
                                        + " ODR | "
                                        + remainingDriveTime
                                        + " Cycle | "
                                        + remainingWeeklyTime
                                        + "\n";
                                if (days == lastDays && lastDays > 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else if (lastDays == 0 && i == 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else {
                                    if (shift != lastShift) {
                                        break;
                                    }

                                    isDayChange = true;
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    sDebug = sDebug
                                            + "Shift | "
                                            + shift
                                            + " Day | "
                                            + days
                                            + " OD | "
                                            + remainingDutyTime
                                            + " ODR | "
                                            + remainingDriveTime
                                            + " Cycle | "
                                            + remainingWeeklyTime
                                            + "\n";
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                }

                                if (!isDayChange) {
                                    lastDays = days;
                                }

                                lastShift = shift;
                                lastLogUtcDateTime = currentUtcDateTime;
                            }
                        } else if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && previousStatus.equals("OnDuty")) {
                            for (int i = 0; i < driveringStatusList.size(); ++i) {
                                ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                                isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentUtcDateTime, lastLogUtcDateTime, nextLogUtcDateTime);
                                if (isBreak) {
                                    if (totalSeconds < 0L) {
                                        totalSeconds = Math.abs(totalSeconds);
                                    } else {
                                        totalSeconds = -totalSeconds;
                                    }

                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                } else {
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                                    remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                                }

                                days = driveringStatusList.get(i).getDays();
                                shift = driveringStatusList.get(i).getShift();
                                if (days == lastDays && lastDays > 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else if (lastDays == 0 && i == 0) {
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                } else {
                                    if (shift != lastShift) {
                                        break;
                                    }

                                    isDayChange = true;
                                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                                }

                                if (!isDayChange) {
                                    lastDays = days;
                                }

                                lastShift = shift;
                            }
                        }
                    } else {
                        for (int i = 0; i < driveringStatusList.size(); ++i) {
                            sDebug = sDebug + "Next log : " + nextStatus + ",\n";
                            ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                            remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                            remainingDutyTime = this.CalculateRemainingTime(totalSeconds, remainingDutyTime);
                            remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                            remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                            remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds, remainingWeeklyTime);
                            days = driveringStatusList.get(i).getDays();
                            shift = driveringStatusList.get(i).getShift();
                            currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                            sDebug = sDebug
                                    + "Day | "
                                    + days
                                    + " OD | "
                                    + remainingDutyTime
                                    + " ODR | "
                                    + remainingDriveTime
                                    + " Cycle | "
                                    + remainingWeeklyTime
                                    + "\n";
                            if (days == lastDays && lastDays > 0) {
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            } else if (lastDays == 0 && i == 0) {
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            } else {
                                if (shift != lastShift) {
                                    break;
                                }

                                isDayChange = true;
                                remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                                remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                                this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                            }

                            if (!isDayChange) {
                                lastDays = days;
                            }

                            lastShift = shift;
                        }
                    }
                } else {
                    for (int i = 0; i < driveringStatusList.size(); ++i) {
                        sDebug = sDebug + "Next log : " + nextStatus + ",\n";
                        ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        remainingDriveTime = this.CalculateRemainingTime(totalSeconds, remainingDriveTime);
                        remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        sDebug = sDebug + "Day | " + days + " OD | " + remainingDutyTime + " ODR | " + remainingDriveTime + " Cycle | " + remainingWeeklyTime + "\n";
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else if (lastDays == 0 && i == 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (shift != lastShift) {
                                break;
                            }

                            isDayChange = true;
                            remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                            remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        if (!isDayChange) {
                            lastDays = days;
                        }

                        lastShift = shift;
                    }
                }
            } else {
                for (int i = 0; i < driveringStatusList.size(); ++i) {
                    ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                    if (i == 0) {
                        isBreak = this.CheckBreak(currentStatus, previousStatus, nextStatus, currentLogTime, lastLogUtcDateTime, nextLogUtcDateTime);
                        breakDuration = (lastUtcDateTime - lastLogUtcDateTime) / 1000L;
                    }

                    long shiftDuration = (currentLogTime - lastLogUtcDateTime) / 1000L;
                    shiftDuration = Math.abs(shiftDuration);
                    if (shiftDuration > secondShift) {
                        sDebug = sDebug + " ### Shift Change :\n";
                    } else {
                        if (isBreak) {
                            remainingDutyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingDutyTime);
                            remainingWeeklyTime = this.CalculateRemainingTime(totalSeconds + breakDuration, remainingWeeklyTime);
                        } else {
                            remainingDutyTime = this.CalculateRemainingTime(-breakDuration, remainingDutyTime);
                            remainingWeeklyTime = this.CalculateRemainingTime(-breakDuration, remainingWeeklyTime);
                        }

                        sDebug = sDebug + " >> BD : " + breakDuration + " :: " + remainingDutyTime + " : " + remainingWeeklyTime + "\n";
                        days = driveringStatusList.get(i).getDays();
                        shift = driveringStatusList.get(i).getShift();
                        currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                        if (days == lastDays && lastDays > 0) {
                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        } else {
                            if (lastDays != 0 || i != 0) {
                                break;
                            }

                            this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                        }

                        lastDays = days;
                    }
                }
            }

            this.SaveLog(sDebug);
        } catch (Exception var80) {
            var80.printStackTrace();
        }
    }

    public void CheckAllVoilations_withsplit(long driverId, long from, long to, long l15toDate, int logShift, int logDays) {
        long secondShift = 122400L;
        long secondSleep = 36000L;
        long continueDriveSeconds = 28800L;
        long remainingContinueDrive = 0L;
        long breakTimeSeconds = 1800L;
        long splitSleepSeconds = 7200L;
        long totalDriveSeconds = 39600L;
        long totalDutySeconds = 50400L;
        long totalContinueDrive = 0L;
        long totalBreakSecond = 0L;
        long currentUtcDateTime = 0L;
        long lastLogUtcDateTime = 0L;
        long nextLogUtcDateTime = 0L;
        long remainingDutyTime = 0L;
        long remainingWeeklyTime = 0L;
        long remainingDriveTime = 0L;
        String nextStatus = "";
        String previousStatus = "";
        int shift = 0;
        int lastShift = 0;
        int days = 0;
        int lastDays = 0;
        boolean isDayChange = false;
        String sDebug = " Voilation Check >> \n";
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
        secondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L;
        secondSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
        continueDriveSeconds = cycleUsaData.getContinueDriveTime() * 60L * 60L;
        breakTimeSeconds = cycleUsaData.getBreakTime() * 60L;
        totalDriveSeconds = cycleUsaData.getOnDriveTime() * 60L * 60L;
        totalDutySeconds = cycleUsaData.getOnDutyTime() * 60L * 60L;
        long splitSleep1 = 0L;
        long splitSleep2 = 0L;
        boolean isFirstSplitDone = false;
        LocalDate firstSplitDay = null;
        LocalDate fromLocalDate = Instant.ofEpochMilli(from).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate toLocalDate = Instant.ofEpochMilli(to).atZone(ZoneId.systemDefault()).toLocalDate();

        try {
            String sCurrentStatus = "";
            String sPreviousStatus = "";
            long previousUtcDateTime = 0L;
            boolean isBreakTime = false;
            boolean isVoilationCreate = false;
            long previousMidnightTimestamp = from - 86400000L;
            List<DriveringStatusLogViewDto> driveringStatusList = this.loockupDriveringStatusDataForOneDay(
                    driverId, previousMidnightTimestamp, l15toDate, logShift, logDays
            );
            sDebug = sDebug + "from : " + previousMidnightTimestamp + " to : " + to + " Size : " + driveringStatusList.size() + " : " + driverId + "\n";

            for (int i = 0; i < driveringStatusList.size(); ++i) {
                if (i == 0) {
                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                }

                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                LocalDate currentLocalDate = Instant.ofEpochMilli(currentUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDate();
                sCurrentStatus = driveringStatusList.get(i).getStatus();
                shift = driveringStatusList.get(i).getShift();
                days = driveringStatusList.get(i).getDays();
                sDebug = sDebug + "Check Status: " + sPreviousStatus + "\n";
                if (!sPreviousStatus.equals("")) {
                    ObjectId objId = new ObjectId(driveringStatusList.get(i).get_id());
                    long duration = (currentUtcDateTime - previousUtcDateTime) / 1000L;
                    isBreakTime = false;
                    if (shift != lastShift) {
                        break;
                    }

                    if (days == lastDays && lastDays > 0 && !isDayChange) {
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                    }
                                }

                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                totalDutySeconds -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingDriveTime -= duration;
                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingDutyTime -= duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                }
                        }
                    } else {
                        isDayChange = true;
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                    }
                                }

                                remainingWeeklyTime -= duration;
                                totalDutySeconds -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                }
                        }
                    }

                    sDebug = sDebug
                            + "Duration | "
                            + duration
                            + " Status | "
                            + sPreviousStatus
                            + " DU | "
                            + remainingDutyTime
                            + " OD | "
                            + remainingDriveTime
                            + " Cycle | "
                            + remainingWeeklyTime
                            + "\n";
                    this.UpdateRemainingCalculationData(driverId, objId, remainingDriveTime, remainingDutyTime, remainingWeeklyTime);
                    if (totalContinueDrive > continueDriveSeconds && !isDayChange) {
                        int count = this.driveringStatusRepo.countVoilationRecords(driverId, from, to, 1, 8);
                        if (count <= 0) {
                            String logType = "You are continuously driving for " + cycleUsaData.getContinueDriveTime() + " hours";
                            int voilationHour = (int) cycleUsaData.getOnSleepTime();
                            long voilationUtcDateTime = currentUtcDateTime - Math.abs(continueDriveSeconds - totalContinueDrive) * 1000L;
                            this.SaveVoilations(driveringStatusList.get(i), logType, voilationHour, voilationUtcDateTime);
                        }
                    }

                    if (days == lastDays && lastDays > 0 && !isDayChange) {
                        this.CheckVoilations(driveringStatusList.get(i), remainingDutyTime, remainingDriveTime, remainingWeeklyTime, currentUtcDateTime, from, to);
                    }

                    if (sPreviousStatus.equals("OnSleep") || sPreviousStatus.equals("OffDuty")) {
                        this.checkSplitSleepViolation(driveringStatusList.get(i), duration, currentLocalDate, currentUtcDateTime, driverId, sPreviousStatus);
                    }
                }

                if (sCurrentStatus.equals("YardMove")) {
                    sPreviousStatus = "OnDuty";
                } else if (sCurrentStatus.equals("PersonalUse")) {
                    sPreviousStatus = "OffDuty";
                } else {
                    sPreviousStatus = sCurrentStatus;
                }

                previousUtcDateTime = currentUtcDateTime;
                lastShift = shift;
                lastDays = days;
            }

            this.SaveLog(sDebug);
        } catch (Exception var80) {
            var80.printStackTrace();
        }
    }

    public void checkSplitSleepViolation(
            DriveringStatusLogViewDto log, long duration, LocalDate currentLocalDate, long currentUtcDateTime, long driverId, String status
    ) {
        if (status.equals("OnSleep") || status.equals("OffDuty")) {
            if (duration >= 7200L && duration < 25200L) {
                this.splitSleep1 = duration;
                this.isFirstSplitDone = true;
                this.firstSplitDay = currentLocalDate;
            } else if (duration >= 25200L && this.isFirstSplitDone) {
                this.splitSleep2 = duration;
                boolean sameDay = currentLocalDate.equals(this.firstSplitDay);
                if (this.splitSleep1 + this.splitSleep2 >= 36000L) {
                    String logType = "Split OffDuty/Sleep satisfied ("
                            + this.splitSleep1 / 3600L
                            + "h + "
                            + this.splitSleep2 / 3600L
                            + "h) "
                            + (sameDay ? "[Same Day]" : "[Different Day]");
                    this.SaveVoilations(log, logType, 0, currentUtcDateTime);
                }

                this.splitSleep1 = 0L;
                this.splitSleep2 = 0L;
                this.isFirstSplitDone = false;
                this.firstSplitDay = null;
            }
        }
    }

    public void CheckAllVoilations(long driverId, long from, long to, long l15toDate, int logShift, int logDays) {
        long totalContinueDrive = 0L;
        long totalBreakSecond = 0L;
        long remainingDutyTime = 0L;
        long remainingWeeklyTime = 0L;
        long remainingDriveTime = 0L;
        long currentUtcDateTime = 0L;
        long previousUtcDateTime = 0L;
        String sCurrentStatus = "";
        String sPreviousStatus = "";
        long firstSleep = 0L;
        long secondSleep = 0L;
        boolean isFirstSleepValid = false;
        long shiftStartTime = 0L;
        boolean is8Created = false;
        boolean is11Created = false;
        boolean is14Created = false;
        boolean is70Created = false;
        String sDebug = "Violation Check >> \n";

        try {
            EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
            CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
            long continueDriveSeconds = cycleUsaData.getContinueDriveTime() * 3600L;
            long breakTimeSeconds = cycleUsaData.getBreakTime() * 60L;
            long totalDutySeconds = cycleUsaData.getOnDutyTime() * 3600L;
            long previousMidnightTimestamp = from - 86400000L;
            List<DriveringStatusLogViewDto> list = this.loockupDriveringStatusDataForOneDay(driverId, previousMidnightTimestamp, l15toDate, logShift, logDays);
            DriveringStatusLogViewDto lastObj = null;

            for (int i = 0; i < list.size(); ++i) {
                DriveringStatusLogViewDto data = list.get(i);
                if (i == 0) {
                    remainingDutyTime = Long.parseLong(data.getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(data.getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(data.getRemainingDriveTime());
                }

                currentUtcDateTime = data.getUtcDateTime();
                sCurrentStatus = data.getStatus();
                if (shiftStartTime == 0L && (sCurrentStatus.equals("OnDuty") || sCurrentStatus.equals("OnDrive"))) {
                    shiftStartTime = currentUtcDateTime;
                }

                if (!sPreviousStatus.equals("")) {
                    long duration = (currentUtcDateTime - previousUtcDateTime) / 1000L;
                    String prev = this.normalizeStatus(sPreviousStatus);
                    switch (prev) {
                        case "OnDrive":
                            totalContinueDrive += duration;
                            totalBreakSecond = 0L;
                            remainingDriveTime -= duration;
                            remainingDutyTime -= duration;
                            remainingWeeklyTime -= duration;
                            break;
                        case "OnDuty":
                            remainingDutyTime -= duration;
                            remainingWeeklyTime -= duration;
                            break;
                        case "OffDuty":
                        case "OnSleep":
                            if (duration >= 36000L) {
                                shiftStartTime = 0L;
                            }

                            if (duration >= 7200L) {
                                if (!isFirstSleepValid) {
                                    firstSleep = duration;
                                    isFirstSleepValid = true;
                                } else {
                                    boolean validSplit = firstSleep >= 28800L && duration >= 7200L
                                            || firstSleep >= 25200L && duration >= 10800L
                                            || duration >= 28800L && firstSleep >= 7200L
                                            || duration >= 25200L && firstSleep >= 10800L;
                                    if (validSplit) {
                                        totalContinueDrive = 0L;
                                        remainingDutyTime = totalDutySeconds;
                                        this.DeleteAllViolations(driverId, from, to);
                                        isFirstSleepValid = false;
                                        firstSleep = 0L;
                                        secondSleep = 0L;
                                        is8Created = false;
                                    }
                                }
                            } else if (duration >= breakTimeSeconds) {
                                totalContinueDrive = 0L;
                                this.DeleteAllViolations(driverId, from, to);
                                is8Created = false;
                            }
                    }

                    if (totalContinueDrive > continueDriveSeconds && !is8Created) {
                        long violationTime = currentUtcDateTime - (totalContinueDrive - continueDriveSeconds) * 1000L;
                        this.SaveVoilations(data, "You are continuously driving for " + continueDriveSeconds / 3600L + " hours", 8, violationTime);
                        is8Created = true;
                    }

                    boolean[] flags = new boolean[]{is11Created, is70Created};
                    flags = this.CheckVoilationsUpdated(data, remainingDutyTime, remainingDriveTime, remainingWeeklyTime, currentUtcDateTime, from, to, flags);
                    is11Created = flags[0];
                    is70Created = flags[1];
                    if (shiftStartTime > 0L && !is14Created) {
                        long dutyUsed = (currentUtcDateTime - shiftStartTime) / 1000L;
                        if (dutyUsed > 50400L) {
                            long violationTime = shiftStartTime + 50400000L;
                            this.SaveVoilations(data, "Your onduty time exceeded 14 hours", 14, violationTime);
                            is14Created = true;
                        }
                    }
                }

                sPreviousStatus = this.normalizeStatus(sCurrentStatus);
                previousUtcDateTime = currentUtcDateTime;
                lastObj = data;
            }

            if (lastObj != null && previousUtcDateTime > 0L) {
                long duration = (from - previousUtcDateTime) / 1000L;
                String prev = this.normalizeStatus(sPreviousStatus);
                if (prev.equals("OnDrive")) {
                    totalContinueDrive += duration;
                    remainingDriveTime -= duration;
                    remainingDutyTime -= duration;
                    remainingWeeklyTime -= duration;
                }

                if (totalContinueDrive > continueDriveSeconds && !is8Created) {
                    this.SaveVoilations(lastObj, "You are continuously driving for " + continueDriveSeconds / 3600L + " hours", 8, l15toDate);
                    is8Created = true;
                }

                if (shiftStartTime > 0L && !is14Created) {
                    long dutyUsed = (currentUtcDateTime - shiftStartTime) / 1000L;
                    if (dutyUsed > 50400L) {
                        long violationTime = shiftStartTime + 50400000L;
                        this.SaveVoilations(lastObj, "Your onduty time exceeded 14 hours", 14, violationTime);
                        is14Created = true;
                    }
                }

                boolean[] flags = new boolean[]{is11Created, is70Created};
                flags = this.CheckVoilationsUpdated(lastObj, remainingDutyTime, remainingDriveTime, remainingWeeklyTime, l15toDate, from, to, flags);
            }

            this.SaveLog(sDebug);
        } catch (Exception var61) {
            var61.printStackTrace();
        }
    }

    public boolean[] CheckVoilationsUpdated(
            DriveringStatusLogViewDto data,
            long remainingDutyTime,
            long remainingDriveTime,
            long remainingWeeklyTime,
            long currentUtcDateTime,
            long from,
            long to,
            boolean[] flags
    ) {
        boolean is11Created = flags[0];
        boolean is70Created = flags[1];
        long driverId = data.getDriverId();
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
        if (remainingDriveTime < 0L && !is11Created) {
            long violationTime = currentUtcDateTime - Math.abs(remainingDriveTime) * 1000L;
            this.SaveVoilations(data, "Your drive time exceeded " + cycleUsaData.getOnDriveTime() + " hours", 11, violationTime);
            is11Created = true;
        }

        if (remainingWeeklyTime < 0L && !is70Created) {
            long violationTime = currentUtcDateTime - Math.abs(remainingWeeklyTime) * 1000L;
            this.SaveVoilations(data, "Your weekly cycle exceeded " + cycleUsaData.getCycleHour() + " hours", 70, violationTime);
            is70Created = true;
        }

        return new boolean[]{is11Created, is70Created};
    }

    public void DeleteAllViolations(long driverId, long from, long to) {
        String sDebug = "Deleted : ";

        try {
            sDebug = sDebug + from + " :: " + to + "\n";
            this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, from, to, 1);
            this.SaveLog(sDebug);
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public void DeleteDrivingViolation(long driverId, long from, long to) {
        long deleted = this.driveringStatusRepo.deleteAllDriveringStatusVoilationByHour(driverId, from, to, 1, 8);
    }

    public void CheckAllVoilations_old(long driverId, long from, long to, long l15toDate, int logShift, int logDays) {
        long secondShift = 122400L;
        long secondSleep = 36000L;
        long continueDriveSeconds = 28800L;
        long remainingContinueDrive = 0L;
        long breakTimeSeconds = 1800L;
        long splitSleepSeconds = 7200L;
        long totalDriveSeconds = 39600L;
        long totalDutySeconds = 50400L;
        long totalContinueDrive = 0L;
        long totalBreakSecond = 0L;
        long currentUtcDateTime = 0L;
        long lastLogUtcDateTime = 0L;
        long nextLogUtcDateTime = 0L;
        long remainingDutyTime = 0L;
        long remainingWeeklyTime = 0L;
        long remainingDriveTime = 0L;
        String nextStatus = "";
        String previousStatus = "";
        int shift = 0;
        int lastShift = 0;
        int days = 0;
        int lastDays = 0;
        boolean isDayChange = false;
        String sDebug = " Voilation Check >> \n";
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());
        secondShift = cycleUsaData.getCycleRestartTime() * 60L * 60L;
        secondSleep = cycleUsaData.getOnSleepTime() * 60L * 60L;
        continueDriveSeconds = cycleUsaData.getContinueDriveTime() * 60L * 60L;
        breakTimeSeconds = cycleUsaData.getBreakTime() * 60L;
        totalDriveSeconds = cycleUsaData.getOnDriveTime() * 60L * 60L;
        totalDutySeconds = cycleUsaData.getOnDutyTime() * 60L * 60L;
        LocalDate fromLocalDate = Instant.ofEpochMilli(from).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate toLocalDate = Instant.ofEpochMilli(to).atZone(ZoneId.systemDefault()).toLocalDate();

        try {
            String sCurrentStatus = "";
            String sPreviousStatus = "";
            long previousUtcDateTime = 0L;
            boolean isBreakTime = false;
            boolean isVoilationCreate = false;
            long previousMidnightTimestamp = from - 86400000L;
            List<DriveringStatusLogViewDto> driveringStatusList = this.loockupDriveringStatusDataForOneDay(
                    driverId, previousMidnightTimestamp, l15toDate, logShift, logDays
            );
            sDebug = sDebug + "from : " + previousMidnightTimestamp + " to : " + to + "Size : " + driveringStatusList.size() + " : " + driverId + "\n";
            ObjectId objId = null;
            DriveringStatusLogViewDto driveringStatusListData = null;
            long duration = 0L;

            for (int i = 0; i < driveringStatusList.size(); ++i) {
                if (i == 0) {
                    remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                    remainingWeeklyTime = Long.parseLong(driveringStatusList.get(i).getRemainingWeeklyTime());
                    remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                }

                currentUtcDateTime = driveringStatusList.get(i).getUtcDateTime();
                LocalDate currentLocalDate = Instant.ofEpochMilli(currentUtcDateTime).atZone(ZoneId.systemDefault()).toLocalDate();
                sCurrentStatus = driveringStatusList.get(i).getStatus();
                shift = driveringStatusList.get(i).getShift();
                days = driveringStatusList.get(i).getDays();
                sDebug = sDebug + "Check Status: " + sPreviousStatus + " :: " + totalContinueDrive + "\n";
                if (!sPreviousStatus.equals("")) {
                    duration = (currentUtcDateTime - previousUtcDateTime) / 1000L;
                    isBreakTime = false;
                    if (shift != lastShift) {
                        break;
                    }

                    if (days == lastDays && lastDays > 0 && !isDayChange) {
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                    }
                                }

                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                totalDutySeconds -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingDriveTime -= duration;
                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingDutyTime -= duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                } else if (duration < 7200L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                                break;
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingDutyTime -= duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                } else if (duration < 7200L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                        }
                    } else {
                        isDayChange = true;
                        remainingDutyTime = Long.parseLong(driveringStatusList.get(i).getRemainingDutyTime());
                        remainingDriveTime = Long.parseLong(driveringStatusList.get(i).getRemainingDriveTime());
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                    }
                                }

                                remainingWeeklyTime -= duration;
                                totalDutySeconds -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                } else if (duration < 7200L) {
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                                break;
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    if (duration > breakTimeSeconds) {
                                        totalContinueDrive = 0L;
                                    } else {
                                        totalContinueDrive += duration;
                                        totalBreakSecond += duration;
                                        remainingWeeklyTime -= duration;
                                    }
                                } else if (duration < 7200L) {
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                        }
                    }

                    sDebug = sDebug
                            + "Duration | "
                            + duration
                            + " Status | "
                            + sPreviousStatus
                            + " DU | "
                            + remainingDutyTime
                            + " OD | "
                            + remainingDriveTime
                            + " Cycle | "
                            + remainingWeeklyTime
                            + "\n";
                    if (totalContinueDrive > continueDriveSeconds && !isDayChange) {
                        int count = this.driveringStatusRepo.countVoilationRecords(driverId, from, to, 1, 8);
                        if (count <= 0) {
                            String logType = "You are continuously driving for " + cycleUsaData.getContinueDriveTime() + " hours";
                            int voilationHour = (int) cycleUsaData.getOnSleepTime();
                            long voilationUtcDateTime = currentUtcDateTime - Math.abs(continueDriveSeconds - totalContinueDrive) * 1000L;
                            this.SaveVoilations(driveringStatusList.get(i), logType, voilationHour, voilationUtcDateTime);
                        }
                    }

                    if (days == lastDays && lastDays > 0 && !isDayChange) {
                        this.CheckVoilations(driveringStatusList.get(i), remainingDutyTime, remainingDriveTime, remainingWeeklyTime, currentUtcDateTime, from, to);
                    }
                }

                if (sCurrentStatus.equals("YardMove")) {
                    sPreviousStatus = "OnDuty";
                } else if (sCurrentStatus.equals("PersonalUse")) {
                    sPreviousStatus = "OffDuty";
                } else {
                    sPreviousStatus = sCurrentStatus;
                }

                previousUtcDateTime = currentUtcDateTime;
                lastShift = shift;
                lastDays = days;
                new ObjectId(driveringStatusList.get(i).get_id());
                driveringStatusListData = driveringStatusList.get(i);
            }

            sDebug = sDebug + "Last Check Status: " + sPreviousStatus + " :: " + totalContinueDrive + "\n";
            if (!sPreviousStatus.equals("")) {
                isBreakTime = false;
                if (shift == lastShift) {
                    if (days == lastDays && lastDays > 0 && !isDayChange) {
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                totalDutySeconds -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingDriveTime -= duration;
                                remainingDutyTime -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                                if (totalContinueDrive > 0L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                } else if (duration < 7200L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                                break;
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                } else if (duration < 7200L) {
                                    remainingDutyTime -= duration;
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                        }
                    } else {
                        isDayChange = true;
                        switch (sPreviousStatus) {
                            case "OnDuty":
                                remainingWeeklyTime -= duration;
                                break;
                            case "OnDrive":
                                totalBreakSecond = 0L;
                                totalContinueDrive += duration;
                                totalDriveSeconds -= duration;
                                remainingWeeklyTime -= duration;
                                break;
                            case "OffDuty":
                                if (totalContinueDrive > 0L) {
                                    remainingWeeklyTime -= duration;
                                } else if (duration < 7200L) {
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                                break;
                            case "OnSleep":
                                if (totalContinueDrive > 0L) {
                                    remainingWeeklyTime -= duration;
                                } else if (duration < 7200L) {
                                    remainingWeeklyTime -= duration;
                                    sDebug = sDebug + "[SHORT BREAK] " + duration + " sec\n";
                                } else {
                                    sDebug = sDebug + "[VALID BREAK] " + duration + " sec\n";
                                }
                        }
                    }
                }

                sDebug = sDebug
                        + "Duration | "
                        + duration
                        + " Status | "
                        + sPreviousStatus
                        + " DU | "
                        + remainingDutyTime
                        + " OD | "
                        + remainingDriveTime
                        + " Cycle | "
                        + remainingWeeklyTime
                        + "\n";
                if (totalContinueDrive > continueDriveSeconds && !isDayChange) {
                    int count = this.driveringStatusRepo.countVoilationRecords(driverId, from, to, 1, 8);
                    if (count <= 0) {
                        String logType = "You are continuously driving for " + cycleUsaData.getContinueDriveTime() + " hours";
                        int voilationHour = (int) cycleUsaData.getOnSleepTime();
                        long voilationUtcDateTime = currentUtcDateTime - Math.abs(continueDriveSeconds - totalContinueDrive) * 1000L;
                        this.SaveVoilations(driveringStatusListData, logType, voilationHour, voilationUtcDateTime);
                    }
                }

                if (days == lastDays && lastDays > 0 && !isDayChange) {
                    this.CheckVoilations(driveringStatusListData, remainingDutyTime, remainingDriveTime, remainingWeeklyTime, currentUtcDateTime, from, to);
                }
            }

            this.SaveLog(sDebug);
        } catch (Exception var75) {
            var75.printStackTrace();
        }
    }

    public boolean CheckBreak(
            String currentStatus, String previousStatus, String nextStatus, long currentUtcDateTime, long lastLogUtcDateTime, long nextLogUtcDateTime
    ) {
        long breakTimeSeconds = 1800L;
        long splitSleepSeconds = 7200L;
        boolean isBreak = false;
        if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && (previousStatus.equals("OnDrive") || previousStatus.equals("OnDuty"))) {
            long duration = (currentUtcDateTime - lastLogUtcDateTime) / 1000L;
            if (duration > breakTimeSeconds || duration > splitSleepSeconds) {
                isBreak = true;
            }
        } else if ((currentStatus.equals("OffDuty") || currentStatus.equals("OnSleep")) && (nextStatus.equals("OnDrive") || nextStatus.equals("OnDuty"))) {
            long duration = (nextLogUtcDateTime - currentUtcDateTime) / 1000L;
            if (duration > breakTimeSeconds || duration > splitSleepSeconds) {
                isBreak = true;
            }
        } else if ((previousStatus.equals("OffDuty") || previousStatus.equals("OnSleep")) && (currentStatus.equals("OnDrive") || currentStatus.equals("OnDuty"))) {
            long duration = (currentUtcDateTime - lastLogUtcDateTime) / 1000L;
            if (duration > breakTimeSeconds || duration > splitSleepSeconds) {
                isBreak = true;
            }
        }

        return isBreak;
    }

    public void CheckVoilations(
            DriveringStatusLogViewDto data, long remainingDutyTime, long remainingDriveTime, long remainingWeeklyTime, long currentUtcDateTime, long from, long to
    ) {
        long driverId = data.getDriverId();
        String sDebug = "Voilation : ";
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());

        try {
            sDebug = sDebug + " OD : " + remainingDutyTime + " : ODR : " + remainingDriveTime + " : Cycle : " + remainingWeeklyTime + "\n";
            this.SaveLog(sDebug);
            if (remainingDutyTime < 0L) {
                long time = currentUtcDateTime - Math.abs(remainingDutyTime) * 1000L;
                if (!this.existsSameViolation(driverId, 14, time)) {
                    this.SaveVoilations(data, "Your onduty time exceeded " + cycleUsaData.getOnDutyTime() + " hours", 14, time);
                }
            }

            if (remainingDriveTime < 0L) {
                long time = currentUtcDateTime - Math.abs(remainingDriveTime) * 1000L;
                if (!this.existsSameViolation(driverId, 11, time)) {
                    this.SaveVoilations(data, "Your drive time exceeded " + cycleUsaData.getOnDriveTime() + " hours", 11, time);
                }
            }

            if (remainingWeeklyTime < 0L) {
                long time = currentUtcDateTime - Math.abs(remainingWeeklyTime) * 1000L;
                if (!this.existsSameViolation(driverId, 70, time)) {
                    this.SaveVoilations(data, "Your weekly cycle exceeded " + cycleUsaData.getCycleHour() + " hours", 70, time);
                }
            }
        } catch (Exception var21) {
            var21.printStackTrace();
        }
    }

    public void DeleteDrivingViolationByType(long driverId, long from, long to, int type) {
        this.driveringStatusRepo.deleteVoilationByType(driverId, from, to, type);
    }

    public boolean existsSameViolation(long driverId, int type, long time) {
        String sDebug = "Exist : ";
        long buffer = 60L;
        boolean isExist = false;

        try {
            long fromTime = time - buffer * 1000L;
            long toTime = time + buffer * 1000L;
            isExist = this.driveringStatusRepo.existsViolationBetweenTime(driverId, type, fromTime, toTime);
            sDebug = sDebug + " From : " + fromTime + " :: " + toTime + " : " + isExist + "\n";
            this.SaveLog(sDebug);
        } catch (Exception var14) {
            var14.printStackTrace();
        }

        return isExist;
    }

    public void CheckVoilations_old(
            DriveringStatusLogViewDto driveringStatusList,
            long remainingDutyTime,
            long remainingDriveTime,
            long remainingWeeklyTime,
            long currentUtcDateTime,
            long midnightTimestamp,
            long currentDayEndTime
    ) {
        String sDebug = "";
        String logType = "";
        int voilationHour = 0;
        long voilationUtcDateTime = 0L;
        long driverId = driveringStatusList.getDriverId();
        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId((int) driverId);
        CycleUsa cycleUsaData = this.cycleUsaRepo.findByCycleUsaId((int) empDetails.getCycleUsaId());

        try {
            sDebug = sDebug + " >> Voilation : DU : " + remainingDutyTime + " | OD : " + remainingDriveTime + " | Cycle : " + remainingWeeklyTime + "\n";
            if (remainingDutyTime < 0L) {
                int count = this.driveringStatusRepo.countVoilationRecords(driverId, midnightTimestamp, currentDayEndTime, 1, 14);
                if (count <= 0) {
                    logType = "Your onduty time has been exceeded to " + cycleUsaData.getOnDutyTime() + " hours";
                    voilationHour = (int) cycleUsaData.getOnDutyTime();
                    voilationUtcDateTime = currentUtcDateTime - Math.abs(remainingDutyTime) * 1000L;
                    this.SaveVoilations(driveringStatusList, logType, voilationHour, voilationUtcDateTime);
                }
            }

            if (remainingDriveTime < 0L) {
                int count = this.driveringStatusRepo.countVoilationRecords(driverId, midnightTimestamp, currentDayEndTime, 1, 11);
                if (count <= 0) {
                    logType = "Your drive time has been exceeded to " + cycleUsaData.getOnDriveTime() + " hours";
                    voilationHour = (int) cycleUsaData.getOnDriveTime();
                    voilationUtcDateTime = currentUtcDateTime - Math.abs(remainingDriveTime) * 1000L;
                    this.SaveVoilations(driveringStatusList, logType, voilationHour, voilationUtcDateTime);
                }
            }

            if (remainingWeeklyTime < 0L) {
                int count = this.driveringStatusRepo.countVoilationRecords(driverId, midnightTimestamp, currentDayEndTime, 1, 70);
                if (count <= 0) {
                    logType = "Your weekly cycle has been exceeded to " + cycleUsaData.getCycleHour() + " hours";
                    voilationHour = (int) cycleUsaData.getCycleHour();
                    voilationUtcDateTime = currentUtcDateTime - Math.abs(remainingWeeklyTime) * 1000L;
                    this.SaveVoilations(driveringStatusList, logType, voilationHour, voilationUtcDateTime);
                }
            }

            this.SaveLog(sDebug);
        } catch (Exception var24) {
            var24.printStackTrace();
        }
    }

    public void UpdateRemainingCalculationData(long driverId, ObjectId objId, long remainingDriveTime, long remainingDutyTime, long remainingWeeklyTime) {
        String sDebug = "$$$";

        try {
            sDebug = sDebug + "Drive : " + remainingDriveTime + ", Duty : " + remainingDutyTime + ", Cycle : " + remainingWeeklyTime + "\n";
            Query query = new Query();
            Update update = new Update();
            query.addCriteria(Criteria.where("_id").is(objId));
            update.set("remainingDriveTime", remainingDriveTime);
            update.set("remainingDutyTime", remainingDutyTime);
            update.set("remainingWeeklyTime", remainingWeeklyTime);
            this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
            query = new Query();
            update = new Update();
            query.addCriteria(Criteria.where("driverId").is(driverId));
            update.set("onDutyTime", this.convertSecondsToTime(remainingDriveTime));
            update.set("onDriveTime", this.convertSecondsToTime(remainingDutyTime));
            update.set("weeklyTime", this.convertSecondsToTime(remainingWeeklyTime));
            this.mongoTemplate.updateMulti(query, update, DriverWorkingStatus.class);
            this.SaveLog(sDebug);
        } catch (Exception var13) {
        }
    }

    public String convertSecondsToTime(long totalSeconds) {
        long hours = totalSeconds / 3600L;
        long minutes = totalSeconds % 3600L / 60L;
        long seconds = totalSeconds % 60L;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public List<DriveringStatusLogViewDto> loockupDriveringStatusDataForOneDay(long driverId, long from, long to, int logShift, int logDays) {
        Query queryData = new Query(
                Criteria.where("driverId")
                        .is(driverId)
                        .and("utcDateTime")
                        .gte(from)
                        .lte(to)
                        .and("shift")
                        .is(logShift)
                        .and("days")
                        .is(logDays)
                        .and("isVoilation")
                        .is(0)
                        .and("isVisible")
                        .is(1)
        );
        queryData.with(Sort.by(Direction.ASC, new String[]{"utcDateTime"}));
        return this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
    }

    public List<DriveringStatusLogViewDto> loockupDriveringStatusData(long driverId, long from, long to) {
        Query queryData = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").gte(from).lte(to).and("isVoilation").is(0).and("isActive").is(1));
        queryData.with(Sort.by(Direction.ASC, new String[]{"utcDateTime"}));
        return this.mongoTemplate.find(queryData, DriveringStatusLogViewDto.class, "drivering_status");
    }

    public long CalculateRemainingTime(long totalSeconds, long remainingTime) {
        try {
            String sLine = "Total Seconds : " + totalSeconds + ", Remaining Time : " + remainingTime + "\n";
            if (totalSeconds < 0L && remainingTime >= 0L) {
                remainingTime -= Math.abs(totalSeconds);
            } else if (totalSeconds >= 0L && remainingTime >= 0L) {
                remainingTime += totalSeconds;
            } else if (totalSeconds < 0L && remainingTime < 0L) {
                remainingTime -= Math.abs(totalSeconds);
            } else if (totalSeconds >= 0L && remainingTime < 0L) {
                remainingTime += Math.abs(totalSeconds);
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return remainingTime;
    }

    public void SaveLog(String sLine) throws Exception {
        this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/log").toAbsolutePath().normalize();

        try {
            if (Files.notExists(this.fileStorageLocation)) {
                Files.createDirectories(this.fileStorageLocation);
            }
        } catch (Exception var3) {
            throw new Exception("Could not create the directory where the uploaded files will be stored.", var3);
        }

        Path filePath = this.fileStorageLocation.resolve("eld_log.txt");
        Files.write(filePath, sLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public List<DriveringStatusViewDto> lookupDriverStatusDataOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId).and("isVisible").is(1));
        } else {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("isVisible").is(1));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "clientId",
                    "status",
                    "lattitude",
                    "longitude",
                    "dateTime",
                    "lDateTime",
                    "receivedTimestamp",
                    "logType",
                    "appVersion",
                    "isVoilation",
                    "note",
                    "customLocation",
                    "engineHour",
                    "odometer",
                    "vehicleId",
                    "osVersion",
                    "simCardNo",
                    "origin",
                    "utcDateTime",
                    "statusId",
                    "timezone",
                    "remainingWeeklyTime",
                    "remainingDutyTime",
                    "remainingDriveTime",
                    "remainingSleepTime",
                    "isReportGenerated",
                    "shift",
                    "days",
                    "_id",
                    "isActive"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.DESC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "drivering_status", DriveringStatusViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<EmployeeMasterViewDto>> ViewAllDriverStatus(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<EmployeeMasterViewDto>> result = new ResultWrapper<>();

        try {
            List<EmployeeMasterViewDto> driveringStatusViewDto = null;
            Instant instant = Instant.now();
            long driverId = driveringStatusCRUDDto.getDriverId();
            long clientId = driveringStatusCRUDDto.getClientId();
            String timezoneOffSet = "";
            driveringStatusViewDto = this.lookupEmployeeMasterOperation((int) driverId, clientId);
            String onDutyTime = "";
            String onDriveTime = "";
            String onSleepTime = "";
            String weeklyTime = "";
            String onBreak = "";

            for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                DriverWorkingStatus driverWorkingStatus = this.driverWorkingStatusRepo
                        .findAndViewDriverWorkingstatusByDriverId((long) driveringStatusViewDto.get(i).getEmployeeId().intValue());

                try {
                    MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) driveringStatusViewDto.get(i).getMainTerminalId());
                    if (mainTerminal.getStateId() > 0L) {
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                        driveringStatusViewDto.get(i).setTimezoneName(stateInfo.getTimeZone());
                        driveringStatusViewDto.get(i).setTimezoneOffSet(stateInfo.getTimezoneOffSet());
                        timezoneOffSet = stateInfo.getTimezoneOffSet();
                    }

                    String[] splitStr = timezoneOffSet.split(":");
                    long hour = Math.abs(Long.parseLong(splitStr[0]));
                    long minutes = Math.abs(Long.parseLong(splitStr[1]));
                    long timestampValue = 0L;
                    if (timezoneOffSet.substring(0, 1).equals("-")) {
                        timestampValue = driveringStatusViewDto.get(i).getUpdatedTimestamp() - (hour * 60L + minutes) * 60000L;
                    } else {
                        timestampValue = driveringStatusViewDto.get(i).getUpdatedTimestamp() + (hour * 60L + minutes) * 60000L;
                    }

                    driveringStatusViewDto.get(i).setUpdatedTimestamp(timestampValue);
                    onDutyTime = driverWorkingStatus.getOnDutyTime();
                    onDriveTime = driverWorkingStatus.getOnDriveTime();
                    onSleepTime = driverWorkingStatus.getOnSleepTime();
                    weeklyTime = driverWorkingStatus.getWeeklyTime();
                    onBreak = driverWorkingStatus.getOnBreak();
                    onDutyTime = onDutyTime.substring(0, onDutyTime.length() - 3);
                    onDriveTime = onDriveTime.substring(0, onDriveTime.length() - 3);
                    onSleepTime = onSleepTime.substring(0, onSleepTime.length() - 3);
                    weeklyTime = weeklyTime.substring(0, weeklyTime.length() - 3);
                    onBreak = onBreak.substring(0, onBreak.length() - 3);
                    driveringStatusViewDto.get(i).setOnDutyTime(onDutyTime);
                    driveringStatusViewDto.get(i).setOnDriveTime(onDriveTime);
                    driveringStatusViewDto.get(i).setOnSleepTime(onSleepTime);
                    driveringStatusViewDto.get(i).setWeeklyTime(weeklyTime);
                    driveringStatusViewDto.get(i).setOnBreak(onBreak);
                    Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                    Query query = new Query(Criteria.where("driverId").is(driveringStatusViewDto.get(i).getEmployeeId()));
                    query.limit(1);
                    query.with(pageableRequest);
                    List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                    driveringStatusViewDto.get(i).setCurrentLocation(driveringStatusViewDtoData.get(0).getCustomLocation());
                    DeviceStatus deviceStatus = this.deviceStatusRepo.findByDeviceStatusId((long) driveringStatusViewDto.get(i).getEmployeeId().intValue());
                    driveringStatusViewDto.get(i).setDeviceStatus(deviceStatus.getStatus());
                } catch (Exception var29) {
                    var29.printStackTrace();
                    driveringStatusViewDto.get(i).setOnDutyTime("14:00");
                    driveringStatusViewDto.get(i).setOnDriveTime("11:00");
                    driveringStatusViewDto.get(i).setOnSleepTime("10:00");
                    driveringStatusViewDto.get(i).setWeeklyTime("70:00");
                    driveringStatusViewDto.get(i).setOnBreak("08:00");
                }
            }

            result.setResult(driveringStatusViewDto);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Driver Status Information Send Successfully");
        } catch (Exception var30) {
            result.setStatus(Result.FAIL);
            result.setMessage(var30.getLocalizedMessage());
        }

        return result;
    }

    public List<EmployeeMasterViewDto> lookupEmployeeMasterOperation(Integer employeeId, long clientId) {
        MatchOperation filter = null;
        if (employeeId > 0) {
            filter = Aggregation.match(Criteria.where("employeeId").is(employeeId).and("clientId").is(clientId).and("isFirstLogin").is("false"));
        } else {
            filter = Aggregation.match(Criteria.where("clientId").is(clientId).and("isFirstLogin").is("false"));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "employeeId",
                    "title",
                    "firstName",
                    "lastName",
                    "email",
                    "username",
                    "companyId",
                    "languageId",
                    "clientId",
                    "startTime",
                    "cycleUsaId",
                    "cycleCanadaId",
                    "mainTerminalId",
                    "mobileNo",
                    "cdlNo",
                    "cdlCountryId",
                    "cdlStateId",
                    "cdlExpiryDate",
                    "pdfEmail",
                    "flatRate",
                    "exempt",
                    "personalUse",
                    "yardMoves",
                    "divR",
                    "cargoTypeId",
                    "truckNo",
                    "manageEquipement",
                    "transferLog",
                    "remarks",
                    "workingStatus",
                    "addedTimestamp",
                    "updatedTimestamp",
                    "client_master.clientName",
                    "cycle_usa_master.cycleUsaName",
                    "cycle_canada_master.cycleCanadaName",
                    "main_terminal_master.mainTerminalName",
                    "country_master.countryName",
                    "state_master.stateName",
                    "cargo_type_master.cargoTypeName",
                    "status",
                    "vehicle_master.vehicleNo",
                    "driverId",
                    "password",
                    "restartId",
                    "restBreakId",
                    "shortHaulException",
                    "unlimitedTrailers",
                    "unlimitedShippingDocs"
                }
        )
                .andExclude(new String[]{"_id"});
        LookupOperation client_master = LookupOperation.newLookup().from("client_master").localField("clientId").foreignField("clientId").as("client_master");
        LookupOperation cycle_usa_master = LookupOperation.newLookup()
                .from("cycle_usa_master")
                .localField("cycleUsaId")
                .foreignField("cycleUsaId")
                .as("cycle_usa_master");
        LookupOperation cycle_canada_master = LookupOperation.newLookup()
                .from("cycle_canada_master")
                .localField("cycleCanadaId")
                .foreignField("cycleCanadaId")
                .as("cycle_canada_master");
        LookupOperation main_terminal_master = LookupOperation.newLookup()
                .from("main_terminal_master")
                .localField("mainTerminalId")
                .foreignField("mainTerminalId")
                .as("main_terminal_master");
        LookupOperation country_master = LookupOperation.newLookup()
                .from("country_master")
                .localField("cdlCountryId")
                .foreignField("countryId")
                .as("country_master");
        LookupOperation state_master = LookupOperation.newLookup().from("state_master").localField("cdlStateId").foreignField("stateId").as("state_master");
        LookupOperation cargo_type_master = LookupOperation.newLookup()
                .from("cargo_type_master")
                .localField("cargoTypeId")
                .foreignField("cargoTypeId")
                .as("cargo_type_master");
        LookupOperation vehicle_master = LookupOperation.newLookup().from("vehicle_master").localField("truckNo").foreignField("vehicleId").as("vehicle_master");
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{
                    filter,
                    client_master,
                    cycle_usa_master,
                    cycle_canada_master,
                    main_terminal_master,
                    country_master,
                    state_master,
                    cargo_type_master,
                    vehicle_master,
                    projectStage
                }
        );
        return this.mongoTemplate.aggregate(aggregation, "employee_master", EmployeeMasterViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<DriveringStatusViewDto>> ViewDriverWorkingStatus(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<DriveringStatusViewDto>> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            long driverId = driveringStatusCRUDDto.getDriverId();
            if (driverId > 0L) {
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId).and("status").is("OnDuty"));
                query.limit(1);
                query.with(pageableRequest);
                List<DriveringStatusViewDto> driveringStatusViewDto = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                long fromDate = driveringStatusViewDto.get(0).getLDateTime();
                LocalDateTime currentDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(fromDate), TimeZone.getDefault().toZoneId());
                currentDateTime = currentDateTime.plusDays(1L);
                long toDate = currentDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                driveringStatusViewDto = this.lookupDriverStatusDataOperation(fromDate, toDate, driverId);

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    driveringStatusViewDto.get(i).setFromDate(fromDate);
                    driveringStatusViewDto.get(i).setToDate(toDate);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    driveringStatusViewDto.get(i).setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
                    driveringStatusViewDto.get(i).setStatus(empInfo.getStatus());
                }

                result.setResult(driveringStatusViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var16) {
            result.setStatus(Result.FAIL);
            result.setMessage(var16.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<LiveDataLogViewDto>> ViewLiveDataLog(ClientMasterCRUDDto clientMasterCRUDDto) {
        ResultWrapper<List<LiveDataLogViewDto>> result = new ResultWrapper<>();

        try {
            long clientId = (long) clientMasterCRUDDto.getClientId().intValue();
            List<LiveDataLogViewDto> liveDataLog = this.lookupLiveDataLogByClientOperation(clientId);

            for (int i = 0; i < liveDataLog.size(); ++i) {
                if (liveDataLog.get(i).getVehicleId() != null && !liveDataLog.get(i).getVehicleId().equals("")) {
                    try {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId(Integer.parseInt(liveDataLog.get(i).getVehicleId()));
                        liveDataLog.get(i).setVehicleName(vehcileInfo.getVehicleNo());
                    } catch (Exception var9) {
                        var9.printStackTrace();
                    }
                }

                if (liveDataLog.get(i).getDriverId() != null && !liveDataLog.get(i).getDriverId().equals("")) {
                    try {
                        EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(Integer.parseInt(liveDataLog.get(i).getDriverId()));
                        liveDataLog.get(i).setDriverName(empDetails.getFirstName() + " " + empDetails.getLastName());
                        liveDataLog.get(i).setMobileNo(empDetails.getMobileNo());
                    } catch (Exception var8) {
                        var8.printStackTrace();
                    }
                }
            }

            result.setResult(liveDataLog);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Live Data Log Information Send Successfully");
        } catch (Exception var10) {
            result.setStatus(Result.FAIL);
            result.setMessage(var10.getLocalizedMessage());
        }

        return result;
    }

    public List<LiveDataLogViewDto> lookupLiveDataLogByClientOperation(long clientId) {
        MatchOperation filter = Aggregation.match(Criteria.where("clientId").is(clientId));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "MAC",
                    "AmbTemp",
                    "DateTime",
                    "FuelEconomy",
                    "FuelRate",
                    "IdleHours",
                    "Lattitude",
                    "Longitude",
                    "Model",
                    "Odometer",
                    "SatStatus",
                    "SerialNo",
                    "Speed",
                    "TotalFuelIdle",
                    "TotalFuelUsed",
                    "VIN",
                    "Version",
                    "receive_time",
                    "PlaceAddress",
                    "DriverId",
                    "VehicleId"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"DateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "live_data_log", LiveDataLogViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<LiveDataLogViewDto>> ViewELDLogHistory(ClientMasterCRUDDto clientMasterCRUDDto) {
        ResultWrapper<List<LiveDataLogViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long vehicleId = clientMasterCRUDDto.getVehicleId();
            String sFromDate = clientMasterCRUDDto.getFromDate();
            String sToDate = clientMasterCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + " >> " + vehicleId + " :: " + from + " :: " + to + ",";
            List<LiveDataLogViewDto> liveDataLog = this.lookupELDLogHistoryOperation(String.valueOf(vehicleId), from, to);
            sDebug = sDebug + "Size : " + liveDataLog.size() + ",";

            for (int i = 0; i < liveDataLog.size(); ++i) {
                liveDataLog.get(i).setSpeed(Math.round(Double.valueOf(String.format("%.2f", (double) liveDataLog.get(i).getSpeed() * 0.62137119))));
                if (liveDataLog.get(i).getVehicleId() != null && !liveDataLog.get(i).getVehicleId().equals("")) {
                    VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId(Integer.parseInt(liveDataLog.get(i).getVehicleId()));
                    liveDataLog.get(i).setVehicleName(vehcileInfo.getVehicleNo());
                }

                if (liveDataLog.get(i).getDriverId() != null && !liveDataLog.get(i).getDriverId().equals("")) {
                    EmployeeMaster empDetails = this.employeeMasterRepo.findByEmployeeId(Integer.parseInt(liveDataLog.get(i).getDriverId()));
                    liveDataLog.get(i).setDriverName(empDetails.getFirstName() + " " + empDetails.getLastName());
                    liveDataLog.get(i).setMobileNo(empDetails.getMobileNo());
                }

                if (liveDataLog.get(i).getStateId() > 0L) {
                    StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) liveDataLog.get(i).getStateId());
                    liveDataLog.get(i).setStateName(stateInfo.getStateName());
                    liveDataLog.get(i).setStateCode(stateInfo.getStateCode());
                }
            }

            result.setResult(liveDataLog);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Live Data Log Information Send Successfully" + sDebug);
        } catch (Exception var18) {
            result.setStatus(Result.FAIL);
            result.setMessage(var18.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateStateInEldLogData(ClientMasterCRUDDto clientMasterCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            String sFromDate = "2025-02-10 00:00:00";
            String sToDate = "2025-02-12 23:59:59";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List<ELDLogData> eldLogData = this.lookupELDLogHistoryByDateOperation(from, to);

            for (int i = 0; i < eldLogData.size(); ++i) {
                double dLattitude = eldLogData.get(i).getLattitude();
                double dLongitude = eldLogData.get(i).getLongitude();
                sDebug = sDebug + "3,";
                double[] point = new double[]{dLongitude, dLattitude};

                try {
                    GeofanceMaster lstGeofacne = this.geofanceMasterRepo.findByAreaIntersects(point);
                    List<StateMaster> states = this.stateMasterRepo.findAndViewByGeofanceId((long) lstGeofacne.getGeoId().intValue());
                    Query query = new Query();
                    query.addCriteria(Criteria.where("utcDateTime").is(eldLogData.get(i).getUtcDateTime()).and("DriverId").is(eldLogData.get(i).getDriverId()));
                    Update update = new Update();
                    update.set("stateId", states.get(0).getStateId());
                    update.set("geoStateId", lstGeofacne.getStateId());
                    this.mongoTemplate.updateMulti(query, update, ELDLogData.class);
                } catch (Exception var24) {
                    var24.printStackTrace();
                }
            }

            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("ELD Log Updated Successfully");
        } catch (Exception var25) {
            result.setStatus(Result.FAIL);
            result.setMessage(var25.getLocalizedMessage());
        }

        return result;
    }

    public List<ELDLogData> lookupELDLogHistoryByDateOperation(long from, long to) {
        MatchOperation filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "MAC",
                    "AmbTemp",
                    "DateTime",
                    "FuelEconomy",
                    "FuelRate",
                    "IdleHours",
                    "Lattitude",
                    "Longitude",
                    "Model",
                    "Odometer",
                    "SatStatus",
                    "SerialNo",
                    "Speed",
                    "TotalFuelIdle",
                    "TotalFuelUsed",
                    "VIN",
                    "Version",
                    "receive_time",
                    "PlaceAddress",
                    "DriverId",
                    "VehicleId",
                    "utcDateTime"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_log_data", ELDLogData.class).getMappedResults();
    }

    public List<LiveDataLogViewDto> lookupLiveDataLogOperation() {
        MatchOperation filter = Aggregation.match(new Criteria());
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "MAC",
                    "AmbTemp",
                    "DateTime",
                    "FuelEconomy",
                    "FuelRate",
                    "IdleHours",
                    "Lattitude",
                    "Longitude",
                    "Model",
                    "Odometer",
                    "SatStatus",
                    "SerialNo",
                    "Speed",
                    "TotalFuelIdle",
                    "TotalFuelUsed",
                    "VIN",
                    "Version",
                    "receive_time",
                    "PlaceAddress",
                    "DriverId",
                    "VehicleId"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "live_data_log", LiveDataLogViewDto.class).getMappedResults();
    }

    public List<LiveDataLogViewDto> lookupELDLogHistoryOperation(String vehicleId, long from, long to) {
        MatchOperation filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("VehicleId").is(vehicleId).and("Speed").gt(0));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "MAC",
                    "AmbTemp",
                    "DateTime",
                    "FuelEconomy",
                    "FuelRate",
                    "IdleHours",
                    "Lattitude",
                    "Longitude",
                    "Model",
                    "Odometer",
                    "SatStatus",
                    "SerialNo",
                    "Speed",
                    "TotalFuelIdle",
                    "TotalFuelUsed",
                    "VIN",
                    "Version",
                    "receive_time",
                    "PlaceAddress",
                    "DriverId",
                    "VehicleId",
                    "utcDateTime",
                    "stateId"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_log_data", LiveDataLogViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<String> ViewIdlingReport(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long vehicleId = driveringStatusCRUDDto.getVehicleId();
            String sFromDate = driveringStatusCRUDDto.getFromDate();
            String sToDate = driveringStatusCRUDDto.getToDate();
            long clientId = driveringStatusCRUDDto.getClientId();
            String reportType = driveringStatusCRUDDto.getReportType();
            Instant instant = Instant.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + " >> " + vehicleId + " :: " + from + " :: " + to + ",";
            String sanitizedFrom = sFromDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String sanitizedTo = sToDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String isIdlingReportExist = "false";
            List<IdlingReportViewDto> idlingReport = this.lookupIdlingReportOperation(String.valueOf(vehicleId), from, to, clientId);
            sDebug = sDebug + "Size : " + idlingReport.size() + ",";

            if (idlingReport == null || idlingReport.isEmpty()) {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("No Idling records found for the selected vehicle and date range.");
                return result;
            }

            for (int i = 0; i < idlingReport.size(); ++i) {
                idlingReport.get(i).setFromDate(sFromDate);
                idlingReport.get(i).setToDate(sToDate);
                if (idlingReport.get(i).getClientId() > 0L) {
                    ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) idlingReport.get(i).getClientId());
                    idlingReport.get(i).setClientName(clientInfo.getClientName());
                }

                if (idlingReport.get(i).getVehicleId() != null && !idlingReport.get(i).getVehicleId().equals("")) {
                    try {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId(Integer.parseInt(idlingReport.get(i).getVehicleId()));
                        idlingReport.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                    } catch (Exception var25) {
                        var25.printStackTrace();
                        idlingReport.get(i).setVehicleNo("");
                    }
                }
            }

            String sUrl = "";
            String outputPath = "";
            if (reportType.equals("pdf")) {
                outputPath = "/opt/tomcat/webapps/uploads/idling_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf";
                this.generateIdlingReportPdf(idlingReport, outputPath);
                sUrl = "https://admin.gbt-usa.com/uploads/idling_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf";
            } else {
                outputPath = "/opt/tomcat/webapps/uploads/idling_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".csv";
                this.generateIdlingReportCsv(idlingReport, outputPath);
                sUrl = "https://admin.gbt-usa.com/uploads/idling_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".csv";
            }

            result.setToken(isIdlingReportExist);
            result.setResult(sUrl);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Idling Report Information Send Successfully" + sDebug);
        } catch (Exception var26) {
            result.setStatus(Result.FAIL);
            result.setMessage(var26.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public void generateIdlingReportCsv(List<IdlingReportViewDto> report, String outputPath) throws Exception {
        File file = new File(outputPath);
        file.getParentFile().mkdirs();
        FileWriter writer = new FileWriter(file);
        writer.append("Vehicle");
        writer.append(",");
        writer.append("Start Time");
        writer.append(",");
        writer.append("End Time");
        writer.append(",");
        writer.append("Duration");
        writer.append(",");
        writer.append("Location");
        writer.append("\n");

        for (IdlingReportViewDto row : report) {
            String durationFormatted = this.convertSecondsToTime(row.getDurationMillis() / 1000L);
            writer.append(row.getVehicleNo() == null ? "" : row.getVehicleNo());
            writer.append(",");
            writer.append(row.getStartDateTime() == null ? "" : row.getStartDateTime());
            writer.append(",");
            writer.append(row.getEndDateTime() == null ? "" : row.getEndDateTime());
            writer.append(",");
            writer.append(durationFormatted);
            writer.append(",");
            String location = row.getStartAddress() == null ? "" : row.getStartAddress().replace(",", " ");
            writer.append(location);
            writer.append("\n");
        }

        writer.flush();
        writer.close();
    }

    public void generateIdlingReportPdf(List<IdlingReportViewDto> report, String outputPath) throws Exception {
        Document document = new Document(PageSize.A4.rotate(), 36.0F, 36.0F, 36.0F, 36.0F);
        File file = new File(outputPath);
        file.getParentFile().mkdirs();
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        Font titleFont = new Font(FontFamily.HELVETICA, 18.0F, 1, BaseColor.BLACK);
        Font sectionFont = new Font(FontFamily.HELVETICA, 14.0F, 1, BaseColor.BLACK);
        Font bodyFont = new Font(FontFamily.HELVETICA, 10.0F, 0, BaseColor.BLACK);
        Font boldFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.BLACK);
        Font whiteBoldFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.WHITE);
        BaseColor headerBgColor = new BaseColor(4, 53, 109);
        Paragraph title = new Paragraph(report.get(0).getClientName(), titleFont);
        title.setAlignment(1);
        title.setSpacingAfter(5.0F);
        document.add(title);
        Paragraph subtitle = new Paragraph("Idling over 1 minutes", sectionFont);
        subtitle.setAlignment(1);
        subtitle.setSpacingAfter(20.0F);
        document.add(subtitle);
        PdfPTable datePeriodTable = new PdfPTable(2);
        datePeriodTable.setWidthPercentage(60.0F);
        datePeriodTable.setHorizontalAlignment(1);
        datePeriodTable.setSpacingAfter(20.0F);
        PdfPCell dateHeader = new PdfPCell(new Phrase("DATE", boldFont));
        PdfPCell periodHeader = new PdfPCell(new Phrase("PERIOD", boldFont));
        dateHeader.setHorizontalAlignment(1);
        periodHeader.setHorizontalAlignment(1);
        dateHeader.setBorder(2);
        periodHeader.setBorder(2);
        datePeriodTable.addCell(dateHeader);
        datePeriodTable.addCell(periodHeader);
        String reportDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fromDate = LocalDateTime.parse(report.get(0).getFromDate(), inputFormatter).format(outputFormatter);
        String toDate = LocalDateTime.parse(report.get(0).getToDate(), inputFormatter).format(outputFormatter);
        String period = fromDate + " - " + toDate;
        PdfPCell dateValue = new PdfPCell(new Phrase(reportDate, bodyFont));
        PdfPCell periodValue = new PdfPCell(new Phrase(period, bodyFont));
        dateValue.setHorizontalAlignment(1);
        periodValue.setHorizontalAlignment(1);
        dateValue.setBorder(0);
        periodValue.setBorder(0);
        datePeriodTable.addCell(dateValue);
        datePeriodTable.addCell(periodValue);
        document.add(datePeriodTable);
        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100.0F);
        table.setWidths(new float[]{2.0F, 3.0F, 3.0F, 2.0F, 8.0F});
        Stream.of("VEHICLE", "START TIME", "END TIME", "DURATION", "LOCATION").forEach(col -> {
            PdfPCell cell = new PdfPCell(new Phrase(col, whiteBoldFont));
            cell.setBackgroundColor(headerBgColor);
            cell.setHorizontalAlignment(1);
            cell.setVerticalAlignment(5);
            cell.setPadding(4.0F);
            table.addCell(cell);
        });
        Font smallFont = new Font(FontFamily.HELVETICA, 10.0F, 0, BaseColor.BLACK);

        for (IdlingReportViewDto row : report) {
            PdfPCell vehicleCell = new PdfPCell(new Phrase(row.getVehicleNo(), smallFont));
            vehicleCell.setHorizontalAlignment(1);
            vehicleCell.setVerticalAlignment(5);
            vehicleCell.setPadding(3.0F);
            PdfPCell startCell = new PdfPCell(new Phrase(row.getStartDateTime(), smallFont));
            startCell.setHorizontalAlignment(1);
            startCell.setVerticalAlignment(5);
            startCell.setPadding(3.0F);
            PdfPCell endCell = new PdfPCell(new Phrase(row.getEndDateTime(), smallFont));
            endCell.setHorizontalAlignment(1);
            endCell.setVerticalAlignment(5);
            endCell.setPadding(3.0F);
            String durationFormatted = this.convertSecondsToTime(row.getDurationMillis() / 1000L);
            PdfPCell durationCell = new PdfPCell(new Phrase(durationFormatted, smallFont));
            durationCell.setHorizontalAlignment(1);
            durationCell.setVerticalAlignment(5);
            durationCell.setPadding(3.0F);
            PdfPCell locationCell = new PdfPCell(new Phrase(row.getStartAddress(), smallFont));
            locationCell.setHorizontalAlignment(0);
            locationCell.setVerticalAlignment(5);
            locationCell.setPadding(3.0F);
            table.addCell(vehicleCell);
            table.addCell(startCell);
            table.addCell(endCell);
            table.addCell(durationCell);
            table.addCell(locationCell);
        }

        document.add(table);
        document.close();
    }

    public List<IdlingReportViewDto> lookupIdlingReportOperation(String vehicleId, long from, long to, long clientId) {
        MatchOperation filter = Aggregation.match(
                Criteria.where("startUtcDateTime").gte(from).lte(to).and("vehicleId").is(vehicleId).and("clientId").is(clientId)
        );
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "vehicleId",
                    "clientId",
                    "VIN",
                    "Version",
                    "MAC",
                    "Model",
                    "SerialNo",
                    "startDateTime",
                    "endDateTime",
                    "startUtcDateTime",
                    "endUtcDateTime",
                    "durationMillis",
                    "startAddress",
                    "endAddress",
                    "startOdometer",
                    "endOdometer",
                    "startEngineHours",
                    "endEngineHours"
                }
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"startUtcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "idling_report", IdlingReportViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<IftaReportViewDto>> ViewIftaReport(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<IftaReportViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long vehicleId = driveringStatusCRUDDto.getVehicleId();
            String sFromDate = driveringStatusCRUDDto.getFromDate();
            String sToDate = driveringStatusCRUDDto.getToDate();
            Instant instant = Instant.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + " >> " + vehicleId + " :: " + from + " :: " + to + ",";
            String sanitizedFrom = sFromDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String sanitizedTo = sToDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String isIftaReportExist = "false";
            List<IftaReportViewDto> iftaReport = null;
            List<IFTAReports> iftaData = this.iftaReportsRepo.findAndViewIftaReport(String.valueOf(vehicleId), sFromDate, sToDate);
            String companyName = "";
            if (iftaData.size() <= 0) {
                isIftaReportExist = "false";
                iftaReport = this.lookupIftaReportOperation(String.valueOf(vehicleId), from, to);
                sDebug = sDebug + "Size : " + iftaReport + ",";

                for (int i = 0; i < iftaReport.size(); ++i) {
                    if (iftaReport.get(i).getClientId() > 0L) {
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) iftaReport.get(i).getClientId());
                        companyName = clientInfo.getClientName();
                    }

                    iftaReport.get(i).setCarrierName(companyName);
                    iftaReport.get(i).setFromDate(sFromDate);
                    iftaReport.get(i).setToDate(sToDate);

                    try {
                        Pageable pageableRequest = PageRequest.of(0, 100, Sort.by(new String[]{"utcDateTime"}).ascending());
                        Query query = new Query();
                        query.addCriteria(
                                Criteria.where("utcDateTime")
                                        .gte(from)
                                        .lte(to)
                                        .and("VehicleId")
                                        .is(String.valueOf(vehicleId))
                                        .and("stateId")
                                        .is(iftaReport.get(i).getStateId())
                        );
                        query.with(pageableRequest);
                        List<EldLogDataViewDto> eldLogData = this.mongoTemplate.find(query, EldLogDataViewDto.class, "eld_log_data");

                        for (int e = 0; e < eldLogData.size(); ++e) {
                            if (Double.parseDouble(eldLogData.get(e).getOdometer()) > 0.0) {
                                iftaReport.get(i).setFirstOdometer((double) Math.round(Double.parseDouble(eldLogData.get(e).getOdometer()) * 0.62137119));
                                break;
                            }
                        }

                        Pageable var48 = PageRequest.of(0, 100, Sort.by(new String[]{"utcDateTime"}).descending());
                        query = new Query();
                        query.addCriteria(
                                Criteria.where("utcDateTime")
                                        .gte(from)
                                        .lte(to)
                                        .and("VehicleId")
                                        .is(String.valueOf(vehicleId))
                                        .and("stateId")
                                        .is(iftaReport.get(i).getStateId())
                        );
                        query.with(var48);
                        eldLogData = this.mongoTemplate.find(query, EldLogDataViewDto.class, "eld_log_data");

                        for (int e = 0; e < eldLogData.size(); ++e) {
                            if (Double.parseDouble(eldLogData.get(e).getOdometer()) > 0.0) {
                                iftaReport.get(i).setLastOdometer((double) Math.round(Double.parseDouble(eldLogData.get(e).getOdometer()) * 0.62137119));
                                break;
                            }
                        }
                    } catch (Exception var39) {
                        var39.printStackTrace();
                    }

                    if (iftaReport.get(i).getVehicleId() != null && !iftaReport.get(i).getVehicleId().equals("")) {
                        try {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId(Integer.parseInt(iftaReport.get(i).getVehicleId()));
                            iftaReport.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                            iftaReport.get(i).setMake(vehcileInfo.getMake());
                            iftaReport.get(i).setVin(vehcileInfo.getVin());
                            iftaReport.get(i).setModel(vehcileInfo.getModel());
                            iftaReport.get(i).setManufacturingYear(vehcileInfo.getManufacturingYear());
                        } catch (Exception var38) {
                            var38.printStackTrace();
                            iftaReport.get(i).setVehicleNo("");
                            iftaReport.get(i).setMake("");
                            iftaReport.get(i).setVin("");
                            iftaReport.get(i).setModel("");
                            iftaReport.get(i).setManufacturingYear(0L);
                        }
                    }

                    if (iftaReport.get(i).getStateId() > 0L) {
                        double lastLat = 0.0;
                        double lastLng = 0.0;
                        double TOTAL_KM = 0.0;
                        long timeDiff = 0L;
                        long lastTimeStamp = 0L;
                        sDebug = sDebug + " >> state ID : " + iftaReport.get(i).getStateId() + ",";
                        List<IftaReportViewDto> eldLogData = this.lookupAllELDLogDataByVehicleOperation(
                                String.valueOf(vehicleId), from, to, iftaReport.get(i).getStateId()
                        );
                        sDebug = sDebug + " >> Size : " + eldLogData.size() + ",";

                        for (int e = 0; e < eldLogData.size(); ++e) {
                            if (lastLat != 0.0 && lastLat != eldLogData.get(e).getLattitude()) {
                                double KM = calculateDistanceInMeters(eldLogData.get(e).getLattitude(), eldLogData.get(e).getLongitude(), lastLat, lastLng);
                                timeDiff = (eldLogData.get(e).getUtcDateTime() - lastTimeStamp) / 1000L;
                                if (KM / 1000.0 <= 5.0 && timeDiff <= 600L) {
                                    TOTAL_KM += KM / 1000.0;
                                }
                            }

                            lastLat = eldLogData.get(e).getLattitude();
                            lastLng = eldLogData.get(e).getLongitude();
                            lastTimeStamp = eldLogData.get(e).getUtcDateTime();
                        }

                        iftaReport.get(i).setGpsKm((double) Math.round(Double.valueOf(String.format("%.2f", TOTAL_KM * 0.62137119))));

                        try {
                            StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) iftaReport.get(i).getStateId());
                            iftaReport.get(i).setStateName(stateInfo.getStateName());
                            iftaReport.get(i).setStateCode(stateInfo.getStateCode());
                        } catch (Exception var37) {
                            var37.printStackTrace();
                            iftaReport.get(i).setStateName("");
                            iftaReport.get(i).setStateCode("");
                        }
                    }

                    iftaReport.get(i).setCurrentTimestamp(instant.toEpochMilli());
                    iftaReport.get(i).setFileName(sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf");
                }

                String outputPath = "/opt/tomcat/webapps/uploads/ifta_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf";
                this.generateFullStyledPdf(iftaReport, outputPath);
                new IFTAReports();

                for (int i = 0; i < iftaReport.size(); ++i) {
                    IFTAReports var51 = new IFTAReports();
                    var51.setCarrierName(iftaReport.get(i).getCarrierName());
                    var51.setFromDate(sFromDate);
                    var51.setToDate(sToDate);
                    var51.setVehicleNo(iftaReport.get(i).getVehicleNo());
                    var51.setVehicleId(iftaReport.get(i).getVehicleId());
                    var51.setDriverId(iftaReport.get(i).getDriverId());
                    var51.setClientId(driveringStatusCRUDDto.getClientId());
                    var51.setStateId(iftaReport.get(i).getStateId());
                    var51.setUtcDateTime(iftaReport.get(i).getUtcDateTime());
                    var51.setMake(iftaReport.get(i).getMake());
                    var51.setVin(iftaReport.get(i).getVin());
                    var51.setModel(iftaReport.get(i).getModel());
                    var51.setManufacturingYear(iftaReport.get(i).getManufacturingYear());
                    var51.setStateName(iftaReport.get(i).getStateName());
                    var51.setStateCode(iftaReport.get(i).getStateCode());
                    var51.setFirstOdometer(iftaReport.get(i).getFirstOdometer());
                    var51.setLastOdometer(iftaReport.get(i).getLastOdometer());
                    var51.setLattitude(iftaReport.get(i).getLattitude());
                    var51.setLongitude(iftaReport.get(i).getLongitude());
                    var51.setGpsKm(iftaReport.get(i).getGpsKm());
                    var51.setCurrentTimestamp(iftaReport.get(i).getCurrentTimestamp());
                    var51.setFileName(sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf");
                    this.iftaReportsRepo.save(var51);
                }

                result.setToken(isIftaReportExist);
                result.setResult(iftaReport);
                result.setStatus(Result.SUCCESS);
                result.setMessage("IFTA Report Information Send Successfully" + sDebug);
            } else {
                isIftaReportExist = "true";
                result.setToken(isIftaReportExist);
                result.setResult(iftaReport);
                result.setStatus(Result.FAIL);
                result.setMessage("IFTA Report Already Generated.");
            }
        } catch (Exception var40) {
            result.setStatus(Result.FAIL);
            result.setMessage(var40.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<IftaReportViewDto>> ViewIftaReportNew(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<IftaReportViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long vehicleId = driveringStatusCRUDDto.getVehicleId();
            String sFromDate = driveringStatusCRUDDto.getFromDate();
            String sToDate = driveringStatusCRUDDto.getToDate();
            Instant instant = Instant.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + " >> " + vehicleId + " :: " + from + " :: " + to + ",";
            String sanitizedFrom = sFromDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String sanitizedTo = sToDate.replace(":", "_").replace("-", "_").replace(" ", "_");
            String isIftaReportExist = "false";
            List<IftaReportViewDto> iftaReport = null;
            List<IFTAReports> iftaData = this.iftaReportsRepo.findAndViewIftaReport(String.valueOf(vehicleId), sFromDate, sToDate);
            String companyName = "";
            long clientId = 0L;
            if (iftaData.size() <= 0) {
                isIftaReportExist = "false";
                iftaReport = this.lookupIftaReportNewOperation(String.valueOf(vehicleId), from, to);
                sDebug = sDebug + "Size : " + iftaReport.size() + ",";
                List<IftaReportViewDto> processedList = new ArrayList<>();
                String prevState = null;
                String prevStateCode = null;
                double firstOdometer = 0.0;
                double lastOdometer = 0.0;
                IftaReportViewDto lastData = null;
                double lastLat = 0.0;
                double lastLng = 0.0;
                double TOTAL_KM = 0.0;
                long timeDiff = 0L;
                long lastTimeStamp = 0L;

                for (int i = 0; i < iftaReport.size(); ++i) {
                    IftaReportViewDto current = iftaReport.get(i);
                    sDebug = sDebug + "1,";
                    if (current.getClientId() > 0L) {
                        clientId = current.getClientId();
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) current.getClientId());
                        companyName = clientInfo.getClientName();
                    }

                    sDebug = sDebug + "2,";
                    current.setCarrierName(companyName);
                    current.setFromDate(sFromDate);
                    current.setToDate(sToDate);
                    current.setVehicleId(String.valueOf(vehicleId));
                    current.setClientId(clientId);
                    sDebug = sDebug + "3,";

                    try {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) vehicleId);
                        current.setVehicleNo(vehcileInfo.getVehicleNo());
                        current.setMake(vehcileInfo.getMake());
                        current.setVin(vehcileInfo.getVin());
                        current.setModel(vehcileInfo.getModel());
                        current.setManufacturingYear(vehcileInfo.getManufacturingYear());
                    } catch (Exception var51) {
                        var51.printStackTrace();
                        current.setVehicleNo("");
                        current.setMake("");
                        current.setVin("");
                        current.setModel("");
                        current.setManufacturingYear(0L);
                    }

                    sDebug = sDebug + "4,";

                    try {
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) current.getStateId());
                        current.setStateName(stateInfo.getStateName());
                        current.setStateCode(stateInfo.getStateCode());
                    } catch (Exception var50) {
                        var50.printStackTrace();
                        current.setStateName("");
                        current.setStateCode("");
                    }

                    sDebug = sDebug + "5,";
                    current.setCurrentTimestamp(instant.toEpochMilli());
                    current.setFileName(sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf");
                    String currentState = current.getStateName();
                    String currentStateCode = current.getStateCode();
                    double currentOdo = Double.parseDouble(current.getOdometer());
                    sDebug = sDebug + "6,";
                    if (prevState == null) {
                        prevState = currentState;
                        prevStateCode = currentStateCode;
                        firstOdometer = currentOdo;
                        lastOdometer = currentOdo;
                        lastData = current;
                        lastLat = current.getLattitude();
                        lastLng = current.getLongitude();
                        lastTimeStamp = current.getUtcDateTime();
                    } else {
                        sDebug = sDebug + "7,";
                        if (lastLat != 0.0 && lastLat != current.getLattitude()) {
                            double KM = calculateDistanceInMeters(current.getLattitude(), current.getLongitude(), lastLat, lastLng);
                            timeDiff = (current.getUtcDateTime() - lastTimeStamp) / 1000L;
                            if (KM / 1000.0 <= 5.0 && timeDiff <= 600L) {
                                TOTAL_KM += KM / 1000.0;
                            }
                        }

                        lastLat = current.getLattitude();
                        lastLng = current.getLongitude();
                        lastTimeStamp = current.getUtcDateTime();
                        sDebug = sDebug + "8,";
                        if (currentState.equals(prevState)) {
                            lastOdometer = currentOdo;
                        } else {
                            IftaReportViewDto segment = new IftaReportViewDto();
                            segment.setStateId(lastData.getStateId());
                            segment.setStateName(prevState);
                            segment.setStateCode(prevStateCode);
                            segment.setFirstOdometer((double) Math.round(firstOdometer * 0.62137119));
                            segment.setLastOdometer((double) Math.round(lastOdometer * 0.62137119));
                            segment.setTotalOdometer((double) Math.round((lastOdometer - firstOdometer) * 0.62137119));
                            segment.setGpsKm((double) Math.round(TOTAL_KM * 0.62137119));
                            segment.setVehicleNo(lastData.getVehicleNo());
                            segment.setVehicleId(lastData.getVehicleId());
                            segment.setClientId(lastData.getClientId());
                            segment.setDriverId(lastData.getDriverId());
                            segment.setCarrierName(lastData.getCarrierName());
                            segment.setFromDate(lastData.getFromDate());
                            segment.setToDate(lastData.getToDate());
                            segment.setMake(lastData.getMake());
                            segment.setVin(lastData.getVin());
                            segment.setModel(lastData.getModel());
                            segment.setManufacturingYear(lastData.getManufacturingYear());
                            segment.setCurrentTimestamp(lastData.getCurrentTimestamp());
                            segment.setUtcDateTime(lastData.getUtcDateTime());
                            segment.setLattitude(lastData.getLattitude());
                            segment.setLongitude(lastData.getLongitude());
                            segment.setFileName(lastData.getFileName());
                            processedList.add(segment);
                            sDebug = sDebug + "9,";
                            prevState = currentState;
                            prevStateCode = currentStateCode;
                            firstOdometer = currentOdo;
                            lastOdometer = currentOdo;
                            lastData = current;
                            TOTAL_KM = 0.0;
                        }
                    }
                }

                sDebug = sDebug + "10,";
                if (prevState != null) {
                    IftaReportViewDto segment = new IftaReportViewDto();
                    segment.setStateId(lastData.getStateId());
                    segment.setStateName(prevState);
                    segment.setStateCode(prevStateCode);
                    segment.setFirstOdometer((double) Math.round(firstOdometer * 0.62137119));
                    segment.setLastOdometer((double) Math.round(lastOdometer * 0.62137119));
                    segment.setTotalOdometer((double) Math.round((lastOdometer - firstOdometer) * 0.62137119));
                    segment.setGpsKm((double) Math.round(TOTAL_KM * 0.62137119));
                    segment.setVehicleNo(lastData.getVehicleNo());
                    segment.setVehicleId(lastData.getVehicleId());
                    segment.setClientId(lastData.getClientId());
                    segment.setDriverId(lastData.getDriverId());
                    segment.setCarrierName(lastData.getCarrierName());
                    segment.setFromDate(lastData.getFromDate());
                    segment.setToDate(lastData.getToDate());
                    segment.setMake(lastData.getMake());
                    segment.setVin(lastData.getVin());
                    segment.setModel(lastData.getModel());
                    segment.setManufacturingYear(lastData.getManufacturingYear());
                    segment.setCurrentTimestamp(lastData.getCurrentTimestamp());
                    segment.setUtcDateTime(lastData.getUtcDateTime());
                    segment.setLattitude(lastData.getLattitude());
                    segment.setLongitude(lastData.getLongitude());
                    segment.setFileName(lastData.getFileName());
                    processedList.add(segment);
                }

                sDebug = sDebug + "11,";
                Map<String, IftaReportViewDto> mergedMap = new LinkedHashMap<>();

                for (IftaReportViewDto seg : processedList) {
                    String key = seg.getStateCode();
                    if (!mergedMap.containsKey(key)) {
                        mergedMap.put(key, seg);
                    } else {
                        IftaReportViewDto existing = mergedMap.get(key);
                        existing.setTotalOdometer(existing.getTotalOdometer() + seg.getTotalOdometer());
                        existing.setGpsKm(existing.getGpsKm() + seg.getGpsKm());
                        if (seg.getFirstOdometer() < existing.getFirstOdometer()) {
                            existing.setFirstOdometer(seg.getFirstOdometer());
                        }

                        if (seg.getLastOdometer() > existing.getLastOdometer()) {
                            existing.setLastOdometer(seg.getLastOdometer());
                        }
                    }
                }

                sDebug = sDebug + "12,";
                List<IftaReportViewDto> finalList = new ArrayList<>(mergedMap.values());
                String outputPath = "/opt/tomcat/webapps/uploads/ifta_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf";
                this.generateFullStyledNewPdf(finalList, outputPath);
                String csvPath = "/opt/tomcat/webapps/uploads/ifta_reports/" + sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".csv";
                this.generateIftaCsv(finalList, csvPath);
                sDebug = sDebug + "13,";
                new IFTAReports();

                for (int i = 0; i < finalList.size(); ++i) {
                    IFTAReports var69 = new IFTAReports();
                    var69.setCarrierName(finalList.get(i).getCarrierName());
                    var69.setFromDate(sFromDate);
                    var69.setToDate(sToDate);
                    var69.setVehicleNo(finalList.get(i).getVehicleNo());
                    var69.setVehicleId(finalList.get(i).getVehicleId());
                    var69.setDriverId(finalList.get(i).getDriverId());
                    var69.setClientId(finalList.get(i).getClientId());
                    var69.setStateId(finalList.get(i).getStateId());
                    var69.setUtcDateTime(finalList.get(i).getUtcDateTime());
                    var69.setMake(finalList.get(i).getMake());
                    var69.setVin(finalList.get(i).getVin());
                    var69.setModel(finalList.get(i).getModel());
                    var69.setManufacturingYear(finalList.get(i).getManufacturingYear());
                    var69.setStateName(finalList.get(i).getStateName());
                    var69.setStateCode(finalList.get(i).getStateCode());
                    var69.setFirstOdometer(finalList.get(i).getFirstOdometer());
                    var69.setLastOdometer(finalList.get(i).getLastOdometer());
                    var69.setTotalOdometer(finalList.get(i).getTotalOdometer());
                    var69.setLattitude(finalList.get(i).getLattitude());
                    var69.setLongitude(finalList.get(i).getLongitude());
                    var69.setGpsKm(finalList.get(i).getGpsKm());
                    var69.setCurrentTimestamp(finalList.get(i).getCurrentTimestamp());
                    var69.setFileName(sanitizedFrom + "_" + sanitizedTo + "_" + vehicleId + ".pdf");
                    this.iftaReportsRepo.save(var69);
                }

                sDebug = sDebug + "14,";
                result.setToken(isIftaReportExist);
                result.setResult(finalList);
                result.setStatus(Result.SUCCESS);
                result.setMessage("IFTA Report Information Send Successfully " + sDebug);
            } else {
                isIftaReportExist = "true";
                result.setToken(isIftaReportExist);
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("IFTA Report Already Generated." + sDebug);
            }
        } catch (Exception var52) {
            result.setStatus(Result.FAIL);
            result.setMessage(var52.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public void generateIftaCsv(List<IftaReportViewDto> report, String outputPath) throws Exception {
        File file = new File(outputPath);
        file.getParentFile().mkdirs();
        FileWriter writer = new FileWriter(file);
        writer.append("IFTA Report\n");
        writer.append("Carrier,").append(report.get(0).getCarrierName()).append("\n");
        String period = report.get(0).getFromDate() + " To " + report.get(0).getToDate();
        writer.append("Period,").append(period).append("\n");
        LocalDateTime dateTime = Instant.ofEpochMilli(report.get(0).getCurrentTimestamp()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        String formatted = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        writer.append("Report Generated,").append(formatted).append("\n");
        writer.append("\n");
        writer.append("Vehicle Information\n");
        writer.append("NAME,").append(report.get(0).getVehicleNo()).append("\n");
        writer.append("MAKE,").append(report.get(0).getMake()).append("\n");
        writer.append("VIN,").append(report.get(0).getVin()).append("\n");
        writer.append("MODEL,").append(report.get(0).getModel()).append("\n");
        writer.append("YEAR,").append(String.valueOf(report.get(0).getManufacturingYear())).append("\n");
        writer.append("\n");
        writer.append("State,Odometer (Miles),GPS (Miles)\n");

        for (IftaReportViewDto state : report) {
            writer.append(state.getStateName() + " (" + state.getStateCode() + ")")
                    .append(",")
                    .append(String.valueOf(state.getTotalOdometer()))
                    .append(",")
                    .append(String.valueOf(state.getGpsKm()))
                    .append("\n");
        }

        writer.flush();
        writer.close();
    }

    public void generateFullStyledPdf(List<IftaReportViewDto> report, String outputPath) throws Exception {
        Document document = new Document(PageSize.A4, 36.0F, 36.0F, 36.0F, 36.0F);
        File file = new File(outputPath);
        file.getParentFile().mkdirs();
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        Font titleFont = new Font(FontFamily.HELVETICA, 18.0F, 1, BaseColor.BLACK);
        Font sectionFont = new Font(FontFamily.HELVETICA, 14.0F, 1, BaseColor.BLACK);
        Font bodyFont = new Font(FontFamily.HELVETICA, 12.0F, 0, BaseColor.BLACK);
        new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.BLACK);
        Font whiteBoldFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.WHITE);
        Font labelFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.BLACK);
        Font valueFont = new Font(FontFamily.HELVETICA, 12.0F, 0, BaseColor.BLACK);
        BaseColor headerBgColor = new BaseColor(4, 53, 109);
        Paragraph title = new Paragraph("IFTA Report", titleFont);
        title.setAlignment(1);
        title.setSpacingAfter(10.0F);
        document.add(title);
        document.add(new Paragraph("IFTA Mileage By State", sectionFont));
        document.add(new Paragraph("Summary of total mileage by state for all equipment", bodyFont));
        document.add(new Paragraph(" "));
        String period = report.get(0).getFromDate() + " To " + report.get(0).getToDate();
        LocalDateTime dateTime = Instant.ofEpochMilli(report.get(0).getCurrentTimestamp()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        String formatted = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        document.add(new Paragraph("Carrier: " + report.get(0).getCarrierName(), bodyFont));
        document.add(new Paragraph("Period: " + period, bodyFont));
        document.add(new Paragraph("Report Generated:  " + formatted, bodyFont));
        document.add(new Paragraph(" "));
        PdfPTable vehicleHeader = new PdfPTable(1);
        vehicleHeader.setWidthPercentage(100.0F);
        PdfPCell headerCell = new PdfPCell(new Phrase("Vehicle : " + report.get(0).getVehicleNo(), whiteBoldFont));
        headerCell.setHorizontalAlignment(1);
        headerCell.setBackgroundColor(headerBgColor);
        headerCell.setPadding(8.0F);
        vehicleHeader.addCell(headerCell);
        document.add(vehicleHeader);
        PdfPTable vehicleDetails = new PdfPTable(2);
        vehicleDetails.setWidthPercentage(100.0F);
        vehicleDetails.setWidths(new float[]{3.0F, 7.0F});
        String[][] vehicleInfo = new String[][]{
            {"NAME", report.get(0).getVehicleNo()},
            {"MAKE", report.get(0).getMake()},
            {"VIN", report.get(0).getVin()},
            {"MODEL", report.get(0).getModel()},
            {"YEAR", String.valueOf(report.get(0).getManufacturingYear())}
        };

        for (String[] row : vehicleInfo) {
            PdfPCell key = new PdfPCell(new Phrase(row[0], labelFont));
            PdfPCell val = new PdfPCell(new Phrase(row[1], valueFont));
            key.setPadding(6.0F);
            val.setPadding(6.0F);
            vehicleDetails.addCell(key);
            vehicleDetails.addCell(val);
        }

        document.add(vehicleDetails);
        PdfPTable dataTable = new PdfPTable(3);
        dataTable.setWidthPercentage(100.0F);
        dataTable.setSpacingBefore(10.0F);
        dataTable.setWidths(new float[]{4.0F, 4.0F, 4.0F});
        Stream.of("State", "Odometer (Miles)", "GPS (Miles)").forEach(col -> {
            PdfPCell cell = new PdfPCell(new Phrase(col, whiteBoldFont));
            cell.setBackgroundColor(headerBgColor);
            cell.setHorizontalAlignment(1);
            cell.setPadding(6.0F);
            dataTable.addCell(cell);
        });

        for (IftaReportViewDto state : report) {
            PdfPCell stateCell = new PdfPCell(new Phrase(state.getStateName() + " (" + state.getStateCode() + ")", bodyFont));
            PdfPCell odoCell = new PdfPCell(new Phrase(String.valueOf(state.getLastOdometer() - state.getFirstOdometer()), bodyFont));
            PdfPCell gpsCell = new PdfPCell(new Phrase(String.valueOf(state.getGpsKm()), bodyFont));
            stateCell.setPadding(4.0F);
            odoCell.setPadding(4.0F);
            gpsCell.setPadding(4.0F);
            odoCell.setHorizontalAlignment(2);
            gpsCell.setHorizontalAlignment(2);
            dataTable.addCell(stateCell);
            dataTable.addCell(odoCell);
            dataTable.addCell(gpsCell);
        }

        document.add(dataTable);
        document.close();
    }

    public void generateFullStyledNewPdf(List<IftaReportViewDto> report, String outputPath) throws Exception {
        Document document = new Document(PageSize.A4, 36.0F, 36.0F, 36.0F, 36.0F);
        File file = new File(outputPath);
        file.getParentFile().mkdirs();
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        Font titleFont = new Font(FontFamily.HELVETICA, 18.0F, 1, BaseColor.BLACK);
        Font sectionFont = new Font(FontFamily.HELVETICA, 14.0F, 1, BaseColor.BLACK);
        Font bodyFont = new Font(FontFamily.HELVETICA, 12.0F, 0, BaseColor.BLACK);
        new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.BLACK);
        Font whiteBoldFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.WHITE);
        Font labelFont = new Font(FontFamily.HELVETICA, 12.0F, 1, BaseColor.BLACK);
        Font valueFont = new Font(FontFamily.HELVETICA, 12.0F, 0, BaseColor.BLACK);
        BaseColor headerBgColor = new BaseColor(4, 53, 109);
        Paragraph title = new Paragraph("IFTA Report", titleFont);
        title.setAlignment(1);
        title.setSpacingAfter(10.0F);
        document.add(title);
        document.add(new Paragraph("IFTA Mileage By State", sectionFont));
        document.add(new Paragraph("Summary of total mileage by state for all equipment", bodyFont));
        document.add(new Paragraph(" "));
        String period = report.get(0).getFromDate() + " To " + report.get(0).getToDate();
        LocalDateTime dateTime = Instant.ofEpochMilli(report.get(0).getCurrentTimestamp()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        String formatted = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        document.add(new Paragraph("Carrier: " + report.get(0).getCarrierName(), bodyFont));
        document.add(new Paragraph("Period: " + period, bodyFont));
        document.add(new Paragraph("Report Generated:  " + formatted, bodyFont));
        document.add(new Paragraph(" "));
        PdfPTable vehicleHeader = new PdfPTable(1);
        vehicleHeader.setWidthPercentage(100.0F);
        PdfPCell headerCell = new PdfPCell(new Phrase("Vehicle : " + report.get(0).getVehicleNo(), whiteBoldFont));
        headerCell.setHorizontalAlignment(1);
        headerCell.setBackgroundColor(headerBgColor);
        headerCell.setPadding(8.0F);
        vehicleHeader.addCell(headerCell);
        document.add(vehicleHeader);
        PdfPTable vehicleDetails = new PdfPTable(2);
        vehicleDetails.setWidthPercentage(100.0F);
        vehicleDetails.setWidths(new float[]{3.0F, 7.0F});
        String[][] vehicleInfo = new String[][]{
            {"NAME", report.get(0).getVehicleNo()},
            {"MAKE", report.get(0).getMake()},
            {"VIN", report.get(0).getVin()},
            {"MODEL", report.get(0).getModel()},
            {"YEAR", String.valueOf(report.get(0).getManufacturingYear())}
        };

        for (String[] row : vehicleInfo) {
            PdfPCell key = new PdfPCell(new Phrase(row[0], labelFont));
            PdfPCell val = new PdfPCell(new Phrase(row[1], valueFont));
            key.setPadding(6.0F);
            val.setPadding(6.0F);
            vehicleDetails.addCell(key);
            vehicleDetails.addCell(val);
        }

        document.add(vehicleDetails);
        PdfPTable dataTable = new PdfPTable(3);
        dataTable.setWidthPercentage(100.0F);
        dataTable.setSpacingBefore(10.0F);
        dataTable.setWidths(new float[]{4.0F, 4.0F, 4.0F});
        Stream.of("State", "Odometer (Miles)", "GPS (Miles)").forEach(col -> {
            PdfPCell cell = new PdfPCell(new Phrase(col, whiteBoldFont));
            cell.setBackgroundColor(headerBgColor);
            cell.setHorizontalAlignment(1);
            cell.setPadding(6.0F);
            dataTable.addCell(cell);
        });

        for (IftaReportViewDto state : report) {
            PdfPCell stateCell = new PdfPCell(new Phrase(state.getStateName() + " (" + state.getStateCode() + ")", bodyFont));
            PdfPCell odoCell = new PdfPCell(new Phrase(String.valueOf(state.getTotalOdometer()), bodyFont));
            PdfPCell gpsCell = new PdfPCell(new Phrase(String.valueOf(state.getGpsKm()), bodyFont));
            stateCell.setPadding(4.0F);
            odoCell.setPadding(4.0F);
            gpsCell.setPadding(4.0F);
            odoCell.setHorizontalAlignment(2);
            gpsCell.setHorizontalAlignment(2);
            dataTable.addCell(stateCell);
            dataTable.addCell(odoCell);
            dataTable.addCell(gpsCell);
        }

        document.add(dataTable);
        document.close();
    }

    public static double calculateDistanceInMeters(double lat1, double lon1, double lat2, double lon2) {
        if (lat1 == lat2 && lon1 == lon2) {
            return 0.0;
        } else {
            double radLat1 = Math.toRadians(lat1);
            double radLat2 = Math.toRadians(lat2);
            double theta = lon1 - lon2;
            double radTheta = Math.toRadians(theta);
            double dist = Math.sin(radLat1) * Math.sin(radLat2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.cos(radTheta);
            if (dist > 1.0) {
                dist = 1.0;
            }

            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60.0 * 1.1515;
            dist *= 1.609344;
            return dist * 1000.0;
        }
    }

    public List<IftaReportViewDto> lookupAllELDLogDataByVehicleOperation(String vehicleId, long from, long to, long stateId) {
        MatchOperation filter = Aggregation.match(
                Criteria.where("utcDateTime").gte(from).lte(to).and("VehicleId").is(vehicleId).and("stateId").is(stateId).and("Speed").gt(2)
        );
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"Odometer", "VehicleId", "DriverId", "stateId", "Lattitude", "Longitude", "utcDateTime"}
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_log_data", IftaReportViewDto.class).getMappedResults();
    }

    public List<IftaReportViewDto> lookupIftaReportOperation(String vehicleId, long from, long to) {
        MatchOperation filter = Aggregation.match(
                Criteria.where("utcDateTime").gte(from).lte(to).and("VehicleId").is(vehicleId).and("stateId").gt(0).and("Speed").gt(2)
        );
        GroupOperation group1 = Aggregation.group(new String[]{"stateId"})
                .count()
                .as("totalCount")
                .first("Odometer")
                .as("firstOdometer")
                .last("Odometer")
                .as("lastOdometer")
                .last("VehicleId")
                .as("vehicleId")
                .last("DriverId")
                .as("driverId")
                .first("utcDateTime")
                .as("utcDateTime")
                .first("clientId")
                .as("clientId")
                .last("stateId")
                .as("stateId");
        ProjectionOperation projectStage = Aggregation.project(new String[]{"Odometer", "VehicleId", "DriverId", "stateId", "utcDateTime", "clientId"})
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{
                    filter, projectStage, group1, Aggregation.sort(Direction.ASC, new String[]{"stateId"}).and(Direction.ASC, new String[]{"utcDateTime"})
                }
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_log_data", IftaReportViewDto.class).getMappedResults();
    }

    public List<IftaReportViewDto> lookupIftaReportNewOperation(String vehicleId, long from, long to) {
        MatchOperation filter = Aggregation.match(
                Criteria.where("utcDateTime").gte(from).lte(to).and("VehicleId").is(vehicleId).and("stateId").gt(0).and("Speed").gt(2)
        );
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"Odometer", "VehicleId", "DriverId", "stateId", "utcDateTime", "clientId", "Lattitude", "Longitude"}
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"utcDateTime"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_log_data", IftaReportViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<IftaReportViewDto>> ViewIftaGeneratedSummaryReport(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<IftaReportViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long clientId = driveringStatusCRUDDto.getClientId();
            Instant instant = Instant.now();
            if (clientId > 0L) {
                List<IftaReportViewDto> iftaReport = this.lookupIftaGeneratedReportOperation(clientId);
                result.setResult(iftaReport);
                result.setStatus(Result.SUCCESS);
                result.setMessage("IFTA Report Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Company.");
            }
        } catch (Exception var8) {
            result.setStatus(Result.FAIL);
            result.setMessage(var8.getLocalizedMessage());
        }

        return result;
    }

    public List<IftaReportViewDto> lookupIftaGeneratedReportOperation(long clientId) {
        MatchOperation filter = Aggregation.match(Criteria.where("clientId").is(clientId));
        GroupOperation group1 = Aggregation.group(new String[]{"currentTimestamp", "vehicleNo"})
                .count()
                .as("totalCount")
                .first("fromDate")
                .as("fromDate")
                .last("toDate")
                .as("toDate")
                .last("vehicleId")
                .as("vehicleId")
                .last("driverId")
                .as("driverId")
                .first("make")
                .as("make")
                .first("vin")
                .as("vin")
                .first("currentTimestamp")
                .as("currentTimestamp")
                .first("fileName")
                .as("fileName")
                .last("vehicleNo")
                .as("vehicleNo");
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"fromDate", "toDate", "vehicleId", "driverId", "make", "vin", "currentTimestamp", "vehicleNo", "fileName"}
        )
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, group1, Aggregation.sort(Direction.DESC, new String[]{"currentTimestamp"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "ifta_reports", IftaReportViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<List<IftaSummaryReport>> ViewIftaSummaryReport(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<List<IftaSummaryReport>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long vehicleId = driveringStatusCRUDDto.getVehicleId();
            String sFromDate = driveringStatusCRUDDto.getFromDate();
            String sToDate = driveringStatusCRUDDto.getToDate();
            Instant instant = Instant.now();
            List<IftaSummaryReport> iftaSummaryReport = new ArrayList<>();
            new IftaSummaryReport();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(sFromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(sToDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List<LiveDataLogViewDto> eldLogData = this.lookupELDLogHistoryOperation(String.valueOf(vehicleId), from, to);
            long iCount = 0L;
            long lastStateId = 0L;
            long startUtcDateTime = 0L;
            long startStateId = 0L;
            long lastTimeStamp = 0L;
            long lastDriverId = 0L;
            String startPlaceAddress = "";
            String endPlaceAddress = "";
            double firstOdometer = 0.0;
            double lastOdometer = 0.0;
            double totalKm = 0.0;
            double lastLat = 0.0;
            double lastLng = 0.0;

            for (int i = 0; i < eldLogData.size(); ++i) {
                if (lastStateId > 0L && lastStateId != eldLogData.get(i).getStateId()) {
                    IftaSummaryReport iftaSummary = new IftaSummaryReport();
                    iftaSummary.setCarrierName("Road Liner Logistics Inc");
                    iftaSummary.setFromDate(startUtcDateTime);
                    iftaSummary.setToDate(eldLogData.get(i).getUtcDateTime());

                    try {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) vehicleId);
                        iftaSummary.setVehicleNo(vehcileInfo.getVehicleNo());
                        iftaSummary.setVehicleId(eldLogData.get(i).getVehicleId());
                        iftaSummary.setMake(vehcileInfo.getMake());
                        iftaSummary.setModel(vehcileInfo.getModel());
                        iftaSummary.setManufacturingYear(vehcileInfo.getManufacturingYear());
                    } catch (Exception var53) {
                        var53.printStackTrace();
                        iftaSummary.setVehicleNo("");
                        iftaSummary.setVehicleId("0");
                        iftaSummary.setMake("");
                        iftaSummary.setModel("");
                        iftaSummary.setManufacturingYear(0L);
                    }

                    try {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) lastDriverId);
                        iftaSummary.setDriverId(eldLogData.get(i).getDriverId());
                        iftaSummary.setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
                    } catch (Exception var52) {
                        var52.printStackTrace();
                        iftaSummary.setDriverId("0");
                        iftaSummary.setDriverName("");
                    }

                    iftaSummary.setFromPlaceAddress(startPlaceAddress);
                    iftaSummary.setToPlaceAddress(eldLogData.get(i).getPlaceAddress());

                    try {
                        StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) startStateId);
                        iftaSummary.setFromStateName(stateInfo.getStateName());
                        iftaSummary.setFromStateCode(stateInfo.getStateCode());
                        stateInfo = this.stateMasterRepo.findByStateId((int) eldLogData.get(i).getStateId());
                        iftaSummary.setToStateName(stateInfo.getStateName());
                        iftaSummary.setToStateCode(stateInfo.getStateCode());
                    } catch (Exception var51) {
                        var51.printStackTrace();
                        iftaSummary.setFromStateName("");
                        iftaSummary.setFromStateCode("");
                        iftaSummary.setToStateName("");
                        iftaSummary.setToStateCode("");
                    }

                    iftaSummary.setFirstOdometer(firstOdometer);
                    double odometer = (double) Math.round(Double.parseDouble(eldLogData.get(i).getOdometer()) * 0.62137119);
                    iftaSummary.setLastOdometer(odometer);
                    if (odometer >= firstOdometer) {
                        iftaSummary.setOdometerMileage(odometer - firstOdometer);
                    } else {
                        iftaSummary.setOdometerMileage(0.0);
                    }

                    double TOTAL_KM = totalKm * 0.62137119;
                    iftaSummary.setGpsMileage((double) Math.round(TOTAL_KM));
                    iftaSummaryReport.add(iftaSummary);
                    iCount = 0L;
                    totalKm = 0.0;
                }

                if (eldLogData.get(i).getStateId() > 0L) {
                    lastStateId = eldLogData.get(i).getStateId();
                    if (++iCount == 1L) {
                        startUtcDateTime = eldLogData.get(i).getUtcDateTime();
                        startPlaceAddress = eldLogData.get(i).getPlaceAddress();
                        startStateId = eldLogData.get(i).getStateId();
                        firstOdometer = (double) Math.round(Double.parseDouble(eldLogData.get(i).getOdometer()) * 0.62137119);
                    }

                    if (lastLat != 0.0 && lastLat != eldLogData.get(i).getLattitude()) {
                        double KM = calculateDistanceInMeters(eldLogData.get(i).getLattitude(), eldLogData.get(i).getLongitude(), lastLat, lastLng);
                        long timeDiff = (eldLogData.get(i).getUtcDateTime() - lastTimeStamp) / 1000L;
                        if (KM / 1000.0 <= 5.0 && timeDiff <= 600L) {
                            totalKm += KM / 1000.0;
                        }
                    }

                    lastLat = eldLogData.get(i).getLattitude();
                    lastLng = eldLogData.get(i).getLongitude();
                    lastTimeStamp = eldLogData.get(i).getUtcDateTime();
                    lastDriverId = Long.parseLong(eldLogData.get(i).getDriverId());
                    endPlaceAddress = eldLogData.get(i).getPlaceAddress();
                    lastOdometer = (double) Math.round(Double.parseDouble(eldLogData.get(i).getOdometer()));
                }
            }

            IftaSummaryReport var55 = new IftaSummaryReport();
            var55.setCarrierName("Road Liner Logistics Inc");
            var55.setFromDate(startUtcDateTime);
            var55.setToDate(lastTimeStamp);

            try {
                VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) vehicleId);
                var55.setVehicleNo(vehcileInfo.getVehicleNo());
                var55.setVehicleId(String.valueOf(vehicleId));
                var55.setMake(vehcileInfo.getMake());
                var55.setModel(vehcileInfo.getModel());
                var55.setManufacturingYear(vehcileInfo.getManufacturingYear());
            } catch (Exception var50) {
                var50.printStackTrace();
                var55.setVehicleNo("");
                var55.setVehicleId("0");
                var55.setMake("");
                var55.setModel("");
                var55.setManufacturingYear(0L);
            }

            try {
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) lastDriverId);
                var55.setDriverId(String.valueOf(lastDriverId));
                var55.setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
            } catch (Exception var49) {
                var49.printStackTrace();
                var55.setDriverId("0");
                var55.setDriverName("");
            }

            var55.setFromPlaceAddress(startPlaceAddress);
            var55.setToPlaceAddress(endPlaceAddress);

            try {
                StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) startStateId);
                var55.setFromStateName(stateInfo.getStateName());
                var55.setFromStateCode(stateInfo.getStateCode());
                stateInfo = this.stateMasterRepo.findByStateId((int) lastStateId);
                var55.setToStateName(stateInfo.getStateName());
                var55.setToStateCode(stateInfo.getStateCode());
            } catch (Exception var48) {
                var48.printStackTrace();
                var55.setFromStateName("");
                var55.setFromStateCode("");
                var55.setToStateName("");
                var55.setToStateCode("");
            }

            var55.setFirstOdometer(firstOdometer);
            double odometer = (double) Math.round(lastOdometer * 0.62137119);
            var55.setLastOdometer(odometer);
            if (lastOdometer >= firstOdometer) {
                var55.setOdometerMileage(odometer - firstOdometer);
            } else {
                var55.setOdometerMileage(0.0);
            }

            double TOTAL_KM = totalKm * 0.62137119;
            var55.setGpsMileage((double) Math.round(TOTAL_KM));
            iftaSummaryReport.add(var55);
            iCount = 0L;
            totalKm = 0.0;
            result.setResult(iftaSummaryReport);
            result.setStatus(Result.SUCCESS);
            result.setMessage("IFTA Summary Report Information Send Successfully");
        } catch (Exception var54) {
            result.setStatus(Result.FAIL);
            result.setMessage(var54.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<DVIRDataCRUDDto> AddDVIRData(List<MultipartFile> file, DVIRData dvirData, String tokenValid) {
        ResultWrapper<DVIRDataCRUDDto> result = new ResultWrapper<>();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = LocalDateTime.parse(dvirData.getDateTime(), formatter);
            long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            DVIRDataCRUDDto dvirDataViewDto = null;
            if (tokenValid.equals("true")) {
                dvirData.setLDateTime(lDateTime);
                Instant instant = Instant.now();
                dvirData.setReceivedTimestamp(instant.toEpochMilli());
                this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/dvir").toAbsolutePath().normalize();

                try {
                    if (Files.notExists(this.fileStorageLocation)) {
                        Files.createDirectories(this.fileStorageLocation);
                    }
                } catch (Exception var20) {
                    throw new Exception("Could not create the directory where the uploaded files will be stored.", var20);
                }

                int iCount = 0;

                for (MultipartFile mf : file) {
                    ++iCount;
                    String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                    String fileName = "";

                    try {
                        if (originalFileName.contains("..")) {
                            throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                        }

                        String fileExtension = "";

                        try {
                            fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                        } catch (Exception var18) {
                            fileExtension = "";
                        }

                        if (iCount == 1) {
                            if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                                fileName = dvirData.getDriverId() + "_sign_" + iCount + fileExtension;
                                Path targetLocation = this.fileStorageLocation.resolve(fileName);
                                Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                                dvirData.setDriverSignFile(fileName);
                            } else {
                                dvirData.setDriverSignFile("");
                            }
                        }
                    } catch (IOException var19) {
                        throw new Exception("Could not store file " + fileName + ". Please try again!", var19);
                    }
                }

                dvirData = (DVIRData) this.dvirDataRepo.save(dvirData);
                dvirDataViewDto = this.dvirDataRepo.findAndViewDvirDataByDriverId(dvirData.getDriverId(), dvirData.getLDateTime());
                result.setResult(dvirDataViewDto);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("DVIR Data Added Successfully");
            } else {
                result.setResult(null);
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Your Token has been expired.");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddDVIRDataImage(List<MultipartFile> file) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/dvir").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var12) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var12);
            }

            int iCount = 0;

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                String fileName = originalFileName;

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    String fileExtension = "";

                    try {
                        fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                    } catch (Exception var10) {
                        fileExtension = "";
                    }

                    if (iCount == 1 && !mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                        Path targetLocation = this.fileStorageLocation.resolve(fileName);
                        Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException var11) {
                    throw new Exception("Could not store file " + originalFileName + ". Please try again!", var11);
                }
            }

            result.setResult("SAved");
            result.setStatus(Result.SUCCESS);
            result.setMessage("DVIR Data Image Added Successfully");
        } catch (Exception var13) {
            result.setStatus(Result.FAIL);
            result.setMessage(var13.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<AddDriveringStatusResponseDto>> AddDVIRDataOffline(AddDvirDataDto addDvirDataDto, String tokenValid) {
        ResultWrapper<List<AddDriveringStatusResponseDto>> result = new ResultWrapper<>();
        String sDebug = ">> ";

        try {
            Instant instant = Instant.now();
            List<AddDriveringStatusResponseDto> AddDvirStatusData = new ArrayList<>();
            new AddDriveringStatusResponseDto();
            ArrayList<DVIRData> dvirStatusData = addDvirDataDto.getDvirStatusData();
            DVIRData dvirData = null;
            sDebug = sDebug + "1,";

            for (int i = 0; i < dvirStatusData.size(); ++i) {
                sDebug = sDebug + "2,";
                dvirData = dvirStatusData.get(i);
                sDebug = sDebug + "3,";
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime ldtDateTime = LocalDateTime.parse(dvirData.getDateTime(), formatter);
                long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                sDebug = sDebug + "4,";
                dvirData.setLDateTime(lDateTime);
                dvirData.setReceivedTimestamp(instant.toEpochMilli());
                dvirData = (DVIRData) this.dvirDataRepo.save(dvirData);
                sDebug = sDebug + "5,";
                DVIRDataCRUDDto dvirDataVewDto = this.dvirDataRepo.findAndViewDvirDataByDriverId(dvirData.getDriverId(), dvirData.getLDateTime());
                String objId = dvirDataVewDto.get_id();
                sDebug = sDebug + "6,";
                AddDriveringStatusResponseDto addDvirStatus = new AddDriveringStatusResponseDto();
                addDvirStatus.setLocalId(dvirData.getLocalId());
                addDvirStatus.setServerId(objId);
                AddDvirStatusData.add(addDvirStatus);
            }

            result.setResult(AddDvirStatusData);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("DVIR Data Added Successfully");
        } catch (Exception var17) {
            result.setStatus(Result.FAIL);
            result.setMessage(var17.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<AddDriveringStatusResponseDto>> AddDefectDataOffline(List<MultipartFile> file, AddDvirDataDto addDvirDataDto, String tokenValid) {
        ResultWrapper<List<AddDriveringStatusResponseDto>> result = new ResultWrapper<>();
        String sDebug = ">> ";

        try {
            Instant instant = Instant.now();
            List<AddDriveringStatusResponseDto> AddDefectData = new ArrayList<>();
            new AddDriveringStatusResponseDto();
            ArrayList<DefectDetails> defectDetailData = addDvirDataDto.getDefectData();
            DefectDetails defectDetails = null;
            sDebug = sDebug + "1,";
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/defects").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var23) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var23);
            }

            for (int i = 0; i < defectDetailData.size(); ++i) {
                sDebug = sDebug + "2,";
                defectDetails = defectDetailData.get(i);
                sDebug = sDebug + "3,";
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime ldtDateTime = LocalDateTime.parse(defectDetails.getDateTime(), formatter);
                long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                sDebug = sDebug + "4,";
                defectDetails.setLDateTime(lDateTime);
                defectDetails.setReceivedTimestamp(instant.toEpochMilli());
                if (file != null && i < file.size()) {
                    MultipartFile mf = (MultipartFile) file.get(i);
                    String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                    String fileName = originalFileName;

                    try {
                        if (originalFileName.contains("..")) {
                            throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                        }

                        String fileExtension = "";

                        try {
                            fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                        } catch (Exception var21) {
                            fileExtension = "";
                        }

                        fileName = "defect_" + defectDetails.getDvirId() + "_" + defectDetails.getDriverId() + "_" + defectDetails.getUtcDateTime() + fileExtension;
                        if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                            Path targetLocation = this.fileStorageLocation.resolve(fileName);
                            Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                            defectDetails.setFileName(fileName);
                        }
                    } catch (IOException var22) {
                        throw new Exception("Could not store file " + fileName + ". Please try again!", var22);
                    }
                }

                defectDetails = (DefectDetails) this.defectDetailsRepo.save(defectDetails);
                sDebug = sDebug + "5,";
                DefectDetailCRUDDto defetctDataViewDto = this.defectDetailsRepo
                        .findAndViewDefectDataByDriverId(defectDetails.getDriverId(), defectDetails.getLDateTime());
                String objId = defetctDataViewDto.get_id();
                sDebug = sDebug + "6,";
                AddDriveringStatusResponseDto addDefectDetail = new AddDriveringStatusResponseDto();
                addDefectDetail.setLocalId(defectDetails.getLocalId());
                addDefectDetail.setServerId(objId);
                AddDefectData.add(addDefectDetail);
            }

            result.setResult(AddDefectData);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Defect Data Added Successfully");
        } catch (Exception var24) {
            result.setStatus(Result.FAIL);
            result.setMessage(var24.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<AddDriveringStatusResponseDto>> AddDefectData(MultipartFile mf, DefectDetails defectDetails, String tokenValid) {
        ResultWrapper<List<AddDriveringStatusResponseDto>> result = new ResultWrapper<>();
        String sDebug = ">> ";

        try {
            Instant instant = Instant.now();
            List<AddDriveringStatusResponseDto> AddDefectData = new ArrayList<>();
            new AddDriveringStatusResponseDto();
            sDebug = sDebug + "1,";
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/defects").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var18) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var18);
            }

            sDebug = sDebug + "2,";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = LocalDateTime.parse(defectDetails.getDateTime(), formatter);
            long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sDebug = sDebug + "4,";
            defectDetails.setLDateTime(lDateTime);
            defectDetails.setReceivedTimestamp(instant.toEpochMilli());
            String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
            String fileName = originalFileName;

            try {
                if (originalFileName.contains("..")) {
                    throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                }

                String fileExtension = "";

                try {
                    fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                } catch (Exception var17) {
                    fileExtension = "";
                }

                fileName = "defect_" + defectDetails.getDvirId() + "_" + defectDetails.getDriverId() + "_" + defectDetails.getUtcDateTime() + fileExtension;
                if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                    Path targetLocation = this.fileStorageLocation.resolve(fileName);
                    Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                    defectDetails.setFileName(fileName);
                }
            } catch (IOException var19) {
                throw new Exception("Could not store file " + fileName + ". Please try again!", var19);
            }

            defectDetails = (DefectDetails) this.defectDetailsRepo.save(defectDetails);
            sDebug = sDebug + "5,";
            DefectDetailCRUDDto defetctDataViewDto = this.defectDetailsRepo
                    .findAndViewDefectDataByDriverId(defectDetails.getDriverId(), defectDetails.getLDateTime());
            String objId = defetctDataViewDto.get_id();
            sDebug = sDebug + "6,";
            AddDriveringStatusResponseDto addDefectDetail = new AddDriveringStatusResponseDto();
            addDefectDetail.setLocalId(defectDetails.getLocalId());
            addDefectDetail.setServerId(objId);
            AddDefectData.add(addDefectDetail);
            result.setResult(AddDefectData);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Defect Data Added Successfully");
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DVIRDataCRUDDto>> ViewDVIRData(DVIRDataCRUDDto dvirDataCRUDDto, String tokenValid) {
        ResultWrapper<List<DVIRDataCRUDDto>> result = new ResultWrapper<>();
        String sDebug = " >> ";

        try {
            List<DVIRDataCRUDDto> dvirDataViewDto = null;
            long driverId = dvirDataCRUDDto.getDriverId();
            String email = dvirDataCRUDDto.getEmail();
            String fromDate = dvirDataCRUDDto.getFromDate();
            String toDate = dvirDataCRUDDto.getToDate();
            long clientId = dvirDataCRUDDto.getClientId();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            DecimalFormat df = new DecimalFormat("0.00");
            String driverName = "";
            String url = "http://admin.gbt-usa.com/uploads/dvir/";
            if (driverId > 0L) {
                dvirDataViewDto = this.lookupDVIRDataByClientOperation(from, to, driverId, clientId);

                for (int i = 0; i < dvirDataViewDto.size(); ++i) {
                    sDebug = sDebug + " 1,";

                    try {
                        dvirDataViewDto.get(i).setOdometer(Double.valueOf(String.format("%.2f", dvirDataViewDto.get(i).getOdometer())));
                        dvirDataViewDto.get(i).setEngineHour(df.format(Double.parseDouble(dvirDataViewDto.get(i).getEngineHour())));
                    } catch (Exception var40) {
                        var40.printStackTrace();
                    }

                    sDebug = sDebug + " 2,";
                    String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
                    dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
                    sDebug = sDebug + " 3,";
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    dvirDataViewDto.get(i).setDriverName(driverName);
                    sDebug = sDebug + " 4,";

                    try {
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        if (mainTerminal.getStateId() > 0L) {
                            StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                            dvirDataViewDto.get(i).setTimezoneName(stateInfo.getTimeZone());
                            dvirDataViewDto.get(i).setTimezoneOffSet(stateInfo.getTimezoneOffSet());
                        }

                        sDebug = sDebug + " 5,";
                        if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) dvirDataViewDto.get(i).getVehicleId());
                            dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                            dvirDataViewDto.get(i).setVin(vehcileInfo.getVin());
                        }

                        sDebug = sDebug + " 6,";
                    } catch (Exception var39) {
                        var39.printStackTrace();
                    }
                }

                sDebug = sDebug + " 7,";
                if (email != null && !email.trim().isEmpty()) {
                    sDebug = sDebug + " 8,";

                    for (Map<String, Object> valueMap : this.dispatchServiceImpl.callReportCreateMethods(driverId, from, to, "dvir_log", driverName)) {
                        System.out.println(">>>SendEmail: [" + valueMap.size() + "]" + LocalDateTime.now());
                        if (valueMap.size() > 0) {
                            sDebug = sDebug + " 9,";
                            ByteArrayOutputStream outputStream = (ByteArrayOutputStream) valueMap.get("outputStream");
                            String fileName = valueMap.get("fileName").toString();
                            System.out.println(">>ReportName-" + fileName + "----------------------" + LocalDateTime.now());
                            String subject = valueMap.get("subject").toString();
                            String text = valueMap.get("text").toString();
                            sDebug = sDebug + " 10,";
                            MimeBodyPart textBodyPart = new MimeBodyPart();
                            textBodyPart.setText(text);
                            byte[] bytes = outputStream.toByteArray();
                            DataSource dataSource = null;
                            sDebug = sDebug + " 11,";
                            if (fileName.contains("pdf")) {
                                dataSource = new ByteArrayDataSource(bytes, "application/pdf");
                            } else if (fileName.contains("xlsx")) {
                                dataSource = new ByteArrayDataSource(bytes, "application/vnd.ms-excel");
                            }

                            sDebug = sDebug + " 12,";
                            MimeBodyPart fileBodyPart = new MimeBodyPart();
                            fileBodyPart.setDataHandler(new DataHandler(dataSource));
                            fileBodyPart.setFileName(fileName);
                            MimeMultipart mimeMultipart = new MimeMultipart();
                            mimeMultipart.addBodyPart(textBodyPart);
                            mimeMultipart.addBodyPart(fileBodyPart);
                            sDebug = sDebug + " 13,";
                            MimeMessage message = this.javaMailSender.createMimeMessage();
                            MimeMessageHelper helper = new MimeMessageHelper(message);
                            helper.setTo(email);
                            helper.setSubject(subject);
                            message.setContent(mimeMultipart);
                            sDebug = sDebug + " 14,";
                            this.javaMailSender.send(message);
                        }
                    }

                    sDebug = sDebug + " 15,";
                }

                sDebug = sDebug + " 16,";
            } else {
                dvirDataViewDto = this.lookupDVIRDataByClientOperation(from, to, driverId, clientId);

                for (int i = 0; i < dvirDataViewDto.size(); ++i) {
                    String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
                    dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) dvirDataViewDto.get(i).getDriverId());
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    dvirDataViewDto.get(i).setDriverName(driverName);

                    try {
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        if (mainTerminal.getStateId() > 0L) {
                            StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                            dvirDataViewDto.get(i).setTimezoneName(stateInfo.getTimeZone());
                            dvirDataViewDto.get(i).setTimezoneOffSet(stateInfo.getTimezoneOffSet());
                        }

                        if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) dvirDataViewDto.get(i).getVehicleId());
                            dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                            dvirDataViewDto.get(i).setVin(vehcileInfo.getVin());
                        }
                    } catch (Exception var38) {
                        var38.printStackTrace();
                    }
                }

                if (email != null && !email.trim().isEmpty()) {
                    for (Map<String, Object> valueMap : this.dispatchServiceImpl.callReportCreateMethods(driverId, from, to, "dvir_log", driverName)) {
                        System.out.println(">>>SendEmail: [" + valueMap.size() + "]" + LocalDateTime.now());
                        if (valueMap.size() > 0) {
                            ByteArrayOutputStream outputStream = (ByteArrayOutputStream) valueMap.get("outputStream");
                            String fileName = valueMap.get("fileName").toString();
                            System.out.println(">>ReportName-" + fileName + "----------------------" + LocalDateTime.now());
                            String subject = valueMap.get("subject").toString();
                            String text = valueMap.get("text").toString();
                            MimeBodyPart textBodyPart = new MimeBodyPart();
                            textBodyPart.setText(text);
                            byte[] bytes = outputStream.toByteArray();
                            DataSource dataSource = null;
                            if (fileName.contains("pdf")) {
                                dataSource = new ByteArrayDataSource(bytes, "application/pdf");
                            } else if (fileName.contains("xlsx")) {
                                dataSource = new ByteArrayDataSource(bytes, "application/vnd.ms-excel");
                            }

                            MimeBodyPart fileBodyPart = new MimeBodyPart();
                            fileBodyPart.setDataHandler(new DataHandler(dataSource));
                            fileBodyPart.setFileName(fileName);
                            MimeMultipart mimeMultipart = new MimeMultipart();
                            mimeMultipart.addBodyPart(textBodyPart);
                            mimeMultipart.addBodyPart(fileBodyPart);
                            MimeMessage message = this.javaMailSender.createMimeMessage();
                            MimeMessageHelper helper = new MimeMessageHelper(message);
                            helper.setTo(email);
                            helper.setSubject(subject);
                            message.setContent(mimeMultipart);
                            this.javaMailSender.send(message);
                        }
                    }
                }
            }

            result.setResult(dvirDataViewDto);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("DVIR Data Information Send Successfully" + sDebug);
        } catch (Exception var41) {
            result.setStatus(Result.FAIL);
            result.setMessage(var41.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DownloadDVIRData(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            long driverId = dvirDataCRUDDto.getDriverId();
            String fromDate = dvirDataCRUDDto.getFromDate();
            String toDate = dvirDataCRUDDto.getToDate();
            long clientId = dvirDataCRUDDto.getClientId();
            String email = dvirDataCRUDDto.getEmail();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            new DecimalFormat("0.00");
            String filePath = "";
            String fileName = "";
            String driverName = "";
            String url = "http://admin.gbt-usa.com/uploads/dvir/";
            if (driverId > 0L) {
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                driverName = empInfo.getFirstName() + " " + empInfo.getLastName();

                for (Map<String, Object> valueMap : this.dispatchServiceImpl.callReportCreateMethods(driverId, from, to, "dvir_log", driverName)) {
                    if (valueMap.size() > 0) {
                        ByteArrayOutputStream outputStream = (ByteArrayOutputStream) valueMap.get("outputStream");
                        fileName = valueMap.get("fileName").toString();
                        byte[] bytes = outputStream.toByteArray();
                        String basePath = "/opt/tomcat/webapps/uploads/dvir_report/";
                        File folder = new File(basePath);
                        if (!folder.exists()) {
                            folder.mkdirs();
                        }

                        filePath = basePath + driverId + "_" + fileName;

                        try (FileOutputStream fos = new FileOutputStream(filePath)) {
                            fos.write(bytes);
                            fos.flush();
                        }
                    }
                }

                String fileUrl = "http://admin.gbt-usa.com/uploads/dvir_report/" + driverId + "_" + fileName;
                result.setResult(fileUrl);
                result.setStatus(Result.SUCCESS);
                result.setMessage("DVIR Report Download Successfully");
            } else {
                result.setResult("Error");
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid driver.");
            }
        } catch (Exception var36) {
            result.setStatus(Result.FAIL);
            result.setMessage(var36.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DownloadDVIRDataEncript(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = dvirDataCRUDDto.getDriverId();
            String fromDate = dvirDataCRUDDto.getFromDate();
            String toDate = dvirDataCRUDDto.getToDate();
            long clientId = dvirDataCRUDDto.getClientId();
            String email = dvirDataCRUDDto.getEmail();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String filePath = "";
            String fileName = "";
            String driverName = "";
            if (driverId > 0L) {
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                driverName = empInfo.getFirstName() + " " + empInfo.getLastName();

                for (Map<String, Object> valueMap : this.dispatchServiceImpl.callReportCreateMethods(driverId, from, to, "dvir_log", driverName)) {
                    if (valueMap.size() > 0) {
                        ByteArrayOutputStream outputStream = (ByteArrayOutputStream) valueMap.get("outputStream");
                        fileName = valueMap.get("fileName").toString();
                        byte[] bytes = outputStream.toByteArray();
                        sDebug = sDebug + "Size : " + bytes.length + ",";
                        String basePath = "/opt/tomcat/webapps/uploads/dvir_report/";
                        File folder = new File(basePath);
                        if (!folder.exists()) {
                            folder.mkdirs();
                        }

                        filePath = basePath + driverId + "_" + fileName;

                        try (FileOutputStream fos = new FileOutputStream(filePath)) {
                            fos.write(bytes);
                            fos.flush();
                        }
                    }
                }

                String fileUrl = "http://admin.gbt-usa.com/uploads/dvir_report/" + driverId + "_" + fileName;
                result.setResult(fileUrl);
                result.setStatus(Result.SUCCESS);
                result.setMessage("DVIR Report Download Successfully" + sDebug);
                if (email != null && !email.isEmpty()) {
                    String subject = driverName + " DVIR Report";
                    String htmlBody = "<div style='text-align:center;font-family:Arial,sans-serif;'><h3>"
                            + driverName
                            + " sent DVIR Report</h3><p>"
                            + fromDate
                            + " - "
                            + toDate
                            + "</p><div style='margin:20px 0;'>  <a href='"
                            + fileUrl
                            + "'      style='display:inline-block;padding:12px 24px;     background:#28a745;color:#fff;font-size:14px;     text-decoration:none;border-radius:5px;     font-weight:bold;'>     DOWNLOAD DVIR REPORT</a></div><p style='color:#666;font-size:12px;'>This is an automated message, please do not reply.</p></div>";
                    this.sendEmail(email, subject, htmlBody);
                }
            } else {
                result.setResult("Error");
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid driver." + sDebug);
            }
        } catch (Exception var34) {
            result.setStatus(Result.FAIL);
            result.setMessage(var34.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    private byte[] encryptPdf(byte[] pdfBytes, String userPassword, String ownerPassword) throws Exception {
        if (pdfBytes != null && pdfBytes.length != 0) {
            if (userPassword == null) {
                userPassword = "";
            }

            if (ownerPassword == null) {
                ownerPassword = "";
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfReader reader = null;

            byte[] var6;
            try {
                this.SaveLog("byte size : " + pdfBytes.length + ",\n");
                reader = new PdfReader(pdfBytes);
                this.SaveLog("1,");
                PdfEncryptor.encrypt(reader, baos, userPassword.getBytes("UTF-8"), ownerPassword.getBytes("UTF-8"), 2052, true);
                this.SaveLog("2,");
                var6 = baos.toByteArray();
            } finally {
                if (reader != null) {
                    reader.close();
                }

                baos.close();
            }

            return var6;
        } else {
            throw new IllegalArgumentException("Empty PDF content, cannot encrypt.");
        }
    }

    public void sendEmail(String to, String subject, String htmlBody) throws MessagingException {
        MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlBody, true);
        this.javaMailSender.send(message);
    }

    @Override
    public ResultWrapper<EldReportDto> ELDReportEncrypt(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<EldReportDto> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            EldReportDto.EldHeader header = new EldReportDto.EldHeader();
            header.setEldIdentifier("INURUMPT30");
            header.setEldProvider("Inurum Technologies");
            header.setEldSoftwareVersion("1.0.0");
            header.setOutputFileFormat("JSON");
            header.setFileGeneratedTime("2025-09-19T14:00:00Z");
            header.setFileSignature("MIIByzYh3k...base64signature...");
            EldReportDto.Carrier carrier = new EldReportDto.Carrier();
            carrier.setCarrierName("ABC Trucking LLC");
            carrier.setUsdotNumber("1234567");
            carrier.setHomeTerminal("Dallas, TX");
            EldReportDto.Driver driver = new EldReportDto.Driver();
            driver.setDriverId("DRV1001");
            driver.setDriverName("John Doe");
            driver.setLicenseNumber("TX123456");
            driver.setLicenseState("TX");
            EldReportDto.Vehicle vehicle = new EldReportDto.Vehicle();
            vehicle.setUnitNumber("TRUCK-101");
            vehicle.setVin("1XPBDP9X5JD123456");
            vehicle.setOdometerStart("0");
            vehicle.setOdometerEnd("0");
            EldReportDto.EventRecord ev1 = new EldReportDto.EventRecord();
            ev1.setEventCode("YM");
            ev1.setEventDescription("Yard Move");
            ev1.setEventTime("2025-09-19T09:30:00Z");
            ev1.setLocation("Dallas Yard, TX");
            ev1.setOdometer("0");
            ev1.setEngineHours("0");
            EldReportDto.EventRecord ev2 = new EldReportDto.EventRecord();
            ev2.setEventCode("OFF");
            ev2.setEventDescription("Off Duty");
            ev2.setEventTime("2025-09-19T13:30:00Z");
            ev2.setLocation("Dallas, TX");
            ev2.setOdometer("0");
            ev2.setEngineHours("0");
            EldReportDto.Annotation ann = new EldReportDto.Annotation();
            ann.setEventRef("ON-2025-09-19T08:00:00Z");
            ann.setNote("Pre-trip inspection completed.");
            EldReportDto report = new EldReportDto();
            report.setEldHeader(header);
            report.setCarrier(carrier);
            report.setDriver(driver);
            report.setVehicle(vehicle);
            report.setEventRecords(Arrays.asList(ev1, ev2));
            report.setAnnotations(Arrays.asList(ann));
            report.setMalfunctions(Collections.emptyList());
            report.setDiagnostics(Collections.emptyList());
            result.setResult(report);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Information Send Successfully." + sDebug);
        } catch (Exception var12) {
            result.setStatus(Result.FAIL);
            result.setMessage(var12.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<AlertsLogViewDto>> ViewAlerts(AlertsLogViewDto alertsLogViewDto) {
        ResultWrapper<List<AlertsLogViewDto>> result = new ResultWrapper<>();

        try {
            List<AlertsLogViewDto> alertsLogViewDtoData = null;
            long clientId = alertsLogViewDto.getClientId();
            String driverName = "";
            if (clientId > 0L) {
                alertsLogViewDtoData = this.alertsLogRepo.findAndViewAllUnreadAlerts(clientId, 0);

                for (int i = 0; i < alertsLogViewDtoData.size(); ++i) {
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) alertsLogViewDtoData.get(i).getDriverId());
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    alertsLogViewDtoData.get(i).setDriverName(driverName);

                    try {
                        if (alertsLogViewDtoData.get(i).getVehicleId() > 0L) {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) alertsLogViewDtoData.get(i).getVehicleId());
                            alertsLogViewDtoData.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                        }
                    } catch (Exception var10) {
                        var10.printStackTrace();
                    }
                }

                result.setResult(alertsLogViewDtoData);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Alerts Data Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var11) {
            result.setStatus(Result.FAIL);
            result.setMessage(var11.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateAlerts(AlertsLogViewDto alertsLogViewDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            String readByEmail = alertsLogViewDto.getReadByEmail();
            String driverName = "";
            if (!readByEmail.equals("")) {
                Query query = new Query();
                query.addCriteria(Criteria.where("driverId").is(alertsLogViewDto.getDriverId()).and("startUtcDateTime").is(alertsLogViewDto.getStartUtcDateTime()));
                Update update = new Update();
                update.set("readByEmail", readByEmail);
                update.set("isRead", 1);
                update.set("readingTimestamp", instant.toEpochMilli());
                this.mongoTemplate.findAndModify(query, update, AlertsLog.class);
                result.setResult("Updated");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Alerts Data Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var8) {
            result.setStatus(Result.FAIL);
            result.setMessage(var8.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateAllUnreadAlerts(AlertsLogViewDto alertsLogViewDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Instant instant = Instant.now();
            long clientId = alertsLogViewDto.getClientId();
            String readByEmail = alertsLogViewDto.getReadByEmail();
            new Query();
            new Update();
            if (clientId > 0L) {
                List<AlertsLogViewDto> alertsLogViewDtoData = this.alertsLogRepo.findAndViewAllUnreadAlerts(clientId, 0);

                for (int i = 0; i < alertsLogViewDtoData.size(); ++i) {
                    Query query = new Query();
                    query.addCriteria(
                            Criteria.where("driverId")
                                    .is(alertsLogViewDtoData.get(i).getDriverId())
                                    .and("startUtcDateTime")
                                    .is(alertsLogViewDtoData.get(i).getStartUtcDateTime())
                    );
                    Update update = new Update();
                    update.set("readByEmail", readByEmail);
                    update.set("isRead", 1);
                    update.set("readingTimestamp", instant.toEpochMilli());
                    this.mongoTemplate.findAndModify(query, update, AlertsLog.class);
                }

                result.setResult("Updated");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Alerts Data Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var11) {
            result.setStatus(Result.FAIL);
            result.setMessage(var11.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<DVIRDataCRUDDto>> ViewDVIRDataByTimestamp(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<List<DVIRDataCRUDDto>> result = new ResultWrapper<>();

        try {
            List<DVIRDataCRUDDto> dvirDataViewDto = null;
            String timestamp = dvirDataCRUDDto.getTimestamp();
            DecimalFormat df = new DecimalFormat("0.00");
            String driverName = "";
            String url = "http://admin.gbt-usa.com/uploads/dvir/";
            String defectUrl = "http://admin.gbt-usa.com/uploads/defects/";
            if (!timestamp.equals("")) {
                dvirDataViewDto = this.lookupDVIRDataByTimestampOperation(timestamp);

                for (int i = 0; i < dvirDataViewDto.size(); ++i) {
                    try {
                        dvirDataViewDto.get(i).setOdometer(Double.valueOf(String.format("%.2f", dvirDataViewDto.get(i).getOdometer())));
                        dvirDataViewDto.get(i).setEngineHour(df.format(Double.parseDouble(dvirDataViewDto.get(i).getEngineHour())));
                    } catch (Exception var19) {
                        var19.printStackTrace();
                    }

                    String setImagePath1 = url.concat(dvirDataViewDto.get(i).getDriverSignFile());
                    dvirDataViewDto.get(i).setDriverSignFile(setImagePath1);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) dvirDataViewDto.get(i).getDriverId());
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    dvirDataViewDto.get(i).setDriverName(driverName);
                    ArrayList<String> sTruckDefectImage = new ArrayList<>();
                    ArrayList<String> sTrailerDefectImage = new ArrayList<>();
                    List<DefectDetailCRUDDto> defectDetailCRUDDto = this.defectDetailsRepo.findAndViewDefectDataByDvirId(dvirDataViewDto.get(i).get_id());

                    for (int d = 0; d < defectDetailCRUDDto.size(); ++d) {
                        if (defectDetailCRUDDto.get(d).getDefectType().equals("Truck")) {
                            String setImagePath2 = defectUrl.concat(defectDetailCRUDDto.get(d).getFileName());
                            sTruckDefectImage.add(setImagePath2);
                        } else {
                            String setImagePath2 = defectUrl.concat(defectDetailCRUDDto.get(d).getFileName());
                            sTrailerDefectImage.add(setImagePath2);
                        }
                    }

                    dvirDataViewDto.get(i).setTruckDefectImage(sTruckDefectImage);
                    dvirDataViewDto.get(i).setTrailerDefectImage(sTrailerDefectImage);

                    try {
                        MainTerminalMaster mainTerminal = this.mainTerminalMasterRepo.findByMainTerminalId((int) empInfo.getMainTerminalId());
                        if (mainTerminal.getStateId() > 0L) {
                            StateMaster stateInfo = this.stateMasterRepo.findByStateId((int) mainTerminal.getStateId());
                            dvirDataViewDto.get(i).setTimezoneName(stateInfo.getTimeZone());
                            dvirDataViewDto.get(i).setTimezoneOffSet(stateInfo.getTimezoneOffSet());
                        }

                        if (dvirDataViewDto.get(i).getVehicleId() > 0L) {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) dvirDataViewDto.get(i).getVehicleId());
                            dvirDataViewDto.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                            dvirDataViewDto.get(i).setVin(vehcileInfo.getVin());
                        }
                    } catch (Exception var18) {
                        var18.printStackTrace();
                    }
                }

                result.setResult(dvirDataViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("DVIR Data Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DeleteDvir(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            String timestamp = dvirDataCRUDDto.getTimestamp();
            long driverId = dvirDataCRUDDto.getDriverId();
            String defectUrl = "http://admin.gbt-usa.com/uploads/defects/";
            if (!timestamp.equals("")) {
                DVIRDataCRUDDto deleteDvir = this.dvirDataRepo.deleteDVIRDataByDriverIdAndTimestamp(driverId, timestamp);
                if (deleteDvir != null) {
                    String dvirId = deleteDvir.get_id();

                    for (DefectDetailCRUDDto defect : this.defectDetailsRepo.findAndViewDefectDataByDvirId(dvirId)) {
                        if (defect.getFileName() != null && !defect.getFileName().trim().isEmpty()) {
                            String filePath = defectUrl + defect.getFileName();
                            File file = new File(filePath);
                            if (file.exists()) {
                                boolean deleted = file.delete();
                                if (!deleted) {
                                }
                            }
                        }
                    }

                    this.defectDetailsRepo.DeleteAllDVIRDataByDriverIdAndDate(deleteDvir.get_id());
                    result.setResult("Deleted");
                    result.setStatus(Result.SUCCESS);
                    result.setMessage("DVIR Data Information Deleted Successfully");
                } else {
                    result.setResult("Not Found");
                    result.setStatus(Result.FAIL);
                    result.setMessage("No DVIR found for given timestamp.");
                }
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var15) {
            result.setStatus(Result.FAIL);
            result.setMessage(var15.getLocalizedMessage());
        }

        return result;
    }

    public List<DVIRDataCRUDDto> lookupDVIRDataByTimestampOperation(String timestamp) {
        MatchOperation filter = Aggregation.match(Criteria.where("timestamp").is(timestamp));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "_id",
                    "driverId",
                    "location",
                    "truckDefect",
                    "trailerDefect",
                    "trailer",
                    "dateTime",
                    "lDateTime",
                    "notes",
                    "vehicleCondition",
                    "driverSignFile",
                    "receivedTimestamp",
                    "engineHour",
                    "odometer",
                    "companyName",
                    "vehicleId",
                    "timestamp"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "dvir_data", DVIRDataCRUDDto.class).getMappedResults();
    }

    public List<DVIRDataCRUDDto> lookupDVIRDataOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("driverId").is(driverId));
        } else {
            filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "_id",
                    "driverId",
                    "location",
                    "truckDefect",
                    "trailerDefect",
                    "trailer",
                    "dateTime",
                    "lDateTime",
                    "notes",
                    "vehicleCondition",
                    "driverSignFile",
                    "receivedTimestamp",
                    "engineHour",
                    "odometer",
                    "companyName",
                    "vehicleId",
                    "timestamp"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{
                    filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"driverId"}).and(Direction.DESC, new String[]{"receivedTimestamp"})
                }
        );
        return this.mongoTemplate.aggregate(aggregation, "dvir_data", DVIRDataCRUDDto.class).getMappedResults();
    }

    public List<DVIRDataCRUDDto> lookupDVIRDataByClientOperation(long from, long to, long driverId, long clientId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("driverId").is(driverId).and("clientId").is(clientId));
        } else {
            filter = Aggregation.match(Criteria.where("lDateTime").gte(from).lte(to).and("clientId").is(clientId));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "_id",
                    "driverId",
                    "location",
                    "truckDefect",
                    "trailerDefect",
                    "trailer",
                    "dateTime",
                    "lDateTime",
                    "notes",
                    "vehicleCondition",
                    "driverSignFile",
                    "receivedTimestamp",
                    "engineHour",
                    "odometer",
                    "companyName",
                    "vehicleId",
                    "timestamp"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{
                    filter, projectStage, Aggregation.sort(Direction.ASC, new String[]{"driverId"}).and(Direction.DESC, new String[]{"receivedTimestamp"})
                }
        );
        return this.mongoTemplate.aggregate(aggregation, "dvir_data", DVIRDataCRUDDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<String> DeleteAllDriverStatusById(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            long driverId = dvirDataCRUDDto.getDriverId();
            if (driverId > 0L) {
                Integer driverStatusCount = this.driveringStatusRepo.CountDriverStatusByDriverId(driverId);
                Integer dvirCount = this.dvirDataRepo.CountDVIRByDriverId(driverId);
                Integer certifiedLogCount = this.certifiedLogRepo.CountCertifiedLogByDriverId(driverId);
                Integer loginLogCount = this.loginLogRepo.CountLoginByDriverId((int) driverId);
                Integer dsLogCount = this.driverStatusLogRepo.CountDriverStatusLogByDriverId((long) ((int) driverId));
                this.splitLogRepo.deleteAllSplitLogByDriverId(driverId);

                for (int i = 0; i < dsLogCount; ++i) {
                    this.driverStatusLogRepo.deleteAllDriveringStatusLogByDriverId(driverId);
                }

                for (int i = 0; i < driverStatusCount; ++i) {
                    this.driveringStatusRepo.deleteAllDriveringStatusByDriverId(driverId);
                }

                for (int i = 0; i < dvirCount; ++i) {
                    this.dvirDataRepo.deleteAllDVIRDataByDriverId(driverId);
                }

                for (int i = 0; i < certifiedLogCount; ++i) {
                    this.certifiedLogRepo.deleteAllCertifiedLogByDriverId(driverId);
                }

                for (int i = 0; i < loginLogCount; ++i) {
                    this.loginLogRepo.deleteAllLoginLogByDriverId((int) driverId);
                }

                result.setResult("Deleted");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Deleted driver record Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var11) {
            result.setStatus(Result.FAIL);
            result.setMessage(var11.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DeleteVoilationByDate(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            long driverId = dvirDataCRUDDto.getDriverId();
            String fromDate = dvirDataCRUDDto.getFromDate();
            String toDate = dvirDataCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            this.driveringStatusRepo.deleteAllDriveringStatusVoilation(driverId, from, to, 1);
            result.setResult("Deleted");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Deleted driver voilation Successfully");
        } catch (Exception var14) {
            result.setStatus(Result.FAIL);
            result.setMessage(var14.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DeleteAllDriverStatusByIdAndDate(DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            long driverId = dvirDataCRUDDto.getDriverId();
            String fromDate = dvirDataCRUDDto.getFromDate();
            String toDate = dvirDataCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            if (driverId > 0L) {
                this.driveringStatusRepo.deleteAllDriveringStatusByDriverIdAndDate(driverId, from, to);
                this.dvirDataRepo.deleteAllDVIRDataByDriverIdAndDate(driverId, from, to);
                this.certifiedLogRepo.deleteAllCertifiedLogByDriverIdAndDate(driverId, from, to);
                this.loginLogRepo.deleteAllLoginLogByDriverIdAndDate((int) driverId, from, to);
                this.driverStatusLogRepo.deleteAllDriveringStatusLogByDriverIdAndDate(driverId, from, to);
                result.setResult("Deleted");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Deleted driver record Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var14) {
            result.setStatus(Result.FAIL);
            result.setMessage(var14.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateDVIRData(List<MultipartFile> file, DVIRDataCRUDDto dvirDataCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtDateTime = LocalDateTime.parse(dvirDataCRUDDto.getDateTime(), formatter);
            long lDateTime = ldtDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            Instant instant = Instant.now();
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/dvir").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var19) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var19);
            }

            int iCount = 0;
            String fileName = "";

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    String fileExtension = "";

                    try {
                        fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                    } catch (Exception var17) {
                        fileExtension = "";
                    }

                    if (iCount == 1 && !mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                        fileName = dvirDataCRUDDto.getDriverId() + "_sign_" + iCount + "_" + lDateTime + fileExtension;
                        Path targetLocation = this.fileStorageLocation.resolve(fileName);
                        Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException var18) {
                    throw new Exception("Could not store file " + fileName + ". Please try again!", var18);
                }
            }

            sDebug = sDebug + "1," + dvirDataCRUDDto + " <<,";
            Query query = new Query();
            query.addCriteria(Criteria.where("timestamp").is(dvirDataCRUDDto.getTimestamp()));
            Update update = new Update();
            sDebug = sDebug + "2,";
            update.set("vehicleId", dvirDataCRUDDto.getVehicleId());
            update.set("truckDefect", dvirDataCRUDDto.getTruckDefect());
            update.set("trailerDefect", dvirDataCRUDDto.getTrailerDefect());
            update.set("trailer", dvirDataCRUDDto.getTrailer());
            update.set("notes", dvirDataCRUDDto.getNotes());
            update.set("vehicleCondition", dvirDataCRUDDto.getVehicleCondition());
            update.set("driverSignFile", fileName);
            this.mongoTemplate.findAndModify(query, update, DVIRData.class);
            sDebug = sDebug + "3,";
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("DVIR Data Updated Successfully");
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddELDOta(List<MultipartFile> file, ELDOta eldOta) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Integer ID = 0;
            Object maxID = this.eldOtaRepo.findMaxIdInELDOta();
            if (maxID == null) {
                ID = 1;
                eldOta.setOtaId(ID);
            } else {
                Integer var22 = (Integer) maxID;
                ID = var22 + 1;
                eldOta.setOtaId(ID);
            }

            Instant instant = Instant.now();
            eldOta.setAddedTimestamp(instant.toEpochMilli());
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/eld_ota_backup").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var18) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var18);
            }

            int iCount = 0;

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                String fileName = "";

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    String fileExtension = "";

                    try {
                        fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                    } catch (Exception var14) {
                        fileExtension = "";
                    }

                    if (iCount == 1) {
                        if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                            fileName = instant.toEpochMilli() + "_" + ID + "_" + iCount + fileExtension;
                            Path targetLocation = this.fileStorageLocation.resolve(fileName);
                            Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                            eldOta.setFirmwareFileName(fileName);
                        } else {
                            eldOta.setFirmwareFileName("");
                        }
                    }
                } catch (IOException var17) {
                    throw new Exception("Could not store file " + fileName + ". Please try again!", var17);
                }
            }

            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/eld_ota").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var16) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var16);
            }

            iCount = 0;

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    if (iCount == 1) {
                        if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                            Path targetLocation = this.fileStorageLocation.resolve(originalFileName);
                            Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                            eldOta.setOriginalFirmwareFileName(originalFileName);
                        } else {
                            eldOta.setOriginalFirmwareFileName("");
                        }
                    }
                } catch (IOException var15) {
                    throw new Exception("Could not store file " + originalFileName + ". Please try again!", var15);
                }
            }

            eldOta = (ELDOta) this.eldOtaRepo.save(eldOta);
            result.setResult("Saved");
            result.setStatus(Result.SUCCESS);
            result.setMessage("ELD Ota Data Added Successfully");
        } catch (Exception var19) {
            result.setStatus(Result.FAIL);
            result.setMessage(var19.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<ELDOta>> ViewELDOta() {
        ResultWrapper<List<ELDOta>> result = new ResultWrapper<>();

        try {
            String url1 = "http://admin.gbt-usa.com/uploads/eld_ota_backup/";
            String url2 = "http://admin.gbt-usa.com/uploads/eld_ota/";
            List<ELDOta> eldOtaData = this.eldOtaRepo.findAll();

            for (int i = 0; i < eldOtaData.size(); ++i) {
                String setImagePath1 = url1.concat(eldOtaData.get(i).getFirmwareFileName());
                eldOtaData.get(i).setFirmwareFileName(setImagePath1);
                setImagePath1 = url2.concat(eldOtaData.get(i).getOriginalFirmwareFileName());
                eldOtaData.get(i).setOriginalFirmwareFileName(setImagePath1);
            }

            result.setResult(eldOtaData);
            result.setStatus(Result.SUCCESS);
            result.setMessage("ELD Ota Data Information Send Successfully");
        } catch (Exception var7) {
            result.setStatus(Result.FAIL);
            result.setMessage(var7.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public String ViewLastELDOta() {
        String result = null;
        JSONObject json = new JSONObject();

        try {
            String url1 = "http://admin.gbt-usa.com/uploads/eld_ota/";
            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
            Query query = new Query();
            query.limit(1);
            query.with(pageableRequest);
            List<ELDOta> eldOtaData = this.mongoTemplate.find(query, ELDOta.class, "eld_ota");

            for (int i = 0; i < eldOtaData.size(); ++i) {
                String setImagePath1 = url1.concat(eldOtaData.get(i).getOriginalFirmwareFileName());
                json.put("hardwareVersion", eldOtaData.get(i).getHardwareVersion());
                json.put("firmwareVersion", eldOtaData.get(i).getFirmwareVersion());
                json.put("otaUrl", setImagePath1);
                json.put("processOta", 1);
                result = json.toString();
            }
        } catch (Exception var9) {
            json.put("status", 0);
            result = json.toString();
        }

        return result;
    }

    @Override
    public ResultWrapper<String> DeleteELDOta(ELDOtaCRUDDto eldOtaCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            Integer otaId = eldOtaCRUDDto.getOtaId();
            if (otaId > 0) {
                ELDOta eldOta = this.eldOtaRepo.deleteELDOtaById(otaId);
                String url1 = "/opt/tomcat/webapps/uploads/eld_ota_backup/" + eldOta.getFirmwareFileName();
                Path fileDeletePath1 = Paths.get(url1);
                Files.deleteIfExists(fileDeletePath1);
                result.setResult("Deleted");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Deleted driver record Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var7) {
            result.setStatus(Result.FAIL);
            result.setMessage(var7.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public String AddELDOtaStatus(ELDOtaStatus eldOtaStatus) {
        String result = null;
        JSONObject json = new JSONObject();

        try {
            Integer ID = 0;
            Object maxID = this.eldOtaStatusRepo.findMaxIdInELDOtaStatus();
            if (maxID == null) {
                ID = 1;
                eldOtaStatus.setOtaStatusId(ID);
            } else {
                ID = (Integer) maxID;
                ID = ID + 1;
                eldOtaStatus.setOtaStatusId(ID);
            }

            Instant instant = Instant.now();
            eldOtaStatus.setAddedTimestamp(instant.toEpochMilli());
            eldOtaStatus = (ELDOtaStatus) this.eldOtaStatusRepo.save(eldOtaStatus);
            json.put("status", 1);
            result = json.toString();
        } catch (Exception var7) {
            json.put("status", 0);
            result = json.toString();
        }

        return result;
    }

    @Override
    public ResultWrapper<List<ELDOtaStatus>> ViewELDOtaStatus(ELDOtaCRUDDto eldOtaCRUDDto) {
        ResultWrapper<List<ELDOtaStatus>> result = new ResultWrapper<>();

        try {
            String fromDate = eldOtaCRUDDto.getFromDate();
            String toDate = eldOtaCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List<ELDOtaStatus> eldOtaStatusData = this.lookupELDOtaStatusOperation(from, to);
            result.setResult(eldOtaStatusData);
            result.setStatus(Result.SUCCESS);
            result.setMessage("ELD Ota Status Data Information Send Successfully");
        } catch (Exception var13) {
            result.setStatus(Result.FAIL);
            result.setMessage(var13.getLocalizedMessage());
        }

        return result;
    }

    public List<ELDOtaStatus> lookupELDOtaStatusOperation(long from, long to) {
        MatchOperation filter = Aggregation.match(Criteria.where("addedTimestamp").gte(from).lte(to));
        ProjectionOperation projectStage = Aggregation.project(new String[]{"otaStatusId", "hardwareVersion", "firmwareVersion", "deviceId", "addedTimestamp"})
                .andExclude(new String[]{"_id"});
        Aggregation aggregation = Aggregation.newAggregation(
                new AggregationOperation[]{filter, projectStage, Aggregation.sort(Direction.DESC, new String[]{"addedTimestamp"})}
        );
        return this.mongoTemplate.aggregate(aggregation, "eld_ota_status", ELDOtaStatus.class).getMappedResults();
    }

    @Override
    public String ViewELDOtaStatusForTesting() {
        String result = null;
        JSONObject json = new JSONObject();
        json.put("status", 1);
        return json.toString();
    }

    @Override
    public ResultWrapper<String> AddCertifiedLogImage(List<MultipartFile> file) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/certified_signature").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var12) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var12);
            }

            int iCount = 0;

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                String fileName = originalFileName;

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    String fileExtension = "";

                    try {
                        fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                    } catch (Exception var10) {
                        fileExtension = "";
                    }

                    if (iCount == 1 && !mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                        Path targetLocation = this.fileStorageLocation.resolve(fileName);
                        Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException var11) {
                    throw new Exception("Could not store file " + originalFileName + ". Please try again!", var11);
                }
            }

            result.setResult("Saved");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Certified Log Image Added Successfully");
        } catch (Exception var13) {
            result.setStatus(Result.FAIL);
            result.setMessage(var13.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<AddDriveringStatusResponseDto>> AddCertifiedLogOffline(AddCertifiedLogDto addCertifiedLogDto, String tokenValid) {
        ResultWrapper<List<AddDriveringStatusResponseDto>> result = new ResultWrapper<>();
        String sDebug = ">> ";

        try {
            Instant instant = Instant.now();
            List<AddDriveringStatusResponseDto> AddCertifiedLogData = new ArrayList<>();
            new AddDriveringStatusResponseDto();
            ArrayList<CertifiedLog> certifiedLogData = addCertifiedLogDto.getCertifiedLogData();
            CertifiedLog certifiedLog = null;
            sDebug = sDebug + "1,";

            for (int i = 0; i < certifiedLogData.size(); ++i) {
                sDebug = sDebug + "2,";
                CertifiedLog var22 = certifiedLogData.get(i);
                sDebug = sDebug + "3," + var22;
                var22.setLCertifiedDate(var22.getCertifiedDateTime());
                var22.setAddedTimestamp(instant.toEpochMilli());
                certifiedLog = (CertifiedLog) this.certifiedLogRepo.save(var22);
                DriverStatusLog driverStatusLog = new DriverStatusLog();
                long maxId = this.lookupMaxIdOfDriverOperation(certifiedLog.getDriverId());
                if (maxId <= 0L) {
                    maxId = 1L;
                    driverStatusLog.setStatusId(maxId);
                } else {
                    driverStatusLog.setStatusId(++maxId);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query queryLog = new Query(Criteria.where("driverId").is(certifiedLog.getDriverId()));
                queryLog.limit(1);
                queryLog.with(pageableRequest);
                List<CertifiedLogViewDto> certifiedLogViewDtoData = this.mongoTemplate.find(queryLog, CertifiedLogViewDto.class, "certified_log");
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLog.getDriverId());
                driverStatusLog.setLogDataId(certifiedLogViewDtoData.get(0).get_id());
                driverStatusLog.setDriverId(certifiedLog.getDriverId());
                driverStatusLog.setVehicleId(certifiedLog.getVehicleId());
                driverStatusLog.setClientId(empInfo.getClientId());
                driverStatusLog.setStatus("Certified");
                driverStatusLog.setLattitude(0.0);
                driverStatusLog.setLongitude(0.0);
                driverStatusLog.setDateTime(certifiedLog.getLCertifiedDate());
                driverStatusLog.setLogType("Certified Log");
                driverStatusLog.setEngineHour("0");
                driverStatusLog.setOrigin("");
                driverStatusLog.setOdometer(0.0);
                driverStatusLog.setIsVoilation(0);
                driverStatusLog.setNote("");
                driverStatusLog.setCustomLocation("");
                driverStatusLog.setIsReportGenerated(1);
                driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                driverStatusLog.setIsVisible(1);
                List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(certifiedLogViewDtoData.get(0).get_id());
                if (logDataExist.size() <= 0) {
                    this.driverStatusLogRepo.save(driverStatusLog);
                    this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                }

                this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                sDebug = sDebug + "5,";
                CertifiedLogViewDto certifiedLogViewDto = this.certifiedLogRepo
                        .findAndViewCertifiedLogByDriverId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                String objId = certifiedLogViewDto.get_id();
                sDebug = sDebug + "6,";
                AddDriveringStatusResponseDto addCertifiedLog = new AddDriveringStatusResponseDto();
                addCertifiedLog.setLocalId(certifiedLog.getLocalId());
                addCertifiedLog.setServerId(objId);
                AddCertifiedLogData.add(addCertifiedLog);
            }

            if (certifiedLog.getLCertifiedDate() > 0L) {
                result.setResult(AddCertifiedLogData);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Certified Log Data Added Successfully");
            } else {
                result.setResult(null);
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Certified Log Date!");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddCertifiedLog(List<MultipartFile> file, CertifiedLog certifiedLog, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            certifiedLog.setLCertifiedDate(certifiedLog.getCertifiedDateTime());
            Instant instant = Instant.now();
            certifiedLog.setAddedTimestamp(instant.toEpochMilli());
            if (tokenValid.equals("true")) {
                this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/certified_signature").toAbsolutePath().normalize();

                try {
                    if (Files.notExists(this.fileStorageLocation)) {
                        Files.createDirectories(this.fileStorageLocation);
                    }
                } catch (Exception var19) {
                    throw new Exception("Could not create the directory where the uploaded files will be stored.", var19);
                }

                int iCount = 0;

                for (MultipartFile mf : file) {
                    ++iCount;
                    String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                    String fileName = originalFileName;

                    try {
                        if (originalFileName.contains("..")) {
                            throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                        }

                        String fileExtension = "";

                        try {
                            fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                        } catch (Exception var16) {
                            fileExtension = "";
                        }

                        if (iCount == 1) {
                            if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                                fileName = certifiedLog.getDriverId() + "_sign_" + iCount + fileExtension;
                                Path targetLocation = this.fileStorageLocation.resolve(fileName);
                                Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                                certifiedLog.setCertifiedSignature(fileName);
                            } else {
                                certifiedLog.setCertifiedSignature("");
                            }
                        }
                    } catch (IOException var18) {
                        throw new Exception("Could not store file " + fileName + ". Please try again!", var18);
                    }
                }

                certifiedLog = (CertifiedLog) this.certifiedLogRepo.save(certifiedLog);
                DriverStatusLog driverStatusLog = new DriverStatusLog();
                long maxId = this.lookupMaxIdOfDriverOperation(certifiedLog.getDriverId());
                if (maxId <= 0L) {
                    maxId = 1L;
                    driverStatusLog.setStatusId(maxId);
                } else {
                    driverStatusLog.setStatusId(++maxId);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query queryLog = new Query(Criteria.where("driverId").is(certifiedLog.getDriverId()));
                queryLog.limit(1);
                queryLog.with(pageableRequest);
                List<CertifiedLogViewDto> certifiedLogViewDtoData = this.mongoTemplate.find(queryLog, CertifiedLogViewDto.class, "certified_log");
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLog.getDriverId());
                driverStatusLog.setLogDataId(certifiedLogViewDtoData.get(0).get_id());
                driverStatusLog.setDriverId(certifiedLog.getDriverId());
                driverStatusLog.setVehicleId(certifiedLog.getVehicleId());
                driverStatusLog.setClientId(empInfo.getClientId());
                driverStatusLog.setStatus("Certified");
                driverStatusLog.setLattitude(0.0);
                driverStatusLog.setLongitude(0.0);
                driverStatusLog.setDateTime(certifiedLog.getLCertifiedDate());
                driverStatusLog.setLogType("Certified Log");
                driverStatusLog.setEngineHour("0");
                driverStatusLog.setOrigin("");
                driverStatusLog.setOdometer(0.0);
                driverStatusLog.setIsVoilation(0);
                driverStatusLog.setNote("");
                driverStatusLog.setCustomLocation("");
                driverStatusLog.setIsReportGenerated(1);
                driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                driverStatusLog.setIsVisible(1);
                List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(certifiedLogViewDtoData.get(0).get_id());
                if (logDataExist.size() <= 0) {
                    this.driverStatusLogRepo.save(driverStatusLog);
                    this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                }
            } else {
                this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/certified_signature").toAbsolutePath().normalize();

                try {
                    if (Files.notExists(this.fileStorageLocation)) {
                        Files.createDirectories(this.fileStorageLocation);
                    }
                } catch (Exception var20) {
                    throw new Exception("Could not create the directory where the uploaded files will be stored.", var20);
                }

                int iCount = 0;

                for (MultipartFile mf : file) {
                    ++iCount;
                    String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                    String fileName = "";

                    try {
                        if (originalFileName.contains("..")) {
                            throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                        }

                        String fileExtension = "";

                        try {
                            fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                        } catch (Exception var15) {
                            fileExtension = "";
                        }

                        if (iCount == 1) {
                            if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                                fileName = certifiedLog.getDriverId() + "_sign_" + iCount + fileExtension;
                                Path targetLocation = this.fileStorageLocation.resolve(fileName);
                                Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                                certifiedLog.setCertifiedSignature(fileName);
                            } else {
                                certifiedLog.setCertifiedSignature("");
                            }
                        }
                    } catch (IOException var17) {
                        throw new Exception("Could not store file " + fileName + ". Please try again!", var17);
                    }
                }

                certifiedLog = (CertifiedLog) this.certifiedLogRepo.save(certifiedLog);
                DriverStatusLog driverStatusLog = new DriverStatusLog();
                long maxId = this.lookupMaxIdOfDriverOperation(certifiedLog.getDriverId());
                if (maxId <= 0L) {
                    maxId = 1L;
                    driverStatusLog.setStatusId(maxId);
                } else {
                    driverStatusLog.setStatusId(++maxId);
                }

                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
                Query queryLog = new Query(Criteria.where("driverId").is(certifiedLog.getDriverId()));
                queryLog.limit(1);
                queryLog.with(pageableRequest);
                List<CertifiedLogViewDto> certifiedLogViewDtoData = this.mongoTemplate.find(queryLog, CertifiedLogViewDto.class, "certified_log");
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLog.getDriverId());
                driverStatusLog.setLogDataId(certifiedLogViewDtoData.get(0).get_id());
                driverStatusLog.setDriverId(certifiedLog.getDriverId());
                driverStatusLog.setVehicleId(certifiedLog.getVehicleId());
                driverStatusLog.setClientId(empInfo.getClientId());
                driverStatusLog.setStatus("Certified");
                driverStatusLog.setLattitude(0.0);
                driverStatusLog.setLongitude(0.0);
                driverStatusLog.setDateTime(certifiedLog.getLCertifiedDate());
                driverStatusLog.setLogType("Certified Log");
                driverStatusLog.setEngineHour("0");
                driverStatusLog.setOrigin("");
                driverStatusLog.setOdometer(0.0);
                driverStatusLog.setIsVoilation(0);
                driverStatusLog.setNote("");
                driverStatusLog.setCustomLocation("");
                driverStatusLog.setIsReportGenerated(1);
                driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
                driverStatusLog.setIsVisible(1);
                List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(certifiedLogViewDtoData.get(0).get_id());
                if (logDataExist.size() <= 0) {
                    this.driverStatusLogRepo.save(driverStatusLog);
                    this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                }
            }

            if (certifiedLog.getLCertifiedDate() > 0L) {
                this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                result.setResult("Saved");
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Certified Log Data Added Successfully");
            } else {
                result.setResult("Error");
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Certified Log Date!");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddCertifiedLogFromWeb(List<MultipartFile> file, CertifiedLog certifiedLog, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();

        try {
            certifiedLog.setLCertifiedDate(certifiedLog.getCertifiedDateTime());
            Instant instant = Instant.now();
            certifiedLog.setAddedTimestamp(instant.toEpochMilli());
            this.fileStorageLocation = Paths.get("/opt/tomcat/webapps/uploads/certified_signature").toAbsolutePath().normalize();

            try {
                if (Files.notExists(this.fileStorageLocation)) {
                    Files.createDirectories(this.fileStorageLocation);
                }
            } catch (Exception var17) {
                throw new Exception("Could not create the directory where the uploaded files will be stored.", var17);
            }

            int iCount = 0;

            for (MultipartFile mf : file) {
                ++iCount;
                String originalFileName = StringUtils.cleanPath(mf.getOriginalFilename());
                String fileName = originalFileName;

                try {
                    if (originalFileName.contains("..")) {
                        throw new Exception("Sorry! Filename contains invalid path sequence " + originalFileName);
                    }

                    String fileExtension = "";

                    try {
                        fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                    } catch (Exception var15) {
                        fileExtension = "";
                    }

                    if (iCount == 1) {
                        if (!mf.getOriginalFilename().isEmpty() && !mf.getOriginalFilename().equals("")) {
                            fileName = certifiedLog.getDriverId() + "_sign_" + iCount + fileExtension;
                            Path targetLocation = this.fileStorageLocation.resolve(fileName);
                            Files.copy(mf.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                            certifiedLog.setCertifiedSignature(fileName);
                        } else {
                            certifiedLog.setCertifiedSignature("");
                        }
                    }
                } catch (IOException var16) {
                    throw new Exception("Could not store file " + fileName + ". Please try again!", var16);
                }
            }

            certifiedLog = (CertifiedLog) this.certifiedLogRepo.save(certifiedLog);
            DriverStatusLog driverStatusLog = new DriverStatusLog();
            long maxId = this.lookupMaxIdOfDriverOperation(certifiedLog.getDriverId());
            if (maxId <= 0L) {
                maxId = 1L;
                driverStatusLog.setStatusId(maxId);
            } else {
                driverStatusLog.setStatusId(++maxId);
            }

            Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"_id"}).descending());
            Query queryLog = new Query(Criteria.where("driverId").is(certifiedLog.getDriverId()));
            queryLog.limit(1);
            queryLog.with(pageableRequest);
            List<CertifiedLogViewDto> certifiedLogViewDtoData = this.mongoTemplate.find(queryLog, CertifiedLogViewDto.class, "certified_log");
            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLog.getDriverId());
            driverStatusLog.setLogDataId(certifiedLogViewDtoData.get(0).get_id());
            driverStatusLog.setDriverId(certifiedLog.getDriverId());
            driverStatusLog.setVehicleId(certifiedLog.getVehicleId());
            driverStatusLog.setClientId(empInfo.getClientId());
            driverStatusLog.setStatus("Certified");
            driverStatusLog.setLattitude(0.0);
            driverStatusLog.setLongitude(0.0);
            driverStatusLog.setDateTime(certifiedLog.getLCertifiedDate());
            driverStatusLog.setLogType("Certified Log");
            driverStatusLog.setEngineHour("0");
            driverStatusLog.setOrigin("");
            driverStatusLog.setOdometer(0.0);
            driverStatusLog.setIsVoilation(0);
            driverStatusLog.setNote("");
            driverStatusLog.setCustomLocation("");
            driverStatusLog.setIsReportGenerated(1);
            driverStatusLog.setReceivedTimestamp(instant.toEpochMilli());
            driverStatusLog.setIsVisible(1);
            List<DriverStatusLog> logDataExist = this.driverStatusLogRepo.CheckDriverStatusLogById(certifiedLogViewDtoData.get(0).get_id());
            if (logDataExist.size() <= 0) {
                this.driverStatusLogRepo.save(driverStatusLog);
                this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
            }

            if (certifiedLog.getLCertifiedDate() > 0L) {
                this.UpdateDriverSequenceId(certifiedLog.getDriverId(), certifiedLog.getLCertifiedDate());
                result.setResult("Saved");
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Certified Log Data Added Successfully");
            } else {
                result.setResult("Error");
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Certified Log Date!");
            }
        } catch (Exception var18) {
            result.setStatus(Result.FAIL);
            result.setMessage(var18.getLocalizedMessage());
        }

        return result;
    }

    @Override
    public ResultWrapper<List<CertifiedLogViewDto>> ViewCertifiedLog(CertifiedLogCRUDDto certifiedLogCRUDDto) {
        ResultWrapper<List<CertifiedLogViewDto>> result = new ResultWrapper<>();

        try {
            List<CertifiedLogViewDto> certifiedLogViewDto = null;
            long driverId = certifiedLogCRUDDto.getDriverId();
            String fromDate = certifiedLogCRUDDto.getFromDate();
            String toDate = certifiedLogCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String url = "http://admin.gbt-usa.com/uploads/certified_signature/";
            if (driverId > 0L) {
                certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);

                for (int i = 0; i < certifiedLogViewDto.size(); ++i) {
                    String setImagePath1 = url.concat(certifiedLogViewDto.get(i).getCertifiedSignature());
                    certifiedLogViewDto.get(i).setCertifiedSignature(setImagePath1);
                    EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                    driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                    certifiedLogViewDto.get(i).setDriverName(driverName);
                    if (certifiedLogViewDto.get(i).getCoDriverId() > 0L) {
                        empInfo = this.employeeMasterRepo.findByEmployeeId((int) certifiedLogViewDto.get(i).getCoDriverId());
                        driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                        certifiedLogViewDto.get(i).setCoDriverName(driverName);
                    }

                    if (certifiedLogViewDto.get(i).getVehicleId() > 0L) {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) certifiedLogViewDto.get(i).getVehicleId());
                        certifiedLogViewDto.get(i).setVehicleName(vehcileInfo.getVehicleNo());
                    }
                }

                result.setResult(certifiedLogViewDto);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Certified Log Information Send Successfully");
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request.");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage());
        }

        return result;
    }

    public List<CertifiedLogViewDto> lookupCertifiedLogDataOperation(long from, long to, long driverId) {
        MatchOperation filter = Aggregation.match(Criteria.where("lCertifiedDate").gte(from).lte(to).and("driverId").is(driverId));
        ProjectionOperation projectStage = Aggregation.project(
                new String[]{
                    "driverId",
                    "vehicleId",
                    "trailers",
                    "shippingDocs",
                    "coDriverId",
                    "certifiedSignature",
                    "certifiedDate",
                    "lCertifiedDate",
                    "addedTimestamp",
                    "_id",
                    "certifiedAt"
                }
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "certified_log", CertifiedLogViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<String> UpdateCertifiedLog(CertifiedLog certifiedLog, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            if (tokenValid.equals("true")) {
                Query query = new Query();
                query.addCriteria(Criteria.where("certifiedDate").is(certifiedLog.getCertifiedDate()).and("driverId").is(certifiedLog.getDriverId()));
                Update update = new Update();
                sDebug = sDebug + "2,";
                update.set("vehicleId", certifiedLog.getVehicleId());
                update.set("trailers", certifiedLog.getTrailers());
                update.set("shippingDocs", certifiedLog.getShippingDocs());
                update.set("coDriverId", certifiedLog.getCoDriverId());
                update.set("lCertifiedDate", certifiedLog.getCertifiedDateTime());
                update.set("certifiedDateTime", certifiedLog.getCertifiedDateTime());
                update.set("updatedTimestamp", instant.toEpochMilli());
                this.mongoTemplate.updateMulti(query, update, CertifiedLog.class);
            } else {
                Query query = new Query();
                query.addCriteria(Criteria.where("certifiedDate").is(certifiedLog.getCertifiedDate()).and("driverId").is(certifiedLog.getDriverId()));
                Update update = new Update();
                sDebug = sDebug + "2,";
                update.set("vehicleId", certifiedLog.getVehicleId());
                update.set("trailers", certifiedLog.getTrailers());
                update.set("shippingDocs", certifiedLog.getShippingDocs());
                update.set("coDriverId", certifiedLog.getCoDriverId());
                update.set("lCertifiedDate", certifiedLog.getCertifiedDateTime());
                update.set("certifiedDateTime", certifiedLog.getCertifiedDateTime());
                update.set("updatedTimestamp", instant.toEpochMilli());
                this.mongoTemplate.updateMulti(query, update, CertifiedLog.class);
            }

            result.setResult("Updated");
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Certified Log Updated Successfully");
        } catch (Exception var8) {
            result.setStatus(Result.FAIL);
            result.setMessage(var8.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateCertifiedLogWithCoDriver(CertifiedLogCRUDDto certifiedLogCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            String certifiedLogId = certifiedLogCRUDDto.getCertifiedLogId();
            ObjectId logStatusId = new ObjectId(certifiedLogId);
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(logStatusId));
            Update update = new Update();
            sDebug = sDebug + "2,";
            update.set("trailers", certifiedLogCRUDDto.getTrailers());
            update.set("shippingDocs", certifiedLogCRUDDto.getShippingDocs());
            update.set("coDriverId", certifiedLogCRUDDto.getCoDriverId());
            this.mongoTemplate.findAndModify(query, update, CertifiedLog.class);
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Certified Log Updated Successfully");
        } catch (Exception var8) {
            result.setStatus(Result.FAIL);
            result.setMessage(var8.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> ExportChartGraph(CertifiedLogCRUDDto certifiedLogCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            System.out.println("Here...1");
            System.out.println("Here...2");
            Document document = new Document(PageSize.A4.rotate());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BaseFont baseFont = BaseFont.createFont("Courier-Bold", "Cp1250", true);
            Font font = new Font(baseFont, 10.0F, 0);
            font.setColor(0, 0, 0);
            String fileName = "graph_data.pdf";
            String subject = "Export Graph";
            String text = "graph report";
            PdfPTable createTable = this.getReportHeader("Static Graph Report", 1, "Testing");
            PdfWriter.getInstance(document, outputStream);
            try {
                Image logoImg = Image.getInstance("/opt/tomcat/webapps/graph_img/output_file.png");
                PdfPCell logo = new PdfPCell();
                logo.addElement(new Chunk(logoImg, 5.0F, -5.0F));
                logo.setVerticalAlignment(1);
                logo.setHorizontalAlignment(1);
                logo.setRowspan(2);
                logo.setColspan(1);
                logo.setPadding(4.0F);
                logo.setPaddingLeft(20.0F);
                createTable.addCell(logo);
            } catch (Exception imgEx) {
            }
            document.open();
            document.add(createTable);
            document.close();
            System.out.println("Done...");
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(text);
            byte[] bytes = outputStream.toByteArray();
            DataSource dataSource = null;
            if (fileName.contains("pdf")) {
                dataSource = new ByteArrayDataSource(bytes, "application/pdf");
            } else if (fileName.contains("xlsx")) {
                dataSource = new ByteArrayDataSource(bytes, "application/vnd.ms-excel");
            }

            MimeBodyPart fileBodyPart = new MimeBodyPart();
            fileBodyPart.setDataHandler(new DataHandler(dataSource));
            fileBodyPart.setFileName(fileName);
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(textBodyPart);
            mimeMultipart.addBodyPart(fileBodyPart);
            MimeMessage message = this.javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            String targetEmail = certifiedLogCRUDDto.getEmail();
            if (targetEmail == null || targetEmail.trim().isEmpty()) {
                targetEmail = "shivamitwork@gmail.com";
            }
            helper.setTo(targetEmail);
            helper.setSubject(subject);
            message.setContent(mimeMultipart);
            this.javaMailSender.send(message);
            result.setResult("Export");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Export Graph Successfully");
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public void writeAsPNG(JFreeChart chart, OutputStream out, int width, int height) {
        try {
            BufferedImage chartImage = chart.createBufferedImage(width, height, null);
            File outputfile = new File("D:\\saved.png");
            ImageIO.write(chartImage, "png", outputfile);
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }

    public XYDataset createDataset() {
        XYSeries series = new XYSeries("Driver Status");
        String iCount = "";

        for (int i = 1; i < 24; ++i) {
            iCount = String.valueOf(i);
            if (iCount.length() > 1) {
                series.add((double) i, 1.0);
                this.labels.put(i, "Driver " + i);
            } else {
                series.add((double) i, 1.0);
                this.labels.put(i, "Driver " + i);
            }
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    public JFreeChart createChart(XYDataset dataset) {
        JFreeChart chart = ChartFactory.createXYLineChart("Driver Working Status", "", "", dataset, PlotOrientation.VERTICAL, true, true, false);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        chart.getLegend().setFrame(BlockBorder.NONE);
        return chart;
    }

    @Override
    public ResultWrapper<String> AddDriverWorkingStatus(DriverWorkingStatus driverWorkingStatus, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            driverWorkingStatus.setReceivedTimestamp(instant.toEpochMilli());
            if (tokenValid.equals("true")) {
                List<DriverWorkingStatus> driverWorkingData = this.driverWorkingStatusRepo.findAndViewDriverWorkingstatusById(driverWorkingStatus.getDriverId());
                if (driverWorkingData.size() <= 0) {
                    driverWorkingStatus = (DriverWorkingStatus) this.driverWorkingStatusRepo.save(driverWorkingStatus);
                } else {
                    Query query = new Query();
                    query.addCriteria(Criteria.where("driverId").is(driverWorkingStatus.getDriverId()));
                    Update update = new Update();
                    update.set("shift", driverWorkingStatus.getShift());
                    update.set("days", driverWorkingStatus.getDays());
                    update.set("status", driverWorkingStatus.getStatus());
                    update.set("onDutyTime", driverWorkingStatus.getOnDutyTime());
                    update.set("onDriveTime", driverWorkingStatus.getOnDriveTime());
                    update.set("onSleepTime", driverWorkingStatus.getOnSleepTime());
                    update.set("weeklyTime", driverWorkingStatus.getWeeklyTime());
                    update.set("onBreak", driverWorkingStatus.getOnBreak());
                    update.set("tokenNo", driverWorkingStatus.getTokenNo());
                    update.set("receivedTimestamp", driverWorkingStatus.getReceivedTimestamp());
                    this.mongoTemplate.findAndModify(query, update, DriverWorkingStatus.class);
                }

                result.setResult("Saved");
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Working Status Save Successfully");
            } else {
                result.setResult("error");
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Token Expired.");
            }
        } catch (Exception var9) {
            result.setStatus(Result.FAIL);
            result.setMessage(var9.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> UpdateDriveringStatusForDotReport(CertifiedLogCRUDDto certifiedLogCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = certifiedLogCRUDDto.getDriverId();
            String fromDate = certifiedLogCRUDDto.getFromDate();
            String toDate = certifiedLogCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            Query query = new Query();
            query.addCriteria(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId));
            Update update = new Update();
            sDebug = sDebug + "2,";
            update.set("isReportGenerated", 1);
            this.mongoTemplate.updateMulti(query, update, DriveringStatus.class);
            result.setResult("Updated");
            result.setStatus(Result.SUCCESS);
            result.setMessage("Dot Report Data Updated Successfully");
        } catch (Exception var17) {
            result.setStatus(Result.FAIL);
            result.setMessage(var17.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<String> AddELDSupport(ELDSupport eldSupport, String tokenValid) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            Instant instant = Instant.now();
            if (tokenValid.equals("true")) {
                eldSupport.setReceivedTimestamp(instant.toEpochMilli());
                eldSupport.setStatus("pending");
                eldSupport = (ELDSupport) this.eldSupportRepo.save(eldSupport);
                result.setResult("Saved");
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("ELD Support Save Successfully");
            } else {
                result.setResult("error");
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Token Expired.");
            }
        } catch (Exception var6) {
            result.setStatus(Result.FAIL);
            result.setMessage(var6.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<ELDSupportViewDto>> ViewELDSupport(ELDSupportViewDto eldSupportViewDto, String tokenValid) {
        ResultWrapper<List<ELDSupportViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = eldSupportViewDto.getDriverId();
            LocalDate periviousDate = LocalDate.now();
            periviousDate = periviousDate.minusDays(14L);
            String fromDate = periviousDate.toString() + " 00:00:00";
            String toDate = LocalDate.now().toString() + " 23:59:59";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            if (tokenValid.equals("true")) {
                List<ELDSupportViewDto> eldSupportViewDtoData = this.lookupELDSupportDataOperation(from, to, driverId);

                for (int i = 0; i < eldSupportViewDtoData.size(); ++i) {
                    try {
                        if (eldSupportViewDtoData.get(i).getDriverId() > 0L) {
                            EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) eldSupportViewDtoData.get(i).getDriverId());
                            eldSupportViewDtoData.get(i).setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
                        } else {
                            eldSupportViewDtoData.get(i).setDriverName("");
                        }

                        if (eldSupportViewDtoData.get(i).getVehicleId() > 0L) {
                            VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) eldSupportViewDtoData.get(i).getVehicleId());
                            eldSupportViewDtoData.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                        } else {
                            eldSupportViewDtoData.get(i).setVehicleNo("");
                        }

                        if (eldSupportViewDtoData.get(i).getCompanyId() > 0L) {
                            ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) eldSupportViewDtoData.get(i).getCompanyId());
                            eldSupportViewDtoData.get(i).setCompanyName(clientInfo.getClientName());
                        } else {
                            eldSupportViewDtoData.get(i).setCompanyName("");
                        }
                    } catch (Exception var20) {
                        var20.printStackTrace();
                    }
                }

                result.setResult(eldSupportViewDtoData);
                result.setToken(tokenValid);
                result.setStatus(Result.SUCCESS);
                result.setMessage("ELD Support Send Data Successfully");
            } else {
                result.setResult(null);
                result.setToken(tokenValid);
                result.setStatus(Result.FAIL);
                result.setMessage("Token Expired.");
            }
        } catch (Exception var21) {
            result.setStatus(Result.FAIL);
            result.setMessage(var21.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<List<ELDSupportViewDto>> ViewELDSupportByDate(ELDSupportViewDto eldSupportViewDto, String tokenValid) {
        ResultWrapper<List<ELDSupportViewDto>> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            long driverId = eldSupportViewDto.getDriverId();
            String fromDate = eldSupportViewDto.getFromDate();
            String toDate = eldSupportViewDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List<ELDSupportViewDto> eldSupportViewDtoData = this.lookupELDSupportDataOperation(from, to, driverId);

            for (int i = 0; i < eldSupportViewDtoData.size(); ++i) {
                try {
                    if (eldSupportViewDtoData.get(i).getDriverId() > 0L) {
                        EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) eldSupportViewDtoData.get(i).getDriverId());
                        eldSupportViewDtoData.get(i).setDriverName(empInfo.getFirstName() + " " + empInfo.getLastName());
                    } else {
                        eldSupportViewDtoData.get(i).setDriverName("");
                    }

                    if (eldSupportViewDtoData.get(i).getVehicleId() > 0L) {
                        VehicleMaster vehcileInfo = this.vehicleMasterRepo.findByVehicleId((int) eldSupportViewDtoData.get(i).getVehicleId());
                        eldSupportViewDtoData.get(i).setVehicleNo(vehcileInfo.getVehicleNo());
                    } else {
                        eldSupportViewDtoData.get(i).setVehicleNo("");
                    }

                    if (eldSupportViewDtoData.get(i).getCompanyId() > 0L) {
                        ClientMaster clientInfo = this.clientMasterRepo.findByClientId((int) eldSupportViewDtoData.get(i).getCompanyId());
                        eldSupportViewDtoData.get(i).setCompanyName(clientInfo.getClientName());
                    } else {
                        eldSupportViewDtoData.get(i).setCompanyName("");
                    }
                } catch (Exception var19) {
                    var19.printStackTrace();
                }
            }

            result.setResult(eldSupportViewDtoData);
            result.setToken(tokenValid);
            result.setStatus(Result.SUCCESS);
            result.setMessage("ELD Support Send Data Successfully");
        } catch (Exception var20) {
            result.setStatus(Result.FAIL);
            result.setMessage(var20.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    public List<ELDSupportViewDto> lookupELDSupportDataOperation(long from, long to, long driverId) {
        MatchOperation filter = null;
        if (driverId > 0L) {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to).and("driverId").is(driverId));
        } else {
            filter = Aggregation.match(Criteria.where("utcDateTime").gte(from).lte(to));
        }

        ProjectionOperation projectStage = Aggregation.project(
                new String[]{"driverId", "vehicleId", "companyId", "message", "status", "utcDateTime", "receivedTimestamp", "_id"}
        );
        Aggregation aggregation = Aggregation.newAggregation(new AggregationOperation[]{filter, projectStage});
        return this.mongoTemplate.aggregate(aggregation, "eld_support", ELDSupportViewDto.class).getMappedResults();
    }

    @Override
    public ResultWrapper<String> UpdateSequenceNoManually(DriveringStatusCRUDDto driveringStatusCRUDDto) {
        ResultWrapper<String> result = new ResultWrapper<>();
        String sDebug = " >> ";

        try {
            DecimalFormat df = new DecimalFormat("0.00");
            List<DriveringStatusLogViewDto> driveringStatusLogViewDto = new ArrayList<>();
            DriveringStatusLogViewDto driveringStatusLogData = new DriveringStatusLogViewDto();
            long driverId = driveringStatusCRUDDto.getDriverId();
            String fromDate = driveringStatusCRUDDto.getFromDate();
            String toDate = driveringStatusCRUDDto.getToDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldtFromDate = LocalDateTime.parse(fromDate, formatter);
            long from = ldtFromDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            LocalDateTime ldtToDate = LocalDateTime.parse(toDate, formatter);
            long to = ldtToDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            String driverName = "";
            String employeeStatus = "";
            if (driverId > 0L) {
                EmployeeMaster empInfo = this.employeeMasterRepo.findByEmployeeId((int) driverId);
                driverName = empInfo.getFirstName() + " " + empInfo.getLastName();
                employeeStatus = empInfo.getStatus();
                List<LoginLog> loginLog = this.lookupLoginLogDataOperation(from, to, driverId, "loginDateTime");
                sDebug = sDebug + " >> " + loginLog.size() + ",";

                for (int i = 0; i < loginLog.size(); ++i) {
                    try {
                        if (loginLog.get(i).getLoginDateTime() > 0L) {
                            DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById1(loginLog.get(i).get_id(), "Login");
                            driveringStatusLogData = new DriveringStatusLogViewDto();
                            driveringStatusLogData.setDriverId(driverId);
                            driveringStatusLogData.setDriverStatusId(loginLog.get(i).get_id());
                            driveringStatusLogData.setDriverName(driverName);
                            driveringStatusLogData.setLattitude(0.0);
                            driveringStatusLogData.setLongitude(0.0);
                            driveringStatusLogData.setCustomLocation("");
                            driveringStatusLogData.setOrigin("");
                            driveringStatusLogData.setOdometer(0.0);
                            driveringStatusLogData.setEngineHour("0");
                            driveringStatusLogData.setNote("");
                            driveringStatusLogData.setIsVoilation(0L);
                            driveringStatusLogData.setLogType("Login");
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                            driveringStatusLogData.setIsReportGenerated(1L);
                            driveringStatusLogData.setIsPreviousLog(0);
                            sDebug = sDebug + "1-1,";
                            driveringStatusLogData.setDateTime(String.valueOf(loginLog.get(i).getLoginDateTime()));
                            driveringStatusLogData.setStatus("Login");
                            driveringStatusLogData.setEmployeeStatus(employeeStatus);
                            sDebug = sDebug + "1-2,";
                            driveringStatusLogViewDto.add(driveringStatusLogData);
                        }
                    } catch (Exception var38) {
                        var38.printStackTrace();
                    }
                }

                loginLog = this.lookupLoginLogDataOperation(from, to, driverId, "logoutDateTime");
                sDebug = sDebug + " >> " + loginLog.size() + ",";

                for (int i = 0; i < loginLog.size(); ++i) {
                    try {
                        if (loginLog.get(i).getLogoutDateTime() > 0L) {
                            DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById1(loginLog.get(i).get_id(), "Logout");
                            driveringStatusLogData = new DriveringStatusLogViewDto();
                            driveringStatusLogData.setDriverId(driverId);
                            driveringStatusLogData.setDriverStatusId(loginLog.get(i).get_id());
                            driveringStatusLogData.setDriverName(driverName);
                            driveringStatusLogData.setLattitude(0.0);
                            driveringStatusLogData.setLongitude(0.0);
                            driveringStatusLogData.setCustomLocation("");
                            driveringStatusLogData.setOrigin("");
                            driveringStatusLogData.setOdometer(0.0);
                            driveringStatusLogData.setEngineHour("0");
                            driveringStatusLogData.setNote("");
                            driveringStatusLogData.setIsVoilation(0L);
                            driveringStatusLogData.setLogType("Logout");
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                            driveringStatusLogData.setIsReportGenerated(1L);
                            driveringStatusLogData.setIsPreviousLog(0);
                            sDebug = sDebug + "2-1,";
                            driveringStatusLogData.setDateTime(String.valueOf(loginLog.get(i).getLogoutDateTime()));
                            driveringStatusLogData.setStatus("Logout");
                            driveringStatusLogData.setEmployeeStatus(employeeStatus);
                            sDebug = sDebug + "2-2,";
                            driveringStatusLogViewDto.add(driveringStatusLogData);
                        }
                    } catch (Exception var37) {
                        var37.printStackTrace();
                    }
                }

                List<DriveringStatusViewDto> driveringStatusViewDto = new ArrayList<>();
                Pageable pageableRequest = PageRequest.of(0, 1, Sort.by(new String[]{"utcDateTime"}).descending());
                Query query = new Query(Criteria.where("driverId").is(driverId).and("utcDateTime").lte(from).and("isVoilation").is(0).and("isVisible").is(1));
                query.limit(1);
                query.with(pageableRequest);
                List<DriveringStatusViewDto> driveringStatusViewDtoData = this.mongoTemplate.find(query, DriveringStatusViewDto.class, "drivering_status");
                if (driveringStatusViewDtoData.size() > 0) {
                    driveringStatusViewDtoData.get(0).setIsPreviousLog(1);
                    driveringStatusLogData.setIsLogDelete(1);
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(0));
                }

                driveringStatusViewDtoData = this.lookupDriverStatusDataOperation(from, to, driverId);

                for (int i = 0; i < driveringStatusViewDtoData.size(); ++i) {
                    driveringStatusViewDto.add(driveringStatusViewDtoData.get(i));
                }

                sDebug = sDebug + "List Size : " + driveringStatusViewDto.size() + "##,";

                for (int i = 0; i < driveringStatusViewDto.size(); ++i) {
                    try {
                        sDebug = sDebug + "1,";
                        DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById(driveringStatusViewDto.get(i).get_id());
                        sDebug = sDebug + "2,";
                        driveringStatusLogData = new DriveringStatusLogViewDto();
                        driveringStatusLogData.setVehicleId(driveringStatusViewDto.get(i).getVehicleId());
                        driveringStatusLogData.setDriverId(driverId);
                        driveringStatusLogData.setDriverStatusId(driveringStatusViewDto.get(i).get_id());
                        driveringStatusLogData.setDriverName(driverName);
                        sDebug = sDebug + "3,";
                        driveringStatusLogData.setDateTime(String.valueOf(driveringStatusViewDto.get(i).getUtcDateTime()));
                        driveringStatusLogData.setUtcDateTime(driveringStatusViewDto.get(i).getUtcDateTime());
                        driveringStatusLogData.setStatus(driveringStatusViewDto.get(i).getStatus());
                        sDebug = sDebug + "3-1,";
                        driveringStatusLogData.setLattitude(driveringStatusViewDto.get(i).getLattitude());
                        sDebug = sDebug + "3-2,";
                        driveringStatusLogData.setLongitude(driveringStatusViewDto.get(i).getLongitude());
                        sDebug = sDebug + "3-3,";
                        driveringStatusLogData.setCustomLocation(driveringStatusViewDto.get(i).getCustomLocation());
                        sDebug = sDebug + "3-4,";
                        driveringStatusLogData.setOrigin(driveringStatusViewDto.get(i).getOrigin());
                        sDebug = sDebug + "3-5,";
                        driveringStatusLogData.setOdometer(Double.parseDouble(df.format(driveringStatusViewDto.get(i).getOdometer())));
                        sDebug = sDebug + "3-6,";

                        try {
                            driveringStatusLogData.setEngineHour(df.format(Double.parseDouble(driveringStatusViewDto.get(i).getEngineHour())));
                        } catch (Exception var35) {
                            driveringStatusLogData.setEngineHour("0.00");
                            var35.printStackTrace();
                        }

                        driveringStatusLogData.setNote(driveringStatusViewDto.get(i).getNote());
                        sDebug = sDebug + "3-7,";
                        driveringStatusLogData.setIsVoilation((long) driveringStatusViewDto.get(i).getIsVoilation().intValue());
                        driveringStatusLogData.setLogType(driveringStatusViewDto.get(i).getLogType());
                        sDebug = sDebug + "3-8,";
                        driveringStatusLogData.setEmployeeStatus(employeeStatus);

                        try {
                            driveringStatusLogData.setStatusId(dsLog.getStatusId());
                        } catch (Exception var34) {
                            var34.printStackTrace();
                        }

                        sDebug = sDebug + "4,";
                        driveringStatusLogData.setRemainingWeeklyTime(driveringStatusViewDto.get(i).getRemainingWeeklyTime());
                        driveringStatusLogData.setRemainingDutyTime(driveringStatusViewDto.get(i).getRemainingDutyTime());
                        driveringStatusLogData.setRemainingDriveTime(driveringStatusViewDto.get(i).getRemainingDriveTime());
                        driveringStatusLogData.setRemainingSleepTime(driveringStatusViewDto.get(i).getRemainingSleepTime());
                        driveringStatusLogData.setShift(driveringStatusViewDto.get(i).getShift());
                        driveringStatusLogData.setDays(driveringStatusViewDto.get(i).getDays());
                        driveringStatusLogData.setIsReportGenerated((long) driveringStatusViewDto.get(i).getIsReportGenerated());
                        driveringStatusLogData.setIsPreviousLog(driveringStatusViewDto.get(i).getIsPreviousLog());
                        driveringStatusLogData.setIsLogDelete(1);
                        driveringStatusLogViewDto.add(driveringStatusLogData);
                        sDebug = sDebug + "5,";
                    } catch (Exception var36) {
                        var36.printStackTrace();
                    }
                }

                List<CertifiedLogViewDto> certifiedLogViewDto = this.lookupCertifiedLogDataOperation(from, to, driverId);
                sDebug = sDebug + "Certified : " + certifiedLogViewDto.size() + ",";

                for (int i = 0; i < certifiedLogViewDto.size(); ++i) {
                    try {
                        sDebug = sDebug + "6,";
                        DriverStatusLog dsLog = this.driverStatusLogRepo.findAndViewDriverStatusLogById(certifiedLogViewDto.get(i).get_id());
                        sDebug = sDebug + "7,";
                        driveringStatusLogData = new DriveringStatusLogViewDto();
                        driveringStatusLogData.setVehicleId(certifiedLogViewDto.get(i).getVehicleId());
                        driveringStatusLogData.setDriverId(driverId);
                        driveringStatusLogData.setDriverStatusId(certifiedLogViewDto.get(i).get_id());
                        driveringStatusLogData.setDriverName(driverName);
                        sDebug = sDebug + "8,";
                        driveringStatusLogData.setDateTime(String.valueOf(certifiedLogViewDto.get(i).getLCertifiedDate()));
                        driveringStatusLogData.setStatus("Certified");
                        sDebug = sDebug + "9,";
                        driveringStatusLogData.setLattitude(0.0);
                        driveringStatusLogData.setLongitude(0.0);
                        driveringStatusLogData.setCustomLocation("");
                        driveringStatusLogData.setOrigin("");
                        driveringStatusLogData.setOdometer(0.0);
                        driveringStatusLogData.setEngineHour("0");
                        driveringStatusLogData.setNote("");
                        driveringStatusLogData.setIsVoilation(0L);
                        driveringStatusLogData.setLogType("Certified Log");
                        driveringStatusLogData.setEmployeeStatus(employeeStatus);
                        driveringStatusLogData.setStatusId(dsLog.getStatusId());
                        driveringStatusLogData.setIsReportGenerated(1L);
                        driveringStatusLogData.setIsPreviousLog(0);
                        driveringStatusLogViewDto.add(driveringStatusLogData);
                        sDebug = sDebug + "10,";
                    } catch (Exception var33) {
                        var33.printStackTrace();
                    }
                }

                driveringStatusLogViewDto.sort(Comparator.comparingLong(dto -> Long.parseLong(dto.getDateTime())));

                for (int i = 0; i < driveringStatusLogViewDto.size(); ++i) {
                    long newStatusId = (long) (i + 1);
                    DriveringStatusLogViewDto log = driveringStatusLogViewDto.get(i);
                    sDebug = sDebug + "status ID: " + newStatusId + " :: " + log.getStatus() + " :: " + log.getDriverStatusId() + "\n";
                    Query updateQuery = new Query(Criteria.where("logDataId").is(log.getDriverStatusId()).and("driverId").is(driverId));
                    Update update = new Update();
                    update.set("statusId", newStatusId);
                    update.set("dateTime", log.getUtcDateTime());
                    this.mongoTemplate.updateFirst(updateQuery, update, DriverStatusLog.class);
                }

                result.setResult("Updated");
                result.setStatus(Result.SUCCESS);
                result.setMessage("Driver Status Information Send Successfully" + sDebug);
            } else {
                result.setResult(null);
                result.setStatus(Result.FAIL);
                result.setMessage("Invalid Request." + sDebug);
            }
        } catch (Exception var39) {
            result.setStatus(Result.FAIL);
            result.setMessage(var39.getLocalizedMessage() + sDebug);
        }

        return result;
    }

    @Override
    public ResultWrapper<ServerHealth> ViewServerHealth() {
        ResultWrapper<ServerHealth> result = new ResultWrapper<>();
        String sDebug = "";

        try {
            ServerHealth serverHealth = this.serverHealthRepo.findTopByOrderByReceivedTimestampDesc();
            result.setResult(serverHealth);
            result.setStatus(Result.SUCCESS);
            result.setMessage("Server Health Send Data Successfully");
        } catch (Exception var4) {
            result.setStatus(Result.FAIL);
            result.setMessage(var4.getLocalizedMessage() + sDebug);
        }

        return result;
    }
}
