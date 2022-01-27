package lt.vaidask.mailbox.mapper;

import lt.vaidask.mailbox.dto.Mailbox;
import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserToEmailMapper {

    public Email mapUserToEmail(User author, List<User> recipients) {
        return Email.builder()
                .author(author)
                .recipients(recipients)
                .content("Some unmapped content .... because of exclude")
                .build();
    }

}
