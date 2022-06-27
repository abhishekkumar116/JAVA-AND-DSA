package leetcodeBitManupulation;

public class rangeBitwiseAnd {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=0;
        return helper(left,right);
    }
    int helper(int left,int right){
        if(right<=left)
            return right & left;
        return helper(left,right=right&(right-1));
    }
}
