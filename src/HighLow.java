import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int upperbound = 1 + random.nextInt(100);
        System.out.println(upperbound);

        System.out.println("Guess a number between 1 and 100: ");
        int userInput = scanner.nextInt();

        do {

            if (userInput == upperbound) {
                System.out.println("You are right!");
            } else if (userInput > upperbound) {
                System.out.println("Guess is wrong, you went to high");
            } else if (userInput < upperbound) {
                System.out.println("Guess is wrong, you went to low");
            }
        } while ();
    }
}
