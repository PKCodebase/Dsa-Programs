package com.array;

public class DivideArrayIntoSubArrayWithMinimumCost {

    public static int minimumCost(int[] nums) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Find two smallest elements from index 1 onward
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                secondMin = min;
                min = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return nums[0] + min + secondMin;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 12};
        System.out.println(minimumCost(nums)); // Output: 6
    }
}
