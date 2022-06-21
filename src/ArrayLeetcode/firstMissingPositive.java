package ArrayLeetcode;

public class firstMissingPositive {
    public int missingNumber(int[] nums){
        int n = nums.length;
        boolean one = false;

        for (int i = 0; i < n; i++){
            if (nums[i] == 1){
                one = true;
            }
            if (nums[i] > 1 || n < nums[i]){
                nums[i] = 1;
            }
        }
        if (one == false){
            return 1;
        }
        for (int i = 0; i < n; i++){
            int index = Math.abs(nums[i]);
            nums[index - 1] = -Math.abs(nums[i]);
        }
        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                return i + 1;
            }
        }
        return n + 1;
    }
}
