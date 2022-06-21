package FAANGLISTArray;
import java.util.*;

public class choclateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a);
        long minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n - m + 1; i++){
            minDiff = Math.min(a.get(i + m - 1) - a.get(i), minDiff);
        }
        return minDiff;

    }
}
