interface payment {
    void pay(double amount);
}

class creditCardPayment implements payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class upiPayment implements payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class M4_Q2_Payment {
    public static void main(String[] a) {
        payment p1 = new creditCardPayment();
        payment p2 = new upiPayment();
        p1.pay(500);
        p2.pay(200);
    }
}
