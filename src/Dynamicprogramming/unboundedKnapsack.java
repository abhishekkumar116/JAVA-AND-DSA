package Dynamicprogramming;

import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] val = new int[n];
        int [] wt = new int[n];

        for (int i = 0; i < val.length; i++){
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < wt.length; i++){
            wt[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int[] dp = new int[cap + 1];
        dp[0] = 0;

        for (int bagc = 1; bagc < cap; bagc++){
            int max = 0;
            for (int i = 1; i < n; i++){
                if (wt[i] <= bagc){
                    int rbagc = bagc - wt[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + val[i];

                    if (tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);
    }
}
