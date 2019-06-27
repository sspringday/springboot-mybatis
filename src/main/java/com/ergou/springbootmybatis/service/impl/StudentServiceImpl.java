package com.ergou.springbootmybatis.service.impl;

import com.ergou.springbootmybatis.bean.Student;
import com.ergou.springbootmybatis.mapper.StudentMapper;
import com.ergou.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 13:13
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
