package com.portaleapp.java.version.changes.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FilesApiExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("example.txt");

        // Scrive il contenuto in un file
        Files.writeString(filePath, "Questo è un file txt scritto con Files API introdotto in Java 11!");

        // Legge il contenuto dal file
        String content = Files.readString(filePath);
        System.out.println("Contenuto del file: " + content);
    }
}
