package leetcodeString;
import java.util.*;

public class baseballGame {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i < ops.length; i++){
            if(!ops[i].equals("C") && !ops[i].equals("D") && !ops[i].equals("+")){
                int roundScore = Integer.valueOf(ops[i]);
                sum += roundScore;
                list.add(roundScore);
            }else if(ops[i].equals("D")){
                int roundScore = 2 * list.get(list.size() - 1);
                sum += roundScore;
                list.add(roundScore);
            }else if(ops[i].equals("C")){
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }else{
                int roundScore = list.get(list.size() - 1) + list.get(list.size() - 2);;
                sum += roundScore;
                list.add(roundScore);
            }
        }
        return sum;
    }
}
