package uk.bovykina.arrays.service;

public class Odd {
    public static int count(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void print(int count) {
        System.out.println("There are " + count + " odd numbers in this array.");
    }
}
