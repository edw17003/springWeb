package com.springboot.demo.config;

import com.springboot.demo.entities.UserEntity;
import com.springboot.demo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig { // Loads database with starter users
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            UserEntity user1 = new UserEntity(
                    "user1@gmail.com",
                    "password1"
            );
            UserEntity user2 = new UserEntity(
                    "user2@gmail.com",
                    "testPass"
            );

            userRepository.saveAll(
                    List.of(user1, user2)
            );
        };
    }
}
