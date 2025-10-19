package com.example.quizplatformf.repository;

import com.example.quizplatformf.entity.Answer;
import com.example.quizplatformf.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
