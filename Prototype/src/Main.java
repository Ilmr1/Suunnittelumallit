import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recommendation originalRecommendation = new Recommendation("Young Adults");
        originalRecommendation.addBook(new Book("Ykä", "Viidakon Ykä", "toiminta", 1987));
        originalRecommendation.addBook(new Book("Nykänen", "Matti Elämänkerta", "Laskettelu", 2000));

        System.out.println("Original Recommendation: " + originalRecommendation);

        System.out.println("Cloning the original recommendation...");
        Recommendation clonedRecommendation = originalRecommendation.clone();
        System.out.println("Cloned Recommendation: " + clonedRecommendation);

        System.out.println("Modifying the cloned recommendation...");
        clonedRecommendation.setTargetAudience("Adults");
        clonedRecommendation.addBook(new Book("Harri Potteri", "Taikasauva", "Skifi", 2010));
        System.out.println("Modified Cloned Recommendation: " + clonedRecommendation);

        System.out.println("Original Recommendation after cloning: " + originalRecommendation);
    }
}