package com.example.quizplatformf;

import com.example.quizplatformf.entity.User;
import com.example.quizplatformf.entity.enums.Role;
import com.example.quizplatformf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizPlatformfApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(QuizPlatformfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }

}
