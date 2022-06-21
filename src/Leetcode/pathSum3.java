package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class pathSum3 {
    int ans = 0;
    public int pathSum(TreeNode root , int target){
        Map<Integer,Integer> hm = new HashMap<>();
        helper(root, target, hm, 0);
        return ans;
    }
    public void helper(TreeNode root, int target , Map<Integer, Integer> hm, int currSum){
        if (root == null){
            return;
        }
        currSum += root.val;
        if (currSum == target){
            ans++;
        }
        if (hm.containsKey(currSum - target)) {
            ans += hm.get(currSum - target);
        }
        hm.put(currSum, hm.getOrDefault(currSum, 0) + 1);
        helper(root.left, target, hm, currSum);
        helper(root.right, target, hm, currSum);
    }
}
