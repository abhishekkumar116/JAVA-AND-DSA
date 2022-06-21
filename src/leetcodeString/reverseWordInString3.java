package leetcodeString;

public class reverseWordInString3 {
    public String reverseWords(String s) {
        char[] strChar = s.toCharArray();
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            while (right < s.length() && strChar[right] != ' ') {
                right++;
            }
            reverse(strChar, left, right - 1);
            left = right + 1;
            right = left;
        }
        return String.valueOf(strChar);
    }

    public void reverse(char[] strChar, int start, int end) {
        while (start < end) {
            char temp = strChar[start];
            strChar[start++] = strChar[end];
            strChar[end--] = temp;
        }
    }
}