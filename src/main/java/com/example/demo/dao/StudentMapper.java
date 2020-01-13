package com.example.demo.dao;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface StudentMapper {
    Integer add(Student student);
    Integer edit(Student student);
    Integer delete(@Param("id") Integer id);
    ArrayList getList(@Param("id") Integer id);
}
