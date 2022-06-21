package Dynamicprogramming;

import java.util.Scanner;

public class paintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int same = k * 1;
        int diff = k * (k - 1);
        int total = same + diff;

        for (int i = 3; i <= n; i++){
            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }
        System.out.println(total);
    }
}
