package com.example.quizplatformf.controller;

import com.example.quizplatformf.dto.request.SignupRequest;
import com.example.quizplatformf.dto.request.loginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInFormController {
    @GetMapping("/signin")
    public String signinForm(Model model) {
        model.addAttribute("loginRequest", new loginRequest());
        return "signin";
    }
}
