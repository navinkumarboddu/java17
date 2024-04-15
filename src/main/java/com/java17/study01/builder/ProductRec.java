package com.java17.study01.builder;

import static com.java17.study01.Validation.checkThat;

public record ProductRec(long id, String name, String description) {

    // The compiler translates this to a final class
    // with private final fields for the components

    // The compileer generates a constructor that initializes the fields

    // The compiler generates the accessor methods i.e. getter methods
    // id()
    // name()
    // description()

    //Instance fields are not allowed
    // private int value;

    //static fields are allowed
    private static int VALUE = 23;

    public boolean hasDescription(){
        return description != null && !description.isBlank();
    }

    public ProductRec{
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }

    public ProductRec(long id, String name){
        this(id, name, null);
    }

    // Canonical constructor is always called fist
}
