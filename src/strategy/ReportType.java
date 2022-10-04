package strategy;

public enum ReportType {
    TOPIC(1, "帖子"), COMMENT(2, "评论"), USER(3, "用户");

    private int code;

    private String desc;

    ReportType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ReportType getByCode(int code) {
        for (ReportType value : ReportType.values()) {
            if (value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("code invalid");
    }
}
