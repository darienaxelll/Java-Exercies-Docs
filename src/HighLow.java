import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random random = new Random();

        int upperbound = 1 + random.nextInt(100);
        System.out.println(upperbound);

//        while  (true) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Guess a number between 1 and 100: ");
//            int userInput = scanner.nextInt();
//
//            if (userInput > upperbound) {
//                System.out.println("Too high");
//            } else if (userInput < upperbound) {
//                System.out.println("Too low");
//            } else if (userInput == upperbound) {
//                System.out.println("right");
//                break;
//            }
//        }

        do {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Guess a number between 1 and 100: ");
            int userInput = scanner.nextInt();

            if (userInput == upperbound) {
                System.out.println("You are right!");
                break;
            } else if (userInput > upperbound) {
                System.out.println("Guess is wrong, you went to high");
            } else if (userInput < upperbound) {
                System.out.println("Guess is wrong, you went to low");
            }
        } while (true);
    }
}
