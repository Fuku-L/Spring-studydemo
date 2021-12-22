package org.example.highlight_spring_security.config;

import org.example.highlight_spring_security.security.CustomUserService;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    UserDetailsService customUserService(){
        return new CustomUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService());
        /*
        // 将用户存在内存中
        auth.inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ROLE_ADMIN","ROLE_USER")
                .and()
                .withUser("lifz").password("lifz").roles("ROLE_USER");
        */
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated() // 所有请求需要登录认证后才能访问
                .and()
                .formLogin()// 登录页面可以任意访问
                    .loginPage("/login")
                    .permitAll()
                .successForwardUrl("/home")
                .and()
                .logout().permitAll(); // 注销请求可以任意访问
    }
}
