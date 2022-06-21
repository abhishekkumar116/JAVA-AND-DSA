package Leetcode;

public class invertBinaryTree {
 public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
  public class solution{
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return root;
            }
            TreeNode left = root.left;
            root.left = this.invertTree(root.right);
            root.right = this.invertTree(left);

            return root;
        }
    }
}
