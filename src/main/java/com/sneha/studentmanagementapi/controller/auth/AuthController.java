package com.sneha.studentmanagementapi.controller.auth;

import com.sneha.studentmanagementapi.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;
    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if ("admin".equals(username) && "admin".equals(password)) {
            return jwtUtil.generateToken(username, "ADMIN");
        }

        if ("user".equals(username) && "password".equals(password)) {
            return jwtUtil.generateToken(username, "USER");
        }

        throw new RuntimeException("Invalid credentials");
    }
}