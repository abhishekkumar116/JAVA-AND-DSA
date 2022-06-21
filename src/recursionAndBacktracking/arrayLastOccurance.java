package recursionAndBacktracking;

import java.util.Scanner;

public class arrayLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

    }
    public static int lastIndex(int[] arr, int idx, int x){
        if (idx == arr.length){
            return -1;
        }
        int lim1 = lastIndex(arr, idx + 1, x);
        if(lim1 == -1){
            if(arr[idx] == x){
                return idx;
            } else{
                return -1;
            }
        } else{
            return lim1;
        }
    }
}
