package Graph;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        if (image[sr][sc] == newColor) return;
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            dfs(image, sr - 1, sc, oldColor, newColor);
            dfs(image, sr + 1, sc, oldColor, newColor);
            dfs(image, sr, sc - 1, oldColor, newColor);
            dfs(image, sr, sc + 1, oldColor, newColor);
        } else return;
    }
}
