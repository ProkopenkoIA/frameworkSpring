package org.example.controllers;

import org.example.domain.Input;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    private Input inputDefault = new Input();

    @RequestMapping("/home")
    public String home(Model model) {
        String message1 = "Урок 4. Spring MVC. Использование шаблонизатора Thymeleaf";
        String message2 = "Это обычная страница";
        model.addAttribute("message1", message1);
        model.addAttribute("message2", message2);
        return "home";
    }

    @GetMapping("/task")
    public String task(Model model) {
        Input inputDefault = new Input();
        model.addAttribute("input", inputDefault);
        return "task";
    }

    @PostMapping("/task")
    public String formSubmit(Input i, Model model) {
        model.addAttribute("input", i);
        return "task";
    }
}
