package com.mes.eld_log.models;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document(
        collection = "driver_status_log"
)
public class DriverStatusLog implements Serializable {

    private static final long serialVersionUID = 1L;
    private long statusId;
    private String logDataId;
    private long driverId;
    private long vehicleId;
    private long clientId;
    private String status;
    private double lattitude;
    private double longitude;
    private long dateTime;
    private String logType;
    private String engineHour;
    private String origin;
    private double odometer;
    private Integer isVoilation;
    private String note;
    private String customLocation;
    private Integer isReportGenerated;
    private long receivedTimestamp;
    private Integer isVisible;
    private String cdlNo;
    private Integer cdlStateId;
    private Integer cdlCountryId;
    private String cdlStateCode;

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof DriverStatusLog)) {
            return false;
        } else {
            DriverStatusLog other = (DriverStatusLog) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStatusId() != other.getStatusId()) {
                return false;
            } else if (this.getDriverId() != other.getDriverId()) {
                return false;
            } else if (this.getVehicleId() != other.getVehicleId()) {
                return false;
            } else if (this.getClientId() != other.getClientId()) {
                return false;
            } else if (Double.compare(this.getLattitude(), other.getLattitude()) != 0) {
                return false;
            } else if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) {
                return false;
            } else if (this.getDateTime() != other.getDateTime()) {
                return false;
            } else if (Double.compare(this.getOdometer(), other.getOdometer()) != 0) {
                return false;
            } else if (this.getReceivedTimestamp() != other.getReceivedTimestamp()) {
                return false;
            } else {
                Object this$isVoilation = this.getIsVoilation();
                Object other$isVoilation = other.getIsVoilation();
                if (this$isVoilation == null ? other$isVoilation == null : this$isVoilation.equals(other$isVoilation)) {
                    Object this$isReportGenerated = this.getIsReportGenerated();
                    Object other$isReportGenerated = other.getIsReportGenerated();
                    if (this$isReportGenerated == null ? other$isReportGenerated == null : this$isReportGenerated.equals(other$isReportGenerated)) {
                        Object this$isVisible = this.getIsVisible();
                        Object other$isVisible = other.getIsVisible();
                        if (this$isVisible == null ? other$isVisible == null : this$isVisible.equals(other$isVisible)) {
                            Object this$logDataId = this.getLogDataId();
                            Object other$logDataId = other.getLogDataId();
                            if (this$logDataId == null ? other$logDataId == null : this$logDataId.equals(other$logDataId)) {
                                Object this$status = this.getStatus();
                                Object other$status = other.getStatus();
                                if (this$status == null ? other$status == null : this$status.equals(other$status)) {
                                    Object this$logType = this.getLogType();
                                    Object other$logType = other.getLogType();
                                    if (this$logType == null ? other$logType == null : this$logType.equals(other$logType)) {
                                        Object this$engineHour = this.getEngineHour();
                                        Object other$engineHour = other.getEngineHour();
                                        if (this$engineHour == null ? other$engineHour == null : this$engineHour.equals(other$engineHour)) {
                                            Object this$origin = this.getOrigin();
                                            Object other$origin = other.getOrigin();
                                            if (this$origin == null ? other$origin == null : this$origin.equals(other$origin)) {
                                                Object this$note = this.getNote();
                                                Object other$note = other.getNote();
                                                if (this$note == null ? other$note == null : this$note.equals(other$note)) {
                                                    Object this$customLocation = this.getCustomLocation();
                                                    Object other$customLocation = other.getCustomLocation();
                                                    return this$customLocation == null ? other$customLocation == null : this$customLocation.equals(other$customLocation);
                                                } else {
                                                    return false;
                                                }
                                            } else {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DriverStatusLog;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $statusId = this.getStatusId();
        result = result * 59 + (int) ($statusId >>> 32 ^ $statusId);
        long $driverId = this.getDriverId();
        result = result * 59 + (int) ($driverId >>> 32 ^ $driverId);
        long $vehicleId = this.getVehicleId();
        result = result * 59 + (int) ($vehicleId >>> 32 ^ $vehicleId);
        long $clientId = this.getClientId();
        result = result * 59 + (int) ($clientId >>> 32 ^ $clientId);
        long $lattitude = Double.doubleToLongBits(this.getLattitude());
        result = result * 59 + (int) ($lattitude >>> 32 ^ $lattitude);
        long $longitude = Double.doubleToLongBits(this.getLongitude());
        result = result * 59 + (int) ($longitude >>> 32 ^ $longitude);
        long $dateTime = this.getDateTime();
        result = result * 59 + (int) ($dateTime >>> 32 ^ $dateTime);
        long $odometer = Double.doubleToLongBits(this.getOdometer());
        result = result * 59 + (int) ($odometer >>> 32 ^ $odometer);
        long $receivedTimestamp = this.getReceivedTimestamp();
        result = result * 59 + (int) ($receivedTimestamp >>> 32 ^ $receivedTimestamp);
        Object $isVoilation = this.getIsVoilation();
        result = result * 59 + ($isVoilation == null ? 43 : $isVoilation.hashCode());
        Object $isReportGenerated = this.getIsReportGenerated();
        result = result * 59 + ($isReportGenerated == null ? 43 : $isReportGenerated.hashCode());
        Object $isVisible = this.getIsVisible();
        result = result * 59 + ($isVisible == null ? 43 : $isVisible.hashCode());
        Object $logDataId = this.getLogDataId();
        result = result * 59 + ($logDataId == null ? 43 : $logDataId.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $logType = this.getLogType();
        result = result * 59 + ($logType == null ? 43 : $logType.hashCode());
        Object $engineHour = this.getEngineHour();
        result = result * 59 + ($engineHour == null ? 43 : $engineHour.hashCode());
        Object $origin = this.getOrigin();
        result = result * 59 + ($origin == null ? 43 : $origin.hashCode());
        Object $note = this.getNote();
        result = result * 59 + ($note == null ? 43 : $note.hashCode());
        Object $customLocation = this.getCustomLocation();
        return result * 59 + ($customLocation == null ? 43 : $customLocation.hashCode());
    }

    @Override
    public String toString() {
        return "DriverStatusLog(statusId="
                + this.getStatusId()
                + ", logDataId="
                + this.getLogDataId()
                + ", driverId="
                + this.getDriverId()
                + ", vehicleId="
                + this.getVehicleId()
                + ", clientId="
                + this.getClientId()
                + ", status="
                + this.getStatus()
                + ", lattitude="
                + this.getLattitude()
                + ", longitude="
                + this.getLongitude()
                + ", dateTime="
                + this.getDateTime()
                + ", logType="
                + this.getLogType()
                + ", engineHour="
                + this.getEngineHour()
                + ", origin="
                + this.getOrigin()
                + ", odometer="
                + this.getOdometer()
                + ", isVoilation="
                + this.getIsVoilation()
                + ", note="
                + this.getNote()
                + ", customLocation="
                + this.getCustomLocation()
                + ", isReportGenerated="
                + this.getIsReportGenerated()
                + ", receivedTimestamp="
                + this.getReceivedTimestamp()
                + ", isVisible="
                + this.getIsVisible()
                + ")";
    }

    public long getStatusId() {
        return this.statusId;
    }

    public String getLogDataId() {
        return this.logDataId;
    }

    public long getDriverId() {
        return this.driverId;
    }

    public long getVehicleId() {
        return this.vehicleId;
    }

    public long getClientId() {
        return this.clientId;
    }

    public String getStatus() {
        return this.status;
    }

    public double getLattitude() {
        return this.lattitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public long getDateTime() {
        return this.dateTime;
    }

    public String getLogType() {
        return this.logType;
    }

    public String getEngineHour() {
        return this.engineHour;
    }

    public String getOrigin() {
        return this.origin;
    }

    public double getOdometer() {
        return this.odometer;
    }

    public Integer getIsVoilation() {
        return this.isVoilation;
    }

    public String getNote() {
        return this.note;
    }

    public String getCustomLocation() {
        return this.customLocation;
    }

    public Integer getIsReportGenerated() {
        return this.isReportGenerated;
    }

    public long getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    public Integer getIsVisible() {
        return this.isVisible;
    }

    public void setStatusId(final long statusId) {
        this.statusId = statusId;
    }

    public void setLogDataId(final String logDataId) {
        this.logDataId = logDataId;
    }

    public void setDriverId(final long driverId) {
        this.driverId = driverId;
    }

    public void setVehicleId(final long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setClientId(final long clientId) {
        this.clientId = clientId;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public void setLattitude(final double lattitude) {
        this.lattitude = lattitude;
    }

    public void setLongitude(final double longitude) {
        this.longitude = longitude;
    }

    public void setDateTime(final long dateTime) {
        this.dateTime = dateTime;
    }

    public void setLogType(final String logType) {
        this.logType = logType;
    }

    public void setEngineHour(final String engineHour) {
        this.engineHour = engineHour;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public void setOdometer(final double odometer) {
        this.odometer = odometer;
    }

    public void setIsVoilation(final Integer isVoilation) {
        this.isVoilation = isVoilation;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public void setCustomLocation(final String customLocation) {
        this.customLocation = customLocation;
    }

    public void setIsReportGenerated(final Integer isReportGenerated) {
        this.isReportGenerated = isReportGenerated;
    }

    public void setReceivedTimestamp(final long receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }

    public void setIsVisible(final Integer isVisible) {
        this.isVisible = isVisible;
    }

    public String getCdlNo() {
        return this.cdlNo;
    }

    public void setCdlNo(String cdlNo) {
        this.cdlNo = cdlNo;
    }

    public Integer getCdlStateId() {
        return this.cdlStateId;
    }

    public void setCdlStateId(Integer cdlStateId) {
        this.cdlStateId = cdlStateId;
    }

    public Integer getCdlCountryId() {
        return this.cdlCountryId;
    }

    public void setCdlCountryId(Integer cdlCountryId) {
        this.cdlCountryId = cdlCountryId;
    }

    public String getCdlStateCode() {
        return this.cdlStateCode;
    }

    public void setCdlStateCode(String cdlStateCode) {
        this.cdlStateCode = cdlStateCode;
    }

}
