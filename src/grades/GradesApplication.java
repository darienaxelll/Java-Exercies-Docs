package grades;

import java.text.DecimalFormat;
import java.util.HashMap;
import util.Input;



public class GradesApplication {
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Input input = new Input();

        Student student1 = new Student("Josh".toLowerCase(), "TheBoiJosh");
        student1.addGrade(90);
        student1.addGrade(75);
        student1.addGrade(100);

        Student student2 = new Student("Nick", "NickDaKick");
        student2.addGrade(85);
        student2.addGrade(100);
        student2.addGrade(78);

        Student student3 = new Student("Jose", "ElJose");
        student3.addGrade(80);
        student3.addGrade(88);
        student3.addGrade(100);

        Student student4 = new Student("Jacob", "White_beard");
        student4.addGrade(90);
        student4.addGrade(75);
        student4.addGrade(80);


        HashMap<String, Student> students = new HashMap<>();
        students.put("Josh", student1);
        students.put("Nick", student2);
        students.put("Jose", student3);
        students.put("Jacob", student4);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println(students.keySet());
        System.out.println();

        while (true) {
            System.out.println("What student would you like to see more information on: ");
            String userInput = input.getString();
            System.out.println();

            if (students.containsKey(userInput)) {
                System.out.println(students.get(userInput).getName() + " - GitHub Username: " + students.get(userInput).getUsername());
                System.out.println("Current Average: " + numberFormat.format(students.get(userInput).getGradeAverage()));
                System.out.println("Current grades are: " + students.get(userInput).getGrade());
                System.out.println();
            }
            else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            } else {
                    System.out.println("Sorry, no student found with the GitHub username of " + userInput);
                    System.out.println();
                }
            }
        }
    }