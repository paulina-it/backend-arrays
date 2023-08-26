package uk.bovykina.arrays.service;

public class PrintOdd {
    public static void printOdd(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " odd numbers in this array.");
    }
}
