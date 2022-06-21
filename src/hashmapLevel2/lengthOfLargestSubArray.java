package hashmapLevel2;

import java.util.HashSet;
import java.util.Scanner;

public class lengthOfLargestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int ans = 0;

        for (int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int max = arr[i];
            HashSet<Integer> cd = new HashSet<>();
            cd.add(arr[i]);

            for (int j = i + 1; j < arr.length; j++){
                if (cd.contains(arr[j])){
                    break;
                }
                cd.add(arr[j]);

                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                int len = max - min + 1;
                if (len > ans){
                    ans = len;
                }
            }
        }
        return ans;
    }
}
