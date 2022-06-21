package ArrayLeetcode;
import java.util.*;

public class zeroOneMatrix {
    private class Pair{
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[][] updateMatrix(int[][] matrix) {
        LinkedList<Pair> queue = new LinkedList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    queue.addLast(new Pair(i, j));
                }else {
                    matrix[i][j] = -1;
                }
            }
        }
        while(queue.size() > 0){
            Pair rem = queue.removeFirst();

            for(int i = 0; i < dirs.length; i++){
                int rowdash = rem.x + dirs[i][0];
                int coldash = rem.y + dirs[i][1];
                if(rowdash >= 0 && coldash >= 0 && rowdash < matrix.length && coldash < matrix[0].length
                        && matrix[rowdash][coldash] < 0){
                    matrix[rowdash][coldash] = matrix[rem.x][rem.y] + 1;
                    queue.add(new Pair(rowdash, coldash));
                }
            }

        }
        return matrix;
    }
    public int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
}
