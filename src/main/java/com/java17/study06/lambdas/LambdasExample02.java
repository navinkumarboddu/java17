package com.java17.study06.lambdas;

import java.util.List;

public class LambdasExample02 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Bill Johnson");

        var count = 0;
        for(String name: names){
            System.out.println(++count + ": " + name);
        }

        //Error: Variable used in lambda expression should be final or effectively final
        //names.forEach(name -> System.out.println(++count + ": " + name));
    }
}
