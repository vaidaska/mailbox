package lt.vaidask.mailbox.mapper;

import lt.vaidask.mailbox.model.Email;
import lt.vaidask.mailbox.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDataMapper {

    public User mapUsersData(Long id, String name, String surname, String email) {
        return User.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .email(email)
                .build();
    }

}
