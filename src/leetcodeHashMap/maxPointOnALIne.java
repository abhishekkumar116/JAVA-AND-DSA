package leetcodeHashMap;
import java.util.*;

public class maxPointOnALIne {
    public int maxPoints(int[][] points) {
        int N = points.length;

        if (N <= 2) {
            return N;
        }

        int max = 1;

        for (int i=0; i<N; i++) {
            int[] point = points[i];
            int duplicate = 0;

            Map<Double, Integer> mp = new HashMap<>();
            int localMax = 1;

            for (int j=i+1; j<N; j++) {
                if (isSame(point, points[j])) {
                    duplicate++;
                    continue;
                }
                // y = mx + c
                double m = getSlope(point, points[j]);
                mp.put(m, mp.getOrDefault(m, 1) + 1);
                localMax = Math.max(localMax, mp.get(m));
            }
            max = Math.max(max, localMax + duplicate);
        }
        return max;
    }

    private static double getSlope(int[] point1, int[] point2) {
        if (point1[0] == point2[0]) {
            return Double.MAX_VALUE;
        }

        if (point1[1] == point2[1]) {
            return 0;               // whether slope if 0 or -0, it is same as 0 in map key
        }

        return (1.0 * point2[1] - point1[1]) / (point2[0] - point1[0]);
    }

    private static boolean isSame(int[] point1, int[] point2) {
        return point1[0] == point2[0]
                && point1[1] == point2[1];
    }
}
