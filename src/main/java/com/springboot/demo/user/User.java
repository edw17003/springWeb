package com.springboot.demo.user;

import java.time.LocalDate;

public class User {
    private Long id;
    private String user;
    private String email;
    private LocalDate dob;
    private Integer age;

    public User() {
    }

    public User(Long id,
                String user,
                String email,
                Integer age,
                LocalDate dob) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public User(String user,
                String email,
                Integer age,
                LocalDate dob) {
        this.user = user;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
