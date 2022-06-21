package Leetcode;
//There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
//
//        When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
//
//        Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
import javax.swing.event.ListDataListener;
import java.util.*;

public class keysAndRoom {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, rooms.get(0), visited);
        visited[0] = true;
        for (int i = 0; i < rooms.size(); i++){
            if (!visited[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, List<Integer> room, boolean[] visited){
        for (int key : room){
            if (!visited[key]){
                visited[key] = true;
                dfs(rooms, rooms.get(key), visited);
            }
        }
    }
}
