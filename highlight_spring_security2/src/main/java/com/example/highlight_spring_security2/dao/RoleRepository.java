package com.example.highlight_spring_security2.dao;

import com.example.highlight_spring_security2.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAllById(Long id);
}
