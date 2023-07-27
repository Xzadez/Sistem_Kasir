package Interface;

import java.util.List;

public interface Cart {
    void addItem(Item item);
    void removeItem(Item item);
    List<Item> getItems();
    double getTotalPrice();
    void checkout();
}
