package org.tswicolly.main;

import org.tswicolly.view.CombatPanel;
import org.tswicolly.view.GameController;
import org.tswicolly.view.MainPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainPanel mainPanel = new MainPanel();
            CombatPanel combatPanel = new CombatPanel();

            JFrame frame = new JFrame("RPG 2D");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(mainPanel);
            frame.pack();
            frame.setVisible(true);

            new GameController(mainPanel, combatPanel);
        });
    }
}
