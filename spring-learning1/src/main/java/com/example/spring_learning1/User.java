package com.example.spring_learning1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class User {
    Order order;

    public User(Order orderObj){
        this.order = orderObj;
        System.out.println("User class initiliazed");
    }
}
