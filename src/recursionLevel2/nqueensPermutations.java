package recursionLevel2;

import java.io.*;
import java.util.*;

public class nqueensPermutations {

    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        // write your code here

        for(int i = row, j = col; i >= 0; i--){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; i < chess.length; i++){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; j >= 0; j--){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; j < chess.length; j++){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; i < chess.length && j < chess.length ; i++, j++){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] > 0){
                return false;
            }
        }
        for(int i = row, j = col; i < chess.length && j >= 0; i++, j--){
            if(chess[i][j] > 0){
                return false;
            }
        }
        return true;
    }

    public static void nqueens(int qpsf, int tq, int[][] chess) {
        // write your code here
        if(qpsf == tq){
            for(int row = 0; row < chess.length; row++){
                for(int col = 0; col < chess.length; col++){
                    if(chess[row][col] == 0){
                        System.out.print("-\t");
                    } else{
                        System.out.print("q" + chess[row][col] + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int cell = 0; cell < chess.length * chess.length; cell++){
            int row = cell / chess.length;
            int col = cell % chess.length;
            if(chess[row][col] == 0 && IsQueenSafe(chess, row, col)){
                chess[row][col] = qpsf + 1;
                nqueens(qpsf + 1, tq, chess);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        nqueens(0, n, chess);
    }
}
