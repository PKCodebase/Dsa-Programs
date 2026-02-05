package com.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> result = new HashSet<>();
        int k = 0;
        for(int num: nums){
            if(result.add(num)){
                nums[k++] = num;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int [] nums = {1,1,2};
      
       System.out.println(removeDuplicates(nums));

    }
}
