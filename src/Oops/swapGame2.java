package Oops;

public class swapGame2 {
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

        p1.saysHi();
        p2.saysHi();
        swap(p1, p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap(person psn1, person psn2){
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
