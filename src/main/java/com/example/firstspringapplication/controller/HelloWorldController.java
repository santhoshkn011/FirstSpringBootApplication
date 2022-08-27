package com.example.firstspringapplication.controller;

import com.example.firstspringapplication.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringApp")
public class HelloWorldController {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String newData(){
        String data = "<h1>Hello From Santhosh!!!</h1>" + "<font color=Blue>Successful Controller Run.</font>";
        return data;
    }

    /*Dependency Injection of layer
    Created Auto object of Service layer
    */
    @Autowired
    ServiceClass service;
    @RequestMapping(value = "/logic", method = RequestMethod.GET)
    public String logicData(){
        String anotherData = service.logicalCoding();
        return anotherData;
    }

    //API using parameter
    @RequestMapping(value = {"/logic/{name}"}, method = RequestMethod.GET)
    public String anotherLogicData(@PathVariable String name) {
        String anotherData = service.logicalCoding();
        return "Hello " + name + "!" + anotherData;
    }
}