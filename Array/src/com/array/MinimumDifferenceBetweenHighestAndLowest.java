package com.array;

import java.sql.Array;
import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowest {
    public static int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }

        Arrays.sort(nums);
        int left = 0;
        int right = k - 1;
        int minDiff = Integer.MAX_VALUE;

        // Step 2: Two pointers sliding window
        while (right < nums.length) {
            minDiff = Math.min(minDiff, nums[right] - nums[left]);
            left++;
            right++;
        }

        return minDiff;
    }
    public static void main(String[]args){
        int [] nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums,k));
    }
}
