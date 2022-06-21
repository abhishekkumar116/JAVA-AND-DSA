package leetcodeStack;
import java.util.*;

public class nextGreaterElement {
    public int[] nextGreater(int[] nums1, int[] nums2){
    int[] arr = nextGreater(nums2);

    int[] result = new int[nums1.length];
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0; i<nums2.length; i++){
        hm.put(nums2[i], arr[i]);
    }
        for(int j=0; j<nums1.length; j++){
        result[j] = hm.get(nums1[j]);
    }

        return result;
}
    public int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] nums = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nums[i] = -1;
            }
            else{
                nums[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nums;
    }
}
