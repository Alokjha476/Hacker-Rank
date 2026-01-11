package InterfaceAndAbstraction;
interface Payment {
    void pay(double amount);
}

interface Payment2 extends Payment {
    void refund(double amount);
}
class UPI implements Payment, Payment2 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " using UPI.");
    }
}


public class AbstractionWithInterface {

    public static void main(String[] args) {
        Payment2 paymentMethod = new UPI();
        paymentMethod.pay(1500.00);
        paymentMethod.refund(20.0);
    }
}
