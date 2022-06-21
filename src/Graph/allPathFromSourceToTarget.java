package Graph;
import java.util.*;

public class allPathFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        currList.add(0);
        dfs(graph, 0, graph.length - 1, list, currList);
        return list;
    }
    public void dfs(int[][] graph, int src, int dist, List<List<Integer>> list, List<Integer> currList){
        if(src == dist){
            list.add(new ArrayList(currList));
            return;
        }

        for(int v : graph[src]){
            currList.add(v);
            dfs(graph, v, dist, list, currList);
            currList.remove(currList.size() - 1);
        }
    }
}
