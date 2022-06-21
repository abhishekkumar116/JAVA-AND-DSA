package GFGStack;
import java.util.*;

public class nextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n){
        long[] nge = new long[arr.length];

        Stack<Long> st = new Stack<>();

        st.push(arr[arr.length -1]);
        nge[arr.length -1]=-1;

        for(int i = arr.length - 2; i >=0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
                st.push(arr[i]);
            }
        return nge;
    }
}
