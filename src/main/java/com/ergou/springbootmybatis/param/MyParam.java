package com.ergou.springbootmybatis.param;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 18:11
 */
@Data
@ToString
public class MyParam implements Serializable {
    private Integer age;
    private String name;

}
