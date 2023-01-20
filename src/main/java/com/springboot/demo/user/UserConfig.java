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
                    "User1",
                    "user1@gmail.com",
                    LocalDate.of(1985, Month.MARCH, 10)
            );
            User user2 = new User(
                    "User2",
                    "user2@gmail.com",
                    LocalDate.of(1984, Month.NOVEMBER, 26)
            );

            userRepository.saveAll(
                    List.of(user1, user2)
            );
        };
    }
}
