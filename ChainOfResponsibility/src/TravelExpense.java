public class TravelExpense {
    private double amount;
    private boolean prePlanned;

    public TravelExpense(double amount, boolean prePlanned) {
        this.amount = amount;
        this.prePlanned = prePlanned;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPrePlanned() {
        return prePlanned;
    }
}