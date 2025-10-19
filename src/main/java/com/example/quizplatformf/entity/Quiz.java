package com.example.quizplatformf.entity;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiz_id;
    private String title;
    private String description;
    private Duration duration;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User created_by;

    @OneToMany(mappedBy = "quiz_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions = new ArrayList<>();
}
