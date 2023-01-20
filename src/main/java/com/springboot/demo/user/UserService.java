package com.springboot.demo.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Jake",
                        "jake.edwards@henryscheinone.com",
                        24,
                        LocalDate.of(1999, Month.JANUARY, 14)
                )
        );
    }
}
