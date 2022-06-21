package GFGHashmap;

import java.util.*;
public class commonElement {
    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2){
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < v1.size(); i++){
            map.put(v1.get(i), map.getOrDefault(v1.get(i), 0) + 1);
        }

        for(int i = 0; i < v2.size(); i++){
            if(map.getOrDefault(v2.get(i), 0) > 0){
                ans.add(v2.get(i));
                map.put(v2.get(i), map.get(v2.get(i)) - 1);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
