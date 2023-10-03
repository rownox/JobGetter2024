package fields;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Field {
    private final String title;
    private final List<Component> components;
}
