package com.ergou.springbootmybatis.test;

import com.ergou.springbootmybatis.bean.Student;
import com.ergou.springbootmybatis.myenum.DataStatusEnum;
import com.ergou.springbootmybatis.myenum.EducationEnum;

import java.util.Date;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 13:27
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("DataStatusEnum.DELETED.name() = " + DataStatusEnum.DELETED.name());
        System.out.println("DataStatusEnum.DELETED.getCode() = " + DataStatusEnum.DELETED.getCode());

    }
}
