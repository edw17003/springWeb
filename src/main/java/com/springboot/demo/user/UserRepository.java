package com.springboot.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository // Makes this our data access layer. All that's necessary is the interface declaration extending our JpaRepository
public interface UserRepository
        extends JpaRepository<User, Long> {

    // Built in Spring method. Equivalent to "SELECT * FROM user WHERE email = ?"
    Optional<User> findUserByEmail(String email);
}
