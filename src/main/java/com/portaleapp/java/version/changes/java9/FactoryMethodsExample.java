package com.portaleapp.java.version.changes.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Esempio di utilizzo dei metodi di fabbrica introdotti in Java 9.
 * Factory Methods per Collezioni (List.of(), Set.of(), Map.of())
 */
public class FactoryMethodsExample {
    public static void main(String[] args) {
        List<String> list = List.of("Alice", "Bob", "Charlie");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("Alice", 25, "Bob", 30);

        System.out.println("Lista: " + list);
        System.out.println("Set: " + set);
        System.out.println("Mappa: " + map);
    }
}
