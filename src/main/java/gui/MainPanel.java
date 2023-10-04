package gui;

import gui.panels.PanelEnum;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
    public static CardLayout cardLayout;
    public static JPanel cardContainer;

    public MainPanel() {
        cardContainer = new JPanel();
        cardLayout = new CardLayout();
        cardContainer.setLayout(cardLayout);

        add(cardContainer, BorderLayout.CENTER);
        cardLayout.show(cardContainer, PanelEnum.MAIN.getContainer().panel.getName());

        setName("mainPanel");
        setTitle("Resume Builder 2024");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
