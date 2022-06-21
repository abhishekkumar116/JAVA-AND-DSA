package Leetcode;

public class increasingOrderSearchTree {
    TreeNode result = new TreeNode();
    TreeNode first = result;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
        {
            return null;
        }

        increasingBST(root.left);

        result.right = new TreeNode(root.val);
        result = result.right;

        increasingBST(root.right);

        return first.right;
    }
}
