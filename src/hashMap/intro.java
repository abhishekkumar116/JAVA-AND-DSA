package hashMap;

import java.util.HashMap;
import java.util.Set;

public class intro {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 130);
        hm.put("China", 160);
        hm.put("Usa", 30);
        hm.put("Pak", 35);

        System.out.println(hm);

        hm.put("Nigeria", 5);
        hm.put("Usa", 30);

        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Utopia"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }
    }
}
