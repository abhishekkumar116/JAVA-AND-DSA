package Leetcode;
import java.util.*;
import java.io.*;
public class combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubset(1, n, new ArrayList<>(), ans, k);
        return ans;
    }
    void generateSubset(int start, int n, List<Integer> current, List<List<Integer>> ans, int k){
        if(current.size() == k){
            ans.add(new ArrayList(current));
            return;
        }

        for(int i = start; i <= n; i++){
            current.add(i);
            generateSubset(i + 1, n, current, ans, k);
            current.remove(current.size() - 1);
        }
    }
}