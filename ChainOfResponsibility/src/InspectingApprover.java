public class InspectingApprover extends Approver {
    @Override
    public void process(TravelExpense expense) {
        if (expense.getAmount() < 400 && expense.isPrePlanned()) {
            System.out.println("Expense approved after detailed checking.");
        } else if (nextApprover != null) {
            nextApprover.process(expense);
        }
    }
}