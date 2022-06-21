package ArrayLeetcode;

public class searchInTwoDMatrix {
    public boolean TwoDMatrix(int[][] matrix, int target){

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = (m * n) - 1;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (matrix[mid/m][mid%m] == target) {
                return true;
            } else if (matrix[mid/m][mid%m] > target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return false;
    }
}
