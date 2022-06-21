package Array;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array dimension :");
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        int a[][] = new int[rows][colm];
        int b[][] = new int[rows][colm];

        System.out.println("Enter array a :");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<colm; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array b :");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<colm; j++){
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[rows][colm];
        System.out.print("result of array is ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<colm; j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }

    }
}
