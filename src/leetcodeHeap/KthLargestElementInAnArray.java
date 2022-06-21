package leetcodeHeap;
import java.util.*;
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        //   Arrays.sort(nums);

//         return nums[nums.length - k];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.remove();
    }
}
