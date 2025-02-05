package org.tswicolly.patterns.creational;

import org.tswicolly.model.AttackItem;
import org.tswicolly.model.Item;

public interface ItemFactory {
    Item createItem(String name, int power);
}

class AttackItemFactory implements ItemFactory {
    @Override
    public Item createItem(String name, int power) {
        return new AttackItem(name, power);
    }
}