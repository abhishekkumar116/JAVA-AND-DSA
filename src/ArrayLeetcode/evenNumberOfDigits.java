package ArrayLeetcode;

public class evenNumberOfDigits {
    public static void main(String[] args) {

    }
    public int findNumber(int[] nums){
        int count = 0;

        for (int num : nums){
            if (even(count)){
                count++;
            }
        }
        return count;
    }
    public boolean even(int num){
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }
    public int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
}
