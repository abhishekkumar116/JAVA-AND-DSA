package leetcodeString;

public class reverseString {
    public void reverse(char[] s){
        int left = 0;
        int right = s.length;

        while(left <= right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
