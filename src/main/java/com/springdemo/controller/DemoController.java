package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
    	System.out.println("111");
    	System.out.println("22333332");
    	System.out.println("444444");
        return "demo";
    }
}