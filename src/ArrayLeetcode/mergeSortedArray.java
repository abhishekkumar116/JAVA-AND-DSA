package ArrayLeetcode;

public class mergeSortedArray {
    public static void merge(long arr1[], long arr2[], int n, int m){
        long[] arr = new long[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        for (int b = 0; b < arr1.length; b++){
            arr1[b] = arr[b];
        }
    }

}
