package gui.panels;

import lombok.Getter;

import javax.swing.*;

@Getter
public abstract class PanelContainer{
    protected final JPanel panel;
    protected final String name;

    public PanelContainer(JPanel panel, String name) {
        this.panel = panel;
        this.name = name;
    }

    protected abstract void setup();
}
