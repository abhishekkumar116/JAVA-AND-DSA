package Leetcode;

import java.util.ArrayList;
import java.util.List;

// print root to leaf paths.

public class binaryTreePaths {
    public List<String> paths(TreeNode root){
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }
    void helper(TreeNode root, List<String> ans, String str) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            ans.add(str + root.val);
            return;
        }
        helper(root.left, ans, str + root.val + "->");
        helper(root.right, ans, str + root.val + "->");
    }
}
