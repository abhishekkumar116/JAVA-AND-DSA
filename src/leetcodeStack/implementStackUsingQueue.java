package leetcodeStack;
import java.util.*;
public class implementStackUsingQueue {
    Stack<Integer> st = new Stack<>();
    public void MyStack() {
        new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        return st.pop();
    }

    public int top() {
        return st.peek();
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
