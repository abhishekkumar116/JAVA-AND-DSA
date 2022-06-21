package CPNumberTheory;

import java.util.Scanner;

public class eulersTotientFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(eulers(n));
    }
    public static int eulers(int n){
        int count = n;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                count = count - count/i;
                while(n % i == 0){
                    n = n/i;
                }
            }

        }
        if(n > 1){
            count = count - count/n;
        }
        return count;
    }
}
