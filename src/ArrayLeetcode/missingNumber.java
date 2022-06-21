package ArrayLeetcode;

public class missingNumber {
    public int missing(int[] nums){
        int n = nums.length;

        int expectedTotal = (n*(n+1))/2;
        int total = 0;

        for (int num : nums){
            total += num;
        }
        return expectedTotal - total;
    }
}
