package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class perfectFriendProblem {
    public static class Edge{
        int v;
        int n;

        Edge(int v, int n){
            this.v = v;
            this.n = n;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int v = 0; v < n; v++){
            graph[v] = new ArrayList<>();
        }
        for (int e = 0; e < k; e++) {
            String line = br.readLine();
            String[] parts = line.split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt((parts[1]));

        }

        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        for (int v = 0; v < n; v++){
            if (visited[v] == false){
                ArrayList<Integer> comp = new ArrayList<>();
                drawTreeAndCreateComp(graph, v, comp, visited);
                comps.add(comp);
            }
        }
        int pair = 0;

        for (int i = 0; i < comps.size(); i++){
            for (int j = i + 1; j < comps.size(); j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pair += count;

            }
        }
        System.out.println(pair);
    }
    public static void drawTreeAndCreateComp(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited){
        visited[src] = true;
        comp.add(src);

        for (Edge e : graph[src]){
            if (visited[e.n] == false){
                drawTreeAndCreateComp(graph, e.n, comp, visited);
            }
        }
    }
}
