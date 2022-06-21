package leetcodeStack;

import java.util.Stack;

public class nextGreaterElement2 {
    public int[] nextElement(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--){
            while (st.size() > 0 && st.peek() <= nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }
        int[] nge = new int[nums.length];

        for (int i = n - 1; i >= 0; i--){
            while (st.size() > 0 && st.peek() <= nums[i]){
                st.pop();
            }
            if (st.size() == 0){
                nge[i] = -1;
            }else {
                nge[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return nge;
    }
}
