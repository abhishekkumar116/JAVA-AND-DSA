package Oops;

public class concept {
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
        p1.saysHi();

        person p2 = new person();
        p2.age = 20;
        p2.name = "Rohit";
        p2.saysHi();

        person p3 = p1;
        p3.age = 40;
        p3.saysHi();
        p1.saysHi();
    }
}
