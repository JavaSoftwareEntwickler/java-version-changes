package com.portaleapp.java.version.changes.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeApiExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Data di oggi: " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
