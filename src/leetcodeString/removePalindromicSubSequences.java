package leetcodeString;

public class removePalindromicSubSequences {
    public int removePalindromeSub(String s) {
        return isPalindrome(s) ? 1:2;


    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
