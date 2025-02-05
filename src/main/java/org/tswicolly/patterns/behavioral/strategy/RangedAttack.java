package org.tswicolly.patterns.behavioral.strategy;

public class RangedAttack implements AttackStrategy {
    @Override
    public int execute(int baseDamage) {
        // Lógica para ataque à distância
        return baseDamage + 3;
    }
}
