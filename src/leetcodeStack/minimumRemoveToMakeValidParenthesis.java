package leetcodeStack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class minimumRemoveToMakeValidParenthesis {
    public String minRemove(String s){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isAlphabetic(ch)){
                continue;
            }
            if(ch == '('){
                st.push(i);
            }else {
                if (!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }else {
                    st.push(i);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();

        while (st.isEmpty() == false){
            set.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            if (set.contains(i)){
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
