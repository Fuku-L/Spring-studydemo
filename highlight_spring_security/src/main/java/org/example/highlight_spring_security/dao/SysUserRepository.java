package org.example.highlight_spring_security.dao;

import org.example.highlight_spring_security.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Long> {

    SysUser findByUsername(String username);

}
