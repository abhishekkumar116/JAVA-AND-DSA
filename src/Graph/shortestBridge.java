package Graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class shortestBridge {

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

            System.out.println(shortestBridge(arr));

        }

        public static class Pair {
            int row;
            int col;

            Pair(int row, int col) {
                this.row = row;
                this.col = col;

            }
        }

        public static int shortestBridge(int[][] arr) {
            LinkedList<Pair> queue = new LinkedList<>();
            boolean[][] visited = new boolean[arr.length][arr[0].length];
            boolean flag = false;

            for (int i = 0; i < arr.length && !flag; i++) {
                for (int j = 0; j < arr[0].length && !flag; j++) {
                    if (arr[i][j] == 1) {
                        dfs(i, j, arr, queue, visited);
                        flag = true;
                    }
                }
            }
            int level = -1;

            while(queue.size() > 0){
                int size = queue.size();
                level++;

                while(size --> 0){
                    Pair rem = queue.removeFirst();

                    for(int i = 0; i < 4; i++){
                        int rowdash = rem.row + dirs[i][0];
                        int coldash = rem.col + dirs[i][1];

                        if (rowdash < 0 || coldash < 0 || rowdash >= arr.length ||
                                coldash >= arr[0].length || visited[rowdash][coldash] == true) {
                            continue;
                        }

                        if(arr[rowdash][coldash] == 1){
                            return level;
                        }
                        queue.addLast(new Pair(rowdash, coldash));

                    }
                }
            }
            return -1;
        }

        static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        public static void dfs(int i, int j, int[][] arr, LinkedList<Pair> queue, boolean[][] visited) {
            visited[i][j] = true;
            queue.addLast(new Pair(i, j));
            for (int k = 0; k < dirs.length; k++) {
                int rowdash = i + dirs[i][0];
                int coldash = j + dirs[i][1];

                if (rowdash < 0 || coldash < 0 || rowdash >= arr.length || coldash >= arr[0].length ||
                        visited[rowdash][coldash] == true || arr[rowdash][coldash] == 0) {
                    continue;
                }
                dfs(rowdash, coldash, arr, queue, visited);
            }

        }
    }







