package leetcodeHashMap;

import java.util.HashMap;

public class wordPattern {
    public boolean pattern(String pattern, String s){
        String[] word = s.split(" ");
        int n=word.length;
        if(pattern.length()!=n)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Boolean> used = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);

            if(map.containsKey(ch) == false){
                if(used.containsKey(word[i]) == true){
                    return false;
                }else{
                    used.put(word[i], true);
                    map.put(ch, word[i]);
                }
            }else{
                String mapWith = map.get(ch);

                if(mapWith.equals(word[i]) == false){
                    return false;
                }
            }
        }
        return true;
    }
}
