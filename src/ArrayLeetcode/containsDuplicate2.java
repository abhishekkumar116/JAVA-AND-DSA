package ArrayLeetcode;

import java.util.HashMap;

public class containsDuplicate2 {
    public boolean duplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
