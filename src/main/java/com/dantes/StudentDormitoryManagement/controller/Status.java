package com.dantes.StudentDormitoryManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

    @RequestMapping("/status")
    public String statusCheck(){
        return "SUCCESS";
    }
}
