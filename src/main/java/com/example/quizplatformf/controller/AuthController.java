package com.example.quizplatformf.controller;

import com.example.quizplatformf.entity.User;
import com.example.quizplatformf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.quizplatformf.dto.SignupRequest;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    //For JSON requests
    @PostMapping(value = "/signup", consumes = "application/json")
    public ResponseEntity<?> signupJson(@RequestBody SignupRequest request) {
        User savedUser = createAndSaveUser(request);
        return ResponseEntity.ok("User created with id: " + savedUser.getUser_id());
    }

    //For HTML form submissions
    @PostMapping(value = "/signup", consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<?> signupForm(@ModelAttribute SignupRequest request) {
        User savedUser = createAndSaveUser(request);
        return ResponseEntity.ok("User created with id: " + savedUser.getUser_id());
    }

    //Common logic for both
    private User createAndSaveUser(SignupRequest request) {
        User user = new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                request.getRole()
        );
        return userService.createUser(user);
    }

}
