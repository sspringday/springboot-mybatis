package com.ergou.springbootmybatis.controller;

import com.ergou.springbootmybatis.bean.Student;
import com.ergou.springbootmybatis.param.MyParam;
import com.ergou.springbootmybatis.service.StudentService;
import com.ergou.springbootmybatis.web.json.DefaultResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 程二狗
 * @since 2019/6/25 0025 13:15
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/getAll")
    public DefaultResponseJson getAll(){
        List<Student> studentList = studentService.getAll();
        System.out.println(new DefaultResponseJson(studentList).toJson());
        return DefaultResponseJson.ok(studentList);
    }

    @RequestMapping("/getMyParam")
    public void  getMyParam(@RequestBody MyParam param){
        System.out.println(param);
    }
}
