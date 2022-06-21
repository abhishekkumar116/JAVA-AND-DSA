package Conditionals;

import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks>90){
            System.out.println("excellent");
        } else if (marks>80){
            System.out.println("Good");
        } else if (marks>70){
            System.out.println("fair");
        } else if (marks>60){
            System.out.println("meet expectations");
        }else {
            System.out.println("below par");
        }
    }
}
