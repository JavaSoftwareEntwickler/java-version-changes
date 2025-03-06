package com.portaleapp.java.version.changes.java8;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.defaultMethod(); // Chiama il metodo predefinito
    }
}

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Questo è un metodo predefinito in un'interfaccia!");
    }
}

class MyClass implements MyInterface {
    // Non è necessario implementare il default method, viene ereditato automaticamente
}
