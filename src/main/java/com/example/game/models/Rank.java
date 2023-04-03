package com.example.game.models;

import java.util.List;

public enum Rank {
    BEGGINER("Beginner", 0, List.of(new Token("token1"))),
    INTERMEDIATE("Intermediate", 5, List.of(new Token("token2"))),
    ADVANCED("Advanced", 10, List.of(new Token("token3")));
    String name;
    Integer resolved;
    List<Token> tokenList;

    Rank(String name, Integer resolved, List<Token> tokenList) {
        this.name = name;
        this.resolved = resolved;
        this.tokenList = tokenList;
    }
}
