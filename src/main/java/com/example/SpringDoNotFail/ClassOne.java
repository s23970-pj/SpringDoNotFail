package com.example.SpringDoNotFail;

import org.springframework.stereotype.Component;

@Component
public class ClassOne {

    public ClassOne(){
        System.out.println("Hello from first Component");

    }
    public void printHelloMessage(){
        System.out.println("Hello elo");
    }

}
