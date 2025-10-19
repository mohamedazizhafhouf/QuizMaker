package com.example.quizplatformf.dto;

import com.example.quizplatformf.entity.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
