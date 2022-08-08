package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return this.scanner.nextLine().equalsIgnoreCase("y") || this.scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int tr  = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number between " + min + " and " + max + ": ");
            int userInput = this.scanner.nextInt();

            if (userInput >= min && userInput <= max) {
                System.out.println("Number is in range");
                System.out.println(userInput);
                tr = 1;
            } else {
                System.out.println("Number not in range");
            }
        } while (tr == 0);
        return tr;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double  getDouble(double min, double max) {
        int tr = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a double between " + min + " and " + max + ": ");
            double userInput = this.scanner.nextInt();

            if (userInput >= min && userInput <= max) {
                System.out.println("Number is in range");
                System.out.println(userInput);
                tr = 1;
            } else {
                System.out.println("Number not in range");
            }
        } while (tr == 0);
        return tr;
    }

    public double getDouble () {
        return this.scanner.nextDouble();
    }

    public static void main(String[] args) {
        Input in = new Input();

        in.getInt(1, 20);
    }
}
