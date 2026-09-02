package model;

public abstract class Item {
    private final String name;
    private final double weight;
    private final double price;
    private final ItemType itemType;

    public Item(String name, ItemType itemType, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return name + " type: " + itemType + " weight: " + weight + " price: " + price;
    }
}
