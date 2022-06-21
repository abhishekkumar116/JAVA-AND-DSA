package Array;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Averagemarksofstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of the student: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        System.out.println("Enter your marks now: ");
        for (int i = 0; i<n; i++) {
            marks[i] = sc.nextInt();
        }
            int averageMarks = 0;
            for (int i=0; i<n; i++){
                averageMarks += marks[i];
            }
            averageMarks /= n;
            System.out.println("Average marks of student is "+averageMarks);
        }
    }

