public class GameCharacter {
    private String name;
    private int level;
    private int experience;
    private int health;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void increaseExperience(int points) {
        this.experience += points;
    }

    public void increaseHealth(int points) {
        this.health += points;
    }

    public void decreaseHealth(int points) {
        this.health -= points;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void displayStatus() {
        state.displayStatus(this);
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", health=" + health +
                '}';
    }
}