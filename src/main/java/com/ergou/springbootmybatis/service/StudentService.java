package com.ergou.springbootmybatis.service;

import com.ergou.springbootmybatis.bean.Student;

import java.util.List;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 13:13
 */
public interface StudentService {
    /**
     * 获取学生列表
     * @return
     */
    List<Student> getAll();
}
