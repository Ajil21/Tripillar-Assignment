public class M4_Q3_StringDemo {
    public static void main(String[] a) {
        String s = "hello";
        s = s + " world";
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sf = new StringBuffer("hello");
        sf.append(" world");
        System.out.println("StringBuffer: " + sf);

        System.out.println("String is immutable, StringBuilder is fast but not thread-safe, StringBuffer is thread-safe");
    }
}
