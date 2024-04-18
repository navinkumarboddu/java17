package com.java17.study06.lambdas;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class LambdasExample04 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Bill Johnson");

        try(FileWriter out = new FileWriter("names.txt", StandardCharsets.UTF_8)){
            for(String name: names){
                out.write(name);
            }

            //Unhandled exception: java.io.IOException
            //names.forEach(name -> out.write(name));
        } catch (IOException e){
            System.err.println("An error occured: " + e.getMessage());
        }
    }
}
