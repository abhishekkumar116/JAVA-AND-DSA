package leetcodeRecursion;
import java.util.*;
public class subset2 {
    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        generateSubset(0, nums, new ArrayList<>(), ans);
        Arrays.sort(nums);
        return ans;
    }
    void generateSubset(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++){
            if (i == index && nums[i] == nums[i - 1]){
                continue;
            }
            curr.add(nums[i]);
            generateSubset(i + 1, nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
