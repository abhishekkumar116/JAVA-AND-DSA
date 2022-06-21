package leetcodeString;
import java.util.*;
import java.io.*;

public class checkIfStringContainsAllBinaryCodesOfSizeK {
    public boolean checkString(String s, int k) {
        int count = 0;
        int start = 0;

        Set set = new HashSet();

        for (int i = 0; i < s.length(); i++){
            count++;
            if (count == k){
                set.add(s.substring(start, start + k));
                count--;
                start++;
            }
        }
        return set.size() == Math.pow(2, k);
    }
}
