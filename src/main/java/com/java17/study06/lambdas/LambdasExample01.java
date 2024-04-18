package com.java17.study06.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdasExample01 {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Joe","Susan","John","Louise"));

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        //A Lambda expression implements a functional interface
        // cannot assign a lambda expression to a variable declared with var

        System.out.println(names);
    }
}
