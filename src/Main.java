import Interface.Cart;
import Interface.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cashier();

        System.out.println("Selamat datang di Sistem Kasir Mandiri!");
        while (true) {
            System.out.print("Masukkan nama produk (tekan 'q' untuk keluar): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Masukkan harga produk: Rp ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the new line character

            Item product = new Product(name, price);
            cart.addItem(product);
        }

        System.out.println("Items in the cart:");
        for (Item item : cart.getItems()) {
            System.out.println("/t" + item.getName() + " - " + item.getPrice());
        }

        System.out.println("Total Price: " + cart.getTotalPrice());

        cart.checkout();

        scanner.close();
    }
}