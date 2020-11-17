package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomePageController {

    @GetMapping("")
    public String welcomePage(Model model){

        model.addAttribute("pageTitle","Welcome");

        return "welcome";
    }

}
