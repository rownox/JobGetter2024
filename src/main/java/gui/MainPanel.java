package gui;

import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
    public static final JPanel panel = new JPanel();

    public MainPanel() {
        panel.setLayout(new BorderLayout());

        CardLayout cardLayout = new CardLayout();

        for (PanelEnum panelContainerEnum : PanelEnum.values()) {
            panel.add(panelContainerEnum.getName(), panelContainerEnum.getContainer().getPanel());
        }

        JButton startButton = new JButton("Start Building Resume");
        startButton.addActionListener(e -> {
            cardLayout.show(panel, PanelEnum.RESUME_CREATOR.getName());
        });

        panel.add(startButton, BorderLayout.SOUTH);

        add(panel);

        setTitle("Resume Builder 2024");
        setSize(400, 300);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}