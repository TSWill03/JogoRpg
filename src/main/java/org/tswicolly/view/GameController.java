package org.tswicolly.view;

import org.tswicolly.view.*;

public class GameController {
    private MainPanel mainPanel;
    private CombatPanel combatPanel;

    public GameController(MainPanel mainPanel, CombatPanel combatPanel) {
        this.mainPanel = mainPanel;
        this.combatPanel = combatPanel;
        setupListeners();
    }

    private void setupListeners() {
        mainPanel.getBtnDungeon().addActionListener(e -> {
            // Lógica para iniciar combate
        });
    }
}
