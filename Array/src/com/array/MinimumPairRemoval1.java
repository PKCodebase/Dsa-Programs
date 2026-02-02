package com.array;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemoval1 {

    public static int minimumPairRemoval(int[] nums) {

        // Convert array to list for easy removal
        List<Integer> myList = new ArrayList<>();
        for (int num : nums) {
            myList.add(num);
        }

        int operations = 0;

        // Repeat until array becomes non-decreasing
        while (!isSorted(myList)) {
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            // Find adjacent pair with minimum sum
            for (int i = 0; i < myList.size() - 1; i++) {
                int sum = myList.get(i) + myList.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            // Replace the pair with their sum
            myList.set(
                    minIndex,
                    myList.get(minIndex) + myList.get(minIndex + 1)
            );
            myList.remove(minIndex + 1);

            operations++;
        }

        return operations;
    }

    // ✅ Must be static (called from static method)
    private static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};

        int result = minimumPairRemoval(nums);

        System.out.println("Minimum operations: " + result);
    }
}

//llrr
