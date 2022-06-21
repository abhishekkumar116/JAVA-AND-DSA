package ArrayLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class squareOfSortedArray {
    public int[] sortedArray(int nums[]){
//        for (int i = 0; i < nums.length; i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;

        int[]res = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;

        while (left <= right){
            int a = nums[left] * nums[left];
            int b= nums[right] * nums[right];

            if (a >= b){
                res[k] = a;
                k--;
                left++;
            }else {
                res[k] = b;
                k--;
                right--;
            }
        }
        return res;
    }
}
