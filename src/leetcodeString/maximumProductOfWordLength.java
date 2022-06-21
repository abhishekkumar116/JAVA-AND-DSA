package leetcodeString;

public class maximumProductOfWordLength {
    public int maxProduct(String[] words){
        int max = 0;

        int n = words.length;
        int[] bits = new int[n];

        for (int i = 0; i < n; i++){
            for (char c : words[i].toCharArray()){
                bits[i] |= (1 << (c - 'a'));
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){
                if (i != j && ((bits[i] & bits[j]) == 0)){
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
