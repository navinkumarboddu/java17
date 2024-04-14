package com.java17.study01;

public class Validation {

    private Validation(){
    }

    public static void checkThat(boolean expr, String msg) {
        if(!expr){
            throw new IllegalArgumentException(msg);
        }
    }
}
