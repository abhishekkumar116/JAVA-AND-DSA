package GFGHashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class countDistnictElementInEveryWindow {
    public ArrayList<Integer> count(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while (i <= k - 2){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        i--;
        int j = -1;
        while (i < arr.length - 1){
            i++;
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            list.add(map.size());

            j++;
        }
        int rfreq = map.get(arr[j]);

        if (rfreq == 1){
            map.remove(arr[i]);
        }else {
            map.put(arr[i], rfreq - 1);
        }
        return list;
    }
}
