package org.tswicolly.model;

import org.tswicolly.patterns.behavioral.strategy.AttackStrategy;

public class Monster implements Character {
    private String name;
    private int health;
    private AttackStrategy attackStrategy;

    public Monster(String name, int health, AttackStrategy strategy) {
        this.name = name;
        this.health = health;
        this.attackStrategy = strategy;
    }

    @Override public String getName() { return name; }
    @Override public int getLevel() { return 1; }
    @Override public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int calculateDamage() {
        return attackStrategy.execute(10); // Dano base
    }
}
