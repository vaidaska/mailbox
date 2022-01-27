package lt.vaidask.mailbox.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString(of = "id")
public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
}
