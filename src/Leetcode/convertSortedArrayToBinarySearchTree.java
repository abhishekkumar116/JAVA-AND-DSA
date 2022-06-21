package Leetcode;

public class convertSortedArrayToBinarySearchTree {
    public TreeNode binaryTree(int[] nums){
        return buildTree(nums, 0, nums.length - 1);
    }
    public TreeNode buildTree(int[] nums, int start, int end){
        if (end < start){
            return null;
        }
        int mid = start - (end + start)/2;
        TreeNode n = new TreeNode(nums[mid]);

        n.left = buildTree(nums, start, mid - 1);
        n.right = buildTree(nums, mid + 1, end);
        return n;
    }
}
