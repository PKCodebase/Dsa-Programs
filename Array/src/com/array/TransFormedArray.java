package com.array;

import java.util.Arrays;

public class TransFormedArray {
    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                int newIndex = (i + nums[i]) % n;

                // handle negative modulo in Java
                if (newIndex < 0) {
                    newIndex += n;
                }

                result[i] = nums[newIndex];
            }
        }

        return result;

    }
    public static  void main(String[] args){
        int[] nums = {3,-2,1,1};
        System.out.println(Arrays.toString(constructTransformedArray(nums)));
    }
}
