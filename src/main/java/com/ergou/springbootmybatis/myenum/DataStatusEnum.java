package com.ergou.springbootmybatis.myenum;

/**
 * 枚举类测试
 * @author 程二狗
 * @since 2019/6/25 0025 12:53
 */
public enum DataStatusEnum {
    DELETED(-1, "已删除"),
    NORMAL(1, "正常");

    private DataStatusEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }

    private final int code;
    private final String text;

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }
}
