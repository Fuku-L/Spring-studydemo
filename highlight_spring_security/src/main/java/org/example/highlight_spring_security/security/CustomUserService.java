package org.example.highlight_spring_security.security;

import org.example.highlight_spring_security.dao.SysRoleRepository;
import org.example.highlight_spring_security.dao.SysUserRepository;
import org.example.highlight_spring_security.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;
    @Autowired
    SysRoleRepository sysRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username："+username);
        SysUser user = sysUserRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        user.setRoles(sysRoleRepository.findAllById(user.getId()));
        System.out.println("user.getRoles()--"+user.getRoles());
        return user;
    }
}
