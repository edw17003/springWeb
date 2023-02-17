package com.springboot.demo.user;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class User {
    @Id // Boilerplate spring annotations to auto-generate each user ID
    @SequenceGenerator(
            name="user_sequence",
            sequenceName="user_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="user_sequence"
    )
    private Long id;
    private String email;
    private String password;

    public User() {
    }

    public User(Long id,
                String email,
                String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(String email,
                String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
}
