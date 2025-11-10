package com.projetoPOO.portal_noticias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
