package com.java17.study02.sealed.demo;

public record Customer(long id, String name, String email) {

    @Override
    public String name(){
        return  name!=null && !name.isBlank() ? name : "anonymous";
    }

    //Rules:
    // - The return type of an overridden accessor method must be the same as the type of the component
    // - Accessor methods cannot have a 'throws' clause
}
