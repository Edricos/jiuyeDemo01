package com.example.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartController {
    @RequestMapping("/")
    public String start(){
        return "redirect:index.html";
    }
}
