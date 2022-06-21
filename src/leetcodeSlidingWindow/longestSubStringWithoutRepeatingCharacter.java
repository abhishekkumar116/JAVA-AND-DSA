package leetcodeSlidingWindow;
import java.util.*;

public class longestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String str) {
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int i = -1;
        int j = -1;

        while(true){
            boolean f1 = false;
            boolean f2 = false;
            while(i < str.length() - 1){
                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(map.get(ch) == 2){
                    break;
                }else{
                    int len = i - j;
                    if(len > max){
                        max = len;
                    }
                }
            }
            while(j < i){
                f2 = true;
                j++;
                char ch = str.charAt(j);
                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) == 1){
                    break;
                }

            }
            if(f1 == false && f2 == false){
                break;
            }
        }
        return max;
    }
}
