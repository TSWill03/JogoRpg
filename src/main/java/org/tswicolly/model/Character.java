package org.tswicolly.model;

public interface Character {
    String getName();
    int getLevel();
    int getHealth();
    void takeDamage(int damage);
    int calculateDamage();
}