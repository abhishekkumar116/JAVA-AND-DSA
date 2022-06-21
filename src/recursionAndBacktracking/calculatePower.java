package recursionAndBacktracking;

import java.util.*;
import java.io.*;

public class calculatePower {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);

    }
    public static int power(int x, int n){
        if (x == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;

        return xn;
    }
}
