package String;

import java.util.Scanner;

public class stringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String s = "hello";
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);
//
//        String s = sc.nextLine();
//        System.out.println(s);
//        System.out.println(s.length());
//
//        for (int i = 0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            System.out.println(ch);
//        }
//        String s = "abcde";
//        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(1));
//        String s = "abcde";
//        for (int i = 0; i<s.length(); i++){
//            for (int j = i+1; j<=s.length(); j++){
//                System.out.println(s.substring(i, j));
//            }
//        }
        String s = "abc,def,ghi,jkl mno";
        String[] parts = s.split(",");
        for (int i = 0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
