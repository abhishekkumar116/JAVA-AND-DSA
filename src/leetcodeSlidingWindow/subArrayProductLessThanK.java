package leetcodeSlidingWindow;

public class subArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)
            return 0;

        int res = 0;
        int product = 1;

        int l = 0, r = 0;

        while(r < nums.length) {
            product *= nums[r];
            while(product >= k) {
                product /= nums[l];
                l++;
            }
            r++;
            res += r - l;
        }
        return res;
    }
}
