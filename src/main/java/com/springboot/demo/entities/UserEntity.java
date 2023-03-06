package com.springboot.demo.entities;

import jakarta.persistence.*;

@Entity
@Table
public class UserEntity {
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

    public UserEntity() {
    }

    public UserEntity(Long id,
                      String email,
                      String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public UserEntity(String email,
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
