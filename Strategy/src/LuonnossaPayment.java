public class LuonnossaPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Maksetaan luonossa...");
    }
}
