package uk.bovykina.arrays.service;

public class ZeroCount {
    public static int count(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    public static void print(int count) {
        System.out.println("There are " + count + " zeros in this array.");
    }
}
