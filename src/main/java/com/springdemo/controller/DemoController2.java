package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo2")
public class DemoController2 {

    @RequestMapping("/index2")
    public String index(){
    	System.out.println("666");
    	System.out.println("6667");
    	System.out.println("6668");
        return "demo";
    }
}