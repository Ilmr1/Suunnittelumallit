import java.util.Random;

public class DiceGame extends Game {
    private Player[] players;
    private int numberOfPlayers;
    private Random random;
    private int winningScore = 20;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
        }
        random = new Random();
        System.out.println("Dice game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        for (Player player : players) {
            if (player.getScore() >= winningScore) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        int roll = random.nextInt(6) + 1; // Heittää noppaa (1-6)
        players[player].addScore(roll);
        System.out.println("Player " + (player + 1) + " rolled a " + roll + " and now has " + players[player].getScore() + " points.");
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < numberOfPlayers; i++) {
            if (players[i].getScore() >= winningScore) {
                System.out.println("Player " + (i + 1) + " wins with " + players[i].getScore() + " points!");
                return;
            }
        }
    }
}