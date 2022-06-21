package GFGSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sumOfMiddleOfTwoSortedArray {
    public int sum(int[] arr1, int[] arr2, int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(arr1[i]);
            list.add(arr2[i]);
        }
        Collections.sort(list);
        return list.get(n) + list.get(n - 1);
    }
}
