package com.springboot.demo.controllers;

import com.springboot.demo.entities.UserEntity;
import com.springboot.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Tells spring that this is a restful controller. Changes how spring wires it.
@RequestMapping(path = "api/v1/user") // URL that the API is mapped to
public class UserController {
    private final UserService userService;

    @Autowired // Enables spring to wire relationships in program. Necessary for most spring annotations
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping // Wires as GET request
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }

    @PostMapping // Wires as POST request
    public String addUser(@RequestBody UserEntity user) { // @RequestBody takes the request and maps it to the user
        userService.addUser(user);
        return "User added";
    }

    @DeleteMapping(path="{userId}") // Wires as DELETE request
    public String deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
        return "User " + userId + " deleted";
    }

    @PostMapping("/login")
    public boolean authenticateUser(@RequestBody UserEntity loginRequest) {
        return userService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());
    }
}
