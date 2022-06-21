package GFGHashmap;

import java.util.HashMap;

public class longestCOnsicutiveSubsequences {
    public int longestSubsequences(int[] arr, int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, true);
        }
        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int max = 0;
        for (int val : arr) {
            if (map.get(val) == true) {
                int tempLength = 1;
                int tempVal = val;

                while (map.containsKey(tempVal + tempLength)) {
                    tempLength++;
                }
                if (tempLength > max) {
                    max = tempLength;
                }
            }
        }
        return max;
    }
}
