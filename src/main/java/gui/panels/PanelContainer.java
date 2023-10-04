package gui.panels;

import gui.MainPanel;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public abstract class PanelContainer{
    public final JPanel panel;

    public PanelContainer(String name) {
        this.panel = new JPanel();
        panel.setName(name);
        panel.add(new JLabel(name), BorderLayout.NORTH);
    }

    protected abstract void setup();
}
