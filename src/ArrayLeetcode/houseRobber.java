package ArrayLeetcode;

public class houseRobber {
    private Integer[] dp;

    public int rob(int[] nums){
        dp = new Integer[nums.length];
        return rob(nums, 0);
    }
    private int rob(int[] nums, int index){
        if (index >= nums.length){
            return 0;
        }
        if (dp[index] != null){
            return dp[index];
        }
        int steal = nums[index] + rob(nums, index + 2);
        int skip = rob(nums, index + 1);

        return dp[index] = Math.max(steal, skip);
    }
}
