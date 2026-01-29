package com.array;

public class Palindromes {

    public static  boolean isPalindrome(int x){
        int sum=0;
        int rem = 0;
        int  result = x;

        while(x>0){
            rem = x%10;
             sum = sum*10+rem;
             x=x/10;
        }
        return result==sum;
    }




        public static void main(String[] args) {

            int x = 12221;
            System.out.println(isPalindrome(x));
        }

}
