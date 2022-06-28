package ArrayLeetcode;

public class MinimumDeletionstoMakeArrayBeautiful {
    public int minDeletion(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] == nums[i + 1] && (i - count)% 2 == 0){
                count++;
            }
        }
        if((nums.length - count)%2 == 0){
            return count;
        }else{
            return count + 1;
        }
    }
}
