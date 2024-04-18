package com.java17.study06.lambdas;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LambdasExample05 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Bill Johnson");

        //Lambda Expression
        names.forEach(name -> System.out.println(name));

        //Method Reference
        names.forEach(System.out::println);
    }
}
