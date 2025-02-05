package org.tswicolly.view;

import javax.swing.*;
import java.awt.*;

public class CombatPanel extends JPanel {
    private JButton attackButton;
    private JButton defendButton;
    private JTextArea combatLog;

    public CombatPanel() {
        setLayout(new BorderLayout());

        combatLog = new JTextArea();
        combatLog.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(combatLog);
        add(scrollPane, BorderLayout.CENTER);

        attackButton = new JButton("Atacar");
        defendButton = new JButton("Defender");

        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(1, 2, 10, 10));
        actionPanel.add(attackButton);
        actionPanel.add(defendButton);

        add(actionPanel, BorderLayout.SOUTH);
    }

    public JButton getAttackButton() {
        return attackButton;
    }

    public JButton getDefendButton() {
        return defendButton;
    }

    public void appendToCombatLog(String message) {
        combatLog.append(message + "\n");
    }
}
