package GFGHashmap;

import java.util.HashMap;

public class findElementThatOccursKtimes {
    public int findElement(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) == k){
                return i;
            }
        }
        return -1;
    }
}
