package gameTheory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class oneTwoThree {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if (n % 3 == 0){
            System.out.println("BOB");
        }else {
            System.out.println("ALICE");
        }
    }
}
