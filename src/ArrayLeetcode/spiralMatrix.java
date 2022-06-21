package ArrayLeetcode;
import java.util.*;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = col - 1, top = 0, bottom = col - 1, d = 0;

        while (left <= right && top <= bottom){
            if (d == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                d = 1;
                top++;
            }else if (d == 1){
                for (int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
                d = 2;
                right--;
            } else if (d == 2){
                for (int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                d = 3;
                bottom--;
            } else if (d == 3){
                for (int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                d = 0;
                left++;
            }
        }

        return list;
    }
}
