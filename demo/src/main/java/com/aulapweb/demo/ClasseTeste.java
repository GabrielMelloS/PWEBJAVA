package com.aulapweb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasseTeste{
    @GetMapping("/")
    public String hi(){
        return "Hi, Adriano!";
    }
}