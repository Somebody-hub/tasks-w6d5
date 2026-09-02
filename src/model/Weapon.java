package model;

public class Weapon extends Item {
    private final int damage;

    public Weapon(String name, ItemType type, double weight, double price, int damage) {
        super(name, type, weight, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Weapon " + super.toString();
    }
}
