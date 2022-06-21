package GFGStack;

import java.util.Stack;

public class stockSpan {
    public int[] span(int[] price, int n){
        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 0; i < n; i++){
            while (st.size() >0 && span[i] >= span[st.peek()]){
                st.pop();
            }
            if (st.size() == 0){
                span[i] = i + 1;
            }else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
