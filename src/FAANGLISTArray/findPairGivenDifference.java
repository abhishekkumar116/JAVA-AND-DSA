package FAANGLISTArray;
import java.util.*;
public class findPairGivenDifference {
    public boolean findPair(int arr[], int size, int n){
        Arrays.sort(arr);
        int i = 0;
        int j = 1;

        while(i < size && j < size){
            if(i != j && (arr[i] - arr[j] == n || arr[j] - arr[i] == n)){
                return true;
            }else if(arr[j] - arr[i] > n){
                i++;
            }else {
                j++;
            }
        }
        return false;
    }
}
