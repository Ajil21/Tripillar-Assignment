import java.io.*;

public class M5_Q1_Exceptions {
    static void checked() throws IOException {
        throw new IOException("This is a checked exception");
    }

    static void unchecked() {
        throw new ArithmeticException("This is an unchecked exception");
    }

    public static void main(String[] a) {
        try {
            checked();
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            unchecked();
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
