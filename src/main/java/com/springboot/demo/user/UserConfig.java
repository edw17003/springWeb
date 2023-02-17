package com.springboot.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig { // Loads database with starter users
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User(
                    "user1@gmail.com",
                    "password1"
            );
            User user2 = new User(
                    "user2@gmail.com",
                    "testPass"
            );

            userRepository.saveAll(
                    List.of(user1, user2)
            );
        };
    }
}
