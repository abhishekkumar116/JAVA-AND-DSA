package FAANGLISTArray;

public class equlibriumSum {
    String equilibrium(int arr[], int n) {
        int leftSum = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            sum -= arr[i];

            if(sum == leftSum){
                return "YES";
            }
            leftSum += arr[i];
        }
        return "NO";
    }
}
