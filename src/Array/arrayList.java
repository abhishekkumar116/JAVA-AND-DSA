package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> "+list.size());

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> "+list.size());

        list.add(1,1000);
        System.out.println(list + " -> "+list.size());

        int val = list.get(1);  // not list[1]
        System.out.println(val);

        list.set(1, 2000);
        System.out.println(list + " -> "+list.size());

        list.remove(1);
        System.out.println(list + " -> "+list.size());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("hii");
        l2.add("bye");
        l2.add("ohh attitude");
        System.out.println(l2 + " -> "+l2.size());

        for (int i = 0; i<list.size(); i++){
            int val2 = list.get(i);
            System.out.println(val2);

            for (int val1 : list){
                System.out.println(val1);
            }
        }
    }
}
