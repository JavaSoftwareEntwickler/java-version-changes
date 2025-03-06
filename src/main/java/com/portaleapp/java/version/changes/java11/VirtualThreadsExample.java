package com.portaleapp.java.version.changes.java11;
import java.util.concurrent.Executors;

public class VirtualThreadsExample {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println("Eseguito con Virtual Thread!"));
        }
    }
}
