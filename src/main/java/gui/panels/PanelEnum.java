package gui.panels;

import gui.panels.sub.Home;
import gui.panels.sub.ResumeCreator;
import lombok.Getter;

public enum PanelEnum {
    HOME(new Home(), "homePage"),
    RESUME_CREATOR(new ResumeCreator(), "resumeCreatorPage");

    @Getter
    private final PanelContainer container;
    @Getter
    private final String name;

    PanelEnum(PanelContainer container, String name) {
        this.container = container;
        this.name = name;
    }
}
