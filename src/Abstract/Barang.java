package Abstract;

import Interface.Item;

public abstract class Barang implements Item {
    private String name;
    private double price;

    public Barang(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

