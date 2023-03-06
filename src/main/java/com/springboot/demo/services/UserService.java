package com.springboot.demo.services;

import com.springboot.demo.entities.UserEntity;
import com.springboot.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(UserEntity user) {
        // Checks if any users already have the given address
        Optional<UserEntity> userByEmail = userRepository.findUserByEmail(user.getEmail());
        // If so, reject the post request. Otherwise, save the user to the database
        if(userByEmail.isPresent()) {
            throw new IllegalStateException("email address is already taken");
        } else {
            userRepository.save(user);
        }
    }

    public void deleteUser(Long userId) {
        // Checks if there are any users with the given id
        boolean userExists = userRepository.existsById(userId);
        // If there aren't, reject the DELETE request. Otherwise, delete the given user
        if (!userExists) {
            throw new IllegalStateException("user does not exist");
        } else {
            userRepository.deleteById(userId);
        }
    }

    public boolean authenticateUser(String email, String password) {
        Optional<UserEntity> userOptional = userRepository.findUserByEmail(email);
        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

//    public boolean existsById(long id) {
//        return userRepository.existsById(id);
//    }
//
//    public boolean existsByEmail(String email) {
//        Optional<User> user = userRepository.findUserByEmail(email);
//        return user.isPresent();
//    }
}
