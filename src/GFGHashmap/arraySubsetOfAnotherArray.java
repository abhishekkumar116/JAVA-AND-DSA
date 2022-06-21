package GFGHashmap;

import java.util.HashSet;

public class arraySubsetOfAnotherArray {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> set = new HashSet<>();

        for(long val : a1){
            set.add(val);
        }

        for(long val : a2){
            if(!set.contains(val)){
                return "No";
            }
        }
        return "Yes";
    }
}
