package com.georgiua.jwtdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.georgiua.jwtdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}