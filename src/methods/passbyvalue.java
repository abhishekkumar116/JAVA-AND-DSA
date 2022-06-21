package methods;

public class passbyvalue {
    public static void main(String[] args) {
        int c = 30;
        int d = 5;
        swap(c,d);
        System.out.println(c +" "+d);

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
