package GFGRecursion;

import java.util.ArrayList;
import java.util.List;

public class permutationsOfGivenString {
    public List<String> permutation(String s){
        List<String> res = new ArrayList<>();

        helper(s, "", res);
        return res;
    }
    public void helper(String s, String ans, List<String> res){
        if (s.length() == 0) {
            res.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String restString = s.substring(0, i) + s.substring(i + 1);
            helper(restString, ans + ch, res);
        }
    }
}
