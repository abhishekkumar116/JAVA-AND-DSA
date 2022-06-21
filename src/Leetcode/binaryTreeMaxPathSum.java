package Leetcode;

import java.util.*;

public class binaryTreeMaxPathSum {
    public int maxPath(TreeNode root){
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }
    public int maxPathDown(TreeNode root, int[] maxValue){
        if (root == null){
            return 0;
        }
        int left = Math.max(0, maxPathDown(root.left, maxValue));
        int right = Math.max(0, maxPathDown(root.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], left + right + root.val);
        return Math.max(left , right) + root.val;
    }
}
