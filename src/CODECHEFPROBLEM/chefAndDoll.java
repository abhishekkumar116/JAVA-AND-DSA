package CODECHEFPROBLEM;

import java.util.Scanner;

public class chefAndDoll {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;

            while(n --> 0){
                int input = sc.nextInt();

                ans ^=  input;
            }
            System.out.println(ans);
        }

    }
}
