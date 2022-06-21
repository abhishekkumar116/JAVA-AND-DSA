package GFGarray;
import java.util.*;

public class CheckIfTwoArraysAreEqualOrNot {
    public static boolean solution(long[] A, long[] B, int N){
        HashMap<Long, Long> mp=new HashMap<>();
        HashMap<Long, Long> mp2=new HashMap<>();

        for(int i=0;i<N; i++){
            if(mp.containsKey(A[i]))
            {
                mp.put(A[i],mp.get(A[i])+1);
            }
            else
            {
                mp.put(A[i],(long)1);
            }
        }

        for(int i=0;i<N; i++){
            if(mp2.containsKey(B[i]))
            {
                mp2.put(B[i],mp2.get(B[i])+1);
            }
            else
            {
                mp2.put(B[i],(long)1);
            }
        }
        if(mp.equals(mp2)){
            return true;
        }
        return false;
    }
}
