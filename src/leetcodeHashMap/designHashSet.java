package leetcodeHashMap;

import java.util.HashSet;

public class designHashSet {
    HashSet<Integer> set = new HashSet<>();
    public designHashSet(int key){

    }
    public void add(int key){
        set.add(key);
    }
    public void remove(int key){
        set.remove(key);
    }
    public boolean contains(int key){
        return set.contains(key);
    }
}
