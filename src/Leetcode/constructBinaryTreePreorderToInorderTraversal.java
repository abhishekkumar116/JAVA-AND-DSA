package Leetcode;
import java.util.*;

public class constructBinaryTreePreorderToInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,int inEnd, Map<Integer, Integer> inMap){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = inMap.get(root.val);
        int numLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numLeft, inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

        return root;
    }
}
