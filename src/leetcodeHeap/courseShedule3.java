package leetcodeHeap;
import java.util.*;

public class courseShedule3 {
    public int course(int[][] courses){
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        int time = 0;

        for (int[] course : courses){
            if (time +course[0] <= course[1]){
                pq.offer(course[0]);
                time+= course[0];
            }else if(!pq.isEmpty() && pq.peek() >course[0]){
                time+= course[0] - pq.poll();
                pq.offer(course[0]);
            }
        }
        return pq.size();
    }
}
