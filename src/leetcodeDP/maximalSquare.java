package leetcodeDP;

public class maximalSquare {
    public int maximalSquare(char[][] matrix) {
//         int[][] dp = new int[arr.length][arr[0].length];

//         int ans = 0;

//         for(int i = dp.length - 1; i >= 0; i--){
//             for(int j = dp[0].length - 1; j >= 0; j--){
//                 if(i == dp.length - 1 && j == dp[0].length - 1){
//                     dp[i][j] = arr[i][j];
//                 }else if(i == dp.length - 1){
//                     dp[i][j] = arr[i][j];
//                 }else if(j == dp[0].length - 1){
//                     dp[i][j] = arr[i][j];
//                 }else{
//                     int min = Math.min(arr[i][j + 1], arr[i + 1][j]);
//                     min = Math.min(min, arr[i + 1][j + 1]);
//                     dp[i][j] = min + 1;

//                     if(dp[i][j] > ans){
//                         ans = dp[i][j];
//                     }
//                 }
//             }
//         }
//         return ans*ans;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int maxlen = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                } else {
                    dp[i][j] = 0;
                }
                maxlen = Math.max(maxlen, dp[i][j]);
            }
        }
        return maxlen * maxlen;
    }
}
