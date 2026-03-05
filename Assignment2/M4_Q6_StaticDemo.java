class counter {
    static int n = 0;

    counter() { n++; }

    static void show() {
        System.out.println("Total objects: " + n);
    }
}

public class M4_Q6_StaticDemo {
    public static void main(String[] a) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        counter.show();
    }
}
