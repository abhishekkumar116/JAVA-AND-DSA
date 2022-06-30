package ArrayLeetcode;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsTwo {
    public int minMoves(int[] nums){
        int moves = 0;
        Arrays.sort(nums);

        int mid = nums[nums.length/2];

        for (int num : nums){
            moves += Math.abs(mid - num);
        }
        return moves;
    }
}
