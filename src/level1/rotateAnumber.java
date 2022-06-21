package level1;

import java.util.Scanner;

public class rotateAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Enter number from which you want to rotate : " );
        int k = sc.nextInt();

        int temp = n;
        int numberOfDigit = 0;
        while (temp > 0){
            temp = temp/10;
            numberOfDigit++;
        }
        k = k% numberOfDigit;
        if (k < 0){
            k = k +numberOfDigit;
        }
        int divisor = 1;
        int mul = 1;
        for (int i = 1; i<=numberOfDigit; i++){
            if (i <= k){
                divisor =divisor* 10;
            } else {
                mul = mul*10;
            }
        }
        int q = n/divisor;
        int r = n%divisor;
        int rotate = r*mul+q;
        System.out.println(rotate);
    }
}
