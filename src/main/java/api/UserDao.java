package api;

import entity.User;
import java.util.List;

/**
 * Create by Lendemark on 05.05.2019.
 */
public interface UserDao {

    void saveUser(User user);

    void removeUserById(Long userId);
    void removeUserByLogin(String login);

    List<User> getAllUsers();
    void upadateUser(User user);

}
