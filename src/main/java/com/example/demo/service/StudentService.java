package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.ArrayList;


public interface StudentService {
    Integer add(Student student);
    Integer edit(Student student);
    Integer delete(Integer id);
    ArrayList getList(Integer id);

}

