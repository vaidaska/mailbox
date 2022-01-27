package lt.vaidask.mailbox.model;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString(exclude = "content")
public class Email {
    private Long id;
    private User author;
    private List<User> recipients;
    private String content;
}