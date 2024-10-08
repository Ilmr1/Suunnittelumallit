// CardPayment.java
public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing card payment....");
    }
}