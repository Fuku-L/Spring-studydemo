package com.example.highlight_spring_security2.dao;

import com.example.highlight_spring_security2.domain.Role;
import com.example.highlight_spring_security2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
