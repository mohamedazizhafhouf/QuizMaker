package com.example.quizplatformf.repository;

import com.example.quizplatformf.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
