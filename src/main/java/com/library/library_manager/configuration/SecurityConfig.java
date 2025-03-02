package com.library.library_manager.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Tắt CSRF nếu dùng API
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/**").permitAll()  // Cho phép tất cả truy cập /public/**
                        .requestMatchers("/admin/**").hasRole("ADMIN")  // Chỉ ADMIN mới được truy cập /admin/**
                        .anyRequest().authenticated() // Các API khác yêu cầu đăng nhập
                )
                .formLogin(login -> login.disable())  // Tắt form login mặc định
                .httpBasic(httpBasic -> httpBasic.disable()); // Tắt HTTP Basic

        return http.build();
    }
}

