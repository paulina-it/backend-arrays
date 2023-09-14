package uk.bovykina.arrays.service;

public class Prime {

    public static int count(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static void print(int count) {
        System.out.println("There are " + count + " prime numbers in this array.");
    }

    private static boolean isPrime(int n) {
        boolean res = true;
        if (n <= 1) {
            res = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res = false;
            }
        }

        return res;
    }
}
