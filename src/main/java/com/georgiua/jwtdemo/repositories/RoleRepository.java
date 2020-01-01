package com.georgiua.jwtdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.georgiua.jwtdemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
