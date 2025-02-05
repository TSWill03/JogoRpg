package org.tswicolly.patterns.behavioral.observer;

import org.tswicolly.model.Player;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class HealthBar extends JProgressBar implements Observer {
    public HealthBar() {
        setMinimum(0);
        setMaximum(100);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Player) {
            setValue(((Player) o).getHealth());
        }
    }
}
