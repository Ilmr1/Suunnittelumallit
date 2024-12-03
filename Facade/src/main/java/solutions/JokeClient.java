package solutions;

public class JokeClient {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();
        try {
            String jokeText = apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Example with another API
        try {
            String exchangeRate = apiFacade.getAttributeValueFromJson("https://api.exchangerate-api.com/v4/latest/USD", "rates");
            System.out.println(exchangeRate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}