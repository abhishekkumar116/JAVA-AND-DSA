package leetcodeDP;

public class deleteOperationForTwoString {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int count = 0;
        int[][] dp = new int[m + 1][n + 1];



        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++)
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
        return m - dp[m][n] + n - dp[m][n];
    }
}
