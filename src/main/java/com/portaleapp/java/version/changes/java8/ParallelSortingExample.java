package com.portaleapp.java.version.changes.java8;

import java.util.Arrays;

public class ParallelSortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9};
        Arrays.parallelSort(numbers);
        System.out.println("Array ordinato in parallelo: " + Arrays.toString(numbers));
    }
}
