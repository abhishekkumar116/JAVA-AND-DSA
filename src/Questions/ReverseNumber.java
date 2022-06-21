package Questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nod = 0;
        int temp = 0;

        while (temp != 0){
            temp = temp/10;
            nod++;
        }

    }
}
