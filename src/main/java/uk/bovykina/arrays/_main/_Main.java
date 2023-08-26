package uk.bovykina.arrays._main;

import uk.bovykina.arrays.service.*;

public class _Main {
    public static void main(String[] args) {
        int [] arr = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        PrintEven.printEven(arr);
        PrintOdd.printOdd(arr);
        PrintPrime.printPrime(arr);
        PrintSum.printSum(arr);
        PrintDifIndex.print(arr);
        PrintZeroCount.print(arr);
    }
}
