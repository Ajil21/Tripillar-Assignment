final class z {
    void show() {
        System.out.println("Final class method called");
    }
}

class demo {
    final int x = 10;

    final void display() {
        System.out.println("Final method called");
    }
}

public class M4_Q5_FinalDemo {
    public static void main(String[] a) {
        demo d = new demo();
        System.out.println("Final variable: " + d.x);
        d.display();

        z obj = new z();
        obj.show();
    }
}
