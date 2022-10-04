package strategy;

public interface ReportStrategy {
    ReportType supportType();

    void processReport(ReportContext context);
}
