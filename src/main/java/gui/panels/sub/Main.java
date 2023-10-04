package gui.panels.sub;

import gui.MainPanel;
import gui.panels.PanelContainer;
import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class Main extends PanelContainer {
    public Main() {
        super("mainPage");
        setup();
    }

    @Override
    protected void setup() {
        JButton buildResumeButton = new JButton("Build Resume");
        JLabel title = new JLabel("Welcome!");
        JLabel description = new JLabel("Begin creating your resume.");

        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title, BorderLayout.NORTH);

        description.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(description, BorderLayout.CENTER);

        buildResumeButton.addActionListener(e -> {
            panel.setVisible(false);
            MainPanel.cardLayout.show(MainPanel.cardContainer, PanelEnum.RESUME_CREATOR.getContainer().getPanel().getName());
        });

        panel.add(buildResumeButton, BorderLayout.SOUTH);
    }
}
