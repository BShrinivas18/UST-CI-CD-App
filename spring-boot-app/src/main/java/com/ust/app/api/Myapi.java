package com.ust.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myapi {
    @GetMapping
    public void Myapi(String[] args) {
        System.out.println("Hello-World");
    }
}
