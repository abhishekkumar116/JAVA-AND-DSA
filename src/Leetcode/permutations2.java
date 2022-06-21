package Leetcode;
import java.util.*;
import java.io.*;
public class permutations2 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        recursion(ans, nums, ds, visited);
        return ans;
    }
    void recursion(List<List<Integer>> ans, int[] nums, ArrayList<Integer> ds, boolean[] visited){
        if (ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == false && set.contains(nums[i]) == false){
                ds.add(nums[i]);
                visited[i] = true;
                set.add(nums[i]);
                recursion(ans, nums, ds, visited);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }
    }
}