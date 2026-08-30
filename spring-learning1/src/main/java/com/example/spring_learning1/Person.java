package com.example.spring_learning1;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private final Game game;

    public Person(Game game){
        this.game = game;
    }
}
