package leetcodeRecursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public List<List<Integer>> combination(int k, int n){
        List<List<Integer>> res = new ArrayList<>();

        findCombination(1, 9, k, n, new ArrayList<>(), res);
        return res;
    }
    void findCombination(int start, int end, int k ,int remain, List<Integer> curr, List<List<Integer>> res){
        if (remain == 0){
            if (curr.size() == 0){
                res.add(new ArrayList<>(curr));
            }else{
                return;
            }
        }
        if (remain < 0 || curr.size() > 0){
            return;
        }
        for (int i = start; i <= end; i++){
            curr.add(i);
            findCombination(i + 1, end, k, remain - i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
