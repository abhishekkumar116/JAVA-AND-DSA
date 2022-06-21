package com.company;

import java.util.Scanner;

public class Average{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths mark");
        int a = sc.nextInt();
        System.out.println("Enter Chemistry mark");
        int b = sc.nextInt();
        System.out.println("Enter Hindi mark");
        int c = sc.nextInt();
        System.out.println("Enter physics mark");
        int d = sc.nextInt();
        System.out.println("Enter English mark");
        int e = sc.nextInt();

        int Average = ((a+b+c+d+e)/5)*100;
        System.out.println(Average);



    }
}
