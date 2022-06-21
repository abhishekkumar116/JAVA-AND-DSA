package Leetcode;
import java.util.*;
public class deepestLeaveSum {
    public int deepestLeavesSum(TreeNode root) {
        int level_sum = 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);  // offer approx == add

        while(!queue.isEmpty()){
            level_sum = 0;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode current_node = queue.poll();

                level_sum += current_node.val;

                if(current_node.left != null){
                    queue.offer(current_node.left);
                }
                if(current_node.right != null){
                    queue.offer(current_node.right);
                }
            }
        }
        return level_sum;
    }
}
