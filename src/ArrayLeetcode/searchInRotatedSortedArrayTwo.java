package ArrayLeetcode;
import java.util.*;
public class searchInRotatedSortedArrayTwo {
    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            // Case 1: if target is found at first attempt
            if(target == nums[mid]){
                return mid;
            }

            //Case 2: to check right side is sorted or not

            if(nums[mid]<=nums[high]){
                if(target>nums[mid] && target <= nums[high]){ //if sorted does target present
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else if(nums[low]<=nums[mid]){ // Case 3: to check left side is sorted or not
                if(target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
