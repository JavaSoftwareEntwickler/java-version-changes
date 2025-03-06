package com.portaleapp.java.version.changes.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        // In Java 9, puoi usare una risorsa dichiarata fuori dal try con auto-close
        try (reader) {
            System.out.println("Contenuto del file: " + reader.readLine());
        }
    }
}
