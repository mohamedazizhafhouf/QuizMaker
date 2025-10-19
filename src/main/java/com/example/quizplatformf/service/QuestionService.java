package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {
    List<Question> getQuestionList();
    void deleteQuestion(Question question);
    void updateQuestion(Question question);
    Question createQuestion(Question question);
}
