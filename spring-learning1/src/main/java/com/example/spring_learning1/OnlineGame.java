package com.example.spring_learning1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="game.type",havingValue = "online")
public class OnlineGame implements Game{
    OnlineGame(){
        System.out.println("Online Game");
    }
}
