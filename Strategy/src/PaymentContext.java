public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy =paymentStrategy;
    }

    public void processPayment() {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment();
        }
        else {
            System.out.println("No payment strategy set.");
        }
    }
}
