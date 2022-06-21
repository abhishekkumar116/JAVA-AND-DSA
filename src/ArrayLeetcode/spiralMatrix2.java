package ArrayLeetcode;

public class spiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int left = 0, right = n - 1, top = 0, bottom = n - 1, d = 0;
        int num = 1;
        while(left <= right && top <= bottom){
            if(d == 0){
                for(int i = left; i <= right; i++){
                    matrix[top][i] = num;
                    num++;
                }
                top++;
                d = 1;
            } else if(d == 1){
                for(int i = top; i <= bottom; i++){
                    matrix[i][right] = num;
                    num++;
                }
                right--;
                d = 2;
            } else if(d == 2){
                for(int i = right; i >= left; i--){
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;
                d = 3;
            } else if(d == 3){
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = num;
                    num++;
                }
                left++;
                d = 0;
            }
        }
        return matrix;
    }
}
