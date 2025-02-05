package org.tswicolly.main;

import org.tswicolly.game.GameLoop;
import org.tswicolly.ui.GameWindow;

public class Main {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();
        GameLoop gameLoop = new GameLoop();

        window.setVisible(true);
        gameLoop.start();
    }
}
