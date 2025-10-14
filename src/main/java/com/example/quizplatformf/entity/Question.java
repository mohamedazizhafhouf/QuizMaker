package com.example.quizplatformf.entity;

import jakarta.persistence.*;

@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private Enum type;
    private int points;
}
