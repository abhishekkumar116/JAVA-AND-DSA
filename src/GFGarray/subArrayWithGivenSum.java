package GFGarray;
import java.util.*;

public class subArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> index=new ArrayList<>();
        if(arr.length==0){
            index.add(-1);
        }
        int curr_sum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {
            while (curr_sum > s && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if (curr_sum == s) {
                int p = i - 1;
                index.add(start+1);
                index.add(p+1);
                return index;
            }

            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        index.add(-1);
        return index;
    }
}
