package Leetcode;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                List<Integer> innerList = new ArrayList<>();
                int count = queue.size();
                for (int i = 0; i < count; i++){
                    TreeNode temp = queue.remove();
                    innerList.add(temp.val);
                    if (temp.left == null){
                        queue.add(temp.left);
                    }
                    if (temp.right == null){
                        queue.add(temp.right);
                    }
                }
                list.add(innerList);
            }
        }
        return list;
    }
}
