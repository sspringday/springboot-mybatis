package com.ergou.springbootmybatis.myenum;

/**
 * 枚举类测试
 * @author 程二狗
 * @since 2019/6/25 0025 12:01
 */
public enum EducationEnum {
    MIDDLE(1,"初中"),HIGH(2,"高中"), JUNIOR(3,"大专"),
    COLLEGE(4,"本科"),MASTER(5,"硕士"),DOCTORATE(6,"博士");

    private final int code;
    private final String name;
    private EducationEnum(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
