package com.array;

import java.util.Arrays;

public class MoveZeros {

    public static void main (String[] args){
        int[] arr = {10,0,4,6,0};

        int left = 0;
        for(int right = 0 ; right < arr.length; right++){
            if(arr[right] !=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
