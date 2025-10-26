package com.example.quizplatformf.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class loginResponse {
    private Long user_id;
    private String email;
    private String password;
}
