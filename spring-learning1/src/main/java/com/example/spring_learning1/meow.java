package com.example.spring_learning1;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class meow {
    public meow(){
        System.out.println("MEEOWOEOEOE");
    }
}
