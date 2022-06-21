package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeRightTreeView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }
    public void helper(TreeNode root, int level, List<Integer> ans){
        if (root == null){
            return;
        }
        if (level == ans.size()){
            ans.add(root.val);
        }
        helper(root.right, level + 1, ans);
        helper(root.left, level + 1, ans);
    }
}
