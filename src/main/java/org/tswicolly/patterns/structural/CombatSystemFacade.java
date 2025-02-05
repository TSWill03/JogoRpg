package org.tswicolly.patterns.structural;

import org.tswicolly.model.Monster;
import org.tswicolly.model.Player;
import org.tswicolly.view.CombatPanel;

public class CombatSystemFacade {
    public static void attack(Player player, Monster monster) {
        int damage = player.calculateDamage();
        monster.takeDamage(damage);
        CombatPanel.blinkRed(monster); // Efeito visual
    }
}
