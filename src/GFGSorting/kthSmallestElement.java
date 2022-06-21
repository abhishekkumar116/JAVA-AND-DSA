package GFGSorting;

import java.util.Arrays;

public class kthSmallestElement {
    public int element(int[] arr, int l, int k){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            return arr[k - 1];
        }
        return arr[k -1];
    }
}
