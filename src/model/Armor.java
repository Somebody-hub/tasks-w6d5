package model;

public class Armor extends Item {
    private final int defense;

    public Armor(String name, ItemType type, double weight, double price, int defense) {
        super(name, type, weight, price);
        this.defense = defense;
    }


    public int getDefense() {
        return defense;
    }



    @Override
    public String toString() {
        return "Armor " + super.toString();
    }
}
