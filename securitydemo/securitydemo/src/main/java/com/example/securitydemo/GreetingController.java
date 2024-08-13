package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// right click on java -> mark directory  as -> source root

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String Sayhello(){
        return "hello";
    }
}
