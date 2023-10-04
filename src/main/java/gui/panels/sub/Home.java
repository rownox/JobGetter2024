package gui.panels.sub;

import gui.GuiManager;
import gui.panels.MainPanel;
import gui.panels.PanelContainer;
import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class Home extends PanelContainer {

    public Home() {
        super(new JPanel(), "homePanel");
    }

    @Override
    protected void setup() {
        JButton startButton = new JButton("Start Building Resume");

        startButton.addActionListener(e -> {
            CardLayout cardLayout1 = (CardLayout) MainPanel.panel.getLayout();
            cardLayout1.show(MainPanel.panel, PanelEnum.RESUME_CREATOR.getName());
        });
    }
}
