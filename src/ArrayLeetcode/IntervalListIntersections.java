package ArrayLeetcode;
import java.util.*;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> ans = new ArrayList<>();

        int ptr1 = 0, ptr2 = 0;

        while(ptr1 < firstList.length && ptr2 < secondList.length){
            int commonStartPoint = Math.max(firstList[ptr1][0], secondList[ptr2][0]);
            int commonEndPoint = Math.min(firstList[ptr1][1], secondList[ptr2][1]);

            if(commonStartPoint <= commonEndPoint){
                int[] intervals = {commonStartPoint, commonEndPoint};
                ans.add(intervals);
            }
            if(firstList[ptr1][1] < secondList[ptr2][1]){
                ptr1++;
            }else{
                ptr2++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
