//package String;
//
//import java.util.*;
//import java.io.*;
//
//public class ASCIIdiffOfCharacter {
//
//    public static String solution(String str){
//        StringBuilder sb = new StringBuilder();
//        sb.append(str.charAt(0));
//
//        for (int i = 1; i<str.length(); i++){
//            char curr = str.charAt(i);
//            char prev = str.charAt(i-1);
//            int gap = curr - prev;
//
//            sb.append(gap);
//            sb.append(curr);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String Str = sc.next();
//
//        System.out.println(solution(str));
//    }
//}
