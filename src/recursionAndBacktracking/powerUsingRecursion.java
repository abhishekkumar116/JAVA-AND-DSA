package recursionAndBacktracking;

import java.util.Scanner;

public class powerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
    }
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int xnb2 = power(x, n/2);
        int xn = xnb2 * xnb2;

        if (n % 2 == 1){
            xn = xn * x;
        }

        return xn;
    }
}
