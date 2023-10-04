package fields;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/*
    Note: This class could be a record
 */
@Getter
@AllArgsConstructor
public class Component {
    private final String name;
    private final String location;
    private final List<String> description;
    private final int fromDate;
    private final int toDate;
}
