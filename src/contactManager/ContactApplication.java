package contactManager;

import util.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ContactApplication {
    public static Path folder = Paths.get("data");
    public static Path file = Paths.get("data", "contactLists.txt");

    public static void main(String[] args) throws IOException {
        Input choice = new Input();

        printMenu();

        switch (choice.getInt(1, 5))  {
            case 1:
                readFile();
                break;
            case 2:
                writeToFile();
                break;
            case 3:
                System.out.println("Hello");
                break;
            case 4:
                deleteContact();
                break;

        }
    }
    public static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                1 - View all contacts
                2 - Add new contact
                3 - Search for contact
                4 - Delete contact
                5 - Exit.
                            
                Enter your choice:\040""");
    }
    public static void writeToFile() {
        Input input = new Input();

        System.out.println("Enter first name, last name and phone number:");
        String userInput = input.getString();

        try {
            Files.write(
                    Paths.get("data", "contactLists.txt"),
                    Arrays.asList(userInput),
                    StandardOpenOption.APPEND
            );}
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void readFile() {
        try {
            List<String> allContacts =  Files.readAllLines(file);
            for (Object contact : allContacts) {
                System.out.println(contact);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteContact() {
        Input input = new Input();

        System.out.println("Enter contact name to delete: ");
        String userInput = input.getString();

        try {
            List<String> contacts = Files.readAllLines(file);
            contacts.removeIf(contact-> contact.contains(userInput));

            Files.write(file, contacts);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
