package com.example.test;

import java.util.Optional;

public class OptionalTest {
    private static Object testString;
    // To try out optional and its usefulness

    Optional<String> testString = Optional.empty();

    public OptionalTest() {
    }

    public static void main(String[] args) {
        System.out.println("Test optional");
        if(testString != null) {
            System.out.println("what");
        }
    }
}
