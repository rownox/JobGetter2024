package gui.panels.sub;

import files.Document;
import gui.MainPanel;
import gui.panels.PanelContainer;
import gui.panels.PanelEnum;
import org.apache.pdfbox.pdmodel.PDDocument;

import javax.swing.*;
import java.awt.*;

public class ResumeCreator extends PanelContainer {
    public ResumeCreator() {
        super("resumeCreatorPanel");
        setup();
    }

    @Override
    protected void setup() {

        JButton previousPageButton = new JButton("Go Back");
        previousPageButton.addActionListener(event -> {
            panel.setVisible(false);
            MainPanel.cardLayout.show(MainPanel.cardContainer, PanelEnum.MAIN.getContainer().getPanel().getName());
        });

        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        JButton finishResumeButton = new JButton("Finish Resume");
        finishResumeButton.addActionListener(event -> {
            panel.setVisible(false);
            MainPanel.cardLayout.show(MainPanel.cardContainer, PanelEnum.MAIN.getContainer().getPanel().getName());

            Document document = new Document(textField.getText());
            document.save();
        });
        panel.add(finishResumeButton, BorderLayout.EAST);
        panel.add(previousPageButton, BorderLayout.SOUTH);
    }
}
