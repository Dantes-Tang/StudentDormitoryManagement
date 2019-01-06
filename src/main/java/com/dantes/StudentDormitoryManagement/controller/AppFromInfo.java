package com.dantes.StudentDormitoryManagement.controller;

import com.dantes.StudentDormitoryManagement.biz.service.IAppFromService;
import com.dantes.StudentDormitoryManagement.model.AppFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppFromInfo {
    @Autowired
    private IAppFromService appFromService;

    @RequestMapping("/getAppFromList")
    public List<AppFrom> getAppFromList(){
        return appFromService.getAppFromList();
    }
}
