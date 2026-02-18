package com.array;

public class AlternatingBits {

    public boolean hasAlternatingBits(int n) {


        String binary = Integer.toBinaryString(n);


        char[] arr = binary.toCharArray();
        int l  = arr.length-1;

        // Check alternating condition
        for (int i = 0; i < l; i++) {

            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        AlternatingBits obj = new AlternatingBits();

        System.out.println(obj.hasAlternatingBits(5));  // true (101)
        System.out.println(obj.hasAlternatingBits(7));  // false (111)
        System.out.println(obj.hasAlternatingBits(10)); // true (1010)
    }
}
