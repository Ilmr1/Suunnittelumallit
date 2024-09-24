public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training is not available at Master level.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditation is not available at Master level.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at Master level.");
    }

    @Override
    public void displayStatus(GameCharacter character) {
        System.out.println(character);
        System.out.println("Congratulations! You have reached the Master level.");
    }
}