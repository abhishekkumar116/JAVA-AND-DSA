package leetcodeStack;
import java.util.*;

public class validateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int j = 0;
        for(int i : pushed){
            st.push(i);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}
