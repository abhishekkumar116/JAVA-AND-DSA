package Questions;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nod = 0;
        int temp = 0;
        while (temp != 0 ){
            temp = temp/10;
            nod++;
        }
        int div = (int)Math.pow(10, nod-1);
        while (div != 0){
            int q = n/div;
            System.out.println(q);

            n = n%div;
            div = div/10;
        }
    }
}
