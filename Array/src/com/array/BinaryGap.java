package com.array;

public class BinaryGap {

        public static int binaryGap(int n) {

            String binary = Integer.toBinaryString(n);
            int lastIndex = -1;
            int maxDistance = 0;

            for (int i = 0; i < binary.length(); i++) {

                if (binary.charAt(i) == '1') {

                    if (lastIndex != -1) {
                        int distance = i - lastIndex;
                        maxDistance = Math.max(maxDistance, distance);
                    }

                    lastIndex = i;
                }
            }

            return maxDistance;
        }

        public static void main(String[] args) {

            int n1 = 22;   // Binary: 10110
            int n2 = 5;    // Binary: 101
            int n3 = 6;    // Binary: 110
            int n4 = 8;    // Binary: 1000

            System.out.println("Input: " + n1 + ", Binary: " + Integer.toBinaryString(n1));
            System.out.println("Output: " + binaryGap(n1));

            System.out.println("Input: " + n2 + ", Binary: " + Integer.toBinaryString(n2));
            System.out.println("Output: " + binaryGap(n2));

            System.out.println("Input: " + n3 + ", Binary: " + Integer.toBinaryString(n3));
            System.out.println("Output: " + binaryGap(n3));

            System.out.println("Input: " + n4 + ", Binary: " + Integer.toBinaryString(n4));
            System.out.println("Output: " + binaryGap(n4));
        }

}
