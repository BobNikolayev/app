package com.studing.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        return "home";
    }

//    @GetMapping("/cart")
//    public String cart(Model model) {
//        model.addAttribute("title", "Cart");
//        return "cart";
//    }


}

