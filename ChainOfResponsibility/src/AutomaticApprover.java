public class AutomaticApprover extends Approver {
    @Override
    public void process(TravelExpense expense) {
        if (expense.getAmount() < 100) {
            System.out.println("Expense automatically approved.");
        } else if (nextApprover != null) {
            nextApprover.process(expense);
        }
    }
}