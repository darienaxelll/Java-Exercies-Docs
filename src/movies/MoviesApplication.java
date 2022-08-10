package movies;

import util.Input;
import static movies.MoviesArray.findAll;


public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    static Movie[] allMovies = findAll();

    public static void main(String[] args) {
        Input input = new Input();
        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();
            choice = input.getInt(0, 5, "");
            doChoice(choice);
        }
    }
    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the musical category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                            
                Enter your choice:\040""");
    }
    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
                // TODO: view all movies
                int i = 0;
                for (i = 0; i < allMovies.length; i++) {
                    System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                }
                break;
            case 2:
                // TODO: view movies in the musical category
                for (i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equalsIgnoreCase("musical")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 3:
                // TODO: view movies in the drama category
                for (i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equalsIgnoreCase("drama")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 4:
                // TODO: view movies in the horror category
                for (i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
            case 5:
                // TODO: view movies in the scifi category
                for (i = 0; i < allMovies.length; i++) {
                    if (allMovies[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.printf("Name: %s Category: %s%n", allMovies[i].getName(), allMovies[i].getCategory());
                    }
                }
                break;
        }
    }
}
