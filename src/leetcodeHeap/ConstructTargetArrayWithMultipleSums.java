package leetcodeHeap;

import java.util.*;

public class ConstructTargetArrayWithMultipleSums {
    public boolean constructTargetArray(int[] target){
        long sum = 0;

        PriorityQueue<Long> pq = new PriorityQueue(Collections.reverseOrder());
        for (int ele : target) {
            pq.add((long) ele);
            sum += ele;
        }
        while (pq.peek() != 1){
            long top = pq.poll();

            sum -= top;
            if (sum <= 0 || sum >= top){
                return false;
            }
            top = top % sum;
            sum = top + sum;
            pq.add(top > sum ? top : sum);
        }
        return true;
    }
}
