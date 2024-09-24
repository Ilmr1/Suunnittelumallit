public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(30);
        System.out.println(character.getName() + " trained and gained 30 experience points.");
        if (character.getExperience() >= 200) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has advanced to Master level!");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        character.increaseHealth(20);
        System.out.println(character.getName() + " meditated and gained 20 health points.");
    }

    @Override
    public void fight(GameCharacter character) {
        character.decreaseHealth(15);
        character.increaseExperience(40);
        System.out.println(character.getName() + " fought and gained 40 experience points but lost 15 health points.");
        if (character.getExperience() >= 200) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has advanced to Master level!");
        }
    }

    @Override
    public void displayStatus(GameCharacter character) {
        System.out.println(character);
        System.out.println("Available actions: train, meditate, fight");
    }
}