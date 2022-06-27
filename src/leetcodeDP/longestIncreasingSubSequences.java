package leetcodeDP;
import java.util.*;
public class longestIncreasingSubSequences {
    public int findNumberOfLIS(int[] nums) {
        // first, we do the problem as
        // '300. Longest Increasing Subsequence', we get array dp ().
        int[] dp = new int[nums.length];
        // count[i] stores the the the length of the longest from 0 to i.
        int[] count = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            // maxLen records the max seq length from 0 to i-1.
            int maxLen = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        max = max > dp[i]? max: dp[i];
                        // if we find the longest, update maxLen.
                        maxLen = dp[j];
                    }
                }
            }
            // go through from from 0 to i-1
            for (int k = 0; k < i; k++) {
                // dp[k] == maxLen: count how many maxLen
                // nums[k] < nums[i]: check, nums[k] can go to nums[i] to form the next seq.
                if (dp[k] == maxLen && nums[k] < nums[i]) {
                    // if i can come from k and count[k] is 0, [nums[k], nums[i]] comes to a 2-length array. So count[i]++.(At most one way to form a 2-length increasing seq.)
                    if (count[k] == 0) {
                        count[i]++;
                    }
                    // else, nums[k] go to nums[i] with count[k] ways. Add count[k] to sum.
                    else {
                        count[i] += count[k];
                    }
                }
            }
        }
        // corner case: all numbers are same. Every number form a 1-length subseq.
        // case: [2,2,2,2]
        // longest length: 1
        // dp:   [1,1,1,1]
        // count:[0,0,0,0]
        // return nums.length.
        if (max == 1) {
            return nums.length;
        }

        // we go through dp[]. when dp[i] == max, add all count[i] up.
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == max) {
                res += count[i];
            }
        }
        return res;
    }
}
