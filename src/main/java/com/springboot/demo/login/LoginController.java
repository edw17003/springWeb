//package com.springboot.demo.login;
//
//import com.springboot.demo.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController // Tells spring that this is a restful controller. Changes how spring wires it.
//@RequestMapping(path = "api/login") // URL that the API is mapped to
//public class LoginController {
//    @Autowired
//    private LoginService loginService;
//
//    @PostMapping("/")
//    public boolean authenticateUser(@RequestBody User loginRequest) {
//        return loginService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());
//    }
//}
