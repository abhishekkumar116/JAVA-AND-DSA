package dpLevel2;

import java.util.Scanner;

public class countBrackets {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int inbracket = i - 1;
            int outbracket = 0;

            while (inbracket >= 0) {
                dp[i] += dp[inbracket] * dp[outbracket];
                inbracket--;
                outbracket++;
            }
        }
        System.out.println(dp[n]);
    }
}
