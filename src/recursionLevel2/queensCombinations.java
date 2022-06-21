package recursionLevel2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class queensCombinations {
    public static void queens(int qpsf, int tq, int row, int col, String asf){
        if(row == tq){
            if (qpsf == tq){
                System.out.println(asf);
            }
            return;
        }

        int nr = 0;
        int nc = 0;
        String yasf = "";
        String nasf = "";
        if (col == tq - 1){
            nr = row + 1;
            nc = 0;
            yasf = asf + "q\n";
            nasf = asf + "-\n";
        } else {
            nr = row;
            nc = col + 1;
            yasf = asf + "q";
            nasf = asf + "-";
        }
        queens(qpsf + 1, tq, nc, nr, yasf);
        queens(qpsf + 0, tq, nc, nr, nasf);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

    }
}
