package GFGSorting;

public class mergeTwoSortedArrayWithoutExtraSpace {
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
        System.arraycopy(arr,0,arr1,0,n);
        System.arraycopy(arr,n,arr2,0,m);

    }
}
