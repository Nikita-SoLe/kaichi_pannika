package com.kaichi_pannika.gamespacework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/mainPage")
    public String mainPage() {
       return "startpage";
    }
}
