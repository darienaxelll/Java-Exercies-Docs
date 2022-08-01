import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println("The value of PI is approximately " + pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter some input yo: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You have entered: " + userInput);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter 3 words: ");
//        String firstUserInput = scanner.next();
//        String secondUserInput = scanner.next();
//        String thirdUserInput = scanner.next();
//
//        System.out.println(firstUserInput);
//        System.out.println(secondUserInput);
//        System.out.println(thirdUserInput);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);
    }
}
