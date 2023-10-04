package gui.panels.sub;

import gui.MainPanel;
import gui.panels.PanelContainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeCreator extends PanelContainer {
    public ResumeCreator() {
        super("resumeCreatorPanel");
        setup();
    }

    @Override
    protected void setup() {

        JLabel text = new JLabel("Resume Creator");
        panel.add(text);

        JButton previousPageButton = new JButton("Go Back");
        previousPageButton.addActionListener(e ->
                MainPanel.cardLayout.show(MainPanel.panel, MainPanel.panel.getName())
        );
    }
}
