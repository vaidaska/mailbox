package lt.vaidask.mailbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;

import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mailbox {
    private User user;
    private List<Email> sentEmails = new ArrayList<>();
    private List<Email> receivedEmails = new ArrayList<>();
}