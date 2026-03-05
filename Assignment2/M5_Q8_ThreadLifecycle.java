public class M5_Q8_ThreadLifecycle {
    public static void main(String[] a) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                System.out.println("State inside run: " + Thread.currentThread().getState());
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        });

        System.out.println("After creation: " + t.getState());

        t.start();
        System.out.println("After start: " + t.getState());

        Thread.sleep(100);
        System.out.println("While sleeping: " + t.getState());

        t.join();
        System.out.println("After finish: " + t.getState());
    }
}
