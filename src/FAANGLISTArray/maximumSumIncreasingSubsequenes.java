package FAANGLISTArray;

public class maximumSumIncreasingSubsequenes {
    public int subSequences(int[] arr){
        int[] dp = new int[arr.length];

        int omax = Integer.MIN_VALUE;

        for (int i = 0; i < dp.length; i++){
            Integer max = null;
            for (int j = 0; j < i; j++){
                if (arr[j] < arr[i]){
                    if (max == null){
                        max = arr[j];
                    }else if (arr[j] > max){
                        max = arr[j];
                    }
                }
            }
            if (max == null){
                dp[i] = arr[i];
            }else {
                dp[i] = arr[i] + max;
            }
            if (dp[i] > omax){
                omax = dp[i];
            }
        }
        return omax;
    }
}
