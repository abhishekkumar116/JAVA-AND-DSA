package loop;

import java.util.Scanner;

public class pattern7java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("*");

        for (int j = 2; j<=n-1; j++){
            System.out.print("*  ");
            for (int k = 1; k<=j-1; k++){
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 1; i<=n; i++){
            System.out.print("*  ");
        }
    }
}
