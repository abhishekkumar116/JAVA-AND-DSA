package ArrayLeetcode;

public class houseRobber2 {
    public int rob(int[] nums){
        int length = nums.length;

        if (length == 0){
            return 0;
        }else if (length == 1){
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    public int rob(int[] nums, int start, int end){
        int with = 0;
        int without = 0;

        for (int i = start; i <= end; i++){
            int temp = without;
            without = Math.max(with, without);
            with = nums[i] + temp;
        }
        return Math.max(with, without);
    }
}
