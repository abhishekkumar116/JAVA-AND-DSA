package recursionAndBacktracking;

import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreasing(n);
    }
    public static void decreasing(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);

    }
}
