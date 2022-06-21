package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,9,5,3,6,4,1};

        Set<Integer> uniqueNumber = new HashSet<>();
        boolean isDuplicateExist = false;

        for (int i = 0; i < arr.length; i++){
            if (uniqueNumber.contains(arr[i])){
                isDuplicateExist = true;
                System.out.println("Duplicate element "+arr[i]);
            }else {
                uniqueNumber.add(arr[i]);
            }
        }
        if (!isDuplicateExist){
            System.out.println(-1);
        }
    }
}
