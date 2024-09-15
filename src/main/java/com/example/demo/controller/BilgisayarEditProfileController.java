package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarEditProfileController {

    @GetMapping ("/edit_profile")
    public String mainPageG(){
        return "edit_profile";
    }

    @PostMapping("/edit_profile")
    public String mainPageP(String name, String cardNumber, String email){
        System.out.println(name+" "+cardNumber+" "+email);
        return "edit_profile";
    }

}
