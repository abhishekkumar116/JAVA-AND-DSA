package dpLevel2;

import java.util.Scanner;

public class numberOfBinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            int l = 0;
            int r = i - 1;
            while (l <= i - 1){
                dp[i] += dp[l] * dp[r];

                l++;
                r--;
            }
        }
        System.out.println(dp[n]);
    }
}
