package org.tswicolly.view;

import javax.swing.*;
import java.awt.*;

public class InventoryPanel extends JPanel {
    public InventoryPanel() {
        setLayout(new BorderLayout());

        JLabel inventoryLabel = new JLabel("Inventário", SwingConstants.CENTER);
        inventoryLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(inventoryLabel, BorderLayout.NORTH);

        JList<String> itemList = new JList<>(new DefaultListModel<>());
        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane, BorderLayout.CENTER);
    }
}
