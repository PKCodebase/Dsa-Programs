package com.array;

import java.util.HashSet;
import java.util.Set;

public class LongestBalancedSubarray {

    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        // Fix starting index
        for (int i = 0; i < n; i++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            // Expand subarray
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evenSet.add(nums[j]); // distinct even
                } else {
                    oddSet.add(nums[j]);  // distinct odd
                }

                // Check balance condition
                if (evenSet.size() == oddSet.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // Main method for testing
    public static void main(String[] args) {
        LongestBalancedSubarray solution = new LongestBalancedSubarray();

        int[] nums1 = {2, 5, 4, 3};
        int[] nums2 = {3, 2, 2, 5, 4};
        int[] nums3 = {1, 2, 3, 2};

        System.out.println(solution.longestBalanced(nums1)); // Output: 4
        System.out.println(solution.longestBalanced(nums2)); // Output: 5
        System.out.println(solution.longestBalanced(nums3)); // Output: 3
    }
}
