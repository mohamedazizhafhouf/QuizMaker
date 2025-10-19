package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {
    Quiz getQuizById(int id);
    List<Quiz> getQuizList();
    Quiz createQuiz(Quiz quiz);
    void deleteQuiz(int id);
    void updateQuiz(Quiz quiz);
}
