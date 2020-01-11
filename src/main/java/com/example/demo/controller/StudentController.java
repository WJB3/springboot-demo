package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @RequestMapping("/")
    public String hello(){
        return "hello student";
    }

    @RequestMapping("/list")
    public Student list(){
        return StudentService;
    }
}
