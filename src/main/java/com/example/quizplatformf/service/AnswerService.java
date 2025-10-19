package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {
    List<Answer> getAnswerList();
    void deleteAnswer(Answer answer);
    Answer createAnswer(Answer answer);
    Answer updateAnswer(Answer answer);
}
