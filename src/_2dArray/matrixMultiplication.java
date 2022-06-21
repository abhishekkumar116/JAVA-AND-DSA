package _2dArray;

import java.util.*;
import java.io.*;

public class matrixMultiplication {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length of 1st matrix : ");
        int m1 = sc.nextInt();
        System.out.println("Enter column length of 1st matrix ");
        int n1 = sc.nextInt();

        int[][] arr1 = new int[m1][n1];
        for (int i = 0; i< arr1.length; i++){
            for (int j = 0; j< arr1[0].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter row length of 2nd matrix : ");
        int m2 = sc.nextInt();
        System.out.println("Enter column length of 2nd matrix ");
        int n2 = sc.nextInt();

        int[][] arr2 = new int[m2][n2];
        for (int i = 0; i< arr2.length; i++){
            for (int j = 0; j< arr2[0].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        if (n1 != m2){
            System.out.println("Invalid input");
            return;
        }
        int[][] product = new int[n1][m2];
        for (int i = 0; i< product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < n1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i< product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                System.out.println(product[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
