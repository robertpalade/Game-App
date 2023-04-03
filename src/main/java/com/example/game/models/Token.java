package com.example.game.models;

import jakarta.persistence.*;

public class Token {
    private String name;

    @ManyToOne
    private User user;

    public Token(String name) {
        this.name = name;
    }
}
