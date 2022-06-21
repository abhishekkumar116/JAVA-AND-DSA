package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class pathSum2 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        helper(root, targetSum, new ArrayList<Integer>());
        return ans;
    }
    public void helper(TreeNode root, int targetSum, List<Integer> newList){
        if (root == null){
            return;
        }
        newList.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val){
            ans.add(newList);
            helper(root, targetSum - root.val, newList);
            helper(root, targetSum - root.val, newList);
            newList.remove(newList.size() - 1);
        }
    }
}
