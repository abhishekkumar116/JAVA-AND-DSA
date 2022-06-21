package leetcodeHeap;
import java.util.*;
public class topKfrequentElement {
    public int[] element(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> map.get(b) - map.get(a));

        for(int i : map.keySet()){
            pq.add(i);
        }
        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty() && i < k){
            res[i] = pq.poll();
            i++;
        }
        return res;
    }
}
