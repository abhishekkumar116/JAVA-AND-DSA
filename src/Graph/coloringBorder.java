package Graph;

public class coloringBorder {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        dfs(grid, row, col, grid[row][col]);
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] < 0)
                    grid[i][j] = color;
            }
        }
        return grid;
    }

    public int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public void dfs(int[][] grid, int row, int col, int toChange){
        grid[row][col] = -toChange;
        int count = 0;
        for(int i = 0; i < 4; i++){
            int rowdash = row + dir[i][0];
            int coldash = col + dir[i][1];
            if(rowdash < 0 || rowdash >= grid.length || coldash < 0 || coldash >= grid[0].length || Math.abs(grid[rowdash][coldash]) != toChange)
                continue;
            count++;
            if(grid[rowdash][coldash] == toChange)
                dfs(grid, rowdash, coldash, toChange);
        }
        if(count == 4)
            grid[row][col] = toChange;
    }
}
