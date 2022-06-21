package CODECHEFPROBLEM;

import java.util.Scanner;

public class ATMMechine {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = 1; i <= n; i++){
                int a = sc.nextInt();

                if(a <= k){
                    k -= a;
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
