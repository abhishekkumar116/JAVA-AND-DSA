package Dynamicprogramming;

import java.util.Scanner;

public class zeroOneKnapsackProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < val.length; i++){
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < wt.length; i++){
            wt[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int[][] dp = new int[cap + 1][n + 1];
        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                if (j >= wt[i - 1]){
                    int rCap = j - wt[i - 1];
                    if (dp[i - 1][rCap] + val[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][rCap] + val[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
