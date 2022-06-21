package CPNumberTheory;

import java.util.Scanner;

public class extendedEuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Pair ans = euclid(a, b);
        System.out.println(ans.x + " " + ans.y);
    }
    public static class Pair{
        long x;
        long y;
        long gcd;

        Pair(long x, long y, long ans){
            this.x = x;
            this.y = y;
            this.gcd = gcd;
        }
    }
    public static Pair euclid(long a, long b){
        if (b == 0){
            return new Pair(1, 0, a);
        }

        Pair dash = euclid(b, a%b);

        return new Pair(dash.y, dash.x - (a/b)* dash.y, dash.gcd);
    }
}
