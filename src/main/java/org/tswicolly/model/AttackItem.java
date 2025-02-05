package org.tswicolly.model;

public class AttackItem implements Item {
    private String name;
    private int power;

    public AttackItem(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override public String getName() { return name; }
    @Override public int getPower() { return power; }
    @Override public void use() { System.out.println("Equipado: " + name); }
}
