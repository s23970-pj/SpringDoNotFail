package com.example.SpringDoNotFail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClassThree {

    public ClassThree(ApplicationContext context){
        var a = context.getBean("classOne", ClassOne.class);
        var b = context.getBean("classTwo", ClassTwo.class);
        a.printHelloMessage();
        b.printHelloClassTwo();
    }

}
