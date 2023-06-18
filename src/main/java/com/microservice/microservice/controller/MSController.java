package com.microservice.microservice.controller;


import com.microservice.microservice.bean.Boundary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSController {

    @GetMapping("/boundary")
    public Boundary retrieveBoundary()
    {
        return new Boundary(1,1000);
    }

}
