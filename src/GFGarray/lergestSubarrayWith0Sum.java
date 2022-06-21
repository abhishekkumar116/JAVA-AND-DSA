package GFGarray;

import java.util.*;

public class lergestSubarrayWith0Sum {
    public int subArray(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = -1;
        int sum = 0;
        map.put(sum, i);
        while (i < arr.length - 1){
            i++;
            sum += arr[i];

            if (map.containsKey(sum) == false){
                map.put(sum, i);
            }else {
                int len = i - map.get(i);
                if (len > maxLen){
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
