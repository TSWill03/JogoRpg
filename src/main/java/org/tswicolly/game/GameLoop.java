package org.tswicolly.game;

public class GameLoop implements Runnable {
    private boolean running = false;
    private final int FPS = 60;

    public void start() {
        running = true;
        Thread thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        double timePerTick = 1000000000 / FPS;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();
                delta--;
            }
        }
    }

    private void update() {
        // Atualize a lógica do jogo aqui (movimentação, física, etc.)
    }

    private void render() {
        // Renderize os gráficos do jogo aqui
    }
}

