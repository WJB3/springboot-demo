package com.example.demo.controller;

import com.example.demo.core.ret.ResResponse;
import com.example.demo.core.ret.ResResult;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping
    public String add(Student student){
        int returnNumber=studentService.add(student);
        if(returnNumber==1){
            return "添加成功";
        }else{
            return "添加失败";
        }

    }

    @PutMapping
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

    @DeleteMapping
    public String delete(Integer id){
        int returnNumber=studentService.delete(id);
        if(returnNumber==1){
            return "删除成功";
        }else{
            return "删除失败";
        }

    }

    @RequestMapping
    public ResResult<List> getList(Integer id){
        List arrayList=studentService.getList(id);
        return ResResponse.makeOKRsp(arrayList);
    }
}
