package org.tswicolly.controller;

import org.tswicolly.model.Player;
import org.tswicolly.model.Monster;
import org.tswicolly.view.CombatPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatController {
    private Player player;
    private Monster monster;
    private CombatPanel combatPanel;

    public CombatController(Player player, Monster monster, CombatPanel combatPanel) {
        this.player = player;
        this.monster = monster;
        this.combatPanel = combatPanel;
        initController();
    }

    private void initController() {
        combatPanel.getAttackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAttack();
            }
        });

        combatPanel.getDefendButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDefend();
            }
        });
    }

    private void handleAttack() {
        int damage = player.calculateDamage();
        monster.takeDamage(damage);
        combatPanel.appendToCombatLog("Você atacou o monstro causando " + damage + " de dano.");
        // Lógica adicional, como verificar se o monstro foi derrotado
    }

    private void handleDefend() {
        // Implementar lógica de defesa
        combatPanel.appendToCombatLog("Você se defendeu.");
    }
}
