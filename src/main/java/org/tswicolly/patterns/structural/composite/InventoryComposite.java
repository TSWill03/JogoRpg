package org.tswicolly.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class InventoryComposite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public InventoryComposite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public void display() {
        System.out.println("Composite: " + name);
        for (Component component : components) {
            component.display();
        }
    }
}
