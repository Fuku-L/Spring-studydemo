package com.example.highlight_spring_security2.service;

import com.example.highlight_spring_security2.dao.RoleRepository;
import com.example.highlight_spring_security2.dao.UserRepository;
import com.example.highlight_spring_security2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("账户不存在");
        }
        user.setRoles(roleRepository.findAllById(user.getId()));
        return user;
    }
}
