package dpLevel2;

import java.util.Scanner;

public class burstBaloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int burstBalloon(int[] arr){
        int[][] dp = new int[arr.length][arr.length];

        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp.length; j++, i++){
                int max = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++){
                    int left = k == i ? 0 :dp[i][k - 1];
                    int right = k == j ? 0 :dp[k + 1][j];
                    int val = (i == 0 ? 1 : arr[i - 1]) * arr[k] * (j == arr.length - 1 ? 1 : arr[j + 1]);

                    int total = left + right + val;
                    if (total > max){
                        max = total;
                    }
                }
                dp[i][j] = max;
            }
        }
        return dp[0][dp.length - 1];
    }
}
