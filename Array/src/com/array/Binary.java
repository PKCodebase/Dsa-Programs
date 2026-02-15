package com.array;

import java.math.BigInteger;

class Binary {
        public static String addBinary(String a, String b) {
            BigInteger num1 = new BigInteger(a, 2);
            BigInteger num2 = new BigInteger(b, 2);

            BigInteger sum = num1.add(num2);

            return sum.toString(2);

        }
        public static void main(String[]args){
            String a = "1001";
            String b = "101";
            System.out.println(addBinary(a,b));
        }

}
