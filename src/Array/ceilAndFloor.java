package Array;

import java.util.Scanner;

public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for( int i = 0; i<arr.length; i++){
            System.out.println("Enter array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data which you want to print");
        int data = sc.nextInt();

        int lower = 0;
        int higher = arr.length - 1;
        int ceil = 0;
        int floor = 0;

        while (lower<=higher){
            int mid = (lower+higher)/2;
            if (data<arr[mid]){
                higher = mid - 1;
                ceil = arr[mid];
            }else if (data>arr[mid]){
                lower = mid + 1;
                floor = arr[mid];

            } else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

    }
}
