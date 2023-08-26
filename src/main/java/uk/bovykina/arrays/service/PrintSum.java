package uk.bovykina.arrays.service;

public class PrintSum {
    public static void printSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all nunbers is " + sum);
    }
}
