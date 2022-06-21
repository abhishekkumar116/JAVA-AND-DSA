package leetcodeDP;

public class longestIncreasingPath {
    int[][] dirs = {{0, 1}, {0, -1,}, {1, 0}, {-1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return 0;
        }

        int m = matrix.length, n = matrix[0].length, longestPath = 0;
        int[][] cache = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int longest = dfs(matrix, cache, m, n, i, j);
                longestPath = Math.max(longestPath, longest);
            }
        }
        return longestPath;
    }
    public int dfs(int[][] matrix, int[][] cache, int m, int n, int i, int j){
        if(cache[i][j] > 0){
            return cache[i][j];
        }
        int max = 0;
        for(int[] dir : dirs){
            int x = dir[0] + i, y = dir[1] + j;
            if(x >= 0 && y >= 0 && x < m && y < n && matrix[x][y] > matrix[i][j]){
                max = Math.max(max, dfs(matrix, cache, m, n, x, y));
            }
        }
        cache[i][j] = 1 + max;
        return cache[i][j];
    }
}
