package ArrayLeetcode;

public class removeDuplicateFromSortedArray2 {
    public int remove(int[] num){
        int l = 0;
        int count = 1;
        int curr = num[0];
        for (int r = 1; r < num.length; r++){
            if (num[r] == curr){
                count++;
            }else {
                count = 1;
                curr = num[r];
            }
            if (count <= 2){
                l++;
                num[l] = num[r];
            }
        }
        return l + 1;
    }

}
