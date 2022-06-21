package Oops;

public class swapGame {
    public static class person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] saysHi");
        }
    }

    public static void main(String[] args) {
        person p1 = new person();

        p1.age = 10;
        p1.name = "Abhishek";

        person p2 = new person();
        p2.age = 20;
        p2.name = "Rohit";

//      will not swap

        p1.saysHi();
        p2.saysHi();
        swap(p1, p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap(person psn1, person psn2){
        person temp = new person();
        psn1 = psn2;
        psn2 = temp;
    }
}
