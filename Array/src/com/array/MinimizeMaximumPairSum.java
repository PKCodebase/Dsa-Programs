package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimizeMaximumPairSum {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int maxSum = 0;
        while(left<right){
            int currentSum = nums[left] +nums[right];
            maxSum = Math.max(maxSum,currentSum);
            left++;
            right--;
        }
        return maxSum;

    }

    public static void main(String[] args){
        int nums[] = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}



