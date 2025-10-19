package com.example.quizplatformf.service;

import com.example.quizplatformf.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {
    List<Answer> getAnswerList();
    Answer getAnswerById(int id);
    void deleteAnswer(int id);
    Answer createAnswer(Answer answer);
    Answer updateAnswer(Answer answer);
}
