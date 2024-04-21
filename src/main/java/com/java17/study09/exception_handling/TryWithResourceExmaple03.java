package com.java17.study09.exception_handling;

public class TryWithResourceExmaple03 {

    public static void main(String[] args) throws Exception {
        try( var r1 = new ExampleResource("1");
             var r2 = new ExampleResource("2")){
            System.out.println("Inside the try-block");
        }
    }
}
