package org.example.highlight_spring_security.dao;

import org.example.highlight_spring_security.domain.SysRole;
import org.example.highlight_spring_security.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.rmi.runtime.Log;

import java.util.List;

public interface SysRoleRepository extends JpaRepository<SysRole,Long> {

    List<SysRole> findAllById(Long id);
}
