package uk.bovykina.arrays.service;
import java.util.Scanner;
public class PrintPrime {
    public static void printPrime(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println("There are " + count + " prime numbers in this array.");
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
