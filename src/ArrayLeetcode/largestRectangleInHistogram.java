package ArrayLeetcode;
import java.util.*;
public class largestRectangleInHistogram {
    public int largestRectangleArea(int[] arr) {
        int[] rb = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;

        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[arr.length];
        Stack<Integer> st1 = new Stack<>();
        st1.push(0);
        lb[0] = -1;

        for(int i = 1; i < arr.length; i++){
            while(st1.size() > 0 && arr[i] <= arr[st1.peek()]){
                st1.pop();
            }
            if(st1.size() == 0){
                lb[i] = -1;
            }else{
                lb[i] = st1.peek();
            }
            st1.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] - 1;

            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
