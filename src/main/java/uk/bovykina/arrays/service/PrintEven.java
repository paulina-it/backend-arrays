package uk.bovykina.arrays.service;

public class PrintEven {
    public static void printEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " even numbers in this array.");
    }
}
