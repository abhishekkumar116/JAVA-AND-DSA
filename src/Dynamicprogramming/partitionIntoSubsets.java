package Dynamicprogramming;

import java.util.Scanner;

public class partitionIntoSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int team = sc.nextInt();
        int person = sc.nextInt();

        if (team == 0 || person == 0 || person < team){
            System.out.println(0);
            return;
        }

        int[][] dp = new int[person + 1][team + 1];

        for (int t = 1; t <= person; t++){
            for (int p = 1; p <= team; p++){
                if (p < t){
                    dp[t][p] = 0;
                } else if (p == t){
                    dp[t][p] = 1;
                } else {
                    dp[t][p] = dp[t - 1][p - 1] + dp[t][p - 1] * t;
                }
            }
        }
        System.out.println(dp[person][team]);
    }
}
