package Leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreeLevelOrderTraversal2 {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root){
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
                    if (temp.left != null){
                        queue.add(temp.left);
                    }
                    if (temp.right != null){
                        queue.add(temp.right);
                    }
                }
                list.add(0, innerList);
            }
        }
        return list;
    }

}
