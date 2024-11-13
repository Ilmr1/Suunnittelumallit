public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(13);
        date.setMonth(11);
        date.setYear(2024);

        System.out.println("Current Date: " + date);

        date.advanceDays(41);

        System.out.println("Date after advancing 41 days: " + date);
    }
}