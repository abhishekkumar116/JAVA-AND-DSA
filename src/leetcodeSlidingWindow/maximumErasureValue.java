package leetcodeSlidingWindow;
import java.util.*;
public class maximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        HashSet<Integer> set = new HashSet<>();

        while(right < nums.length){
            if(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }else{
                sum += nums[right];
                set.add(nums[right]);
                right++;
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
