package gui.panels;

import gui.panels.sub.ResumeCreator;
import lombok.Getter;

@Getter
public enum PanelEnum {
    RESUME_CREATOR(new ResumeCreator(), "resumeCreatorPage");

    private final PanelContainer container;
    private final String name;

    PanelEnum(PanelContainer container, String name) {
        this.container = container;
        this.name = name;
    }
}
