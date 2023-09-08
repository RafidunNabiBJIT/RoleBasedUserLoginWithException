package com.spring.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/amigos")
    public String amigos(){
        return "Hello. I an admin amigos.";
    }

    @GetMapping("/techie")
    public String techie(){
        return "Hello. I an admin techie.";
    }

    @GetMapping("/buffer")
    public String buffercode(){
        return "Hello. I an admin buffercode.";
    }
}
