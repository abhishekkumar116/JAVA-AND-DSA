package Dynamicprogramming;

import java.util.Scanner;

public class bestTimeToBuyAndSell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int bd = 0;
        int sd = 0;
        int profit = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] >= arr[i - 1]){
                sd++;
            } else {
                profit += arr[sd] - arr[bd];
                bd = sd = i;
            }
        }
        profit += arr[sd] - arr[bd];
        System.out.println(profit);
    }
}
