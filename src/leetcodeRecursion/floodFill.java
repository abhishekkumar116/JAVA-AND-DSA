package leetcodeRecursion;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int srcColor = image[sr][sc];
        int[] dirs = {1, -1};
        image[sr][sc] = -1;

        for(int i : dirs){
            if(isSrcColor(image, sr + i, sc, srcColor)){
                floodFill(image, sr + i, sc, newColor);
            }
            if(isSrcColor(image, sr, sc + i, srcColor)){
                floodFill(image, sr, sc + i, newColor);
            }
        }
        image[sr][sc] = newColor;
        return image;


    }
    public boolean isSrcColor(int[][] image, int i, int j, int srcColor){
        return i >= 0 && j >= 0 && i < image.length && j < image[0].length && image[i][j] == srcColor;
    }
}
