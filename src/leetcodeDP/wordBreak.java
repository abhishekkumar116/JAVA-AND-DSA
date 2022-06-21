package leetcodeDP;

import java.util.List;

public class wordBreak {
    public boolean word(String s, List<String> wordDict){
        int n = s.length();
        boolean[] dp = new boolean[s.length()];

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                String sub = s.substring(j, i + 1);
                if (wordDict.contains(sub)){
                    if (j > 0 && !dp[i]){
                        dp[i] = dp[j - 1];
                    }else {
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[n - 1];
    }
}
