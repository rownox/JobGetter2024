package gui;

import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
    public static JPanel panel;
    public static CardLayout cardLayout;

    public MainPanel() {
        cardLayout = new CardLayout();
        panel = new JPanel(cardLayout);

        setName("mainPanel");
        setTitle("Resume Builder 2024");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);

        panel.setLayout(new BorderLayout());

        JButton startButton = new JButton("Start Building Resume");
        startButton.addActionListener(e ->
                cardLayout.show(panel, PanelEnum.RESUME_CREATOR.getContainer().getPanel().getName())
        );

        panel.add(startButton, BorderLayout.SOUTH);

        add(panel);
    }
}
