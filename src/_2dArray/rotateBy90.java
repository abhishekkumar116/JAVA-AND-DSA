package _2dArray;

import java.util.Scanner;

public class rotateBy90 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i<arr.length; i++){
            int li = 0;
            int ri = arr.length - 1;
            while (li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
        display(arr);
    }
    public static void display(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();

        }
    }

}
