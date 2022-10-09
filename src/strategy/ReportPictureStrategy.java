package strategy;

public class ReportPictureStrategy implements ReportStrategy{
    @Override
    public ReportType supportType() {
        return ReportType.PICTURE;
    }

    @Override
    public void processReport(ReportContext context) {
        System.out.println("处理图片举报的逻辑");
    }
}
