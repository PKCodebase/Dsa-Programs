package com.array;

public class ReverseBit {

        public static int reverseBits(int n) {

            int result = 0;

            for (int i = 0; i < 32; i++) {

                result <<= 1;        // result ko left shift karo
                result |= (n & 1);   // n ka last bit add karo
                n >>= 1;             // n ko right shift karo
            }

            return result;
        }
       public static void main(String[] args){
            int n = 43261596;
            System.out.println(reverseBits(n));
    }

}
