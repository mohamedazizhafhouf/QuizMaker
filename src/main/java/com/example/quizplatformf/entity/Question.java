package com.example.quizplatformf.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_id;
    private String question;
    private Enum type;
    private int points;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz_id;

    @OneToMany(mappedBy = "question_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answers = new ArrayList<>();
}
