package ArrayLeetcode;

import java.util.HashMap;

public class findLuckyIntegerInAnArray {
    public int findNumber(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = -1;

        for (int i : map.keySet()){
            if (i == map.get(i)){
                count = Math.max(count, i);
            }
        }
        return count;
    }
}
