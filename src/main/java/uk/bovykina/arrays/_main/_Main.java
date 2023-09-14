package uk.bovykina.arrays._main;

import uk.bovykina.arrays.service.*;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        Even.print(Even.count(arr));
        Odd.print(Odd.count(arr));
        Prime.print(Prime.count(arr));
        Sum.print(Sum.count(arr));
        Difference.print(Difference.count(arr));
        ZeroCount.print(ZeroCount.count(arr));
    }
}
