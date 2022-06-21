package leetcodeStack;
import java.util.*;
public class removeKdigit {
    public String remove(String num, int k){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);

            while(st.size() > 0 && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(st.size() > 0 && k > 0){
            st.pop();
            k--;
        }

        char[] ans = new char[st.size()];
        int i = ans.length - 1;
        while(i >= 0){
            ans[i--] = st.pop();
        }
        int d = 0;

        while(d < ans.length && ans[d] == '0'){
            d++;
        }
        StringBuilder sb = new StringBuilder();
        while(d < ans.length){
            sb.append(ans[d++]);
        }
        while(sb.length() == 0){
            sb.append('0');
        }
        return sb.toString();
    }
}
