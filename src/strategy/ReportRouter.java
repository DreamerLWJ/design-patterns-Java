package strategy;

public class ReportRouter {

    private ReportStrategy[] strategies;

    public ReportRouter() {
        // 初始化策略数组
        strategies = new ReportStrategy[]{
                new ReportUserStrategy(),
                new ReportCommentStrategy(),
                new ReportTopicStrategy(),
                new ReportPictureStrategy()};
    }

    public void processReport(ReportContext context) {
        ReportType type = ReportType.getByCode(context.getReportTypeCode());
        for (ReportStrategy strategy : strategies) {
            // 判断是否为该策略处理
            if (strategy.supportType() == type) {
                strategy.processReport(context);
            }
        }
    }
}