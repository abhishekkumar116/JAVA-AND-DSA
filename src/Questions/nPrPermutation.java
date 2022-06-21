package Questions;

import java.util.*;

public class nPrPermutation {

    public static void Display(int n, int r, int nPr){

        System.out.println(n+"p"+r+" = "+nPr);
    }
    public static int fact(int x){
        int rv = 1;

        for (int i = 1; i<=x; i++){
            rv = rv*i;
        }
        return rv;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

//        int nfact  = 1;
//        for (int  i = 1; i <= n; i++){
//            nfact *= i;
//        }
//        int nmrfact = 1;
//        for (int  i = 1; i <= n-r; i++){
//            nmrfact *= i;
//        }
        int nPr = nfact/nmrfact;
        Display(n, r, nPr);
//        System.out.println(n+"p"+r+" = "+nPr);
    }
}
