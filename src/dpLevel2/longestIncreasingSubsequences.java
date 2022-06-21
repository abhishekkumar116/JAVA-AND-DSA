package dpLevel2;

import java.util.Scanner;

public class longestIncreasingSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int omax = 0;

        int[] dp = new int[arr.length];
        for (int i = 0; i < dp.length; i++){
            int max = 0;
            for (int j = 0; j < i; j++){
                if (arr[j] < arr[i]){
                    if (dp[j] > max){
                        max = arr[j];
                    }
                }
            }
            dp[i] = max + 1;
            if (dp[i] > omax){
                omax = dp[i];
            }
        }
        System.out.println(omax);
    }
}
