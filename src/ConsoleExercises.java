import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.println("The value of PI is approximately " + pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        System.out.println("You have entered: " + userInput);

        System.out.println("Enter 3 words: ");
        String firstUserInput = scanner.next();
        String secondUserInput = scanner.next();
        String thirdUserInput = scanner.next();

        System.out.println(firstUserInput);
        System.out.println(secondUserInput);
        System.out.println(thirdUserInput);

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);


        System.out.println("Enter width: ");
        System.out.println("Enter length: ");
        System.out.println("Enter height: ");

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println("The area of your room is: " + (width * length) + " ftSq");
        System.out.println("The perimeter of your room is: " + ((width * 2) + (length * 2)) + " feet");
        System.out.println("The volume of your room is: " + (width * length * height) + " cubic cm");

        scanner.useDelimiter("\n");
    }
}


