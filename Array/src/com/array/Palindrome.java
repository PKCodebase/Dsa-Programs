package com.array;

class Palindrome {
    public boolean isPalindrome(int x) {
        int rem, sum = 0;
        int result = x;

        while (x > 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }

        return result == sum;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome(); // create object
        int x = 121;
        System.out.println(p.isPalindrome(x));
    }
}
