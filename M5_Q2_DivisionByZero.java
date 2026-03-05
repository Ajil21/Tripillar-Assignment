public class M5_Q2_DivisionByZero {
    public static void main(String[] a) {
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}
