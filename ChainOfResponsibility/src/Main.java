public class Main {
    public static void main(String[] args) {
        Approver automaticApprover = new AutomaticApprover();
        Approver inspectingApprover = new InspectingApprover();
        Approver manualReviewApprover = new ManualReviewApprover();

        automaticApprover.setNextApprover(inspectingApprover);
        inspectingApprover.setNextApprover(manualReviewApprover);

        TravelExpense expense1 = new TravelExpense(50, true);
        TravelExpense expense2 = new TravelExpense(300, true);
        TravelExpense expense3 = new TravelExpense(500, false);

        automaticApprover.process(expense1);
        automaticApprover.process(expense2);
        automaticApprover.process(expense3);
    }
}