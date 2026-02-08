package com.array;

import java.util.HashMap;
import java.util.HashSet;

class MinimumDeletions {

        public static int minimumDeletions(String s) {
            HashMap<Integer,Object> seen = new HashMap<>();
            seen.put(1,"kaushik");
            seen.put(2,"87");
            System.out.println(seen);
            int bCount = 0;
            int deletions = 0;

            for (char c : s.toCharArray()) {
                if (c == 'b') {
                    bCount++;
                } else { // c == 'a'
                    deletions = Math.min(deletions + 1, bCount);
                }
            }
            return deletions;
        }
            public static  void main(String[] args){
            String s = "aababbab";
           Object name = "kaushik";


            System.out.println(minimumDeletions(s));
    }


}
