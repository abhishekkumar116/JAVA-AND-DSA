package GFGarray;

import java.util.*;

public class leaderInAnArray {
    public ArrayList<Integer> solution(int[] arr, int n){
        ArrayList<Integer> result = new ArrayList<>();

        int rmax = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] >= rmax){
                result.add(arr[i]);
                rmax = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
