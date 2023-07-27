import Interface.Cart;
import Interface.Item;

import java.util.ArrayList;
import java.util.List;

public class Cashier implements Cart {
    private List<Item> items;
    private double totalPrice;

    public Cashier() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
        totalPrice -= item.getPrice();
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void checkout() {
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("Items purchased:");
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Thank you for shopping!");
    }
}
