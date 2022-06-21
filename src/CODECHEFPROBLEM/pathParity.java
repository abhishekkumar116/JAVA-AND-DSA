package CODECHEFPROBLEM;
import java.util.*;

public class pathParity {
    public static void main (String[] args) throws java.lang.Exception{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(n == 1){
                if(k == 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else if(n % 2 == 0){
                System.out.println("YES");
            }else{
                if(k == 1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
