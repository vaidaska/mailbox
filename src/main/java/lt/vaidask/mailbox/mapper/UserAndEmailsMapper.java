package lt.vaidask.mailbox.mapper;

import lt.vaidask.mailbox.dto.Mailbox;
import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAndEmailsMapper {

    public Mailbox mapUserAndEmailToDto(User user, List<Email> emails) {
        return Mailbox.builder()
                .user(user)
                .sentEmails(emails)
                .receivedEmails(emails)
                .build();
    }

}
