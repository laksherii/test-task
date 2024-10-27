package hangman;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final int HEALTH = 6;
    private static final String[] WORDLIST = new String[] {"java", "hibernate", "spring", "liquibase"};
    private final Word word;
    private final Player player;

    public Hangman() {
        this.word = new Word(WORDLIST[new Random().nextInt(WORDLIST.length)]);
        this.player = new Player(HEALTH);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game Hangman");

        while (player.getHealth() > 0 && !word.isGuessed()) {
            System.out.println("Guess the word " + word.getGuessableWord());
            System.out.println("Input letter");
            char inputLetter = scanner.next().charAt(0);

            if (word.guessLetter(inputLetter)) {
                System.out.println("Correct letter");
            } else {
                player.reduceHealth();
                System.out.println("Wrong letter. Try again your health is " + player.getHealth());

            }
        }
            if (word.isGuessed()) {
                System.out.println("Congratulations, you've won, the target word " + word.getWord());
            } else {
                System.out.println("You lose the target word " + word.getWord());
            }
        }
}
