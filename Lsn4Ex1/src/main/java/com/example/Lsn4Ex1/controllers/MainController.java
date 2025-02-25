package com.example.Lsn4Ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class MainController {

    @RequestMapping("/random")
    public String getRandomNumber(Model model){
        Random random = new Random();
        model.addAttribute("number", random.nextInt(100)+1);
        return "random.html";
    }
}
