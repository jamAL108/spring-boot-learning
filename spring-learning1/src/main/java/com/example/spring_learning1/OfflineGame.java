package com.example.spring_learning1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="game.type", havingValue = "offline")
public class OfflineGame implements Game{
    OfflineGame(){
        System.out.println("Offline Game");
    }
}
