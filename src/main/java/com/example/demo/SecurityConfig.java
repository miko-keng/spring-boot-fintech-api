package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()) // Disable CSRF for H2
                .headers(headers -> headers.frameOptions(frame -> frame.disable())) // Allow frames for H2
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // Allow everything for now
        return http.build();
    }
}