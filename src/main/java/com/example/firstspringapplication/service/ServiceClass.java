package com.example.firstspringapplication.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public String logicalCoding (){
        String logic = "<h1>This is because of logical coding.</h1>" + "<font color=Green>Successful Service Run.</font>";
        return logic;
    }
}
