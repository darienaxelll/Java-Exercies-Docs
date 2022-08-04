import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//
        getInteger(1, 10);
//        factorial(userInput);

//        diceRolling();


    }


//    public static int Addition(int n1, int n2) {
//        return n1 + n2;
//    }
//
//    public static int Subtraction(int n1, int n2) {
//        return n1 - n2;
//    }
//
//    public static int Multiplication(int n1, int n2) {
//        return n1 * n2;
//    }
//
//    public static int Division(int n1, int n2) {
//        if (n2 == 0) {
//            System.out.println("Error");
//        }
//        return n1 / n2;
//    }
//
//    public static int Modulus(int n1, int n2) {
//        return n1 % n2;
//    }

    public static int getInteger(int min, int max) {
        int tr  = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();

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


//    public static void factorial(int userInput) {
//
//        if (userInput >= 1 && userInput <= 10) {
//            long i,fact=1;
//            for(i=1;i<=userInput;i++){
//                fact=fact*i;
//            }
//            System.out.println("Factorial of "+userInput+" is: "+fact);
//        } else {
//            System.out.println("Invalid number");
//        }
//    }

    public static void diceRolling() {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Roll dice? [Y/N]");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals("Y")){
                System.out.println("Enter number of sides for a pair of dice...");
                int userInput = scanner.nextInt();

                int dice1 = (int) (Math.random()*userInput+1);
                int dice2 = (int) (Math.random()*userInput+1);
                int sum = dice1 + dice2;

                System.out.println(dice1);
                System.out.println(dice2);

                System.out.println("Roll: total = " + sum);
            } else {
                System.out.println("We can play another time");
                break;
            }
        }
    }
}

