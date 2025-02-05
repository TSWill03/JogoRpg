package org.tswicolly.patterns.structural;

import org.tswicolly.model.Item;

public abstract class ItemDecorator implements Item {
    protected Item decoratedItem;

    public ItemDecorator(Item decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    @Override
    public String getName() {
        return decoratedItem.getName();
    }

    @Override
    public int getPower() {
        return decoratedItem.getPower();
    }

    @Override
    public void use() {
        decoratedItem.use();
    }
}
