package Graph;

public class pathWithMaxGold {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    dfs(grid, i, j, 0);
                }
            }
        }
        return max;
    }
    public void dfs(int[][] grid, int i, int j, int currCost){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return;
        }
        int x = grid[i][j];
        grid[i][j] = 0;

        max = Math.max(max, x + currCost);

        dfs(grid, i + 1, j, x + currCost);
        dfs(grid, i - 1, j, x + currCost);
        dfs(grid, i, j + 1, x + currCost);
        dfs(grid, i, j - 1, x + currCost);

        grid[i][j] = x;
    }
}
