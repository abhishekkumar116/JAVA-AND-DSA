package ArrayLeetcode;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    public List<Integer> majorityElement(int[] nums){
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0, len = nums.length;

        for (int i = 0; i < len; i++){
            if (nums[i] == num1){
                count1++;
            }else if (nums[i] == num2){
                count2++;
            }else if (count1 == 0){
                num1 = nums[i];
                count1++;
            }else if (count2 == 0){
                num2 = nums[i];
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < len; i++){
            if (nums[i] == num1){
                count1++;
            }else if (nums[i] == num2){
                count2++;
            }
        }
        if (num1 > len/3){
            ans.add(num1);
        }else if (num2 > len/3){
            ans.add(num2);
        }
        return ans;
    }
}
