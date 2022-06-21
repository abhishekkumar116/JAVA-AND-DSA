package GFGarray;

public class trappingRainWater {
    public long trap(int[] arr, int n){
        int left = 0;
        int right = arr.length;
        int lmax = 0;
        int rmax = 0;

        long res = 0;

        while (left <= right){
            if (arr[left] <= arr[right]){
                if (arr[left] >= lmax){
                    lmax = arr[left];
                }else {
                    res += lmax - arr[left];
                }
                left++;
            }else {
                if (arr[right] >= rmax){
                    rmax = arr[right];
                }else {
                    res += rmax - arr[right];
                }
                right--;
            }
        }
        return res;
    }
}
