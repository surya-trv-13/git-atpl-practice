package com.aaslin.spring_security.models;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
