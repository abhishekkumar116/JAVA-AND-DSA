package _2dArray;

import java.util.Scanner;

public class exitPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of row : ");
        int m = sc.nextInt();
        System.out.println("Enter length of column : ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int dir = 0; // 0-e 1-s 2-w 3-n
        int i = 0;
        int j = 0;
        while (true){
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0){
                j++;
            } else if (dir == 1){
                i++;
            } else if (dir == 2){
                j--;
            } else if (dir == 3){
                i--;
            }
            if (i < 0){
                i++;
                break;
            } else if (j < 0){
                j++;
                break;
            } else if (i > arr.length){
                i--;
                break;
            } else if (i >arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}