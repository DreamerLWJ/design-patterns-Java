package strategy;

public class ReportService {
    public ReportRouter reportRouter = new ReportRouter();

    public void reportLogic(int reportType, String bizID, String reason) {
        ReportContext context = new ReportContext();
        context.setReportTypeCode(reportType);
        context.setBizID(bizID);
        context.setReason(reason);
        reportRouter.processReport(context);
    }
}