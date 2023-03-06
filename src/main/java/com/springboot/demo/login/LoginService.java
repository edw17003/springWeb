//package com.springboot.demo.login;
//
//import com.springboot.demo.entities.User;
//import com.springboot.demo.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LoginService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public boolean authenticateUser(String username, String password) {
//        boolean isValidUser = false;
//        User user = userRepository.findByUsername(username);
//        if (user != null && user.getPassword().equals(password)) {
//            isValidUser = true;
//        }
//        return isValidUser;
//    }
//}
