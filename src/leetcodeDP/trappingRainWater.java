package leetcodeDP;

public class trappingRainWater {
    public int trappingWater(int[] arr){
        int left = 0;
        int right = 0;
        int lMax = 0;
        int rMax = 0;
        int res = 0;

        while (left <= right){
            if (arr[left] <= arr[right]){
                if (arr[left] >= lMax){
                    lMax = arr[left];
                } else {
                    res += lMax - arr[left];
                }
                left++;
            }else {
                if (arr[right] > rMax){
                    rMax = arr[right];
                } else{
                    res += rMax - arr[right];
                }
            }
            right--;
        }

        return res;
    }
}
