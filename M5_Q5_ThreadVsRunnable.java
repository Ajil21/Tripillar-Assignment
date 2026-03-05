class t1 extends Thread {
    public void run() {
        System.out.println("Thread class: " + Thread.currentThread().getName());
    }
}

class t2 implements Runnable {
    public void run() {
        System.out.println("Runnable interface: " + Thread.currentThread().getName());
    }
}

public class M5_Q5_ThreadVsRunnable {
    public static void main(String[] a) throws InterruptedException {
        t1 thread1 = new t1();
        Thread thread2 = new Thread(new t2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
