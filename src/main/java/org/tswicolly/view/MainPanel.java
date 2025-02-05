package org.tswicolly.view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private JButton btnDungeon, btnInventory, btnVillage;

    public MainPanel() {
        setLayout(new GridLayout(3, 1));
        btnDungeon = new JButton("Entrar na Masmorra");
        btnInventory = new JButton("Abrir Inventário");
        btnVillage = new JButton("Visitar Vilarejo");

        add(btnDungeon);
        add(btnInventory);
        add(btnVillage);
    }

    public JButton getBtnDungeon() { return btnDungeon; }
    public JButton getBtnInventory() { return btnInventory; }
    public JButton getBtnVillage() { return btnVillage; }
}
