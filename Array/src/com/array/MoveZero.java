package com.array;
import java.util.Arrays;

class Solution {

    // Function to move all zeroes to the end
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));
        solution.moveZeroes(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }
}
