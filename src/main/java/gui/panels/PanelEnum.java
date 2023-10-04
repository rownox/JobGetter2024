package gui.panels;

import gui.panels.sub.Main;
import gui.panels.sub.ResumeCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PanelEnum {
    MAIN(new Main()),
    RESUME_CREATOR(new ResumeCreator());

    private final PanelContainer container;
}
