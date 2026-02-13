package com.array;

public class Trionic {
    public static  boolean isTrionic(int[] nums){
        int n = nums.length;
        if(n< 4) return false;
        int i = 1;
        while(i<n && nums[i]>nums[i-1]){
          i++;
        }
        if(i==1 || i==n){
            return false;
        }
        while(i<n && nums[i]<nums[i]-1){
            i++;
        }
        if(i==n){
            return false;
        }
        while(i<n && nums[i]>nums[i]-1){
            i++;
        }
        return i== n;
    }
    public static void main(String[] args){
        int[] nums = {1,1,5,4,2,6,6};
        boolean result = isTrionic(nums);
        System.out.println(result);
    }
}
