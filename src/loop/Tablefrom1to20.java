package loop;

public class Tablefrom1to20 {
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++){
            int Tableof = i;
            for (int j = 1; j<=10; j++){
                System.out.print(Tableof*j+" ");
            }
            System.out.println();
        }
    }
}
