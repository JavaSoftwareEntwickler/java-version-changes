package com.portaleapp.java.version.changes.java8;

import java.util.function.Consumer;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("java 8 functional interfaces!");
    }
}
