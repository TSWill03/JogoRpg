package org.tswicolly.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel extends JPanel {

    public SettingsPanel(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Controle de Volume da Música
        JLabel musicVolumeLabel = new JLabel("Volume da Música:");
        JSlider musicVolumeSlider = new JSlider(0, 100, 50);
        musicVolumeSlider.setMajorTickSpacing(25);
        musicVolumeSlider.setPaintTicks(true);
        musicVolumeSlider.setPaintLabels(true);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(musicVolumeLabel, gbc);
        gbc.gridx = 1;
        add(musicVolumeSlider, gbc);

        // Controle de Volume dos Efeitos Sonoros
        JLabel sfxVolumeLabel = new JLabel("Volume dos Efeitos Sonoros:");
        JSlider sfxVolumeSlider = new JSlider(0, 100, 50);
        sfxVolumeSlider.setMajorTickSpacing(25);
        sfxVolumeSlider.setPaintTicks(true);
        sfxVolumeSlider.setPaintLabels(true);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(sfxVolumeLabel, gbc);
        gbc.gridx = 1;
        add(sfxVolumeSlider, gbc);

        // Configurações de Controles (Exemplo Simples)
        JLabel controlsLabel = new JLabel("Configurações de Controles:");
        JButton configureControlsButton = new JButton("Configurar Controles");

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(controlsLabel, gbc);
        gbc.gridx = 1;
        add(configureControlsButton, gbc);

        // Botão para retornar ao Menu Principal
        JButton backButton = new JButton("Voltar ao Menu Principal");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(backButton, gbc);

        // Ação do botão Voltar
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "menuPanel");
            }
        });

        // Ação do botão Configurar Controles
        configureControlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para configurar os controles
                JOptionPane.showMessageDialog(mainPanel, "Funcionalidade de configurar controles ainda não implementada.");
            }
        });
    }
}
