package com.springboot.demo.controllers;

import com.springboot.demo.entities.UserEntity;
import com.springboot.demo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Tells spring that this is a restful controller. Changes how spring wires it.
@RequestMapping(path = "api/login") // URL that the API is mapped to
public class LoginController {
    private final LoginService loginService;

    @Autowired // Enables spring to wire relationships in program. Necessary for most spring annotations
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("")
    public boolean authenticateUser(@RequestBody UserEntity loginRequest) {
        return loginService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());
    }
}
