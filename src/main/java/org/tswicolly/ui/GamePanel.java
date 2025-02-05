package org.tswicolly.ui;

import org.tswicolly.entities.Player;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class GamePanel extends JPanel implements Runnable {

    private Thread gameThread;
    private boolean running;
    private final int FPS = 60;
    private Image backgroundImage;
    private Player player;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        setFocusable(true);
        requestFocus();
        loadResources();
        initializeGame();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                player.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.keyReleased(e);
            }
        });
    }

    private void loadResources() {
        // Carrega a imagem de fundo
        backgroundImage = new ImageIcon("path/to/background/image.png").getImage();
    }

    private void initializeGame() {
        player = new Player(100, 100); // Posição inicial do jogador
        startGame();
    }

    private void startGame() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double nsPerFrame = 1000000000.0 / FPS;

        while (running) {
            long now = System.nanoTime();
            double delta = (now - lastTime) / nsPerFrame;
            lastTime = now;

            updateGame();
            repaint();

            try {
                Thread.sleep((long) (nsPerFrame - delta));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateGame() {
        player.update();
        // Atualize outros elementos do jogo aqui
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        player.draw(g);
        // Desenhe outros elementos do jogo aqui
    }
}