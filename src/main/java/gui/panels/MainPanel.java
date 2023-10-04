package gui.panels;

import javax.swing.*;

public class MainPanel extends JFrame {
    public static final JPanel panel = new JPanel();

    public MainPanel() {
        add(panel);
        setTitle("Resume Builder 2024");
        setSize(400, 300);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
