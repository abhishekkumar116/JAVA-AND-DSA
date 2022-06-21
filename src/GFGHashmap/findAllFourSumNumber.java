package GFGHashmap;
import java.util.*;

public class findAllFourSumNumber {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;
        if(arr == null || arr.length == 0){
            return res;
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int target2 = k - arr[j] - arr[i];

                int front = j + 1;
                int back = n - 1;

                while(front < back){
                    int twoSum = arr[front] + arr[back];
                    if(twoSum < target2){
                        front++;
                    }else if(twoSum > target2){
                        back--;
                    }else{
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[front]);
                        quad.add(arr[back]);
                        res.add(quad);

                        while(front < back && arr[front] == quad.get(2)) ++front;
                        while(front < back && arr[back] == quad.get(3)) --back;
                    }
                }
                while(j + 1 < n && arr[j + 1] == arr[j]) ++j;
            }
            while(i + 1 < n && arr[i + 1] == arr[i]) ++i;
        }
        return res;
    }
}
