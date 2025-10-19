package com.example.quizplatformf.repository;

import com.example.quizplatformf.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
