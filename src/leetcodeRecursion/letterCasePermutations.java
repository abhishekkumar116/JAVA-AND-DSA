package leetcodeRecursion;
import java.util.*;
public class letterCasePermutations {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        findAllPermutation(res, s, 0);

        return res;
    }
    public void findAllPermutation(List<String> res, String word, int start){
        res.add(word);

        for(int i = start; i < word.length(); i++){
            char[] wordArray = word.toCharArray();
            char ch = word.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    wordArray[i] = Character.toUpperCase(ch);
                    findAllPermutation(res, String.valueOf(wordArray), i + 1);
                }else{
                    wordArray[i] = Character.toLowerCase(ch);
                    findAllPermutation(res, String.valueOf(wordArray), i + 1);
                }
            }
        }
    }
}
