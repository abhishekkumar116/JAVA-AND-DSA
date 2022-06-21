package Leetcode;

public class mergeTwoBinaryTree {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
    public TreeNode merge(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return null;
        }
        if(root1 != null && root2 == null){
            return root1;
        }
        if(root1 == null && root2 != null){
            return root2;
        }
        root1.val = root1.val + root2.val;
        root1.left = merge(root1.left, root2.left);
        root1.right = merge(root1.right, root2.right);
        return root1;
    }
}
