package Array;

import java.util.Scanner;

public class firstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data : ");
        int data = sc.nextInt();
        int lower = 0;
        int high = arr.length-1;
        int f1 = 0;

        while (lower<=high) {
            int mid = (lower + high) / 2;
            if (data > arr[mid]) {
                lower = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                f1 = mid;
                high = mid - 1;
            }
            System.out.println(f1);
        lower = 0;
        high = arr.length-1;
        int f2 = -1;
        while (lower<=high) {
            mid = (lower + high) / 2;
            if (data > arr[mid]) {
                lower = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                f2 = mid;
                high = mid - 1;
            }
            System.out.println(f2);
        }
    }
    }
}
