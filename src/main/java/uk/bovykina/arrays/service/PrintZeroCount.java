package uk.bovykina.arrays.service;

public class PrintZeroCount {
    public static void print(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " zeros in this array.");
    }
}
