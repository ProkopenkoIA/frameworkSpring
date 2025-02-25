package com.example.spring_security_demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping("/home")
    public String home(){
        return "home";
    }


    @GetMapping("/public-data")
    public String userPage(){
        return "public_page";
    }


    @GetMapping("/private-data")
    public String adminPage(){
        return "private_page";
    }


    @GetMapping("/login")
    public String auth(){
        return "login";
    }

}
