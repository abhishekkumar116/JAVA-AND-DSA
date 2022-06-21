package CPNumberTheory;
import java.io.IOException;
import java.util.*;
public class wilsonsTheorem {
    public static long pow(long x, long n, int p){
        long ans = 1;

        while(n > 0){
            if(n % 2 == 1){
                ans = (ans * x) % p;
                n--;
            }
            x = (x * x) % p;
            n = n/2;

        }
        return (ans);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        if (n >= p){
            System.out.println("0");
            return;
        }
        long ans = p - 1;
        for (int i = n + 1; i <= p - 1; i++){
            ans = (ans * pow(i, p - 2, p) % p);
        }
    }
}
