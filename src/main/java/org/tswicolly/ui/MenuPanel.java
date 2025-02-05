package org.tswicolly.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    public MenuPanel(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JButton btnStart = new JButton("Iniciar Jogo");
        JButton btnLoad = new JButton("Carregar Jogo");
        JButton btnSettings = new JButton("Configuracoes");
        JButton btnExit = new JButton("Sair");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btnStart, gbc);
        gbc.gridy++;
        add(btnLoad, gbc);
        gbc.gridy++;
        add(btnSettings, gbc);
        gbc.gridy++;
        add(btnExit, gbc);

        // Adiciona ActionListeners para os botões
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Muda para o painel do jogo
                cardLayout.show(mainPanel, "gamePanel");
            }
        });

        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para carregar o jogo
                JOptionPane.showMessageDialog(mainPanel, "Funcionalidade de carregar jogo ainda não implementada.");
            }
        });

        btnSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Muda para o painel de configurações
                cardLayout.show(mainPanel, "settingsPanel");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Sai do jogo
                System.exit(0);
            }
        });
    }
}