package lt.vaidask.mailbox.service;

import lombok.AllArgsConstructor;
import lt.vaidask.mailbox.dto.Mailbox;
import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;
import lt.vaidask.mailbox.repository.EmailRepository;
import lt.vaidask.mailbox.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MailboxService {

    private final UserRepository userRepository;
    private final EmailRepository emailRepository;

    public List<Mailbox> getUserMailboxes() {

        List<User> users = userRepository.findAll();

        List<Email> emails = emailRepository.findAll();

        List<Mailbox> mailboxes= new ArrayList<>();

        return mailboxes;
    }
}