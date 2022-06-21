package Graph;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class shortestPathInBinaryMatrix {
    public int shortestPath(int[][] grid){
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0){

        }
        int ans = bfs(grid);
        return ans;
    }
    public class Pair{
        int i;
        int j;

        Pair(int i , int j){
            this.i = i;
            this.j = j;
        }
    }
    private int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}, {-1, -1}, {1, 1}, {-1, -1}, {-1, 1}};
    public int bfs(int[][] grid){
        LinkedList<Pair> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        boolean reached = false;
        int level = 0;

        while (!queue.isEmpty() && !reached){
            int size = queue.size();
            while (size --> 0){
                Pair rem = queue.removeFirst();
                if (visited[rem.i][rem.j]){
                    continue;
                }
                visited[rem.i][rem.j] = true;

                if (rem.i == grid.length - 1 && rem.j == grid[0].length - 1){
                    reached = true;
                }
                for (int d = 0; d < dirs.length; d++) {
                    int x = dirs[d][0] + rem.i;
                    int y = dirs[d][1] + rem.j;

                    if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && !visited[x][y] && grid[x][y] == 0) {
                        queue.addLast(new Pair(x, y));
                    }
                }
            }
            level++;
        }
        if (reached){
            return level;
        }else {
            return -1;
        }
    }
}
