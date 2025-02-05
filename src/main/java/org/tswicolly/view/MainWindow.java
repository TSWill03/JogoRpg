package org.tswicolly.view;

import javax.swing.*;
import java.awt.*;
import org.tswicolly.model.Player;
import org.tswicolly.model.Monster;
import org.tswicolly.controller.CombatController;
import org.tswicolly.patterns.behavioral.strategy.AttackStrategy;
import org.tswicolly.patterns.behavioral.strategy.MeleeAttack;

public class MainWindow extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private CombatPanel combatPanel;
    private JButton startButton;
    private JButton exitButton;

    public MainWindow() {
        setTitle("Jogo RPG");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        combatPanel = new CombatPanel();
        mainPanel.add(combatPanel, "PainelCombate");

        add(mainPanel);

        // Inicializar modelos
        Player player = new Player("");
        AttackStrategy MeleeAttack = new MeleeAttack();
        Monster monster = new Monster("de",10, MeleeAttack);

        // Inicializar controlador
        new CombatController(player, monster, combatPanel);

        // Inicializa os botões
        startButton = new JButton("Iniciar Jogo");
        exitButton = new JButton("Sair");

        // Adiciona os botões ao painel principal ou a um painel específico
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        mainPanel.add(buttonPanel, "MenuPrincipal");

        add(mainPanel);
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }
}
