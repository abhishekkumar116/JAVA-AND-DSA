package Leetcode;

public class balancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        return dfsHeight(root) != -1;
    }
    public int dfsHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int lh = dfsHeight(root.left);
        if (lh == -1){
            return -1;
        }
        int rh = dfsHeight(root.right);
        if (rh == -1){
            return -1;
        }
        if (Math.abs(lh - rh) > 1){
            return -1;
        }
        return Math.max(lh,rh) + 1;
    }
}
