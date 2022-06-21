package _2dArray;

import java.util.Scanner;

public class spiralTransversal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of row : ");
        int m = sc.nextInt();
        System.out.println("Enter length of column : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr[0].length-1;
        int maxc = arr[0].length-1;
        int tn = m * n;
        int cnt = 0;
        while (cnt<tn){
            for (int i = minr,j = minc; i<=maxr && cnt<tn;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            for (int i = maxr,j = minc; j<=maxc && cnt<tn; j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            for (int i = maxr,j = maxc; i>=minr && cnt<tn; i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            for (int i = minr, j = maxc; j>=minc && cnt<tn; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;

        }
    }
}
