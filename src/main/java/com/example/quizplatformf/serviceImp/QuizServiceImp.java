package com.example.quizplatformf.serviceImp;


import com.example.quizplatformf.entity.Quiz;
import com.example.quizplatformf.repository.QuizRepository;
import com.example.quizplatformf.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImp implements QuizService {
    @Autowired
    QuizRepository quizRepository;
    @Override
    public List<Quiz> getQuizList() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Quiz quiz) {
        quizRepository.delete(quiz);
    }

    public Quiz updateQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }
}
