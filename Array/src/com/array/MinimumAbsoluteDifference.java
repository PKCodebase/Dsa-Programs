package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 1: Find minimum absolute difference
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Form pairs with minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }

    // Main method to run in IntelliJ
    public static void main(String[] args) {

        int[] arr1 = {4, 2, 1, 3};
        int[] arr2 = {1, 3, 6, 10, 15};
        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};

        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + minimumAbsDifference(arr1));

        System.out.println("\nInput: " + Arrays.toString(arr2));
        System.out.println("Output: " + minimumAbsDifference(arr2));

        System.out.println("\nInput: " + Arrays.toString(arr3));
        System.out.println("Output: " + minimumAbsDifference(arr3));
    }
}
