package gui.panels;

import gui.panels.sub.ResumeCreator;
import lombok.Getter;

@Getter
public enum PanelEnum {
    RESUME_CREATOR(new ResumeCreator());

    private final PanelContainer container;

    PanelEnum(PanelContainer container) {
        this.container = container;
    }
}
