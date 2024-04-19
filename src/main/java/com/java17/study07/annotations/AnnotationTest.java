package com.java17.study07.annotations;

import java.lang.reflect.*;

public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {
        // Get the method where you applied the annotation
        Method method = MyClass1.class.getMethod("myMethod");

        // Check if the annotation is present on the method
        if (method.isAnnotationPresent(TestAnnotation.class)) {
            // Get the annotation instance
            TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);

            // Access the value of the annotation
            String value = annotation.value();

            // Print the annotation value
            System.out.println("Annotation value: " + value);
        } else {
            System.out.println("Annotation not present on the method");
        }
    }
}
