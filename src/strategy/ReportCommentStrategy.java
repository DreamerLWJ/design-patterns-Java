package strategy;

public class ReportCommentStrategy implements ReportStrategy{
    @Override
    public ReportType supportType() {
        return ReportType.COMMENT;
    }

    @Override
    public void processReport(ReportContext context) {
        System.out.println("处理评论举报的逻辑");
    }
}
