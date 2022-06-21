package GFGarray;

import java.util.ArrayList;

public class stockBuyAndSell {
    public ArrayList<ArrayList<Integer>> buyAndSell(int[] price ,int n){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> subList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++){
            subList = new ArrayList<Integer>();
            if (price[i] < price[i + 1]){
                subList.add(i);
                subList.add(i + 1);
                list.add(subList);
            }
        }
        return list;
    }
}
