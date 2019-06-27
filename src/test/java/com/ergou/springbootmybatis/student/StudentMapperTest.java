package com.ergou.springbootmybatis.student;

import com.ergou.springbootmybatis.bean.Student;
import com.ergou.springbootmybatis.mapper.StudentMapper;
import com.ergou.springbootmybatis.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 14:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StudentService studentService;

    @Test
    public void  getAll(){
        List<Student> all = studentMapper.getAll();
        for (Student student : all) {
            System.out.println(student);
        }
    }
}
