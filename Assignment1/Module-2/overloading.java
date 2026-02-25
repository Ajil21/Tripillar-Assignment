package Asssignment1.Module2;
public class overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(7, 5));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(10, 21, 8));
    }
}
