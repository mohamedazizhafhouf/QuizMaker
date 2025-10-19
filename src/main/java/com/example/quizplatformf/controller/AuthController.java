package com.example.quizplatformf.controller;

import com.example.quizplatformf.entity.User;
import com.example.quizplatformf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.quizplatformf.dto.SignupRequest;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest request) {
        User user = new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                request.getRole()
        );
        User savedUser = userService.createUser(user);
        return ResponseEntity.ok("User created with id: " + savedUser.getUser_id());
    }
}
