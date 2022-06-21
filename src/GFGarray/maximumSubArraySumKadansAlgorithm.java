package GFGarray;

public class maximumSubArraySumKadansAlgorithm {
    public int maxSubArray(int[] arr, int n){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            sum += arr[i];
            if (sum > maxSum){
                maxSum = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
