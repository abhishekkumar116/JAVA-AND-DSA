package stackAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stocksSpan {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] span = solve(a);
        display(span);
    }
    public static int[] solve(int[] arr){
        int[] span = new int[arr.length];


        return span;
    }

}
