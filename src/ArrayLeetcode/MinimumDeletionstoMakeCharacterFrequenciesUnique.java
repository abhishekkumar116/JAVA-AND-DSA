package ArrayLeetcode;
import java.util.*;

public class  MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int deletion = 0;

        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        Set<Integer> uniqueFreq = new HashSet<>();

        for(int count : freq){
            while(count > 0 && uniqueFreq.contains(count)){
                deletion++;
                count--;
            }
            uniqueFreq.add(count);
        }
        return deletion;
    }
}
