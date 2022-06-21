package leetcodeSlidingWindow;

public class minimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {

        int currSum = 0;
        int end = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        while(end < nums.length){
            currSum += nums[end];

            while(currSum >= target){
                int len = end - start +1;
                minLen = Math.min(minLen, len);
                currSum -= nums[start];
                start++;
            }
            end++;
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}
