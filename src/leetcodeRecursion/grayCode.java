package leetcodeRecursion;
import java.util.*;

public class grayCode {
    public List<Integer> solution(int n){
        if (n == 1){
            ArrayList<Integer> bres = new ArrayList<>();
            bres.add(0);
            bres.add(1);
            return bres;
        }

        List<Integer> rres = solution(n - 1);
        List<Integer> mres = new ArrayList<>();

        for (int i = 0; i < rres.size(); i++){
            mres.add(0 + 2*rres.get(i));
        }
        for (int i = rres.size() - 1; i >= 0; i--){
            mres.add(1 + 2*rres.get(i));
        }
        return mres;
    }
}
