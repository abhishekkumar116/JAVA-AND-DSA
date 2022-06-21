package _2dArray;

import java.util.Scanner;

public class waveTransversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter length of column : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++)
            arr[i][j] = sc.nextInt();
        }
        for (int j = 0; j <arr[0].length; j++){
            if (j%2==0){
                for (int i = 0; i< arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }else {
                for (int i = arr.length-1; i>=0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
