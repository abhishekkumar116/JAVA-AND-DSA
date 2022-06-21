package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public List<List<Integer>> subset(int[] arr){
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generateSubset(arr, 0, ans, curr);
        return ans;
    }
    void generateSubset(int[] arr, int i, List<List<Integer>> ans, List<Integer> curr){
        if (i == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[i]);
        generateSubset(arr, i + 1, ans, curr);
        curr.remove(curr.size() - 1);
        generateSubset(arr, i + 1, ans, curr);
    }

}
