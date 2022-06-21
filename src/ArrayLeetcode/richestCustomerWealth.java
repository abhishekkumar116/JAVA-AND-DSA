package ArrayLeetcode;

public class richestCustomerWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            int rowSum = 0;
            for(int j = 0; j < arr[0].length; j++){
                rowSum += arr[i][j];
            }
            if (rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
