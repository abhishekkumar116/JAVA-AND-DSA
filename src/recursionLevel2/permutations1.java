package recursionLevel2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class permutations1 {
    public static void permute(int[] boxes, int ci, int ti){
        if (ci > ti){
            for (int i = 0; i < boxes.length; i++) {
                System.out.println(boxes[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < boxes.length; i++){
            if (boxes[i] == 0){
                boxes[i] = ci;
                permute(boxes, ci + 1, ti);
                boxes[i] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permute(new int[nboxes], 1, ritems);
    }
}
