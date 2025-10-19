package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {
    List<Question> getQuestionList();
    Question getQuestionById(int id);
    void deleteQuestion(int id);
    void updateQuestion(Question question);
    Question createQuestion(Question question);
}
