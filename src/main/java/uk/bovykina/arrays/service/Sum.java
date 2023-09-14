package uk.bovykina.arrays.service;

public class Sum {
    public static int count(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void print(int sum) {
        System.out.println("The sum of all nunbers is " + sum);
    }
}
