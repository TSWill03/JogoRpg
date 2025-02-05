package org.tswicolly.controller;

import org.tswicolly.view.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
    private MainWindow mainWindow;

    public MenuController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        initController();
    }

    private void initController() {
        mainWindow.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.showPanel("PainelCombate");
            }
        });

        mainWindow.getExitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}