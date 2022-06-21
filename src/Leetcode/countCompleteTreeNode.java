package Leetcode;

public class countCompleteTreeNode {
    public int countNode(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        } else {
            return 1 + countNode(root.left) + countNode(root.right);
        }
    }
}
