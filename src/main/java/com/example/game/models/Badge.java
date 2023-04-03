package com.example.game.models;

import jakarta.persistence.*;

public class Badge {
    private String name;

    @ManyToOne
    private User user;
}
