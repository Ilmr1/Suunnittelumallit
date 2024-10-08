public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CardPayment());
        context.processPayment();

        context.setPaymentStrategy(new GiftcardPayment());
        context.processPayment();

        context.setPaymentStrategy(new CashPayment());
        context.processPayment();

        context.setPaymentStrategy(new LuonnossaPayment());
        context.processPayment();
    }
}
