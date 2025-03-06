package com.portaleapp.java.version.changes.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalString = getOptionalValue();
        System.out.println("Valore presente in Optional: " + optionalString.orElse("Valore di default"));
    }

    private static Optional<String> getOptionalValue() {
        return Optional.ofNullable(null); // Prova a cambiare `null` con una stringa
    }
}
