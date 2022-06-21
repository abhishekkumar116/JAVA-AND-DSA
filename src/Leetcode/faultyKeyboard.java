package Leetcode;

import java.util.*;
import java.util.Scanner;

public class faultyKeyboard {
    public static boolean isPossible(String name, String typed){
        if (name.length() > typed.length()) return false;
        int i = 0;
        int j = 0;
        while (i<name.length() && j<typed.length()){
            if (name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } else if (i > 0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            } else {
                return false;
            }
        }
        while (j < typed.length()){
            if (name.charAt(i-1) != typed.charAt(j)){
                return false;
            }
        }
        return i<name.length()? false : true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String typed = sc.nextLine();

        boolean res = isPossible(name, typed);
        System.out.println(res);
    }
}
