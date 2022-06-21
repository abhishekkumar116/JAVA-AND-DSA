package hashmapLevel2;

import java.util.HashMap;
import java.util.Scanner;

public class countOfAllSubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = -1;
        int sum = 0;
        map.put(0, 1);

        while (i < arr.length - 1){
            i++;
            sum += arr[i];

            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }else {
                map.put(sum, 1);
            }
        }
        return count;
    }
}
