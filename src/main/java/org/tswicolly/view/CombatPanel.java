package org.tswicolly.view;

import org.tswicolly.model.Monster;

import javax.swing.*;
import java.awt.*;

public class CombatPanel extends JPanel {
    private JLabel lblEnemy;
    private JButton btnAttack;

    public CombatPanel() {
        setLayout(new BorderLayout());
        lblEnemy = new JLabel("Inimigo", SwingConstants.CENTER);
        btnAttack = new JButton("Atacar");

        add(lblEnemy, BorderLayout.CENTER);
        add(btnAttack, BorderLayout.SOUTH);
    }

    public static void blinkRed(Monster monster) {
    }

    public JButton getBtnAttack() { return btnAttack; }
    public JLabel getLblEnemy() { return lblEnemy; }
}