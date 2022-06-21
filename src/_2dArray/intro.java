package _2dArray;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row's length of array : ");
        int m = sc.nextInt();
        System.out.println("Enter column's length : ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
