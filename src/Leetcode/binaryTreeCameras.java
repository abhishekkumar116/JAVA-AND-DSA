package Leetcode;

public class binaryTreeCameras {
    public int camera = 0;
    public int minCameraCover(TreeNode root) {
        if(cameraCover(root) == -1){
            camera++;
        }
        return camera;
    }
    public int cameraCover(TreeNode root){
        if(root == null){
            return 1;
        }
        int leftChild = cameraCover(root.left);
        int rightChild = cameraCover(root.right);

        if(leftChild == -1 || rightChild == -1){
            camera++;
            return 0;
        }
        if(leftChild == 0 || rightChild == 0){
            return 1;
        }
        return -1;
    }
}
