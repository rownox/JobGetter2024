package fields;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/*
    Note: This class could be a record
 */
@Getter
@AllArgsConstructor
public class Field {
    private final String title;
    private final List<Component> components;
}
