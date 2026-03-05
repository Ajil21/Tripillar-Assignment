public class M4_Q4_ReverseString {
    public static void main(String[] a) {
        String s = "hello world";
        String r = new StringBuilder(s).reverse().toString();
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + r);
    }
}
