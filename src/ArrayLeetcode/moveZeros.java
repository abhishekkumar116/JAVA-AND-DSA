package ArrayLeetcode;

public class moveZeros {
    public void moveZero(int[] nums){
        int insertPosition = 0;
        int pos = 0;

        while (pos < nums.length){
            if (nums[pos] == 0) {
                pos++;
            }else {
                int temp = nums[insertPosition];
                nums[insertPosition] = nums[pos];
                nums[pos] = temp;
                insertPosition++;
                pos++;
            }

        }
    }
}
