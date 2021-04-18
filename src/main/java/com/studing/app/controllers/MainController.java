package com.studing.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        return "home";
    }


    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("title", "Cart");
        return "cart";
    }

    @RequestMapping("/app")
    public String app(Model model) {
        model.addAttribute("title", "AppMain");
        return "app-main";
    }



}

