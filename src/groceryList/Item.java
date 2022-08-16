package groceryList;

import java.util.ArrayList;

public class Item {
    private String category;
    private String name;
    private ArrayList<String> itemsList = new ArrayList<>();

    public Item(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<String> itemsList) {
        this.itemsList = itemsList;
    }
}
