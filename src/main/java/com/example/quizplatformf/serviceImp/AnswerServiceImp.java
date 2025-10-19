package com.example.quizplatformf.serviceImp;

import com.example.quizplatformf.entity.Answer;
import com.example.quizplatformf.repository.AnswerRepository;
import com.example.quizplatformf.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImp implements AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    @Override
    public List<Answer> getAnswerList() {
        return answerRepository.findAll();
    }

    @Override
    public Answer createAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public Answer updateAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public void deleteAnswer(Answer answer) {
        answerRepository.delete(answer);
    }
}
