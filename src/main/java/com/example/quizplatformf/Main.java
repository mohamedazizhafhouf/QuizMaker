package com.example.quizplatformf;

import com.example.quizplatformf.entity.User;
import com.example.quizplatformf.entity.enums.Role;
import com.example.quizplatformf.service.UserService;
import com.example.quizplatformf.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;



public class Main {

    public static void main(String[] args) {
        SpringApplication.run(QuizPlatformfApplication.class, args);

    }
}
