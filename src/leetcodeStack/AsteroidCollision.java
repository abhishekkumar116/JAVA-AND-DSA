package leetcodeStack;
import java.util.*;
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int val : asteroids){
            if(val > 0){
                st.push(val);
            }else{
                while(st.size() > 0 && st.peek() > 0 && st.peek() < -val){
                    st.pop();
                }
                if(st.size() > 0 && st.peek() > -val){

                }else if(st.size() > 0 && st.peek() == -val){
                    st.pop();
                }else{
                    st.push(val);
                }
            }
        }
        int[] ans = new int[st.size()];
        int i = ans.length - 1;

        while(i >= 0)ans[i--] = st.pop();
        return ans;
    }
}
