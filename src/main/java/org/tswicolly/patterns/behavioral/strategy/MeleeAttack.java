package org.tswicolly.patterns.behavioral.strategy;

public class MeleeAttack implements AttackStrategy {
    @Override
    public int execute(int baseDamage) {
        // Lógica para ataque corpo a corpo
        return baseDamage + 5;
    }
}