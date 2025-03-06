package com.portaleapp.java.version.changes.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApiExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());

        System.out.println("Nomi che iniziano con 'C': " + filteredNames);
    }
}
