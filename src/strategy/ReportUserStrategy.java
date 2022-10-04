package strategy;

public class ReportUserStrategy implements ReportStrategy{
    @Override
    public ReportType supportType() {
        return ReportType.USER;
    }

    @Override
    public void processReport(ReportContext context) {
        System.out.println("处理用户举报的逻辑");
    }
}
