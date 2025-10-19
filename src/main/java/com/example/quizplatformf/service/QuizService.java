package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {
    List<Quiz> getQuizList();
    Quiz createQuiz(Quiz quiz);
    Quiz updateQuiz(Quiz quiz);
}
