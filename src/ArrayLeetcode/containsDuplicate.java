package ArrayLeetcode;

import java.util.HashSet;

public class containsDuplicate {
    public boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
