package com.ergou.springbootmybatis.bean;

import com.ergou.springbootmybatis.myenum.DataStatusEnum;
import com.ergou.springbootmybatis.myenum.EducationEnum;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * lombok 插件的使用 注：注解的有参构造器不会继承父类的属性，若需要
 * 手动添加
 * @author 程二狗
 * @since 2019/6/25 0025 11:22
 */
@Data //包含@ToString, @EqualsAndHashCode, @Getter and @Setter
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
@Accessors(chain=true)//开启链式编程
@ToString(callSuper = true) //重写toString包含基类字段
public class Student extends BaseBean implements Serializable {

    /**---年龄--- */
    private Integer age;

    /**---姓名--- */
    private String name;

    /**---学号--- */
    private Integer no;

    /**---生日--- */
    private Date birthDay;

    /**---家庭住址（驼峰测试）--- */
    private String homeAdress;

    /**---月生活费（BigDecimal测试）--- */
    private BigDecimal monthAlimoney;

    /**---性别0 女 1 男（Byte测试）--- */
    private Byte gender;

    /**
     * 由于enum在mysql中许多坑，数据迁移也麻烦，在实际开发中我也不常用，故
     * 用（Byte)tinyint维护
     */
    /**---文化程度（枚举测试）--- */
//    private EducationEnum educationEnum;
    private Byte education;


    /**
     * 手动生成包含基类中的属性
     */
    public Student(Integer id, Date createTime, Date updateTime, Date deleteTime, Byte dataStatus, Integer age, String name, Integer no, Date birthDay, String homeAdress, BigDecimal monthAlimoney, Byte gender, Byte education) {
        super(id, createTime, updateTime, deleteTime, dataStatus);
        this.age = age;
        this.name = name;
        this.no = no;
        this.birthDay = birthDay;
        this.homeAdress = homeAdress;
        this.monthAlimoney = monthAlimoney;
        this.gender = gender;
        this.education = education;
    }
}
