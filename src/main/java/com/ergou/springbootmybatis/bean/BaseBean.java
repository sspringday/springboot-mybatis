package com.ergou.springbootmybatis.bean;

import com.ergou.springbootmybatis.myenum.DataStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体基类
 * @author 程二狗
 * @since 2019/6/25 0025 13:22
 */
@Data //包含@ToString, @EqualsAndHashCode, @Getter and @Setter
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
@Accessors(chain=true)//开启链式编程
public class BaseBean implements Serializable {
    /**---主键--- */
    protected Integer id;

    /**---创建日期--- */
    protected Date createTime;

    /**---更新日期--- */
    protected Date updateTime;

    /**---删除日期--- */
    protected Date deleteTime;

    /**---数据有效性 -1 已删除 1正常（枚举测试）--- */
//    protected DataStatusEnum dataStatus;
    private Byte dataStatus;

}
