package ArrayLeetcode;

public class nQueen2 {
    int count = 0;
    public int queen(int n){
        int[][] chess = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                chess[i][j] = 0;
            }
        }
        backtrack(chess, 0, n);
        return count;
    }
    public boolean isValid(int[][] chess, int row, int col){
        for (int i = 0; i < row; i++){
            if (chess[i][col] == 1){
                return false;
            }
        }
        for (int i  = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if (chess[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++){
            if (chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    public void backtrack(int[][] chess, int row, int n){
        if (row == chess.length){
            count++;
            return;
        }
        for (int col = 0; col < chess.length; col++){
            if (isValid(chess, row, col)){
                chess[row][col] = 1;
                backtrack(chess, row + 1, n);
                chess[row][col] = 0;
            }
        }
    }
}
