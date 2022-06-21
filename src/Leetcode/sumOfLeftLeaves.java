package Leetcode;

import com.sun.source.tree.Tree;

public class sumOfLeftLeaves {
    int sum = 0;
    public int sumLeftLeaves(TreeNode root){
        helper(root, false);
        return sum;
    }
    public void helper(TreeNode root ,boolean isLeft){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null && isLeft){
            sum += root.val;
        }
        helper(root.left, true);
        helper(root.right, false);
    }
}
