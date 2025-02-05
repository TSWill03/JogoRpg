package org.tswicolly.model;

import java.util.Observable;

public class Player extends Observable implements Character {
    private String name;
    private int level;
    private int health;
    private int strength;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        this.strength = 10;
        this.inventory = new Inventory();
    }

    // Getters e Setters
    @Override public String getName() { return name; }
    @Override public int getLevel() { return level; }
    @Override public int getHealth() { return health; }
    public void setHealth(int health) {
        this.health = health;
        setChanged();
        notifyObservers();
    }
    public Inventory getInventory() { return inventory; }

    @Override
    public void takeDamage(int damage) {
        setHealth(health - damage);
    }

    @Override
    public int calculateDamage() {
        Item equippedItem = inventory.getEquippedAttackItem();
        int itemPower = (equippedItem != null) ? equippedItem.getPower() : 0;
        return strength + itemPower;
    }
}