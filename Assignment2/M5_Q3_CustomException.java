class myException extends Exception {
    myException(String msg) {
        super(msg);
    }
}

public class M5_Q3_CustomException {
    static void check(int x) throws myException {
        if (x < 0) throw new myException("Negative number not allowed: " + x);
    }

    public static void main(String[] a) {
        try {
            check(-5);
        } catch (myException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
