package com.portaleapp.java.version.changes.java9;

interface MyInterface {
    default void publicMethod() {
        System.out.println("Metodo pubblico nelle interfacce!");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Metodo privato chiamato all'interno di un metodo di default.");
    }
}

public class PrivateMethodInterfaceExample {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {};
        obj.publicMethod();
    }
}
