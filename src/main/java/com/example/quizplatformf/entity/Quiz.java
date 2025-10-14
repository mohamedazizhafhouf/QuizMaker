package com.example.quizplatformf.entity;

import jakarta.persistence.*;

import java.time.Duration;

@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Duration duration;
}
