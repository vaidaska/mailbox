package lt.vaidask.mailbox.repository;

import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
