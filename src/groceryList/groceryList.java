package groceryList;

import util.Input;

import java.util.HashMap;

public class groceryList {
    public static void main(String[] args) {
        HashMap <String, String> foodCategory = new HashMap<>();
        foodCategory.put("vegetable", "tomato");
        foodCategory.put("cosmetic", "shampoo");
        foodCategory.put("meat", "chicken");
        foodCategory.put("dairy", "milk");
        System.out.println(foodCategory);

        Input input = new Input();

        System.out.println("Would you like to create a grocery list? [Y/N]");
        String userInput = input.getString();

        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println("Would you  like to enter a new item? [Y/N]");
            String newItem = input.getString();

            if (newItem.equalsIgnoreCase("y") || (newItem.equalsIgnoreCase("yes"))) {
                System.out.println();
            }
        }

    }
}
