package recursionLevel2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class queensPermutations {
    public static void queens(int qpsf, int tq, int[][] chess){
        if (qpsf == tq){
            for (int i = 0; i < chess.length; i++){
                for(int j = 0; j < chess[0].length; j++){
                    if (chess[i][j] == 0){
                        System.out.print("-\t");
                    }else {
                        System.out.print("q" + chess[i][j] + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < chess.length; i++){
            for (int j = 0; j < chess[0].length; j++){
                if (chess[i][j] == 0){
                    chess[i][j] = qpsf + 1;
                    queens(qpsf + 1, tq, chess);
                    chess[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        queens(0, n, chess);

    }
}
