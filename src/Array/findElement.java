package Array;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i<arr.length; i++){
//            System.out.println("Enter array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Find : ");
        int Search = sc.nextInt();

        int find = -1;
        for (int i = 1; i <= arr.length; i++){
            if (arr[i] == Search){
                find = i;
                break;
            }
        }
        System.out.println(find);
    }
}
