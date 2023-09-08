package com.spring.jwt.controller;

import com.spring.jwt.entity.UserEntity;
import com.spring.jwt.model.UserDto;
import com.spring.jwt.model.UserRegistrationResponse;
import com.spring.jwt.repository.UserRepository;
import com.spring.jwt.service.UserService;
import com.spring.jwt.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/amigos")
    public String amigos(){
        return "Hello. I am user amigos.";
    }

    @GetMapping("/techie")
    public String techie(){
        return "Hello. I am user techie.";
    }

    @GetMapping("/buffer")
    public String buffer(){
        return "Hello. I am user buffercode.";
    }

}

