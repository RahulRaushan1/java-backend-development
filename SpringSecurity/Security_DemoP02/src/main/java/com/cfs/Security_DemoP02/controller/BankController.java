package com.cfs.Security_DemoP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {


    @GetMapping("/contactUS")
    public String contactUS(){
        return "Contact US at: 8789287Ab";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Your money transfer successful";
    }

    @GetMapping("/admin")
    public String admin(){
        return "welcome admin";
    }

    @GetMapping("/about")
    public String about(){
        return "Rahul Raushan founder of Rahul Bank";
    }


}
