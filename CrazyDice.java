// how to use Random
import java.util.Random;
public class CrazyDice {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int diceNumber = randomGenerator.nextInt(10) + 1;
        System.out.println("The dice number is " + diceNumber);
    }
}