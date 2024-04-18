package com.java17.study06.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample03 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Bill Johnson");

        var result = new ArrayList<>();
        for( String name: names){
            result.add(name.toUpperCase());
        }
        System.out.println(result);

        var result2 = new ArrayList<>();
        names.forEach(name -> result2.add(name.toUpperCase()));
        //Lambda Expression with a side effect
        System.out.println(result2);

        var result3 = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(result3);
    }
}
