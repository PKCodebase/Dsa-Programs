package com.array;

import java.util.Scanner;

public class ChampagneTower {

        public static double champagneTower(int poured, int query_row, int query_glass) {

            int n = query_row;

            double[][] dp = new double[n + 2][n + 2];

            dp[0][0] = poured;

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {

                    if (dp[i][j] > 1.0) {

                        double overflow = (dp[i][j] - 1.0) / 2.0;

                        dp[i + 1][j] += overflow;
                        dp[i + 1][j + 1] += overflow;

                        dp[i][j] = 1.0; // Cap at 1
                    }
                }
            }

            return Math.min(1.0, dp[query_row][query_glass]);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter poured amount: ");
            int poured = sc.nextInt();

            System.out.print("Enter query row: ");
            int query_row = sc.nextInt();

            System.out.print("Enter query glass: ");
            int query_glass = sc.nextInt();

            double result = champagneTower(poured, query_row, query_glass);

            System.out.println("Amount in glass: " + result);

            sc.close();
        }


}
