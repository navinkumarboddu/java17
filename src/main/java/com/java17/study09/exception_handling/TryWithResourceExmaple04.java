package com.java17.study09.exception_handling;

public class TryWithResourceExmaple04 {

    public static void main(String[] args) throws Exception {
        try( var r1 = new ExampleResource("1");
             var r2 = new ExampleResource("2")){
            System.out.println("Inside the try-block");
            throw new Exception("Exception thrown in try block...");
        } catch(Exception e){
            System.out.println("Inside the catch-block");
            e.printStackTrace(System.out);
        }
    }
}
