package leetcodeContest288;
import java.util.*;
public class playerWithZeroOrOneLoses {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> winner = new HashMap<>();
        HashMap<Integer, Integer> loser = new HashMap<>();
        List<Integer> win = new ArrayList<>();
        List<Integer>lose = new ArrayList<>();

        for(int i = 0; i < matches.length; i++){
            winner.put(matches[i][0], winner.getOrDefault(matches[i][0], 0) + 1);
            loser.put(matches[i][1], loser.getOrDefault(matches[i][1], 0) + 1);
        }

        for(int player : winner.keySet()){
            if(!loser.containsKey(player)){
                win.add(player);
            }
        }
        Collections.sort(win);
        ans.add(win);

        for(int player : loser.keySet()){
            if(loser.get(player) == 1){
                lose.add(player);
            }
        }
        Collections.sort(lose);
        ans.add(lose);

        return ans;
    }
}
