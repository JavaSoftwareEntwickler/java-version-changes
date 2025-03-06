package com.portaleapp.java.version.changes.java10;

import java.lang.management.ManagementFactory;

public class ParallelFullGCExample {
    public static void main(String[] args) {
        System.out.println("Parallel Full GC attivato per G1GC in Java 10+");
        // Stampa il nome del Garbage Collector in uso
        System.out.println("Garbage Collector attivo: " +
                ManagementFactory.getGarbageCollectorMXBeans()
                        .get(0).getName());
        // Simuliamo il carico di memoria
        for (int i = 0; i < 5_000_000; i++) {
            byte[] memoryLoad = new byte[1024]; // 1KB di memoria allocata
        }
        // Suggeriamo al GC di eseguire una raccolta completa
        System.gc();
    }
}
