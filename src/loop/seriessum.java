package loop;

import java.util.Optional;
import java.util.Scanner;

public class seriessum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

//        float result = 0;
//        for (float i = 1; i<=n; i++){
//            result += 1/i;
//        }
//        System.out.println(result);
        float result = 0;
        for (float i=1; i<=n; i++){
            if (i % 2==0){
                result-=1/i;
            } else {
                result+=1/i;
            }
        }
        System.out.println(result);

    }
}
