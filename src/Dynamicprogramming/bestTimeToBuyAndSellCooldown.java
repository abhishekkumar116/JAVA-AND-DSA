package Dynamicprogramming;

import java.util.Scanner;

public class bestTimeToBuyAndSellCooldown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;

        for (int i = 1; i < arr.length; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if (ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            } else {
                nbsp = obsp;
            }

            if (ossp > ocsp){
                ncsp = ossp;
            } else {
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
