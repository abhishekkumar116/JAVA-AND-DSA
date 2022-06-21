package leetcodeRecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class letterCombinationOfPhoneNumber {
    public List<String> combinations(String digits){

        List<String> list = new ArrayList<>();
        if (digits.length() == 0){
            return list;
        }

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(digits, "", map, list);
        return list;
    }
    public void helper(String input, String output, String[] map, List<String> list){
        if (input.length() == 0){
            list.add(output);
            return;
        }
        int digit = input.charAt(0) - '0';

        for (char ch : map[digit].toCharArray()){
            helper(input.substring(1), output + ch, map, list);
        }
    }
}
