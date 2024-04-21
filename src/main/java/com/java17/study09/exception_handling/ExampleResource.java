package com.java17.study09.exception_handling;

public class ExampleResource implements AutoCloseable{

    private final String name;

    public ExampleResource(String name) {
        this.name = name;
        System.out.println("Initializing resource: " + name);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource:" + name);
    }
}
