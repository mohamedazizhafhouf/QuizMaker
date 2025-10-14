package com.example.quizplatformf.entity;

import jakarta.persistence.*;

@Entity
@Table(name="option")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String option;
    private Boolean isCorrect;
}
