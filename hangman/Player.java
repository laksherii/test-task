package hangman;

public class Player {
    private int health;

    public Player(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth() {
        health--;
    }
}
