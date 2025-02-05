package org.tswicolly.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GameWindow extends JFrame {

    public GameWindow() {
        setTitle("RPG Épico em Java");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        MenuPanel menuPanel = new MenuPanel(cardLayout, mainPanel);
        GamePanel gamePanel = new GamePanel();
        SettingsPanel settingsPanel = new SettingsPanel(cardLayout, mainPanel);

        mainPanel.add(menuPanel, "menuPanel");
        mainPanel.add(gamePanel, "gamePanel");
        mainPanel.add(settingsPanel, "settingsPanel");

        cardLayout.show(mainPanel, "menuPanel");

        add(mainPanel);
    }
}