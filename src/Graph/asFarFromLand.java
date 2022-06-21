package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class asFarFromLand {

        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st[j]);
                }
            }

            System.out.println(maxDistance(arr));

        }
        public static class Pair{
            int row;
            int col;

            Pair(int row, int col){
                this.row = row;
                this.col = col;
            }
        }

        public static int maxDistance(int[][] arr) {
            LinkedList<Pair> queue = new LinkedList<>();

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    if(arr[i][j] == 1){
                        queue.addLast(new Pair(i, j));
                    }
                }
            }

            if(queue.size() == 0 || queue.size() == arr.length * arr[0].length){
                return -1;
            }
            int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            int level = -1;
            while(queue.size() > 0){
                level++;
                int size = queue.size();
                while(size-->0){
                    Pair rem = queue.removeFirst();

                    for(int i = 0; i < dirs.length; i++){
                        int rowdash = rem.row + dirs[i][0];
                        int coldash = rem.col + dirs[i][1];

                        if(rowdash < 0 || coldash < 0 || rowdash >= arr.length ||
                                coldash >= arr[0].length || arr[rowdash][coldash] == 1){
                            continue;
                        }
                        queue.addLast(new Pair(rowdash, coldash));
                        arr[rowdash][coldash] = 1;
                    }
                }
            }
            return level;
        }
    }

