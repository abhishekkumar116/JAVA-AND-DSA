package Graph;

import java.util.PriorityQueue;

public class pathWithMinmumEffort {
    public int minimumEffort(int[][] heights){
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0, 0));

        boolean[][] visited = new boolean[n][m];

        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        int min = Integer.MAX_VALUE;
        while(pq.size() > 0){
            Pair rem = pq.remove();
            if(rem.row == n - 1 && rem.col == m - 1){
                return Math.min(min, rem.diff);
            }
            if(visited[rem.row][rem.col] == true){
                continue;
            }
            visited[rem.row][rem.col] = true;

            for(int i = 0; i < 4; i++){
                int rowDash = rem.row + dirs[i][0];
                int colDash = rem.col + dirs[i][1];

                if(rowDash < 0 || colDash < 0 || rowDash >= n || colDash >= m || visited[rowDash][colDash] == true){
                    continue;
                }
                pq.add(new Pair(rowDash, colDash, Math.max(rem.diff, Math.abs(heights[rowDash][colDash] - heights[rem.row][rem.col]))));
            }
        }
        return min;
    }
    public class Pair implements Comparable<Pair>{
        int row;
        int col;
        int diff;

        Pair(int row, int col, int diff){
            this.row = row;
            this.col = col;
            this.diff = diff;
        }
        public int compareTo(Pair o){
            return this.diff - o.diff;
        }
    }
}
