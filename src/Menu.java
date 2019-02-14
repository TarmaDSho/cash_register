import java.util.ArrayList;

public class Menu {

    private ArrayList<Item> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addObjectToMenu(String name, double price) {
        Item newItem = new Item(name, price);
        menuItems.add(newItem);
    }

    public void printMenu() {
        for(Item x: menuItems) {
            x.printItem();
        }
    }
}
