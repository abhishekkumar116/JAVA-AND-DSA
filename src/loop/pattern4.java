package loop;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
