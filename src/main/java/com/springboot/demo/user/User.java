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
    private String user;
    private String email;
    private LocalDate dob;
    @Transient // Specifies that this should not be stored to database, it will only be returned in the GET request
    private Integer age;

    public User() {
    }

    public User(Long id,
                String user,
                String email,
                LocalDate dob) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.dob = dob;
    }

    public User(String user,
                String email,
                LocalDate dob) {
        this.user = user;
        this.email = email;
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
        // calculates age based on date of birth
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
    public LocalDate getDob() {
        return dob;
    }
}
