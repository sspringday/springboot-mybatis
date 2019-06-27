package com.ergou.springbootmybatis.mapper;

import com.ergou.springbootmybatis.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 13:14
 */
@Mapper
public interface StudentMapper {
    /**
     * 获取学生列表
     * @return
     */
//    @Select("select * from tb_student ")
    List<Student> getAll();
}
