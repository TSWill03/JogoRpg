package org.tswicolly.model;

import org.tswicolly.patterns.structural.composite.InventoryComposite;
import org.tswicolly.patterns.structural.composite.InventoryItem;

public class Inventory {
    private InventoryComposite root;
    private Item equippedAttackItem; // Declaração da variável

    public Inventory() {
        root = new InventoryComposite("Inventário");
    }

    public void addItem(InventoryItem item) {
        root.add(item);
    }

    public void addCategory(InventoryComposite category) {
        root.add(category);
    }

    public void displayInventory() {
        root.display();
    }

    public Item getEquippedAttackItem() {
        return equippedAttackItem;
    }

    public void setEquippedAttackItem(Item item) {
        this.equippedAttackItem = item;
    }
}
