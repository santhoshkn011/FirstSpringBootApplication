package com.example.firstspringapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class HelloWorldController {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String newData(){
        String data = "<h1>Hello From Santhosh!!!</h1>" + "<font color=Blue>Successful Controller Run.</font>";
        return data;
    }
}