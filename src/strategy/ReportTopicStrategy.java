package strategy;

public class ReportTopicStrategy implements ReportStrategy{
    @Override
    public ReportType supportType() {
        return ReportType.TOPIC;
    }

    @Override
    public void processReport(ReportContext context) {
        System.out.println("处理帖子举报的逻辑");
    }
}
