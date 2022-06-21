package recursionAndBacktracking;

import java.util.Scanner;

public class floodfill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
         floodFill(arr, 0, 0, "", visited);
    }

    public static void floodFill(int[][] maze, int row, int col, String asf, boolean[][] visited){


        floodFill(maze, row - 1, col, asf + "t", visited);


    }

}
