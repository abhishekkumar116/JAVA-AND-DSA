package leetcodeDP;

import java.util.HashMap;

public class arithematicSlice {
    public int slice(int[] nums){
        int ans = 0;
        HashMap<Integer, Integer>[] map = new HashMap[nums.length];

        for(int i = 0; i < nums.length; i++){
            map[i] = new HashMap<>();
        }
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                long cd = (long) nums[i] - (long) nums[j];

                if(cd <= Integer.MIN_VALUE || cd >= Integer.MAX_VALUE){
                    continue;
                }

                int endingOnJ = map[j].getOrDefault((int) cd, 0);
                int endingOnI = map[i].getOrDefault((int) cd, 0);

                ans += endingOnJ;
                map[i].put((int)cd, endingOnI + endingOnJ + 1);

            }
        }
        return ans;
    }
}
