package leetcodeMath;

public class palindromeNumber {
    public boolean isPalindrome(int x){
        if(x == 0){
            return true;
        }
        if (x < 0 || x % 10 == 0){
            return false;
        }
        int temp = x;
        int ans = 0;

        while (temp != 0){
            int rem = temp%10;
            temp = temp/10;
            ans = ans*10 + rem;
        }
        if (ans == x){
            return true;
        }else {
            return false;
        }
    }
}
