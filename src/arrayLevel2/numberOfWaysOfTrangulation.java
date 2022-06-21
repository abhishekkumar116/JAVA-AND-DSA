package arrayLevel2;

import java.io.*;
import java.util.*;

public class numberOfWaysOfTrangulation {

        public static int solution(int n){
            n = n - 2;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for(int i = 2; i <= n; i++){
                int l = i - 1;
                int r = 0;
                while(l >= 0){
                    dp[i] += dp[l] * dp[r];
                    l--;
                    r++;
                }
            }
//         dp[2] = 1;
//         dp[3] = 1;

//         for (int i = 4; i <= n; i++) {

//             int l = i - 1;
//             int r = 2;

//             while (l >= 2) {
//                 dp[i] += dp[l] * dp[r];
//                 l--;
//                 r++;
//             }
//         }
            return dp[n];
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(solution(n));
        }
}
