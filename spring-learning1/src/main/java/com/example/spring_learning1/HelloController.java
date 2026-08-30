package com.example.spring_learning1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@Scope("request")
@RequestMapping(value="/api/")
public class HelloController {

    private final User user;

    @Value("${game.type}")
    private String type;

    public HelloController(User user){
        this.user = user;
        System.out.println("HELO CONTROLLER ");
    }

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/orders")
    public String orders() {
        return "No Orders made yet!";
    }

    @GetMapping("/game")
    public String games() {
        String val = null;
        char ch = val.charAt(0);
        return "games";
    }

    @GetMapping("/meow")
    public String meow() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"KAEWEEEE");
    }

    @ExceptionHandler(MeowNotFoundException.class)
    public ResponseEntity<String> meowNotFound(MeowNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}

class MeowNotFoundException extends RuntimeException{
    MeowNotFoundException(String Message){
        super(Message);
    }
}
