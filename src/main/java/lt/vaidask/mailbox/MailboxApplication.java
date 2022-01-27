package lt.vaidask.mailbox;

import lt.vaidask.mailbox.model.User;
import lt.vaidask.mailbox.repository.UserRepository;
import lt.vaidask.mailbox.service.MailboxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MailboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailboxApplication.class, args);
    }
}
