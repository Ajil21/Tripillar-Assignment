public class M5_Q7_Deadlock {
    static Object r1 = new Object();
    static Object r2 = new Object();

    public static void main(String[] a) {
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("T1 locked R1, waiting for R2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (r2) {
                    System.out.println("T1 locked R2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("T2 locked R2, waiting for R1");
                synchronized (r1) {
                    System.out.println("T2 locked R1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
