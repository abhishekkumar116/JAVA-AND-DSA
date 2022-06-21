package arrayLevel2;

import java.util.Scanner;

public class containerWithMostWater {
    private static int mostWater(int[] heights){
        int i = 0;
        int j = heights.length - 1;

        int water = 0;
        while (i < j){
            int w = j - 1;
            int h = Math.min(heights[i] ,heights[j]);

            water = Math.max(water, w * h);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        int res = mostWater(heights);
        System.out.println(res);
    }
}
