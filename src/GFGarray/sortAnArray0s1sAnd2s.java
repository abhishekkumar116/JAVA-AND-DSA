package GFGarray;

public class sortAnArray0s1sAnd2s {
    public void sorted(int[] arr, int n){
        int low = 0;
        int high = arr.length;
        int mid = 0;

        while (mid <= high){
            switch (arr[mid]){
                case 0:{
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }

        }
    }
}
