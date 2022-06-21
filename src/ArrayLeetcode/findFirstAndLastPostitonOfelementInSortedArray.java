package ArrayLeetcode;

public class findFirstAndLastPostitonOfelementInSortedArray {
    public int[] findElement(int[] nums, int target){
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0){
            return result;
        }
        result[0] = findFirstElement(nums, target);
        if (result[0] == 1){
            return result;
        }
        result[1] = findLastElement(nums, target);
        return result;
    }
    private int findFirstElement(int[] nums, int target){
        int left = 0;
        int right= nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] >= target){
                right = mid;
            }else {
                left = mid;
            }
        }
        if (nums[right] == target){
            return right;
        }
        if (nums[left] == target){
            return left;
        }
        return  - 1;
    }
    private int findLastElement(int[] nums, int target){
        int left = 0;
        int right= nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] <= target){
                left = mid;
            }else {
                right = mid;
            }
        }
        if (nums[left] == target){
            return left;
        }
        if (nums[right] == target){
            return right;
        }
        return -1;
    }
}
