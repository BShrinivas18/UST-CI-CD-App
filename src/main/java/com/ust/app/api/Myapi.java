package com.ust.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myapi {
    @GetMapping
    public String SayHello(){
        String output= "Hey Brijesh and Marcus";
       return "Hello-World"+output;
    }
}
