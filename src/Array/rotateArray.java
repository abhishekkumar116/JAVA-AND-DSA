package Array;

import java.util.*;
import java.io.*;

public class rotateArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;

        while (li < ri){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public static void rotate(int[] a, int k){
        k = k % a.length;
        if (k<0){
            k = k + a.length;
        }

        // part 1
        reverse(a, 0, a.length-1-k);

        // part 2
        reverse(a, a.length,a.length-1-k);

        // reverse all
        reverse(a, 0, a.length);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        rotate(a, k);
        display(a);
    }
}
