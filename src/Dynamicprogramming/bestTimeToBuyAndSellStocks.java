package Dynamicprogramming;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class bestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        int lsf = Integer.MAX_VALUE;
        int tp = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (pist > tp){
                tp = pist;
            }
        }
        System.out.println(tp);
    }
}
