package org.tswicolly.main;

import org.tswicolly.model.Inventory;
import org.tswicolly.patterns.structural.composite.InventoryComposite;
import org.tswicolly.patterns.structural.composite.InventoryItem;
import org.tswicolly.view.CombatPanel;
import org.tswicolly.view.GameController;
import org.tswicolly.view.MainPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        InventoryItem sword = new InventoryItem("Espada");
        InventoryItem shield = new InventoryItem("Escudo");

        InventoryComposite potions = new InventoryComposite("Poções");
        InventoryItem healthPotion = new InventoryItem("Poção de Vida");
        InventoryItem manaPotion = new InventoryItem("Poção de Mana");

        potions.add(healthPotion);
        potions.add(manaPotion);

        inventory.addItem(sword);
        inventory.addItem(shield);
        inventory.addCategory(potions);

        inventory.displayInventory();
    }
}
