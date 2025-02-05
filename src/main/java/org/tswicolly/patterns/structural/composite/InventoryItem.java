package org.tswicolly.patterns.structural.composite;

public class InventoryItem implements Component {
    private String name;

    public InventoryItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        // Não aplicável para itens individuais
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        // Não aplicável para itens individuais
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        // Não aplicável para itens individuais
        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
    }
}
