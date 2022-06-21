package ArrayLeetcode;

import java.util.*;

public class intersectionOfTwoArray2 {
    public int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int i : nums2){
            map.put(i, map.getOrDefault(i, 0) - 1);
            if (map.get(i) >= 0){
                res.add(i);
            }
        }
        int[] ans = new int[res.size()];

        int k = 0;
        for (int i : res){
            ans[k++] = i;
        }
        return ans;
    }
}
