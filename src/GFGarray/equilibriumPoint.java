package GFGarray;

public class equilibriumPoint {
    public int solution(int[] arr, int n){
        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        for (int i = 0; i < n; i++){
            sum -= arr[i];
            if (leftSum == sum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
