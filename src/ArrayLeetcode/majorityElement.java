package ArrayLeetcode;

public class majorityElement {
    public int find(int[] nums){
        int count = 0;
        int candidate = 0;

        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            if (num == candidate){
                count += 1;
            }else {
                count -= 1;
            }
        }

        return candidate;
    }
}
