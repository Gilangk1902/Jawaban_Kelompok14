import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	private List<Item> items;

    double nama;

    // constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // add item to cart
    public void addItem(Item item) {
        items.add(item);
    }

    // getter for totalPrice
    public double getTotalPrice() {
        double result = 0; 
        for(int i=0;i<items.size();i++){
            result += items.get(i).getPrice();
        }
        return result;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item name (or 'exit' to quit):");
            String itemName = scanner.nextLine();
            if (itemName.equals("exit")) {
                break;
            }
            System.out.println("Enter item price:");
            double itemPrice = Double.parseDouble(scanner.nextLine());
            Item item = new Item(itemName, itemPrice);
            cart.addItem(item);
        }
        scanner.close();
        System.out.println("Total price: " + cart.getTotalPrice());
    }
}
