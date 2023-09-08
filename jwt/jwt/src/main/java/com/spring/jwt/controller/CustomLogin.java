package com.spring.jwt.controller;

import com.spring.jwt.model.LoginRequest;
import com.spring.jwt.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;

@RestController
public class CustomLogin {
    @Autowired
    private AuthenticationManager authenticationManager;

    /*@PostMapping("/custom-login")
    public ResponseEntity<String> customLogin(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                loginRequest.getEmail(),
                loginRequest.getPassword()
        );
        authentication = authenticationManager.authenticate(authentication);
        return ResponseEntity.ok("Authentication successful");
    }*/
}

