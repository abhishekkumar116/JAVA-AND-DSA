package Leetcode;
import java.util.*;

public class minimumDepthOfBinaryTree {
    public int minDepth(TreeNode root){
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        int minDepth = 0;

        while (!q.isEmpty()){
            minDepth++;
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if (node.left == null && node.right == null){
                    return minDepth;
                }
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
        }
        return minDepth;
    }
}
