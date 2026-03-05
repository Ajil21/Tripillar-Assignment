class obj {
    protected void finalize() {
        System.out.println("Object garbage collected");
    }
}

public class M4_Q7_GarbageCollection {
    public static void main(String[] a) {
        obj o = new obj();
        o = null;
        System.gc();
        System.out.println("GC requested");
    }
}
