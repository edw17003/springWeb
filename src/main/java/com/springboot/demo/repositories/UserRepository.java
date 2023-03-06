package com.springboot.demo.repositories;

import com.springboot.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository // Makes this our data access layer. All that's necessary is the interface declaration extending our JpaRepository
public interface UserRepository
        extends JpaRepository<UserEntity, Long> {

    // Built in Spring method. Equivalent to "SELECT * FROM user WHERE email = ?"
    Optional<UserEntity> findUserByEmail(String email);
}
