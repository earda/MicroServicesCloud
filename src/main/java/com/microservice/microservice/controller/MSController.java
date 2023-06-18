package com.microservice.microservice.controller;


import com.microservice.microservice.bean.Boundary;
import com.microservice.microservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/boundary")
    public Boundary retrieveBoundary()
    {
        return new Boundary(configuration.getMinimum(),configuration.getMaximum());
    }


}
