package Dynamicprogramming;

import java.util.Scanner;

public class countBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp0 = new int[n + 1];
        int[] dp1 = new int[n + 1];

        dp0[0] = 1;
        dp1[0] = 1;

        for (int i = 2; i <= n; i++){
            dp0[i] = dp1[i - 1];
            dp1[i] = dp1[i - 1] + dp0[i - 1];
        }

//        int o0s = 1;
//        int o1s = 1;
//
//        for (int i = 2; i <= n; i++){
//            int n0s = o0s;
//            int n1s = o1s + o0s;
//
//            o0s = n0s;
//            o1s = n1s;
//        }
        System.out.println(dp0[n] + dp1[n]);
    }
}
