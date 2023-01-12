package com.springboot.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @GetMapping
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
