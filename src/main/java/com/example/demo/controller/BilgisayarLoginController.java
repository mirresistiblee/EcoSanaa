package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarLoginController {

    @GetMapping ("/login")
    public String mainPageG(){
        return "login";
    }

    @PostMapping("/login")
    public String mainPageP(String login, String password){
        System.out.println(login+" "+password);
        return "login";
    }

}
