package com.example.demo.service.impl;

import com.example.demo.dao.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public Integer add(Student student){
        return studentMapper.add(student);
    }

    public Integer edit(Student student){
        if(student.getName()==null && student.getNo()==null){
            return 11;
        }
        return studentMapper.edit(student);
    }

    public Integer delete(Integer id){
        return studentMapper.delete(id);
    }

    public ArrayList getList(Integer id){
        return studentMapper.getList(id);
    }
}
