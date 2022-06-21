package arrayLevel2;

import java.util.Scanner;

public class rangeAddition {
    public static int[] getModifiedArray(int length, int[][] queries){
        int res[] = new int[length];

        for (int q = 0; q < queries.length; q++){
            int st = queries[q][0];
            int end = queries[q][1];
            int inc = queries[q][2];

            res[st] += inc;
            if (end + 1 < length){
                res[end+1] -= inc;
            }
        }
        int sum = 0;
        // prefix sum
        for (int i = 0; i < length; i++){
            sum += res[i];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int nq = sc.nextInt();

        int[][] queries = new int[nq][3];

        for (int q = 0; q < nq; q++){
            queries[q][0] = sc.nextInt();
            queries[q][1] = sc.nextInt();
            queries[q][2] = sc.nextInt();

        }
        int[] res = getModifiedArray(length, queries);

        for (int i = 0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
