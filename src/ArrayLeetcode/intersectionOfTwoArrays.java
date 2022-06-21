package ArrayLeetcode;

import java.util.HashSet;

public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1){
            set1.add(i);
        }
        for (int i : nums2){
            if (set1.contains(i)){
                set2.add(i);
            }
        }
        int[] ans = new int[set2.size()];
        int k = 0;
        for (int i : set2){
            ans[k++] = i;
        }
        return ans;
    }
}
