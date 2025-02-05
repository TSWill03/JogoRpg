package org.tswicolly.entities;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player {

    private int x, y;
    private int dx, dy;
    private Image playerImage;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        loadImage();
    }

    private void loadImage() {
        playerImage = new ImageIcon("path/to/player/image.png").getImage();
    }

    public void update() {
        x += dx;
        y += dy;
        // Adicione lógica para colisão e limites da tela aqui
    }

    public void draw(Graphics g) {
        g.drawImage(playerImage, x, y, null);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
