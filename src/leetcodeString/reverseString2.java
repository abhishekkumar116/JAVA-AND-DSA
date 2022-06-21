package leetcodeString;

public class reverseString2 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int j = 0;

        for(int i = 0; i < s.length(); i+=2*k){
            reverse(ch, i, i + k - 1);
        }

        return String.valueOf(ch);
    }
    public void reverse(char[] ch, int left, int right){
        if(right >= ch.length){
            right = ch.length - 1;
        }
        while(left < right){
            char temp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = temp;
        }
    }
}
