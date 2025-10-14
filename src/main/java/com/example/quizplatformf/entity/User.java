package com.example.quizplatformf.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Enum role;
    private Date createdAt;
}
