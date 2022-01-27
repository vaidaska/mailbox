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

        //Mailbox owner
        User mailboxUser = users.get(0);

        //Get sent email list of the mailbox owner
        List<Email> sentEmails = getUserSentEmails(mailboxUser, emails);

        //Get received email list of the mailbox owner
        List<Email> receivedEmails = getUserReceivedEmails(mailboxUser, emails);

        //Create mailbox of mailbox owner with sent/receives emails
        mailboxes.add(new Mailbox( mailboxUser, sentEmails, receivedEmails));

        return mailboxes;
    }

    public List<Email> getUserSentEmails(User user, List<Email> emails) {
        List<Email> sentEmails = new ArrayList<>();

        emails.forEach(email -> {
            if (email.getAuthor().equals(user)) {
                sentEmails.add(email);
            }
        });
        return sentEmails;
    }

    public List<Email> getUserReceivedEmails(User user, List<Email> emails) {
        List<Email> receivedEmails = new ArrayList<>();

        emails.forEach(email -> {
            email.getRecipients().forEach(recipient -> {
                if(recipient.equals(user)) {
                    receivedEmails.add(email);
                }
            });
        });

        return receivedEmails;
    }
}