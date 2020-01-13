package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping("/add")
    public Integer add(Student student){
        return studentService.add(student);
    }

    @PutMapping("/edit")
    public String edit(Student student){
        int returnNumber=studentService.edit(student);
        if(returnNumber==1){
            return "修改成功";
        }else if(returnNumber==11){
            return "丢失参数";
        }else{
            return "更新失败";
        }
    }

    @RequestMapping("/getList")
    public ArrayList getList(Integer id){
        return studentService.getList(id);
    }
}
