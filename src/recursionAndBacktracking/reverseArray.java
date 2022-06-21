package recursionAndBacktracking;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverseArr(arr, 0);

    }
    public static void reverseArr(int[] arr, int idx){
        if (idx == arr.length) {
            return;
        }
         reverseArr(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
