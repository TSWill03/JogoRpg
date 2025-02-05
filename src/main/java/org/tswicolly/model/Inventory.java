package org.tswicolly.model;

import java.awt.*;

public class Inventory {
    private Composite root;

    public Inventory() {
        root = new Composite("Inventário");
    }

    public void addItem(Item item) {
        root.add(new InventoryItem(item));
    }

    public Item getEquippedAttackItem() {
        // Lógica simplificada
        return new AttackItem("Espada Básica", 5);
    }
}