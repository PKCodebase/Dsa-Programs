package com.array;

import java.util.Arrays;

public class MinimumPairRemoval {


        public static int minRemoval(int[] nums, int k) {
            Arrays.sort(nums);

            int left = 0;
            int maxWindow = 1;

            for (int right = 0; right < nums.length; right++) {
                while ((long) nums[right] > (long) nums[left] * k) {
                    left++;
                }
                maxWindow = Math.max(maxWindow, right - left + 1);
            }
            return nums.length - maxWindow;
        }

        // Main method to test the program
        public static void main(String[] args) {
            Solution solution = new Solution();

            int[] nums = {1, 3, 4, 9, 10};
            int k = 3;

            int result = minRemoval(nums, k);
            System.out.println("Minimum removals required: " + result);
        }


}
