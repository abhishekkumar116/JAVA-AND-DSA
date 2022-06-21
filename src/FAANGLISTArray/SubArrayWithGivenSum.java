package FAANGLISTArray;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithGivenSum {
    public ArrayList<Integer> subArray(int[] arr, int sum){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if (currSum - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - sum)){
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
        }
        if (end == -1){
            ans.add(-1);
        }else {
            ans.add(start + 1);
            ans.add(end + 1);
        }
        return ans;
    }
}
