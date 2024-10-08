public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment...");
    }
}