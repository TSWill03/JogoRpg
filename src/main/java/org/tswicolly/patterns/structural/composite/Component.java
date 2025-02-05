package org.tswicolly.patterns.structural.composite;

public interface Component {
    String getName();
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
    void display();
}
