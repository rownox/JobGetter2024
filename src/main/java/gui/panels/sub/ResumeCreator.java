package gui.panels.sub;

import gui.panels.PanelContainer;

import javax.swing.*;

public class ResumeCreator extends PanelContainer {
    public ResumeCreator() {
        super(new JPanel(), "resumeCreatorPanel");
    }

    @Override
    protected void setup() {
        JLabel text = new JLabel("Resume Creator");
        panel.add(text);
    }
}
