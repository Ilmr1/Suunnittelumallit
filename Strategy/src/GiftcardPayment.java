public class GiftcardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing gift card payment...");
    }
}
