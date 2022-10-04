package strategy;

public class ReportContext {
    private int reportTypeCode;

    private String bizID;

    private String reason;

    public int getReportTypeCode() {
        return reportTypeCode;
    }

    public void setReportTypeCode(int reportTypeCode) {
        this.reportTypeCode = reportTypeCode;
    }

    public String getBizID() {
        return bizID;
    }

    public void setBizID(String bizID) {
        this.bizID = bizID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
