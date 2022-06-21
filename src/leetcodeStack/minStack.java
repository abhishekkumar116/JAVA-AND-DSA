package leetcodeStack;
import java.util.*;
class minStack {
    Stack<Integer> stack;
    Stack<Integer> minStack = new Stack<>();

    public minStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
}

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

