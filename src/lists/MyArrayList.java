package lists;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList();
        List<String> vegetable = new ArrayList();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        String temp[] = new String[fruits.size()];

        fruits.toArray(temp);

        for (String e: temp){
            System.out.println(e);
        }

//        fruits.size();
//        fruits.contains("Apple");
//        fruits.isEmpty();
//
//        System.out.println(fruits);
//        fruits.set(1, "Banana");
//       fruits.remove(2);
//        fruits.clear();
//        List<String> toRemove = new ArrayList();
//        toRemove.add("Apple");
//        toRemove.add("Mango");
//
//        fruits.removeAll(toRemove);

//        System.out.println(fruits.get(1));
//        System.out.println(fruits);
//        vegetable.add("Gobhi");
//        vegetable.add("bhata");
//        vegetable.add("karela");
//
//        fruits.addAll(vegetable);
//
//        System.out.println(fruits);

//        ArrayList<Integer> marks = new ArrayList<>();
//
//        pair<String, Integer> p1 = new pair("Anuj",400);
//        pair<Boolean,String> p2 = new pair(true,"Hello");
//
//        p1.getDescription();
//        p2.getDescription();
    }
}
