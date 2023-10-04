package gui;

import gui.panels.MainPanel;
import gui.panels.PanelContainer;
import gui.panels.PanelEnum;
import gui.panels.sub.Home;
import gui.panels.sub.ResumeCreator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GuiManager {
    public static final List<PanelContainer> panelContainerList = new ArrayList<>();

    public static void initPanels() {
        for (PanelContainer panelContainer : panelContainerList) {
            MainPanel.panel.add(panelContainer.getName(), panelContainer.getPanel());
        }
    }

    public static void addPanels() {
        panelContainerList.add(PanelEnum.HOME.getContainer());
        panelContainerList.add(PanelEnum.RESUME_CREATOR.getContainer());
    }
}
