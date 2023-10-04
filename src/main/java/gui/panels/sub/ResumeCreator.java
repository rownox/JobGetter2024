package gui.panels.sub;

import gui.MainPanel;
import gui.panels.PanelContainer;
import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class ResumeCreator extends PanelContainer {
    public ResumeCreator() {
        super("resumeCreatorPanel");
        setup();
    }

    @Override
    protected void setup() {

        final JButton previousPageButton = new JButton("Go Back");
        previousPageButton.addActionListener(e -> {
            panel.setVisible(false);
            MainPanel.cardLayout.show(MainPanel.cardContainer, PanelEnum.MAIN.getContainer().getPanel().getName());
        });
        panel.add(previousPageButton, BorderLayout.SOUTH);
    }
}
