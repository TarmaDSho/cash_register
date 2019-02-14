public class Item {
    String name;
    double price;

    public Item(String n, double p ){
        name = n;
        price = p;
    }

    public void printItem() {
        System.out.println(name + " " + price);
    }

}
