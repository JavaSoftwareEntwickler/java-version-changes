package com.portaleapp.java.version.changes.java10;

public class G1GCExample {
    public static void main(String[] args) {
        System.out.println("Esempio di G1 Garbage Collector migliorato in Java 10+");
        // Creiamo un grande numero di oggetti per forzare il garbage collector
        for (int i = 0; i < 10_000_000; i++) {
            String temp = new String("Oggetto temporaneo " + i);
        }
        // Forziamo la chiamata al Garbage Collector
        System.gc();
        System.out.println("GC invocato manualmente (solo per test, non raccomandato in produzione)");
    }
}
