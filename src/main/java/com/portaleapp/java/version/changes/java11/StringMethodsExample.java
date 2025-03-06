package com.portaleapp.java.version.changes.java11;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "  Java 11  ";

        System.out.println("isBlank(): " + text.isBlank()); // False, contiene spazi
        System.out.println("strip(): '" + text.strip() + "'"); // Rimuove spazi iniziali e finali
        System.out.println("lines():");
        "Java\n11\nfeatures".lines().forEach(System.out::println);
        System.out.println("repeat(3): " + "Java".repeat(3)); // Ripete la stringa 3 volte
    }
}
