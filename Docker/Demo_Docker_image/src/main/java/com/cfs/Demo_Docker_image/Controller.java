package com.cfs.Demo_Docker_image;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Controller {

    @GetMapping
    public String welcome(){

        return "Welcome to docker";
    }
}
