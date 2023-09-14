package uk.bovykina.arrays.service;

public class Difference {
    public static int count(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        return sumEven - sumOdd;
    }

    public static void print(int res) {
        System.out.println("There difference between the sum of numbers with odd and even indexes is " + res);
    }
}
