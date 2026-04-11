package com.example.movie_review_system.repository;

import com.example.movie_review_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Find user by userName (for LogIn)
    Optional<User> findByUsername(String username);

    // Find user by email to prevent duplicate registration
    Optional<User> findByEmail(String email);

    //Check if userName exists
    boolean existsByUsername(String username);

    //Check if email already exist
    boolean existsByEmail(String email);

    //Find user by username (case-insensitive)
    Optional<User> findByUsernameIgnoreCase(String username);
}