package com.example.demo01.controller;

import com.example.demo01.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/tea")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


//    @RequestMapping("/info")
//    public Teacher info(int id, HttpSession session){
//
//    }
}
