package com.example.SpringDoNotFail;

import org.springframework.stereotype.Component;

@Component
public class ClassTwo {
    public ClassTwo(ClassOne classOne){  //najwyraźniej konstruktor musi sie tak samo nazywac jak klasa
        System.out.println("Hello from Second");
    classOne.printHelloMessage(); // wywołanie metody z klasy classOne. Dodaliśmy nowy argument w parametrach konstruktora
    // wywołaliśmy metode MyFirstComponent
    }
    public void printHelloClassTwo(){
        System.out.println("Hello from method in second");
    }

}
