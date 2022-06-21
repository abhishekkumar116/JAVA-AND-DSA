package Dynamicprogramming;

import java.util.Scanner;

public class bestTimeToBuyAndSellWithTransactionFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int obsp = -arr[0];
        int ossp = 0;

        for (int i = 1; i < args.length; i++){
            int nbsp = 0;
            int nssp = 0;
            if (ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            } else {
                nbsp = obsp;
            }

            if (obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            } else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}
