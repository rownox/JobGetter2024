package gui.panels;

import gui.MainPanel;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public abstract class PanelContainer{
    public final JPanel panel;

    public PanelContainer(String name) {
        this.panel = new JPanel(new BorderLayout());
        panel.setName(name);
        MainPanel.cardContainer.add(panel, name);
    }

    protected abstract void setup();
}
