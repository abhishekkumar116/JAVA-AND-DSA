package recursionAndBacktracking;

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Increasing(n);
    }
    public static void Increasing(int n){
        if (n == 0){
            return;
        }
        Increasing(n-1);
        System.out.println(n);
    }
}
