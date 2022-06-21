package methods;

public class introduction {
    public static void main(String[] args) {

        int firstNumber = 30;
        int secondNumber = 23;

        int result = maxOf(firstNumber,secondNumber);
        maxOf(200,300);
        maxOf(2,5);
        sayHi();
        sayHi();
        sayHi();

        System.out.println(result);
    }
    static int maxOf (int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
    static void sayHi(){
        System.out.println("Hii");
        System.out.println("Good morning");
    }
}
