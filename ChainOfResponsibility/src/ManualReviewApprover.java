public class ManualReviewApprover extends Approver {
    @Override
    public void process(TravelExpense expense) {
        System.out.println("Expense sent for manual review.");
    }
}