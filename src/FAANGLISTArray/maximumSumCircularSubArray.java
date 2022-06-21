package FAANGLISTArray;

public class maximumSumCircularSubArray {
    public int maxSubarraySumCircular(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int x = kadans(arr);
        int y = 0;

        for(int i = 0; i < arr.length; i++){
            y += arr[i];
            arr[i] *= -1;
        }
        int z = kadans(arr);

        if(y + z == 0){
            return x;
        }
        return Math.max(x, y + z);

    }
    public static int kadans(int[] arr){
        int sum = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++){
            sum += arr[i];

            if(sum < arr[i]){
                sum = arr[i];
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
