package com.array;

public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {

        int prevGroup = 0;      // previous consecutive group count
        int currentGroup = 1;   // current consecutive group count
        int result = 0;

        for (int i = 1; i < s.length(); i++) {

            // If same character, increase current group count
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroup++;
            }
            // If character changes (0 → 1 or 1 → 0)
            else {
                result += Math.min(prevGroup, currentGroup);
                prevGroup = currentGroup;
                currentGroup = 1;
            }
        }

        // Add last group comparison
        result += Math.min(prevGroup, currentGroup);

        return result;
    }

    public static void main(String[] args) {

        String s1 = "00110011";
        String s2 = "10101";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + countBinarySubstrings(s1));

        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Output: " + countBinarySubstrings(s2));
        System.out.println("Input: " + s2);
        System.out.println("Output: " + countBinarySubstrings(s2));
    }
}
