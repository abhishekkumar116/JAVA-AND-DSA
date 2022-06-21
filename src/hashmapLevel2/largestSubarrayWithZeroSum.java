package hashmapLevel2;

import java.util.HashMap;
import java.util.Scanner;

public class largestSubarrayWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int mlen = 0;

        int i = -1;
        int sum = 0;
        map.put(sum, i);

        while (i < arr.length - 1){
            i++;
            sum += arr[i];

            if(map.containsKey(sum) == false){
                map.put(sum, i);
            }else {
                int len = i - map.get(sum);
                if (len > mlen){
                    mlen = len;
                }
            }
        }
        return mlen;
    }
}
