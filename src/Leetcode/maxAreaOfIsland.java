package Leetcode;

public class maxAreaOfIsland {
    public static int maxArea(int[][] grid){
        int count = 0;

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                if (grid[row][col] == 1){
                    count = Math.max(count, dfs(grid, row, col));
                }
            }
        }
        return count;
    }
    public static int dfs(int[][] grid, int row, int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;

        int p = dfs(grid, row + 1, col);
        int q = dfs(grid, row, col + 1);
        int r = dfs(grid, row - 1, col);
        int s = dfs(grid, row, col - 1);
        return p + q + r + s + 1;
    }
}
