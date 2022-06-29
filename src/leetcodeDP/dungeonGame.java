package leetcodeDP;

public class dungeonGame {
    public int calculateMinimumHP(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        int knights = 0;

        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {

                //last cell
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = arr[i][j] >= 0 ? 1 : 1 - arr[i][j];
                    // last row
                } else if (i == dp.length - 1) {
                    if (arr[i][j] >= dp[i][j + 1])
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i][j + 1] - arr[i][j];
                    //last colm
                } else if (j == dp[0].length - 1) {
                    if (arr[i][j] >= dp[i + 1][j]) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i + 1][j] - arr[i][j];
                    }
                } else {
                    int cost = Math.min(dp[i][j + 1], dp[i + 1][j]) - arr[i][j];

                    dp[i][j] = cost <= 0 ? 1 : cost;
                }
            }
        }
        return dp[0][0];
    }
}
