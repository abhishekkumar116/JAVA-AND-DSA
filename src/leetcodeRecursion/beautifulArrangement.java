package leetcodeRecursion;

public class beautifulArrangement {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];

        helper(n, 1, used);
        return ans;
    }
    int ans;
    public void helper(int n, int index, boolean[]used){
        if(index > n){
            ans++;
            return;
        }
        for(int i = 1; i <= n; i++){
            if(used[i]){
                continue;
            }
            if(index % i == 0 || i % index == 0){
                used[i] = true;
                helper(n, index + 1, used);
                used[i] = false;
            }
        }
    }
}
