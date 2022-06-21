package GFGStack;
import java.util.*;

public class queueUsingTwoStack {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        //Function to push an element in queue by using 2 stacks.
        void Push(int x){
        s1.push(x);
    }


        //Function to pop an element from queue by using 2 stacks.
        int Pop(){
        if(s2.isEmpty()) {
            while(s1.size()>0) {
                s2.push(s1.pop());
            }
        }
        int el = s2.size()>0 ? s2.pop() : -1;
        return el;
    }
}
