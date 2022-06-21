package GFGarray;
import java.util.*;

public class minimumPlatform {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platformReq = 1;
        int result = 1;
        int i = 1;
        int j = 0;

        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                platformReq++;
                i++;
            }else if(arr[i] > dep[j]){
                platformReq--;
                j++;
            }
            if(platformReq > result){
                result = platformReq;
            }
        }
        return result;

    }
}
