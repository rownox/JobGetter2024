package fields;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Component {
    private final String name;
    private final String location;
    private final List<String> description;
    private final int fromDate;
    private final int toDate;
}
